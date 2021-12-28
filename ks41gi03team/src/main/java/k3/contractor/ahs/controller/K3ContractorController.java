package k3.contractor.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/team03/contractorContract/Contractor")
public class K3ContractorController {
	
	//계약처 등록
	@GetMapping("/addContractor")
	public String K3GetAddContractor(Model model) {
		
		model.addAttribute("title", "거래처 관리");
		model.addAttribute("subtitle", "거래처 등록");
		return "/team03/contractorContract/Contractor/addContractor";
	}
	
	//계약처 현황
	@GetMapping("/searchContractor")
	public String K3GetContractorSearch(Model model) {
		model.addAttribute("title", "거래처 관리");
		model.addAttribute("subtitle", "거래처 현황");
		return "/team03/contractorContract/Contractor/searchContractor";
	}
	
	//계약처 수정
	@GetMapping("/modifyContractor")
	public String k3GetModifyContractor(Model model) {
		model.addAttribute("title","거래처 관리");
		model.addAttribute("subtitle", "거래처 수정");
		return "/team03/contractorContract/Contractor/modifyContractor";
	}
}
