package k3.estimate.ahs.controller;


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

import k3.contractor.ahs.dto.K3Contractor;
import k3.estimate.ahs.dto.K3Estimate;
import k3.estimate.ahs.dto.K3Unit;
import k3.estimate.ahs.service.K3EstimateService;

@Controller
@RequestMapping(value="/team03/contractorContract/Estimate")
public class K3EstimateController {
	
	private K3EstimateService k3EstimateService;
	
	public K3EstimateController(K3EstimateService k3EstimateService) {
		this.k3EstimateService = k3EstimateService;
	}
	
	//견적서 삭제
	@PostMapping("/k3SearchEstimate")
	public String k3DeleteEstimate(HttpServletRequest request) {
		//체크박스
		if(request.getParameter("removeEstimateArr") != null) {
			
			String[] removeEstimateArr = request.getParameterValues("removeEstimateArr");
			
			int size = removeEstimateArr.length;
			for(int i=0; i < size; i++) {
				k3EstimateService.k3DeleteEstimate(removeEstimateArr[i]);
			}
		//버튼 
		}else if(request.getParameter("estimateNum") != null){
			String estimateNum = request.getParameter("estimateNum");
			k3EstimateService.k3DeleteEstimate(estimateNum);
		}
			return "redirect:/team03/contractorContract/Estimate/k3SearchEstimate";		
	}
	
	//견적서 차량 수정 처리
	@PostMapping("/k3ModifyCarEstimate")
	public String k3ModifyCarEstimate(K3Estimate k3Estimate) {
		
		k3EstimateService.k3ModifyEstimate(k3Estimate);
		k3EstimateService.k3ModifyCarDetailEstimate(k3Estimate);
		
		return "redirect:/team03/contractorContract/Estimate/k3SearchEstimate";
	}
	
	//견적서 송장 수정 처리
	@PostMapping("/k3ModifyInvoiceEstimate")
	public String k3ModifyInvoiceEstimate(K3Estimate k3Estimate) {
		
		k3EstimateService.k3ModifyEstimate(k3Estimate);
		k3EstimateService.k3ModifyInvoiceDetailEstimate(k3Estimate);
		
		return "redirect:/team03/contractorContract/Estimate/k3SearchEstimate";
	}

	//견적서 송장 수정 페이지로 이동
	@GetMapping("/k3ModifyInvoiceEstimate")
	public String k3GetModifyInvoiceEstimate(@RequestParam(value = "estimateNum",required = false)String estimateNum,
											Model model) {
		
		List<K3Estimate> k3Estimate = k3EstimateService.k3GetModifyInvoiceEstimate(estimateNum);
		
		model.addAttribute("title", "견적서 관리");
		model.addAttribute("subtitle", "견적서 수정");
		model.addAttribute("k3Estimate", k3Estimate);

		return "/team03/contractorContract/Estimate/k3ModifyInvoiceEstimate";
	}
	
	//견적서 차량 수정 페이지로 이동
	@GetMapping("/k3ModifyCarEstimate")
	public String k3GetModifyCarEstimate(@RequestParam(value = "estimateNum",required = false)String estimateNum,
										Model model) {
		
		List<K3Estimate> k3Estimate = k3EstimateService.k3GetModifyInvoiceEstimate(estimateNum);
		
		model.addAttribute("title", "견적서 관리");
		model.addAttribute("subtitle", "견적서 수정");
		model.addAttribute("k3Estimate", k3Estimate);

		return "/team03/contractorContract/Estimate/k3ModifyCarEstimate";
	}

	
	//견적서 등록처리
	@PostMapping("/k3AddEstimate")
	public String k3AddEstimate(@RequestParam(name = "invoiceUnitPrice", required = false) String invoiceUnitPrice
								,@RequestParam(name = "carPrice", required = false) String carPrice
								,@RequestParam(name = "unitPrice", required = false) String unitPrice
								,K3Estimate k3Estimate) {
		if(invoiceUnitPrice != null && invoiceUnitPrice != "".toString()) {
			k3EstimateService.k3AddEstimate(k3Estimate);
			k3EstimateService.k3AddWareEstimate(k3Estimate);
			k3EstimateService.k3AddInvoiceilEstimate(k3Estimate);
		}else if(carPrice != null && carPrice != "".toString() && unitPrice != null && unitPrice != "".toString()) {
			k3EstimateService.k3AddEstimate(k3Estimate);
			k3EstimateService.k3AddWareEstimate(k3Estimate);
			k3EstimateService.k3AddCarEstimate(k3Estimate);
			k3EstimateService.k3AddDistanceEstimate(k3Estimate);
		}
		return "redirect:/team03/contractorContract/Estimate/k3SearchEstimate";
	}
	
