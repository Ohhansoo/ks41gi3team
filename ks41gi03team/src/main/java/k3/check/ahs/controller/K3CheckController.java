package k3.check.ahs.controller;

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

import k3.check.ahs.dto.K3LaydownCheck;
import k3.check.ahs.dto.K3ShipmentCheck;
import k3.check.ahs.service.K3CheckService;
import k3.release.ahs.dto.K3Release;
import k3.release.ahs.service.K3ReleaseService;
import k3.warehousing.ahs.dto.K3Warehousing;
import k3.warehousing.ahs.service.K3WarehousingService;

@Controller
@RequestMapping(value="/team03/goodsManagement/check")
public class K3CheckController {
	
	
	private static final Logger log = LoggerFactory.getLogger(K3CheckController.class);

	
	private final K3CheckService k3CheckService;

	public K3CheckController(K3CheckService k3CheckService) {
		this.k3CheckService = k3CheckService;
	}
	//출하검수 등록이동
	@GetMapping("/k3AddShipmentCheck")
	public String k3AddShipmentCheck(){
		
		return "team03/goodsManagement/check/k3AddShipmentCheck";
	}
	
	 //입하검수 수정폼이동
	 @GetMapping("/k3ModifyLaydownCheck")
	 public String K3ModifyLaydownCheck(@RequestParam(value="warehousingCode", required=false)String warehousingCode, 
			 Model model){
		 log.info("K3CheckController/ 입하검수 수정페이지 이동----->>>>>>>>>>", warehousingCode);
		 //수정 관련 정보 받아오기
		 String type = "modify";
		 List<K3LaydownCheck> laydownModifyList = k3CheckService.getLaydownCheckList(warehousingCode, type);		
		 log.info("K3CheckController/ 입하검수 수정페이지 이동 처리결과----->>>>>>>>>>", laydownModifyList);
		 model.addAttribute("title", "입고관리");
		 model.addAttribute("subtitle", "입하검수수정");
		 model.addAttribute("laydownModifyList", laydownModifyList);
		 System.out.println(laydownModifyList);
		 return "team03/goodsManagement/check/k3ModifyLaydownCheck";
	 }
	 
	//입하검수 등록처리
	@PostMapping("/k3AddLaydownCheck") 
	public String k3AddLaydownCheck(K3LaydownCheck K3LaydownCheck){
		log.info("K3CheckController/ 입하검수 등록페이지 이동----->>>>>>>>>>", K3LaydownCheck);
		int result = k3CheckService.k3AddLaydownCheck(K3LaydownCheck);  
		return "redirect:/team03/goodsManagement/check/k3LaydownCheckList"; 
	}
	
	//모달 입하검수 등록을 위한 입하검수코드 조회
	@PostMapping("/k3GetLaydownCheckCodeList") 
	@ResponseBody
	public List<Map<String, Object>> k3GetLaydownCheckCodeList(){
		log.info("K3CheckController/ 입하검수 등록페이지 이동----------------------");
		List<Map<String, Object>> laydownCheckCodeList = k3CheckService.k3GetLaydownCheckCodeList();  
		return laydownCheckCodeList; 
	}
	
	 //입하검수 등록폼이동
	 @GetMapping("/k3AddLaydownCheck")
	 public String k3AddLaydownCheck(@RequestParam(value="warehousingCode", required=false)String warehousingCode, 
			 Model model){
		 log.info("K3CheckController/ 입하검수 등록페이지 이동----->>>>>>>>>>", warehousingCode);
		 //등록 관련 정보 받아오기
		 String type = "add";
		 List<K3LaydownCheck> laydownCheckList = k3CheckService.getLaydownCheckList(warehousingCode, type);		
		 log.info("K3CheckController/ 입하검수 등록페이지 이동 처리결과----->>>>>>>>>>", laydownCheckList);
		 model.addAttribute("title", "입고관리");
		 model.addAttribute("subtitle", "입하검수등록");
		 model.addAttribute("laydownCheckList", laydownCheckList);
		 return "team03/goodsManagement/check/k3AddLaydownCheck";
	 }
	
	//입하현황  이동(입하검수 할 목록)
	@GetMapping("/k3LaydownCheckList")
	public String k3GetLaydownCheckList(@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage,
										Model model){
		List<K3LaydownCheck> laydownCheck = k3CheckService.k3GetLaydownCheckList();
		model.addAttribute("title", "입고관리");
		model.addAttribute("subtitle", "입하현황");
		model.addAttribute("laydownCheck", laydownCheck);
		return "team03/goodsManagement/check/k3LaydownCheckList";
	}
	/*
	 * //출하검수 현황이동(초기화면)
	 * 
	 * @GetMapping("/k3ShipmentCheckList") public String
	 * k3GetShipmentCheckList(Model model) { List<K3ShipmentCheck> K3ShipmentCheck =
	 * k3CheckService.k3GetShipmentCheckList();
	 * model.addAttribute("K3ShipmentCheck", K3ShipmentCheck); return
	 * "team03/goodsManagement/release/k3ReleaseList"; } //입하검수 현황이동(초기화면)
	 * 
	 * @GetMapping("/k3LaydownCheckList") public String k3GetWarehousingList(Model
	 * model) {
	 * 
	 * List<K3Warehousing> K3LaydownCheck =
	 * k3WarehousingService.k3GetWarehousingList();
	 * model.addAttribute("K3LaydownCheck", K3LaydownCheck);
	 * 
	 * return "team03/goodsManagement/warehousing/k3WarehousingList"; }
	 */
	
}
