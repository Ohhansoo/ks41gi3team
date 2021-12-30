package k3.contractor.ahs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.contractor.ahs.dto.K3Contractor;
import k3.contractor.ahs.service.K3ContractorService;

@Controller
@RequestMapping(value="/team03/contractorContract/Contractor")
public class K3ContractorController {
	
	private K3ContractorService k3ContractorService;
	
	public K3ContractorController(K3ContractorService k3ContractorService) {
		this.k3ContractorService = k3ContractorService;
	}
	
	//거래처 등록
	@GetMapping("/addContractor")
	public String K3GetAddContractor(Model model) {
		
		model.addAttribute("title", "거래처 관리");
		model.addAttribute("subtitle", "거래처 등록");
		
		return "/team03/contractorContract/Contractor/addContractor";
	}
	
	//거래처 현황에 거래처 가져오기
	@GetMapping("/searchContractor")
	public String K3GetContractorSearch(Model model) {
		List<K3Contractor> contractorList = k3ContractorService.K3GetContractorList();

		model.addAttribute("title", "거래처 관리");
		model.addAttribute("subtitle", "거래처 현황");
		model.addAttribute("contractorList", contractorList);

		return "/team03/contractorContract/Contractor/searchContractor";
	}
	
	//거래처 수정
	@GetMapping("/modifyContractor")
	public String k3GetModifyContractor(Model model) {
		model.addAttribute("title","거래처 관리");
		model.addAttribute("subtitle", "거래처 수정");
		return "/team03/contractorContract/Contractor/modifyContractor";
	}
}
