package k3.warehousing.ahs.controller;

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

import k3.warehousing.ahs.dto.K3Warehousing;
import k3.warehousing.ahs.service.K3LaydownCheckService;

@Controller
@RequestMapping(value="/team03/goodsManagement/warehousing")
public class K3LaydownCheckController {
	
	
	private static final Logger log = LoggerFactory.getLogger(K3LaydownCheckController.class);

	
	private final K3LaydownCheckService k3LaydownCheckService;
	
	public K3LaydownCheckController(K3LaydownCheckService k3LaydownCheckService) {
		this.k3LaydownCheckService = k3LaydownCheckService;
	}
	
	//입하검수 수정처리
	@PostMapping("/k3ModifyLaydownCheck") 
	public String k3ModifyLaydownCheck(K3Warehousing k3Warehousing){
		log.info("K3CheckController/ 입하검수 등록페이지 이동----->>>>>>>>>>", k3Warehousing);
		int result = k3LaydownCheckService.k3AddLaydownCheck(k3Warehousing);  
		return "redirect:/team03/goodsManagement/warehousing/k3WarehousingList"; 
	}
	
	 //입하검수 수정폼이동
	 @GetMapping("/k3ModifyLaydownCheck")
	 public String K3ModifyLaydownCheck(@RequestParam(value="warehousingCode", required=false)String warehousingCode, 
			 Model model){
		 log.info("K3CheckController/ 입하검수 수정페이지 이동----->>>>>>>>>>", warehousingCode);
		 //수정 관련 정보 받아오기
		 String type = "modify";
		 List<K3Warehousing> laydownModifyList = k3LaydownCheckService.k3GetLaydownCheckUpdateList(warehousingCode, type);		
		 log.info("K3CheckController/ 입하검수 수정페이지 이동 처리결과----->>>>>>>>>>", laydownModifyList);
		 model.addAttribute("title", "입고관리");
		 model.addAttribute("subtitle", "입하검수수정");
		 model.addAttribute("laydownModifyList", laydownModifyList);
		 System.out.println(laydownModifyList);
		 return "team03/goodsManagement/warehousing/k3ModifyLaydownCheck";
	 }
	 
	//입하검수 등록처리
	@PostMapping("/k3AddLaydownCheck") 
	public String k3AddLaydownCheck(K3Warehousing k3Warehousing){
		log.info("K3CheckController/ 입하검수 등록페이지 이동----->>>>>>>>>>", k3Warehousing);
		int result = k3LaydownCheckService.k3AddLaydownCheck(k3Warehousing);  
		return "redirect:/team03/goodsManagement/warehousing/k3LaydownCheckList"; 
	}
	
	//모달 입하검수 등록을 위한 입하검수코드 조회
	@PostMapping("/k3GetLaydownCheckCodeList") 
	@ResponseBody
	public List<Map<String, Object>> k3GetLaydownCheckCodeList(){
		log.info("K3CheckController/ 입하검수 등록페이지 이동----------------------");
		List<Map<String, Object>> laydownCheckCodeList = k3LaydownCheckService.k3GetLaydownCheckCodeList();  
		return laydownCheckCodeList; 
	}
	
	 //입하검수 등록폼이동
	 @GetMapping("/k3AddLaydownCheck")
	 public String k3AddLaydownCheck(@RequestParam(value="warehousingCode", required=false)String warehousingCode, 
			 Model model){
		 log.info("K3CheckController/ 입하검수 등록페이지 이동----->>>>>>>>>>", warehousingCode);
		 //등록 관련 정보 받아오기
		 String type = "add";
		 List<K3Warehousing> laydownCheckList = k3LaydownCheckService.k3GetLaydownCheckUpdateList(warehousingCode, type);		
		 log.info("K3CheckController/ 입하검수 등록페이지 이동 처리결과----->>>>>>>>>>", laydownCheckList);
		 model.addAttribute("title", "입고관리");
		 model.addAttribute("subtitle", "입하검수등록");
		 model.addAttribute("laydownCheckList", laydownCheckList);
		 return "team03/goodsManagement/warehousing/k3AddLaydownCheck";
	 }
	
	//입하현황  이동(입하검수 할 목록)
	@GetMapping("/k3LaydownCheckList")
	public String k3GetLaydownCheckList(@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage,
										Model model){
		List<K3Warehousing> laydownCheck = k3LaydownCheckService.k3GetLaydownCheckList();
		log.info("chech 컨트롤러 --- 입하현황 이동 결과값 --- >>>>> {}", laydownCheck);
		model.addAttribute("title", "입고관리");
		model.addAttribute("subtitle", "입하현황");
		model.addAttribute("laydownCheck", laydownCheck);
		return "team03/goodsManagement/warehousing/k3LaydownCheckList";
	}
}
