package k3.warehousing.ahs.controller;

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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import k3.category.ahs.service.K3CategoryService;
import k3.check.ahs.dto.K3LaydownCheck;
import k3.check.ahs.service.K3CheckService;
import k3.contract.ahs.dto.K3Contract;
import k3.location.ahs.service.K3LocationServise;
import k3.memberuser.ahs.service.K3MemberUserService;
import k3.stock.ahs.dto.K3Stock;
import k3.warehousing.ahs.dto.K3Warehousing;
import k3.warehousing.ahs.dto.K3WarehousingSort;
import k3.warehousing.ahs.service.K3WarehousingService;

@Controller
@RequestMapping(value="/team03/goodsManagement/warehousing")
public class K3WarehousingController {
	
	
	private static final Logger log = LoggerFactory.getLogger(K3WarehousingController.class);

	private final K3WarehousingService k3WarehousingService;
	private final K3CheckService k3CheckService;
	private final K3CategoryService k3CategoryService;
	private final K3MemberUserService k3MemberUserService;
	private final K3LocationServise k3LocationServise;
	
	public K3WarehousingController(K3WarehousingService k3WarehousingService, K3CheckService k3CheckService, K3CategoryService k3CategoryService, K3MemberUserService k3MemberUserService, K3LocationServise k3LocationServise) {
		this.k3WarehousingService = k3WarehousingService;
		this.k3CheckService = k3CheckService;
		this.k3CategoryService = k3CategoryService;
		this.k3MemberUserService = k3MemberUserService;
		this.k3LocationServise = k3LocationServise;
	}
	//입고현황 조회처리
	@PostMapping("/k3WarehousingList")
	public String k3GetWarehousingList(@RequestParam(value="warehousingKey", required = false) String warehousingKey,
									   @RequestParam(value="warehousingValue", required = false) String warehousingValue,
									   @RequestParam(value="searchStartDate", required = false) String searchStartDate,
									   @RequestParam(value="searchEndDate", required = false) String searchEndDate,
									   @RequestParam(value="warehousingDateKey", required = false) String warehousingDateKey,
									   Model model) {
		Map<String, Object> searchCondition = new HashMap<String, Object>();
		if(warehousingKey != null && "laydownGoodsName".equals(warehousingKey)) {
			warehousingKey = "laydownGoodsName";
		}else if(warehousingKey != null && "contractorName".equals(warehousingKey)) {
			warehousingKey = "contractorName";
		}else if(warehousingKey != null && "warehousingCode".equals(warehousingKey)) {
			warehousingKey = "warehousingCode";
		}
		if(warehousingDateKey != null && "manufacturedDate".equals(warehousingDateKey)) {
			warehousingDateKey = "manufacturedDate";
		}else if(warehousingDateKey != null && "expiratonDate".equals(warehousingDateKey)) {
			warehousingDateKey = "expiratonDate";
		}else if(warehousingDateKey != null && "laydownCheckDate".equals(warehousingDateKey)) {
			warehousingDateKey = "laydownCheckDate";
		}
		searchCondition.put("warehousingKey", warehousingKey);
		searchCondition.put("warehousingValue", warehousingValue);
		searchCondition.put("searchStartDate", searchStartDate);
		searchCondition.put("searchEndDate", searchEndDate);
		searchCondition.put("warehousingDateKey", warehousingDateKey);
		log.info(" post 입고현황 조회처리 searchCondition ----------------", searchCondition);
		List<K3Warehousing> warehousingList = k3WarehousingService.k3GetWarehousingSearchList(searchCondition);
		model.addAttribute("warehousingList", warehousingList);
		log.info(" post 입고현황 조회 리스트 warehousingSearchList ----------------", warehousingList);
		
		return "team03/goodsManagement/warehousing/k3WarehousingList";
	}
	//입고 승인/반려 처리
	@PostMapping("/k3AllowWarehousing")
	public String k3AllowWarehousing(@RequestParam(value="allowList[]", required=false)List<String> allowList,
									 @RequestParam(value="YesOrNo", required=false)String YesOrNo){
		log.info("컨트롤러//////입고 승인처리  allowList ------ " + allowList);
		log.info("컨트롤러//////입고 반려처리  YesOrNo ------ " + YesOrNo);
		Map<String, Object> warehousingList = new HashMap<String, Object>();
		warehousingList.put("allowList", allowList);
		warehousingList.put("YesOrNo", YesOrNo);

		int result = k3WarehousingService.k3AllowWarehousing(warehousingList);
		log.info("컨트롤러//////입고 승인처리 결과 result------ " + result);
		return "redirect:/team03/goodsManagement/warehousing/k3AllowWarehousing";
	}
	
