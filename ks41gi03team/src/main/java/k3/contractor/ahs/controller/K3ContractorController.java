package k3.contractor.ahs.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import k3.contractor.ahs.dto.K3DetailContractor;
import k3.contractor.ahs.service.K3ContractorService;

@Controller
@RequestMapping(value = "/team03/contractorContract/Contractor")
public class K3ContractorController {

	private K3ContractorService k3ContractorService;

	public K3ContractorController(K3ContractorService k3ContractorService) {
		this.k3ContractorService = k3ContractorService;
	}
	
	//거래처 삭제처리
	@PostMapping("/k3SearchContractor")
	public String k3DeleteContractor(HttpServletRequest request) {
		//체크박스
		if(request.getParameter("removeContractorArr") != null) {
			
			String[] removeContractorArr = request.getParameterValues("removeContractorArr");
			
			int size = removeContractorArr.length;
			for(int i=0; i < size; i++) {
				k3ContractorService.k3DeleteContractor(removeContractorArr[i]);
			}
		//버튼 
		}else if(request.getParameter("deleteContractorCode") != null){
			String deleteContractorCode = request.getParameter("deleteContractorCode");
			k3ContractorService.k3DeleteContractor(deleteContractorCode);
		}
			return "redirect:/team03/contractorContract/Contractor/k3SearchContractor";
	}

	//거래처 중복확인
	@PostMapping("/contractorCheck")
	@ResponseBody
	public boolean k3ContractorCheck(@RequestParam(value="contractorCode", required = false)String contractorCode
									,@RequestParam(value="contractorBusinessNum", required = false)String contractorBusinessNum
									,@RequestParam(value="contractorBusinessClientNum", required = false)String contractorBusinessClientNum
									) {
		System.out.println("ajax로 받은 파라미터 contractorCode확인 : " + contractorCode + "-> 확인끝");
		System.out.println("ajax로 받은 파라미터 concontractorBusinessNum확인 : " + contractorBusinessNum + "-> 확인끝");
		System.out.println("ajax로 받은 파라미터 contractorBusinessClientNum확인 : " + contractorBusinessClientNum + "-> 확인끝");
		
		boolean checkResult = false;
		
		if(contractorCode != "undefined" && contractorCode != null && contractorCode != "".toString()) {
			int check = k3ContractorService.k3ContractorCodeCheck(contractorCode);
			if(check > 0) checkResult = true;
		}else if(contractorBusinessNum != "undefined" && contractorBusinessNum != null && contractorBusinessNum != "".toString()) {
			int check = k3ContractorService.k3ContractorBusinessNumCheck(contractorBusinessNum);
			if(check > 0) checkResult = true;
		}else if(contractorBusinessClientNum != "undefined" && contractorBusinessClientNum != null && contractorBusinessClientNum != "".toString()) {
			int check = k3ContractorService.k3ContractorBusinessClientNumCheck(contractorBusinessClientNum);
			if(check > 0) checkResult = true;
		}
		
		return checkResult;
	}

	
	//거래처 수정처리
	@PostMapping("/k3ModifyContractor")
	public String k3ModifyContractor(K3DetailContractor k3DetailContractor) {
		 k3ContractorService.k3ModifyContractor(k3DetailContractor);
		 k3ContractorService.k3ModifyDetailContractor(k3DetailContractor);
		
		return "redirect:/team03/contractorContract/Contractor/k3SearchContractor";
	}
	
	// 거래처 수정으로 화면전환
	@GetMapping("/k3ModifyContractor")
	public String k3GetModifyContractor(@RequestParam(value = "contractorCode", required = false) String contractorCode,
										Model model) {
		
		K3DetailContractor k3DetailContractor = k3ContractorService.k3GetModifyContractor(contractorCode);
		
		model.addAttribute("title", "거래처 관리");
		model.addAttribute("subtitle", "거래처 정보 수정");
		model.addAttribute("k3DetailContractor", k3DetailContractor);

		return "/team03/contractorContract/Contractor/k3ModifyContractor";
	}
	

