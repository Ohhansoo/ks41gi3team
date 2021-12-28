package k3.contract.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/team03/contractorContract/Contract")
public class K3ContractController {
	//계약
	@GetMapping("/addContract")
	public String K3GetAddContract(Model model) {
		
		model.addAttribute("title", "계약 관리");
		model.addAttribute("subtitle", "계약 등록");
		return "/team03/contractorContract/Contract/addContract";
	}
	
	@GetMapping("/searchContract")
	public String k3GetSearchContract(Model model) {

		model.addAttribute("title", "계약 관리");
		model.addAttribute("subtitle", "계약 현황");
		return "/team03/contractorContract/Contract/searchContract";
	}
	
	@GetMapping("/modifyContract")
	public String k3GetModifyContract(Model model) {
		
		model.addAttribute("title", "계약 관리");
		model.addAttribute("subtitle", "계약 수정");
		return "/team03/contractorContract/Contract/modifyContract";
		
	}
}