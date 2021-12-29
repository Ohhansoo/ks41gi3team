package k3.estimate.ahs.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.estimate.ahs.dto.K3Estimate;
import k3.estimate.ahs.service.K3EstimateService;

@Controller
@RequestMapping(value="/team03/contractorContract/Estimate")
public class K3EstimateController {
	
	private K3EstimateService k3EstimateService;
	
	public K3EstimateController(K3EstimateService k3EstimateService) {
		this.k3EstimateService = k3EstimateService;
	}
	
	//견적서 등록
	@GetMapping("/addEstimate")
	public String K3GetAddEstimate(Model model) {
		
		model.addAttribute("title", "견적서 관리");
		model.addAttribute("subtitle", "견적서 등록");
		return "/team03/contractorContract/Estimate/addEstimate";
	}
	
	//견적서 현황
	@GetMapping("/searchEstimate")
	public String K3GetEstimateSearch(Model model) {
		List<K3Estimate> estimateList = k3EstimateService.K3GetEstimateList();
		
		model.addAttribute("title", "견적서 관리");
		model.addAttribute("subtitle", "견적서 현황");
		model.addAttribute("estimateList", estimateList);

		return "/team03/contractorContract/Estimate/searchEstimate";
	}
	//견적서 수정
	@GetMapping("/modifyEstimate")
	public String k3GetModifyEstimate(Model model) {
		model.addAttribute("title", "견적서 관리");
		model.addAttribute("subtitle", "견적서 수정");
		return "/team03/contractorContract/Estimate/modifyEstimate";
	}

}