package k3.release.ahs.controller;

import java.util.HashMap;
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

import k3.check.ahs.dto.K3ShipmentCheck;
import k3.check.ahs.service.K3CheckService;
import k3.release.ahs.dto.K3Release;
import k3.release.ahs.service.K3ReleaseService;
import k3.release.ahs.service.K3ShipmentCheckService;
import k3.warehousing.ahs.dto.K3Warehousing;

@Controller
@RequestMapping(value="/team03/goodsManagement/release")
public class K3ReleaseController {
	
	
	private static final Logger log = LoggerFactory.getLogger(K3ReleaseController.class);

	
	private final K3ReleaseService k3ReleaseService;
	private final K3ShipmentCheckService k3ShipmentCheckService;
	
	public K3ReleaseController(K3ReleaseService k3ReleaseService, K3ShipmentCheckService k3ShipmentCheckService){
		this.k3ReleaseService = k3ReleaseService;
		this.k3ShipmentCheckService = k3ShipmentCheckService;
	}
	
	//<모달>-출하 상품명 리스트 가져오기
	@PostMapping("/findProductNameList")
	@ResponseBody
	public List<Map<String, Object>> findProductNameList(){
		List<Map<String, Object>> ProductNameList = k3ReleaseService.findProductNameList();
		 return ProductNameList;
	}
	
	//출고 승인/반려 처리
	@PostMapping("/k3AllowRelease")
	public String k3AllowRelease(@RequestParam(value="allowList[]", required=false)List<String> allowList,
			 						 @RequestParam(value="YesOrNo", required=false)String YesOrNo){
			log.info("컨트롤러//////입고 승인처리  allowList{} ------ " + allowList);
			log.info("컨트롤러//////입고 반려처리  YesOrNo{} ------ " + YesOrNo);
			Map<String, Object> releaseList = new HashMap<String, Object>();
			releaseList.put("allowList", allowList);
			releaseList.put("YesOrNo", YesOrNo);
			int result = k3ReleaseService.k3AllowRelease(releaseList);
			log.info("컨트롤러//////입고 승인처리 결과 result{}------ " + result);
			return "redirect:/team03/goodsManagement/release/k3AllowRelease";
	}
	
	//출고 승인 요청폼 이동
	@GetMapping("/k3AllowRelease")
	public String k3AllowRelease(Model model){
		List<K3Release>	RequestAllowRelease = k3ReleaseService.k3RequestAllowRelease();
		model.addAttribute("title", "출고관리");
		model.addAttribute("subtitle", "출고승인");
		model.addAttribute("RequestAllowRelease", RequestAllowRelease);
		return "team03/goodsManagement/release/k3AllowRelease";
	}
	//출고 등록처리(출고 요청)
	@PostMapping("/k3AddRelease")
	public String k3AddRelease(K3Release k3Release) {
		log.info("출고 컨트롤러 ---- 출고 등록처리 전 k3Release----------->{}", k3Release);
		int result = k3ReleaseService.k3AddRelease(k3Release);
		log.info("출고 컨트롤러 ---- 출고 등록처리 후 result----------->{}", result);
		return "redirect:/team03/goodsManagement/release/k3ReleaseList";
	}
	
	//출고 등록폼 이동(출고 요청)
	@GetMapping("/k3AddRelease")
	public String k3AddRelease() {
		
		return "team03/goodsManagement/release/k3AddRelease";
	}
	//출고 현황이동
	@GetMapping("/k3ReleaseList")
	public String k3GetReleaseList(Model model) {
		//검수리스트
		List<K3Release> shipmentCheck = k3ShipmentCheckService.k3GetShipmentCheck();
		//출고리스트
		List<K3Release>	releaseList = k3ReleaseService.k3GetReleaseList();
		model.addAttribute("title", "출고관리");
		model.addAttribute("subtitle", "출고현황");
		model.addAttribute("shipmentCheck", shipmentCheck);
		model.addAttribute("releaseList", releaseList);
		return "team03/goodsManagement/release/k3ReleaseList";
	}
}
