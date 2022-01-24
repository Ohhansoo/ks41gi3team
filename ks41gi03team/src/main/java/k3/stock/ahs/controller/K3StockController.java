package k3.stock.ahs.controller;

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

import k3.check.ahs.service.K3CheckService;
import k3.stock.ahs.dto.K3Stock;
import k3.stock.ahs.service.K3StockService;
import k3.warehousing.ahs.dto.K3Warehousing;
import k3.warehousing.ahs.dto.K3WarehousingSort;

@Controller
@RequestMapping(value="/team03/goodsManagement/stock")
public class K3StockController {
	
	
	private static final Logger log = LoggerFactory.getLogger(K3StockController.class);

	
	private K3StockService k3StockService;
	private K3CheckService k3CheckService;
	
	public K3StockController(K3StockService k3StockService, K3CheckService k3CheckService) {
		this.k3StockService = k3StockService;
		this.k3CheckService = k3CheckService;	
	}
	
	//재고현황 조회 처리
	@PostMapping("/k3StockList")
	public String k3StockList(@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage,
							  @RequestParam(value="simpleStockKey", required = false) String simpleStockKey,
							  @RequestParam(value="simpleStockValue", required = false) String simpleStockValue,
							  @RequestParam(value="searchSimpleStockType", required = false) String searchSimpleStockType,
							  @RequestParam(value="detailStockKey", required = false) String detailStockKey,
							  @RequestParam(value="detailStockValue", required = false) String detailStockValue,
							  @RequestParam(value="searchDetailStockType", required = false) String searchDetailStockType,
							  @RequestParam(value="categoryKey", required = false) String categoryKey,
							  @RequestParam(value="categoryValue", required = false) String categoryValue,
							  @RequestParam(value="stockDateKey", required = false) String stockDateKey,
							  @RequestParam(value="searchStartDate", required = false) String searchStartDate,
							  @RequestParam(value="searchEndDate", required = false) String searchEndDate,
							  Model model) {
		Map<String, Object> searchCondition = new HashMap<String, Object>();
		searchCondition.put("simpleStockKey", simpleStockKey);
		searchCondition.put("simpleStockValue", simpleStockValue);
		searchCondition.put("searchSimpleStockType", searchSimpleStockType);
		searchCondition.put("detailStockKey", detailStockKey);
		searchCondition.put("detailStockValue", detailStockValue);
		searchCondition.put("searchDetailStockType", searchDetailStockType);
		searchCondition.put("categoryKey", categoryKey);
		searchCondition.put("categoryValue", categoryValue);
		searchCondition.put("stockDateKey", stockDateKey);
		searchCondition.put("searchStartDate", searchStartDate);
		searchCondition.put("searchEndDate", searchEndDate);
		//간단재고 현황 조회처리
		Map<String, Object> simpleStockListMap = k3StockService.k3GetSimpleStockSearchList(searchCondition, currentPage);
		//상세재고 현황 조회처리
		Map<String, Object> detailStockListMap = k3StockService.k3GetDetailStockSearchList(searchCondition, currentPage);
		
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("simpleLastPage", simpleStockListMap.get("lastPage"));
		model.addAttribute("simpleStockList", simpleStockListMap.get("simpleStockList"));
		model.addAttribute("simpleStartPageNum", simpleStockListMap.get("startPageNum"));
		model.addAttribute("simpleEndPageNum", simpleStockListMap.get("endPageNum"));
		
		model.addAttribute("lastPage", detailStockListMap.get("lastPage"));
		model.addAttribute("detailStockList", detailStockListMap.get("detailStockList"));
		model.addAttribute("startPageNum", detailStockListMap.get("startPageNum"));
		model.addAttribute("endPageNum", detailStockListMap.get("endPageNum"));
		log.info(" post 입고현황 조회 리스트 simpleStockListMap ----------------", simpleStockListMap);
		log.info(" post 입하검수현황 조회 리스트 detailStockListMap ----------------", detailStockListMap);
		System.out.println(simpleStockListMap.get("simpleStockList"));
		System.out.println(detailStockListMap.get("detailStockList"));
		System.out.println(detailStockListMap);
		
		
		return "team03/goodsManagement/stock/k3StockList";
	}
	
	//재고 수정 처리
	@PostMapping("/k3ModifyStock")
	public String K3ModifyStock(@RequestParam(value="locationCode", required=false) String locationCode,
								@RequestParam(value="beforelocationCode", required=false) String beforelocationCode,
								K3Stock k3Stock){
		log.info("GetMapping 재고 수정처리 컨트롤러 이동 locationCode ----->>>>>>>>", locationCode);
		log.info("GetMapping 재고 수정처리 컨트롤러 이동 beforelocationCode ----->>>>>>>>", beforelocationCode);
		log.info("GetMapping 재고 수정처리 컨트롤러 이동 stockCode ----->>>>>>>>", k3Stock);
		System.out.println(locationCode);
		System.out.println(beforelocationCode);
		System.out.println(k3Stock);
		
		int result = k3StockService.K3ModifyStock(k3Stock);
		log.info("GetMapping 재고 수정처리 결과 result ----->>>>>>>>{}", result);
		
		if(result > 0) {
			if(!beforelocationCode.equals(beforelocationCode)) {
				int returnLocationState = k3StockService.K3ReturnLocationState(beforelocationCode);
				int inputLocationState = k3StockService.K3InputLocationState(locationCode);
			}			
		}
		
		return "redirect:/team03/goodsManagement/stock/k3StockList";
	}
	
