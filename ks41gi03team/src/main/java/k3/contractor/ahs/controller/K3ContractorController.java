package k3.contractor.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.contractor.ahs.dto.K3Contractor;
import k3.contractor.ahs.dto.K3ContractorDetail;
import k3.contractor.ahs.service.K3ContractorService;

@Controller
@RequestMapping(value="/team03/contractorContract/Contractor")
public class K3ContractorController {
	
	private static final Logger log = LoggerFactory.getLogger(K3ContractorController.class);
	
	private K3ContractorService k3ContractorService;
	
	public K3ContractorController(K3ContractorService k3ContractorService) {
		this.k3ContractorService = k3ContractorService;
	}
	
	//거래처 수정
	
	//거래처 수정으로 화면전환
	@GetMapping("/k3ModifyContractor")
	public String k3GetModifyContractor(Model model) {
		
		model.addAttribute("title", "거래처 관리");
		model.addAttribute("subtitle", "거래처 정보 수정");
		
		return "/team03/contractorContract/Contractor/k3ModifyContractor";
	}

	
	//거래처 등록으로 화면전환
	@GetMapping("/k3AddContractor")
	public String K3GetAddContractor(Model model) {
		model.addAttribute("title", "거래처 관리");
		model.addAttribute("subtitle", "거래처 등록");
		
		return "/team03/contractorContract/Contractor/k3AddContractor";
	}
	
	//거래처 등록
	@PostMapping("/k3AddContractor")
	public String k3AddContractor(K3ContractorDetail k3ContractorDetail) {
		
		k3ContractorService.k3AddContractor(k3ContractorDetail);
		k3ContractorService.k3AddContractorDeatail(k3ContractorDetail);
		/*
		 * System.out.println("ContractorController 거래처 등록 화면에서 입력받은 값" +
		 * k3ContractorDetail);
		 * 
		 * String contractorCode = k3ContractorDetail.getContractorCode(); String
		 * contractorBusinessNum = k3ContractorDetail.getContractorBusinessNum();
		 * 
		 * if(contractorCode != null && contractorBusinessNum != null &&
		 * !"".equals(contractorCode) && !"".equals(contractorBusinessNum)) {
		 * k3ContractorService.k3AddContractor(k3ContractorDetail); }
		 */		
		return "redirect:/team03/contractorContract/Contractor/k3SearchContractor";
	}
	
	//거래처 현황에 거래처 가져오기
	@GetMapping("/k3SearchContractor")
	public String K3GetContractorSearch(Model model) {
		List<K3Contractor> contractorList = k3ContractorService.K3GetContractorList();

		model.addAttribute("title", "거래처 관리");
		model.addAttribute("subtitle", "거래처 현황");
		model.addAttribute("contractorList", contractorList);

		return "/team03/contractorContract/Contractor/k3SearchContractor";
	}
	

}
