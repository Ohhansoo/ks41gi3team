package k3.dispatch.ahs.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;

import k3.dispatch.ahs.dto.K3Dispatch;
import k3.dispatch.ahs.service.K3DispatchService;
import k3.driver.ahs.service.K3DriverService;
import k3.memberuser.ahs.service.K3MemberUserService;


@Controller
@RequestMapping(value="/team03/delivery/dispatch")
public class K3DispatchController {
	
	private static final Logger log = LoggerFactory.getLogger(K3DispatchController.class);
	
	private K3DispatchService k3DispatchService;
	private K3MemberUserService k3MemberUserService; //의존성 검사
	private K3DriverService k3DriverService;
	
	public K3DispatchController(K3DispatchService k3DispatchService, K3MemberUserService k3MemberUserService, K3DriverService k3DriverService) {
		this.k3DispatchService = k3DispatchService;
		this.k3MemberUserService = k3MemberUserService;
		this.k3DriverService = k3DriverService;
	}
	
	//중복확인 
	@PostMapping("/dispatchCheck")
	@ResponseBody
	public boolean dispatchCheck(@RequestParam(value="dispatchCode", required = false) String dispatchCode) {
		
		boolean checkResult = false;
		
		Integer check = k3DispatchService.getOverlappedDispatchCode(dispatchCode);
		
		if(check > 0) checkResult = true;
		
		return checkResult;
	}
	
	//현황
	@GetMapping("/k3DispatchList")
	public String getDispatchList(Model model) {
		List<K3Dispatch> dispatchList = k3DispatchService.getDispatchList();
		model.addAttribute("title", "일일배차 관리");
		model.addAttribute("subtitle", "일일배차 현황");
		model.addAttribute("dispatchList", dispatchList);
		
		return "team03/delivery/dispatch/k3DispatchList";
	}
	

	//등록 화면
	@GetMapping("/k3AddDispatch")
	public String addDispatch(Model model) {
		model.addAttribute("title", "일일배차 관리");
		model.addAttribute("subtitle", "일일배차 등록");
		return "team03/delivery/dispatch/k3AddDispatch";
	}

	//등록 진행
	@PostMapping("/k3AddDispatch")
	public String addDispatch(K3Dispatch k3Dispatch) {
		
		Integer result = k3DispatchService.addDispatch(k3Dispatch);
		log.info("AddDispatch" + result);
		return "redirect:/team03/delivery/dispatch/k3DispatchList";
	}
	

	//수정 화면

	@GetMapping("/k3ModifyDispatch")
	public String k3ModifyDispatch(@RequestParam(value="dispatchCode", required = false) String dispatchCode, Model model) {
		
		log.info("k3ModifyDispatch dispatchCode:{}", dispatchCode);
		
		if(dispatchCode != null && !"".equals(dispatchCode)) {
			K3Dispatch dispatchInfo = k3DispatchService.getModifyDispatch(dispatchCode);
			model.addAttribute("dispatchInfo", dispatchInfo);
		}
		model.addAttribute("title", "일일배차 관리");
		model.addAttribute("subtitle", "일일배차 수정");
		
		return "team03/delivery/dispatch/k3ModifyDispatch";
	}
	

	//수정 진행
	@PostMapping("/k3ModifyDispatch")
	public String modifyDispatch(K3Dispatch k3Dispatch) {
		
		k3DispatchService.modifyDispatch(k3Dispatch);
		
		return "redirect:/team03/delivery/dispatch/k3DispatchList";
	}
	
	//검색
	@PostMapping("/k3DispatchList")
	public String k3SearchDispatchList(@RequestParam(value="dispatchKey", required = false) String dispatchKey,
										@RequestParam(value="dispatchValue", required = false) String dispatchValue,
										Model model) {
		if(dispatchKey != null && "dispatch".equals(dispatchKey)) {
			dispatchKey = "dispatchCode";
		}else if(dispatchKey != null && "driver".equals(dispatchKey)) {
			dispatchKey = "driverName";
		}else if(dispatchKey != null && "vehicle".equals(dispatchKey)) {
			dispatchKey = "vehicleCode";
		}
		
		List<K3Dispatch> dispatchList = k3DispatchService.k3SearchDispatchList(dispatchKey, dispatchValue);
		
		model.addAttribute("title", "일일배차 관리");
		model.addAttribute("subtitle", "일일배차 검색");
		model.addAttribute("dispatchList", dispatchList);
		
		return"team03/delivery/dispatch/k3DispatchList";
	}
	
	//모달1 (@ResponseBody 중요)
	@PostMapping("/dispatchMemberId")
	@ResponseBody
		public List<Map<String, Object>> k3SelectDispatchMemberId(){
			List<Map<String, Object>> searchId = k3MemberUserService.k3GetMemberUserModalList();
			return searchId;
		}
	
	//모달2
	@PostMapping("/dispatchDriverName")
	@ResponseBody 
		public List<Map<String, Object>> k3SelectDispatchDriverName(){
			List<Map<String, Object>> searchName = k3DriverService.k3GetDriverNameModalList(); 
			return searchName; 
	}
	
	//체크 삭제
	@PostMapping("/k3DeleteDispatch")
	public String k3DeleteDispatch(@RequestParam(value="deleteList[]", required = false) List<String> deleteList) {
		
		Integer result = k3DispatchService.k3DeleteDispatch(deleteList);
		log.info("DeleteDipsatch" + result);
		return "redirect:/team03/delivery/dispatch/k3DispatchList";
	}
	 
}