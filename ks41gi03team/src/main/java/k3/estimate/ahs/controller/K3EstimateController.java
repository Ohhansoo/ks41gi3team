package k3.estimate.ahs.controller;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import k3.estimate.ahs.dto.K3Estimate;
import k3.estimate.ahs.dto.K3Unit;
import k3.estimate.ahs.service.K3EstimateService;

@Controller
@RequestMapping(value="/team03/contractorContract/Estimate")
public class K3EstimateController {
	
	private K3EstimateService k3EstimateService;
	
	public K3EstimateController(K3EstimateService k3EstimateService) {
		this.k3EstimateService = k3EstimateService;
	}
	
	//단가표 모달창
	@GetMapping("/k3UnitModalAjax")
	@ResponseBody
	public List<K3Unit> k3GetUnit() {
		List<K3Unit> k3Unit = k3EstimateService.k3GetUnit();
		
		return k3Unit;
	}
	
	//견적서 등록
	@GetMapping("/k3AddEstimate")
	public String K3GetAddEstimate(Model model) {
		
		model.addAttribute("title", "견적서 관리");
		model.addAttribute("subtitle", "견적서 등록");
		return "/team03/contractorContract/Estimate/k3AddEstimate";
	}

	//견적서 수정
	@GetMapping("/k3ModifyEstimate")
	public String k3GetModifyEstimate(Model model) {
		model.addAttribute("title", "견적서 관리");
		model.addAttribute("subtitle", "견적서 수정");
		return "/team03/contractorContract/Estimate/k3ModifyEstimate";
	}
	
	//견적서 현황
	@GetMapping("/k3SearchEstimate")
	public String K3GetEstimateSearch(@RequestParam(value="searchKey", required=false, defaultValue="estimateNum") String searchKey,
						  			@RequestParam(value="searchValue", required=false) String searchValue,
						  			@RequestParam(value="estimateMeasureDateStart", required=false) String estimateMeasureDateStart,
						  			@RequestParam(value="estimateMeasureDateEnd", required=false) String estimateMeasureDateEnd, 
						  			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage, 
									Model model) {
		// model currentPage, lastPage, estimateList, startPageNum, endPageNum
		
		if(searchValue != null && searchValue != "".toString()) {
			searchValue = searchValue.trim();
			Map<String, Object> resultMap = k3EstimateService.K3SearchEstimateList(searchKey,estimateMeasureDateStart, estimateMeasureDateEnd, searchValue, currentPage);
			model.addAttribute("lastPage", resultMap.get("lastPage"));
			model.addAttribute("startPageNum", resultMap.get("startPageNum"));
			model.addAttribute("endPageNum", resultMap.get("endPageNum"));
			model.addAttribute("searchKey", searchKey);
			model.addAttribute("searchValue", searchValue);
			model.addAttribute("estimateMeasureDateStart", estimateMeasureDateStart);
			model.addAttribute("estimateMeasureDateEnd", estimateMeasureDateEnd);
			model.addAttribute("estimateList", resultMap.get("estimateList"));
		}else if(estimateMeasureDateStart != null && estimateMeasureDateStart != "".toString() && estimateMeasureDateEnd != null && estimateMeasureDateEnd != "".toString()) {
			Map<String, Object> resultMap = k3EstimateService.K3SearchEstimateList(searchKey,estimateMeasureDateStart, estimateMeasureDateEnd, searchValue, currentPage);
			model.addAttribute("lastPage", resultMap.get("lastPage"));
			model.addAttribute("startPageNum", resultMap.get("startPageNum"));
			model.addAttribute("endPageNum", resultMap.get("endPageNum"));
			model.addAttribute("searchKey", searchKey);
			model.addAttribute("searchValue", searchValue);
			model.addAttribute("estimateMeasureDateStart", estimateMeasureDateStart);
			model.addAttribute("estimateMeasureDateEnd", estimateMeasureDateEnd);
			model.addAttribute("estimateList", resultMap.get("estimateList"));
		}else{
			Map<String, Object> resultMap = k3EstimateService.K3GetEstimateList(currentPage);
			model.addAttribute("lastPage", resultMap.get("lastPage"));
			model.addAttribute("startPageNum", resultMap.get("startPageNum"));
			model.addAttribute("endPageNum", resultMap.get("endPageNum"));
			model.addAttribute("estimateList", resultMap.get("estimateList"));
	
		}
		
		model.addAttribute("title", "견적서 관리");
		model.addAttribute("subtitle", "견적서 현황");
		model.addAttribute("currentPage", currentPage);

		return "/team03/contractorContract/Estimate/k3SearchEstimate";
	}

}