	// 거래처 등록으로 화면전환
	@GetMapping("/k3AddContractor")
	public String k3GetAddContractor(Model model) {
		List<Map<String, Object>> contractorIdPw = k3ContractorService.getContractorIdPw();

		model.addAttribute("title", "거래처 관리");
		model.addAttribute("subtitle", "거래처 등록");
		model.addAttribute("contractorIdPw", contractorIdPw);
		
		System.out.println("변수 내부 확인 contractorIdPw : " + contractorIdPw);
		
		return "/team03/contractorContract/Contractor/k3AddContractor";
	}

	// 거래처 등록
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

	

	 

	// 거래처 상세정보 모달창으로 화면 전환+거래처정보 가져오기 public K3DetailContractor
	@GetMapping("/k3SearchContractorAjax")
	@ResponseBody
	public K3DetailContractor k3GetDetailContractor(
			@RequestParam(value = "contractorCode", required = false) String contractorCode) {

		K3DetailContractor k3DetailContractor = k3ContractorService.K3GetDetailContractor(contractorCode);

		return k3DetailContractor;
	}

	// 거래처 현황에 거래처 가져오기 + 검색 기능(동적 페이징)
	@GetMapping("/k3SearchContractor")
	public String K3GetSearchContractor(@RequestParam(value="searchKey", required=false, defaultValue="contractorCode") String searchKey,
						  			@RequestParam(value="searchValue", required=false) String searchValue,
						  			@RequestParam(value="contractorRegistrationDateStart", required=false) String contractorRegistrationDateStart,
						  			@RequestParam(value="contractorRegistrationDateEnd", required=false) String contractorRegistrationDateEnd, 
						  			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage, 
									Model model) {

		// model currentPage, lastPage, contractorList, startPageNum, endPageNum
		
		if(searchValue != null && searchValue != "".toString()) {
			searchValue = searchValue.trim();
			Map<String, Object> resultMap = k3ContractorService.K3SearchContractorList(searchKey,contractorRegistrationDateStart, contractorRegistrationDateEnd, searchValue, currentPage);
			model.addAttribute("lastPage", resultMap.get("lastPage"));
			model.addAttribute("startPageNum", resultMap.get("startPageNum"));
			model.addAttribute("endPageNum", resultMap.get("endPageNum"));
			model.addAttribute("searchKey", searchKey);
			model.addAttribute("searchValue", searchValue);
			model.addAttribute("contractorRegistrationDateStart", contractorRegistrationDateStart);
			model.addAttribute("contractorRegistrationDateEnd", contractorRegistrationDateEnd);
			model.addAttribute("contractorList", resultMap.get("contractorList"));
		}else if(contractorRegistrationDateStart != null && contractorRegistrationDateStart != "".toString() && contractorRegistrationDateEnd != null && contractorRegistrationDateEnd != "".toString()) {
			Map<String, Object> resultMap = k3ContractorService.K3SearchContractorList(searchKey,contractorRegistrationDateStart, contractorRegistrationDateEnd, searchValue, currentPage);
			model.addAttribute("lastPage", resultMap.get("lastPage"));
			model.addAttribute("startPageNum", resultMap.get("startPageNum"));
			model.addAttribute("endPageNum", resultMap.get("endPageNum"));
			model.addAttribute("searchKey", searchKey);
			model.addAttribute("searchValue", searchValue);
			model.addAttribute("contractorRegistrationDateStart", contractorRegistrationDateStart);
			model.addAttribute("contractorRegistrationDateEnd", contractorRegistrationDateEnd);
			model.addAttribute("contractorList", resultMap.get("contractorList"));
		}else{
			Map<String, Object> resultMap = k3ContractorService.K3GetContractorList(currentPage);
			model.addAttribute("lastPage", resultMap.get("lastPage"));
			model.addAttribute("startPageNum", resultMap.get("startPageNum"));
			model.addAttribute("endPageNum", resultMap.get("endPageNum"));
			model.addAttribute("contractorList", resultMap.get("contractorList"));
	
		}
		
		model.addAttribute("title", "거래처 관리");
		model.addAttribute("subtitle", "거래처 현황");
		model.addAttribute("currentPage", currentPage);


		return "/team03/contractorContract/Contractor/k3SearchContractor";
	}

}
