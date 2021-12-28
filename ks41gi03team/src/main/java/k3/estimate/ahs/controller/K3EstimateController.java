package k3.estimate.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/team03/contractorContract/Estimate")
public class K3EstimateController {
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
		model.addAttribute("title", "견적서 관리");
		model.addAttribute("subtitle", "견적서 현황");
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