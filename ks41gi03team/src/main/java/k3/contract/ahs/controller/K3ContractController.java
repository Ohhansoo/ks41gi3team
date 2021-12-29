package k3.contract.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.contract.ahs.dto.K3Contract;
import k3.contract.ahs.service.K3ContractService;

@Controller
@RequestMapping(value="/team03/contractorContract/Contract")
public class K3ContractController {

	
	private K3ContractService k3ContractService;
	
	public K3ContractController(K3ContractService k3ContractService) {
		this.k3ContractService = k3ContractService;
	}
	
	//계약
	@GetMapping("/addContract")
	public String K3GetAddContract(Model model) {
		
		model.addAttribute("title", "계약 관리");
		model.addAttribute("subtitle", "계약 등록");
		return "/team03/contractorContract/Contract/addContract";
	}
	
	//계약현황에 계약 리스트가져오기
	@GetMapping("/searchContract")
	public String k3GetSearchContract(Model model) {
		List<K3Contract> contractList =  k3ContractService.k3GetContractList();
	
		model.addAttribute("title", "계약 관리");
		model.addAttribute("subtitle", "계약 현황");
		model.addAttribute("contractList", contractList);
		
		return "/team03/contractorContract/Contract/searchContract";
	}
	@GetMapping("/driver/checkpointList")
	public String getDriver() {

		return "team03/driver/checkpointList";
	}	
	
	//수정
	@GetMapping("/modifyContract")
	public String k3GetModifyContract(Model model) {
		
		model.addAttribute("title", "계약 관리");
		model.addAttribute("subtitle", "계약 수정");
		return "/team03/contractorContract/Contract/modifyContract";
		
	}
	

}