	//견적서 등록페이지 거래처 모달창
	@GetMapping("/contractorModalAjax")
	@ResponseBody
	public List<K3Contractor> K3GetContractor(){
		
		List<K3Contractor> K3Contractor = k3EstimateService.K3GetContractor();
		
		return K3Contractor;
		
	}
	
	//견적서 상세정보 모달창
	@GetMapping("/k3SearchEstimateAjax")
	@ResponseBody
	public List<K3Estimate> k3GetDetailEstimate(
										@RequestParam(value = "estimateNum", required = false) String estimateNum) {
		List<K3Estimate> k3DetailEstimate = k3EstimateService.k3GetDetailEstimate(estimateNum);
		
		return k3DetailEstimate;
	}
	
	//단가표 모달창
	@GetMapping("/k3UnitModalAjax")
	@ResponseBody
	public List<K3Unit> k3GetUnit() {
		List<K3Unit> k3Unit = k3EstimateService.k3GetUnit();
		
		return k3Unit;
	}
	
	//견적서 등록 페이지로 이동
	@GetMapping("/k3AddEstimate")
	public String K3GetAddEstimate(Model model) {
		//직접 값 정해주기
		List<Map<String, Object>> estimateDef = k3EstimateService.getEstimateDef();
		
		model.addAttribute("title", "견적서 관리");
		model.addAttribute("subtitle", "견적서 등록");
		model.addAttribute("estimateDef", estimateDef);

		return "/team03/contractorContract/Estimate/k3AddEstimate";
	}
	
	//견적서 현황+검색
	@GetMapping("/k3SearchEstimate")
	public String K3GetEstimateSearch(@RequestParam(value="searchKey", required=false, defaultValue="estimateNum") String searchKey,
						  			@RequestParam(value="searchValue", required=false) String searchValue,
						  			@RequestParam(value="estimateMeasureDateStart", required=false) String estimateMeasureDateStart,
						  			@RequestParam(value="estimateMeasureDateEnd", required=false) String estimateMeasureDateEnd, 
						  			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage, 
									Model model) {
		// model currentPage, lastPage, estimateList, startPageNum, endPageNum
		System.out.println("호출 잘되었나 확인");
		if(searchValue != null && searchValue != "".toString()) {
			searchValue = searchValue.trim();
			Map<String, Object> resultMap = k3EstimateService.K3SearchEstimateList(searchKey,estimateMeasureDateStart, estimateMeasureDateEnd, searchValue, currentPage);
			System.out.println("resultMap.get(\"estimateList\") 잘되었나 확인 : " + resultMap.get("estimateList") );
			model.addAttribute("lastPage", resultMap.get("lastPage"));
			model.addAttribute("startPageNum", resultMap.get("startPageNum"));
			model.addAttribute("endPageNum", resultMap.get("endPageNum"));
			model.addAttribute("searchKey", searchKey);
			model.addAttribute("searchValue", searchValue);
			model.addAttribute("estimateMeasureDateStart", estimateMeasureDateStart);
			model.addAttribute("estimateMeasureDateEnd", estimateMeasureDateEnd);
			model.addAttribute("estimateList", resultMap.get("estimateList"));
		}else if(estimateMeasureDateStart != null && estimateMeasureDateStart != "".toString() && estimateMeasureDateEnd != null && estimateMeasureDateEnd != "".toString()) {
			Map<String, Object> resultMap = k3EstimateService.K3SearchEstimateList(searchKey,estimateMeasureDateStart, estimateMeasureDateEnd, searchValue, currentPage);
			model.addAttribute("lastPage", resultMap.get("lastPage"));
			model.addAttribute("startPageNum", resultMap.get("startPageNum"));
			model.addAttribute("endPageNum", resultMap.get("endPageNum"));
			model.addAttribute("searchKey", searchKey);
			model.addAttribute("searchValue", searchValue);
			model.addAttribute("estimateMeasureDateStart", estimateMeasureDateStart);
			model.addAttribute("estimateMeasureDateEnd", estimateMeasureDateEnd);
			model.addAttribute("estimateList", resultMap.get("estimateList"));
		}else{
			Map<String, Object> resultMap = k3EstimateService.K3GetEstimateList(currentPage);
			model.addAttribute("lastPage", resultMap.get("lastPage"));
			model.addAttribute("startPageNum", resultMap.get("startPageNum"));
			model.addAttribute("endPageNum", resultMap.get("endPageNum"));
			model.addAttribute("estimateList", resultMap.get("estimateList"));
	
		}
		
		model.addAttribute("title", "견적서 관리");
		model.addAttribute("subtitle", "견적서 현황");
		model.addAttribute("currentPage", currentPage);

		return "/team03/contractorContract/Estimate/k3SearchEstimate";
	}

}