	//재고 수정폼 이동
	@GetMapping("/k3ModifyStock")
	public String K3ModifyStock(@RequestParam(value="stockCode", required=false) String stockCode,
								Model model){
		log.info("GetMapping 재고 수정폼 이동 stockCode ----->>>>>>>>", stockCode);
		System.out.println(stockCode);
		List<K3Stock> modifyList = k3StockService.K3GetStockInfo(stockCode);
		
		model.addAttribute("title", "재고관리");
		model.addAttribute("subtitle", "재고수정");
		model.addAttribute("modifyList", modifyList);
		
		return "team03/goodsManagement/stock/k3ModifyStock";
	}
	
	//재고 등록
	@PostMapping("/k3AddStock")
	public String k3AddStock(K3Stock k3Stock) {
		log.info("재고 등록폼 처리 값받아오기 warehousingCode ------.>>>>{}", k3Stock);
		//재고 테이블에 등록
		int pileupResult = k3StockService.k3AddStock(k3Stock);
		if(pileupResult > 0) {
			//입고 테이블에 분류 승인 업데이트
			int soringResult = k3StockService.k3UpdateSorting(k3Stock);
			//로케이션 테이블에 사용현황 업데이트
			int locationStateResult = k3StockService.k3UpdateLocationState(k3Stock);
		}
		log.info("재고 등록폼 처리 값받아오기 warehousingCode ------.>>>>{}", pileupResult);
		return "redirect:/team03/goodsManagement/stock/k3AddStockList";
	}
	
	//재고 등록폼 이동
	@GetMapping("/k3AddStock")
	public String k3AddStock(@RequestParam(value="warehousingCode", required= false) String warehousingCode,
									   Model model) {
		log.info("재고 등록폼 이동 warehousingCode ------.>>>>{}", warehousingCode);
		//재고등록 정보 받아오기
		String type = "add";
		List<K3Warehousing> warehousingSort = k3CheckService.k3GetLaydownCheckUpdateList(warehousingCode, type);
		log.info("재고 등록폼 이동 warehousingCode ------.>>>>{}", warehousingSort);
		model.addAttribute("warehousingSort", warehousingSort);
		model.addAttribute("title", "재고관리");
		model.addAttribute("subtitle", "재고등록");
		
		return "team03/goodsManagement/stock/k3AddStock";
	}
	

	//재고 등록 리스트로 이동
	@GetMapping("/k3AddStockList")
	public String k3AddStockList(Model model) {
		List<K3Stock> addStockList = k3StockService.k3AddStockList();
		log.info("입고 분류이동 컨트롤러 requestSort{}------ " + addStockList);
		model.addAttribute("title", "재고관리");
		model.addAttribute("subtitle", "재고등록리스트");
		model.addAttribute("addStockList", addStockList);	
		return "team03/goodsManagement/stock/k3AddStockList";
	}
	
	//재고 현황 이동
	@GetMapping("/k3StockList")
	public String k3StockList(@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage,
							  Model model) {
		//재고현황 간단조회
		Map<String, Object> simpleStockListMap = k3StockService.k3GetStockByStockName(currentPage);
		//재고현황 상세조회
		Map<String, Object> detailStockListMap = k3StockService.k3GetStockByLocation(currentPage);
		log.info("재고현황 간단조회 컨트롤러 ----->{}", simpleStockListMap);
		System.out.println(simpleStockListMap);
		log.info("재고현황 간단조회 컨트롤러 ----->", detailStockListMap);
		System.out.println(simpleStockListMap);
		
		model.addAttribute("title", "재고관리");
		model.addAttribute("subtitle", "재고현황");
		model.addAttribute("currentPage", currentPage);	
		model.addAttribute("simpleStockList", simpleStockListMap.get("simpleStockList"));
		model.addAttribute("simpleStartPageNum", simpleStockListMap.get("startPageNum"));
		model.addAttribute("simpleEndPageNum", simpleStockListMap.get("endPageNum"));
		model.addAttribute("simpleLastPage", simpleStockListMap.get("lastPage"));

		model.addAttribute("detailStockList", detailStockListMap.get("detailStockList"));
		model.addAttribute("startPageNum", detailStockListMap.get("startPageNum"));
		model.addAttribute("endPageNum", detailStockListMap.get("endPageNum"));
		model.addAttribute("lastPage", detailStockListMap.get("lastPage"));
		return "team03/goodsManagement/stock/k3StockList";
	}

}