	//입고 승인폼 이동
	@GetMapping("/k3AllowWarehousing")
	public String k3AllowWarehousing(Model model){
		List<K3Warehousing> K3RequestAllow = k3WarehousingService.k3RequestAllowWarehousing();
		log.info("입고요청 승인 이동 컨트롤러 K3RequestAllow ------ " + K3RequestAllow);
		model.addAttribute("title", "입고관리");
		model.addAttribute("subtitle", "입고승인");
		model.addAttribute("K3RequestAllow", K3RequestAllow);
		return "team03/goodsManagement/warehousing/k3AllowWarehousing";
	}
	//입고분류 등록처리
	@PostMapping("/k3AddSort")
	public String k3AddWarehousingSort(K3Stock k3Stock) {
		log.info("입고분류 등록폼 처리 값받아오기 warehousingCode ------.>>>>", k3Stock);
		System.out.println("입고분류 등록처리 ->>>>------------>>>>" + k3Stock);
		//재고 테이블에 등록
		int pileupResult = k3WarehousingService.k3AddWarehousingSort(k3Stock);
		if(pileupResult > 0) {
			//입고 테이블에 분류 승인 업데이트
			int soringResult = k3WarehousingService.k3UpdateSorting(k3Stock);
			//로케이션 테이블에 사용현황 업데이트
			int locationStateResult = k3WarehousingService.k3UpdateLocationState(k3Stock);
		}
		log.info("입고분류 등록폼 처리 값받아오기 warehousingCode ------.>>>>", pileupResult);
		return "redirect:/team03/goodsManagement/warehousing/k3WarehousingList";
	}
	
	//입고분류 모달 로케이션 선택처리
	@PostMapping("/locationList")
	@ResponseBody
	public List<Map<String, Object>> locationList() {
		List<Map<String, Object>> locationList = k3LocationServise.k3GetModalLocationList();
		
		return locationList;
	}
	
	//입고분류 모달 담당자 선택처리
	@PostMapping("/MemberList")
	@ResponseBody
	public List<Map<String, Object>> memberList() {
		List<Map<String, Object>> memberList = k3MemberUserService.k3GetMemberUserModalList();
		
		return memberList;
	}
	//입고분류 모달 카테고리 선택처리
	@PostMapping("/getCategoryList")
	@ResponseBody
	public List<Map<String, Object>> getCategoryList() {
		List<Map<String, Object>> categoryList = k3CategoryService.getCategoryListByMap();
		return categoryList;
	}
	
	//입고분류 등록폼 이동
	@GetMapping("/k3AddSort")
	public String k3AddWarehousingSort(@RequestParam(value="warehousingCode", required= false) String warehousingCode,
									   Model model) {
		log.info("입고분류 등록폼 이동 값받아오기 warehousingCode ------.>>>>", warehousingCode);
		//입고분류 등록 받아오기
		String type = "add";
		List<K3LaydownCheck> warehousingSort = k3CheckService.getLaydownCheckList(warehousingCode, type);
		model.addAttribute("warehousingSort", warehousingSort);
		model.addAttribute("title", "입고관리");
		model.addAttribute("subtitle", "입고분류");
		
		return "team03/goodsManagement/warehousing/k3AddSort";
	}
	//입고 요청 등록 처리
	@PostMapping("/k3AddWarehousing")
	public String k3AddWarehousing(K3Warehousing k3Warehousing) {
		log.info("입고요청 처리 컨트롤러 값받아오기 : k3Warehousing ------ " + k3Warehousing);
		int result = k3WarehousingService.k3AddWarehousing(k3Warehousing);
		log.info("입고요청 처리 컨트롤러 결과: result ------ " + result);
		return "redirect:/team03/goodsManagement/warehousing/k3WarehousingList";
	}
	//모달 입고 요청폼에서 조회 처리
	@PostMapping("/findContractorName")
	@ResponseBody
	public List<Map<String, Object>> k3FindContractorName() {
		List<Map<String, Object>> resultList = k3WarehousingService.k3FindContractorName();
		log.info(" postMapping 입고청폼에서 모달 조회처리 결과  resultList ---------------------->>>>>>>>>", resultList);
		return resultList;
	}
	
	
	//입고 요청폼 이동
	@GetMapping("/k3AddWarehousing")
	public String k3AddWarehousing(Model model) {
		List<K3Contract> nameList = k3WarehousingService.k3FindContractorNameByCode();
		model.addAttribute("nameList", nameList);
		return "team03/goodsManagement/warehousing/k3AddWarehousing";
	}

	
	//입고분류 현황이동
	@GetMapping("/k3SortList")
	public String k3GetWarehousingSortList(Model model) {
		List<K3WarehousingSort> sortList = k3WarehousingService.k3GetWarehousingSortList();
		List<K3WarehousingSort> requestSort = k3WarehousingService.k3GetWarehousingRequestSort();
		log.info("입고 분류이동 컨트롤러 sortList ------ " + sortList);
		log.info("입고 분류이동 컨트롤러 requestSort------ " + requestSort);
		model.addAttribute("title", "입고관리");
		model.addAttribute("subtitle", "입고분류현황");
		model.addAttribute("sortList", sortList);	
		model.addAttribute("requestSort", requestSort);	
		return "team03/goodsManagement/warehousing/k3SortList";
	}
	//입고 현황이동
	@GetMapping("/k3WarehousingList")
	public String k3GetWarehousingList(Model model) {
		List<K3Warehousing> warehousingList = k3WarehousingService.k3GetWarehousingList();
		List<K3Warehousing> laydownCheck = k3WarehousingService.k3GetLaydownCheck();
		log.info("입고 현황이동 컨트롤러 K3LaydownCheck------ " + warehousingList);
		model.addAttribute("title", "입고관리");
		model.addAttribute("subtitle", "입고현황");
		model.addAttribute("warehousingList", warehousingList);
		model.addAttribute("laydownCheck", laydownCheck);
		
		return "team03/goodsManagement/warehousing/k3WarehousingList";
	}
}
