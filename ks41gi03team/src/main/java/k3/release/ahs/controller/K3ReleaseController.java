package k3.release.ahs.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import k3.release.ahs.dto.K3Release;
import k3.release.ahs.service.K3ReleaseService;
import k3.release.ahs.service.K3ShipmentCheckService;


@Controller
@RequestMapping(value="/team03/goodsManagement/release")
public class K3ReleaseController {
	
	
	private static final Logger log = LoggerFactory.getLogger(K3ReleaseController.class);

	
	private final K3ReleaseService k3ReleaseService;
	private final K3ShipmentCheckService k3ShipmentCheckService;
	private ExecutorService nonBlockingService = Executors.newCachedThreadPool();
			
	public K3ReleaseController(K3ReleaseService k3ReleaseService, K3ShipmentCheckService k3ShipmentCheckService){
		this.k3ReleaseService = k3ReleaseService;
		this.k3ShipmentCheckService = k3ShipmentCheckService;
	}
	
    @GetMapping("/sse")
    public SseEmitter handleSse() {
         SseEmitter emitter = new SseEmitter();
         int requestCount = k3ReleaseService.k3CountRequestReleaseList();
         nonBlockingService.execute(() -> {
             try {
                 emitter.send(requestCount);
                 // we could send more events
                 emitter.complete();
             } catch (Exception ex) {
                 emitter.completeWithError(ex);
             }
         });
         log.info("sse 로직결과--------{}", emitter);
         return emitter;
    }   
	
	//<ajax>-통합출고코드 생성코드 전달
	@PostMapping("/createReleaseMergeCode")
	@ResponseBody
	public String k3CreateReleaseMergeCode(){
		log.info("출고컨트롤러 --------- 모달 통합출고코드 리스트 시작 전");
		String releaseMergeCode = k3ReleaseService.k3CreateReleaseMergeCode();
		log.info("출고컨트롤러 --------- 모달 통합출고코드 리스트 결과 -----------{}", releaseMergeCode);
		return releaseMergeCode;
	}
	
	//<모달>-통합출고코드 리스트 가져오기
	@PostMapping("/findReleaseMergeCode")
	@ResponseBody
	public List<Map<String, Object>> k3FindReleaseMergeCode(){
		log.info("출고컨트롤러 --------- 모달 통합출고코드 리스트 시작 전");
		List<Map<String, Object>> releaseMergeCodeList = k3ReleaseService.k3FindReleaseMergeCode();
		log.info("출고컨트롤러 --------- 모달 통합출고코드 리스트 결과 -----------{}", releaseMergeCodeList);
		return releaseMergeCodeList;
	}
	
	
	//<모달>-출하 상품명 리스트 가져오기
	@PostMapping("/findProductNameList")
	@ResponseBody
	public List<Map<String, Object>> k3FindProductNameList(){
		log.info("모달 - 상품명 리스트 컨트롤러 시작");
		List<Map<String, Object>> ProductNameList = k3ReleaseService.k3FindProductNameList();
		log.info("모달 -출고관리 컨트롤러 출하 상품명 리스트 가져오기 결과-------------------> {}", ProductNameList);
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
	//출고 및 출하검수 현황 조회처리
	@PostMapping("/k3ReleaseList")
	public String k3GetReleaseList(@RequestParam(value="releaseKey", required = false) String releaseKey,
									   @RequestParam(value="releaseValue", required = false) String releaseValue,
									   @RequestParam(value="shipmentKey", required = false) String shipmentKey,
									   @RequestParam(value="shipmentValue", required = false) String shipmentValue,
									   @RequestParam(value="shipmentDateKey", required = false) String shipmentDateKey,
									   @RequestParam(value="searchShipmentType", required = false) String searchShipmentType,
									   @RequestParam(value="searchReleaseType", required = false) String searchReleaseType,
									   @RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage,
									   Model model) {
		Map<String, Object> searchCondition = new HashMap<String, Object>();
		searchCondition.put("releaseKey", releaseKey);
		searchCondition.put("releaseValue", releaseValue);
		searchCondition.put("shipmentKey", shipmentKey);
		searchCondition.put("shipmentValue", shipmentValue);
		searchCondition.put("shipmentDateKey", shipmentDateKey);
		searchCondition.put("searchShipmentType", searchShipmentType);
		searchCondition.put("searchReleaseType", searchReleaseType);
		log.info(" post 입고현황 조회처리 searchCondition ----------------", searchCondition);
		
		Map<String, Object> releaseMap = k3ReleaseService.k3GetReleaseSearchList(searchCondition, currentPage);
		Map<String, Object> shipmentCheckMap = k3ShipmentCheckService.k3GetShipmentSearchList(searchCondition, currentPage);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("releaseLastPage", releaseMap.get("lastPage"));
		model.addAttribute("releaseList", releaseMap.get("releaseList"));
		model.addAttribute("releaseStartPageNum", releaseMap.get("startPageNum"));
		model.addAttribute("releaseEndPageNum", releaseMap.get("endPageNum"));
		
		model.addAttribute("shipmentCheckLastPage", shipmentCheckMap.get("lastPage"));
		model.addAttribute("shipmentCheck", shipmentCheckMap.get("shipmentCheck"));
		model.addAttribute("shipmentCheckStartPageNum", shipmentCheckMap.get("startPageNum"));
		model.addAttribute("shipmentCheckEndPageNum", shipmentCheckMap.get("endPageNum"));
		log.info(" post 입고현황 조회 리스트 releaseMap ----------------", releaseMap);
		log.info(" post 입하검수현황 조회 리스트 shipmentCheckMap ----------------", shipmentCheckMap);
		
		return "team03/goodsManagement/release/k3ReleaseList";
	}
	
	//출고 현황이동
	@GetMapping("/k3ReleaseList")
	public String k3GetReleaseList(@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage,
								   Model model) {
		//검수리스트
		Map<String, Object> shipmentCheckMap = k3ShipmentCheckService.k3GetShipmentCheck(currentPage);
		//출고리스트
		Map<String, Object>	releaseListMap = k3ReleaseService.k3GetReleaseList(currentPage);
		log.info("입고 현황이동 컨트롤러 releaseMap------ {}" + shipmentCheckMap);
		log.info("입하검수 현황이동 컨트롤러 shipmentCheckMap------ {}" + releaseListMap);
		//공통
		model.addAttribute("title", "출고관리");
		model.addAttribute("subtitle", "출고현황");
		model.addAttribute("currentPage", currentPage);
		//검수현황 페이징 및 리스트
		model.addAttribute("shipmentCheckLastPage", shipmentCheckMap.get("lastPage"));
		model.addAttribute("shipmentCheck", shipmentCheckMap.get("shipmentCheck"));
		model.addAttribute("shipmentCheckStartPageNum", shipmentCheckMap.get("startPageNum"));
		model.addAttribute("shipmentCheckEndPageNum", shipmentCheckMap.get("endPageNum"));
		//출고현황 페이징 및 리스트
		model.addAttribute("releaseLastPage", releaseListMap.get("lastPage"));
		model.addAttribute("releaseList", releaseListMap.get("releaseList"));
		model.addAttribute("releaseStartPageNum", releaseListMap.get("startPageNum"));
		model.addAttribute("releaseEndPageNum", releaseListMap.get("endPageNum"));
		return "team03/goodsManagement/release/k3ReleaseList";
	}
}
