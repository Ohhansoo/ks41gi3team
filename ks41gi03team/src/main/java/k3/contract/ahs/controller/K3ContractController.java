package k3.contract.ahs.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import k3.contract.ahs.dto.K3Contract;
import k3.contract.ahs.service.K3ContractService;
import k3.contractor.ahs.dto.K3Contractor;

@Controller
@RequestMapping(value="/team03/contractorContract/Contract")
public class K3ContractController {

	
	private K3ContractService k3ContractService;
	
	public K3ContractController(K3ContractService k3ContractService) {
		this.k3ContractService = k3ContractService;
	}
	
	//계약 대표코드 중복검사
	@PostMapping("/contractCodeCheck")
	@ResponseBody
	public boolean contractCodeCheck(@RequestParam(value="contractCode",required = false)String contractCode) {
		
		boolean checkResult = false;
		
		if(contractCode != "undefined" && contractCode != null && contractCode != "".toString()) {
			int check = k3ContractService.contractCodeCheck(contractCode);
			if(check > 0) checkResult = true;
		}
		
		return checkResult;
		
	}
	
	
	//비용 계약 등록페이지 거래처 모달창
	@GetMapping("/contractorModalAjax")
	@ResponseBody
	public List<K3Contractor> K3GetContractor(){
		
		List<K3Contractor> K3Contractor = k3ContractService.K3GetContractor();
		
		return K3Contractor;
		
	}
	
	
	//비용 계약 등록페이지
	@GetMapping("/k3AddLossContract")
	public String k3AddLossContract(Model model) {
		
		List<Map<String, Object>> contractSingningDate = k3ContractService.contractSingningDate();
		
		model.addAttribute("title", "계약 관리");
		model.addAttribute("subtitle", "비용 계약 등록");
		model.addAttribute("contractSingningDate", contractSingningDate);
		
		return "/team03/contractorContract/Contract/k3AddLossContract";
	}

	//계약 상세정보 모달창
	@GetMapping("/k3SearchContractAjax")
	@ResponseBody
	public List<K3Contract> k3GetDetailContract(
										@RequestParam(value = "contractCode", required = false) String contractCode,
										@RequestParam(value = "contractorDevision", required = false) String contractorDevision) {
		
		List<K3Contract> k3DetailContract = k3ContractService.k3GetDetailContract(contractCode,contractorDevision);
		
		return k3DetailContract;
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