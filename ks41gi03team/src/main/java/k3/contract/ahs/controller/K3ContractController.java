package k3.contract.ahs.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k3.contract.ahs.service.K3ContractService;

@Controller
@RequestMapping(value="/team03/contractorContract/Contract")
public class K3ContractController {

	
	private K3ContractService k3ContractService;
	
	public K3ContractController(K3ContractService k3ContractService) {
		this.k3ContractService = k3ContractService;
	}
	
	//계약
	@GetMapping("/k3AddContract")
	public String K3GetAddContract(Model model) {
		
		model.addAttribute("title", "계약 관리");
		model.addAttribute("subtitle", "계약 등록");
		return "/team03/contractorContract/Contract/k3AddContract";
	}
	
	//계약현황 + 검색
	@GetMapping("/k3SearchContract")
	public String k3GetSearchContract(@RequestParam(value="searchKey", required=false, defaultValue="estimateNum") String searchKey,
						  			@RequestParam(value="searchValue", required=false) String searchValue,
						  			@RequestParam(value="contractSingningDateStart", required=false) String contractSingningDateStart,
						  			@RequestParam(value="contractSingningDateEnd", required=false) String contractSingningDateEnd, 
						  			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage, 
						  			Model model) {
		if(searchValue != null && searchValue != "".toString()) {
			searchValue = searchValue.trim();
			Map<String, Object> resultMap = k3ContractService.K3SearchContractList(searchKey,contractSingningDateStart, contractSingningDateEnd, searchValue, currentPage);
			System.out.println("resultMap.get(\"estimateList\") 잘되었나 확인 : " + resultMap.get("estimateList") );
			model.addAttribute("lastPage", resultMap.get("lastPage"));
			model.addAttribute("startPageNum", resultMap.get("startPageNum"));
			model.addAttribute("endPageNum", resultMap.get("endPageNum"));
			model.addAttribute("searchKey", searchKey);
			model.addAttribute("searchValue", searchValue);
			model.addAttribute("contractSingningDateStart", contractSingningDateStart);
			model.addAttribute("contractSingningDateEnd", contractSingningDateEnd);
			model.addAttribute("contractList", resultMap.get("contractList"));
		}else if(contractSingningDateStart != null && contractSingningDateStart != "".toString() && contractSingningDateEnd != null && contractSingningDateEnd != "".toString()) {
			Map<String, Object> resultMap = k3ContractService.K3SearchContractList(searchKey,contractSingningDateStart, contractSingningDateEnd, searchValue, currentPage);
			model.addAttribute("lastPage", resultMap.get("lastPage"));
			model.addAttribute("startPageNum", resultMap.get("startPageNum"));
			model.addAttribute("endPageNum", resultMap.get("endPageNum"));
			model.addAttribute("searchKey", searchKey);
			model.addAttribute("searchValue", searchValue);
			model.addAttribute("contractSingningDateStart", contractSingningDateStart);
			model.addAttribute("contractSingningDateEnd", contractSingningDateEnd);
			model.addAttribute("contractList", resultMap.get("contractList"));
		}else{
			Map<String, Object> resultMap = k3ContractService.k3GetContractList(currentPage);
			model.addAttribute("lastPage", resultMap.get("lastPage"));
			model.addAttribute("startPageNum", resultMap.get("startPageNum"));
			model.addAttribute("endPageNum", resultMap.get("endPageNum"));
			model.addAttribute("contractList", resultMap.get("contractList"));
	
		}	
		model.addAttribute("title", "계약 관리");
		model.addAttribute("subtitle", "계약 현황");
		model.addAttribute("currentPage", currentPage);
		
		return "/team03/contractorContract/Contract/k3SearchContract";
	}
	
	//수정
	@GetMapping("/k3ModifyContract")
	public String k3GetModifyContract(Model model) {
		
		model.addAttribute("title", "계약 관리");
		model.addAttribute("subtitle", "계약 수정");
		return "/team03/contractorContract/Contract/k3ModifyContract";
		
	}
	

}