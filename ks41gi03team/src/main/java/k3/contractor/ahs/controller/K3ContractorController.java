package k3.contractor.ahs.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import k3.contractor.ahs.dto.K3Contractor;
import k3.contractor.ahs.dto.K3DetailContractor;
import k3.contractor.ahs.service.K3ContractorService;

@Controller
@RequestMapping(value="/team03/contractorContract/Contractor")
public class K3ContractorController {
	
	
	private K3ContractorService k3ContractorService;
	
	public K3ContractorController(K3ContractorService k3ContractorService) {
		this.k3ContractorService = k3ContractorService;
	}
	
	//거래처 수정으로 화면전환
	@GetMapping("/k3ModifyContractor")
	public String k3GetModifyContractor(@RequestParam(value="contractorCode", required = false) String contractorCode
										, Model model) {
		//거래처 정보
		if(contractorCode != null && !"".equals(contractorCode)) {
			K3DetailContractor contractorInfo =  (K3DetailContractor) k3ContractorService.K3GetContractorList(0);
			model.addAttribute("contractorInfo", contractorInfo);
		}
		
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
	public String k3AddContractor(K3DetailContractor k3ContractorDetail) {
		
		k3ContractorService.k3AddContractor(k3ContractorDetail);
		k3ContractorService.k3AddDetailContractor(k3ContractorDetail);
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
	

	
	
	//거래처 검색 기능
	@PostMapping("/k3SearchContractor")
	public String K3SearchContractorList(@RequestParam(value="searchKey", required=false) String searchKey ,
										 @RequestParam(value="searchValue", required=false) String searchValue,
										 @RequestParam(value="contractorRegistrationDateStart", required=false) String contractorRegistrationDateStart,
										 @RequestParam(value="contractorRegistrationDateEnd", required=false) String contractorRegistrationDateEnd,
										 Model model) {
	
		//검색키(searchKey), 검색어(searchValue)를 이용해서 거래처 목록 조회
		if(searchKey != null && "contractorCode".equals(searchKey)) {
			searchKey = "contractorCode";
		}else if(searchKey != null && "contractorName".equals(searchKey)) {
			searchKey = "contractorName";
		}else if(searchKey != null && "contractorItem".equals(searchKey)) {
			searchKey = "contractorItem";
		}else if(searchKey != null && "contractorStatus".equals(searchKey)) {
			searchKey = "contractorStatus";
		}else if(searchKey != null && "contractorDevision".equals(searchKey)) {
			searchKey = "contractorDevision";
		}else if(searchKey != null && "contractorPhone".equals(searchKey)) {
			searchKey = "contractorPhone";
		}else if(searchKey != null && "contractorId".equals(searchKey)) {
			searchKey = "contractorId";
		}else if(searchKey != null && "contractorState".equals(searchKey)) {
			searchKey = "contractorState";
		}else if(searchKey != null && "memberId".equals(searchKey)) {
			searchKey = "memberId";
		}else if(searchKey == null && contractorRegistrationDateStart != null && contractorRegistrationDateEnd != null) {
			
		}else{
			searchKey = "*" ;
		}
		
		List<K3Contractor> k3SearchContractorList = k3ContractorService.K3SearchContractorList(searchKey, searchValue);
		
		
		//조회된 거래처 목록 model에 값 저장
		model.addAttribute("title", "거래처 관리");
		model.addAttribute("subtitle", "거래처 현황");
		model.addAttribute("contractorList", k3SearchContractorList);	
		
		System.out.println("model = " + model);
		
		return "/team03/contractorContract/Contractor/k3SearchContractor"; 
	}
	 
	
	//거래처 상세정보 모달창으로 화면 전환+거래처정보 가져오기 public K3DetailContractor
	@GetMapping("/k3SearchContractorAjax")
	@ResponseBody
	public K3DetailContractor k3GetDetailContractor(@RequestParam(value="contractorCode", required = false) String contractorCode) { 

		K3DetailContractor k3DetailContractor = k3ContractorService.K3GetDetailContractor(contractorCode);
		
		return k3DetailContractor; 
	}
	 
	
	
	//거래처 현황에 거래처 가져오기
	@GetMapping("/k3SearchContractor")
	public String K3GetSearchContractor(@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage
										,Model model) {
		
		   //model currentPage, lastPage, contractorList, startPageNum, endPageNum
		Map<String, Object> resultMap = k3ContractorService.K3GetContractorList(currentPage);

		model.addAttribute("title", "거래처 관리");
		model.addAttribute("subtitle", "거래처 현황");
		model.addAttribute("currentPage",		currentPage);
		model.addAttribute("lastPage",			resultMap.get("lastPage"));
		model.addAttribute("contractorList",	resultMap.get("contractorList"));
		model.addAttribute("startPageNum",		resultMap.get("startPageNum"));
		model.addAttribute("endPageNum",			resultMap.get("endPageNum"));

		return "/team03/contractorContract/Contractor/k3SearchContractor";
	}
	

}
