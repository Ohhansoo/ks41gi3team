package k3.driver.ahs.controller;

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

import k3.driver.ahs.dto.K3Driver;
import k3.driver.ahs.service.K3DriverService;


@Controller
@RequestMapping(value="/team03/delivery/driver")
public class K3DriverController {
	
	
	private static final Logger log = LoggerFactory.getLogger(K3DriverController.class);

	private K3DriverService k3DriverService;
	
	public K3DriverController(K3DriverService k3DriverService) {
		this.k3DriverService = k3DriverService;
	}
	
	//중복확인 
		@PostMapping("/driverCheck")
		@ResponseBody
		public boolean driverCheck(@RequestParam(value="driverId", required = false) String driverId) {
			
			boolean checkResult = false;
			
			Integer check = k3DriverService.getOverlappedDriverId(driverId);
			
			if(check > 0) checkResult = true;
			
			return checkResult;
		}
	
	//현황
	@GetMapping("/k3DriverList")
	public String getDriverList(Model model) {
		List<K3Driver> driverList = k3DriverService.getDriverList();
		model.addAttribute("title", "차량기사 관리");
		model.addAttribute("subtitle", "차량기사 현황");
		model.addAttribute("driverList", driverList);
		
		return "team03/delivery/driver/k3DriverList";
	}
	
	//등록 화면
	@GetMapping("/k3AddDriver")
	public String driverCheck(Model model) {
		model.addAttribute("title", "차량기사 관리");
		model.addAttribute("subtitle", "차량기사 등록");
		return "team03/delivery/driver/k3AddDriver";
	}
	
	//등록 진행
	@PostMapping("/k3AddDriver")
	public String addDriver(K3Driver k3Driver) {
		Integer result = k3DriverService.addDriver(k3Driver);
		log.info("AddDriver" + result);
		log.info("AddDriver" + k3Driver);
		return "redirect:/team03/delivery/driver/k3DriverList";
	}
	

	//수정 화면

	@GetMapping("/k3ModifyDriver")
	public String k3ModifyDriver(@RequestParam(value="driverId", required = false) String driverId, Model model) {
		
		log.info("k3ModifyDriver driverId:{}", driverId);
		
		if(driverId != null && !"".equals(driverId)) {
			K3Driver driverInfo = k3DriverService.getModifyDriver(driverId);
			model.addAttribute("driverInfo", driverInfo);
		}
		model.addAttribute("title", "차량기사 관리");
		model.addAttribute("subtitle", "차량기사 수정");
		
		return "team03/delivery/driver/k3ModifyDriver";
	}

	
	//수정 등록
	@PostMapping("/k3ModifyDriver")
	public String modifyDriver(K3Driver k3Driver) {
		
		k3DriverService.modifyDriver(k3Driver);
		
		return "redirect:/team03/delivery/driver/k3DriverList";
	}
	
	//체크 삭제
	@PostMapping("/k3DeleteDriver")
	public String k3DeleteDriver(@RequestParam(value="deleteList[]", required = false) List<String> deleteList) {
		Integer result = k3DriverService.k3DeleteDriver(deleteList);
		log.info("DeleteDriver" + result);
		return "redirect:/team03/delivery/driver/k3DriverList";
	}
	
	//검색
	@PostMapping("/k3DriverList")
	public String k3SearchDriverList(@RequestParam(value="driverKey", required = false) String driverKey,
										@RequestParam(value="driverValue", required = false) String driverValue,
										Model model) {
		if(driverKey != null && "driver".equals(driverKey)) {
			driverKey = "driverId";
		}else if(driverKey != null && "dname".equals(driverKey)) {
			driverKey = "driverName";
		}
		List<K3Driver> driverList = k3DriverService.k3SearchDriverList(driverKey, driverValue);
		
		model.addAttribute("title", "차량 기사 관리");
		model.addAttribute("subtitle", "차량 기사 검색");
		model.addAttribute("driverList", driverList);
		
		return "team03/delivery/driver/k3DriverList";
	}
	
	//모달
	@PostMapping("/k3drivermodal")
	@ResponseBody
		public List<Map<String, Object>> k3GetDriverNameModalList(){
			List<Map<String, Object>> modalList = k3DriverService.k3GetDriverNameModalList();
			return modalList;
	}

}