package k3.estimate.ahs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.contractor.ahs.dto.K3Contractor;
import k3.contractor.ahs.dto.K3DetailContractor;
import k3.contractor.ahs.mapper.K3ContractorMapper;
import k3.estimate.ahs.dto.K3Estimate;
import k3.estimate.ahs.dto.K3Unit;
import k3.estimate.ahs.mapper.K3EstimateMapper;

@Service
@Transactional
public class K3EstimateService {
	
	private final K3EstimateMapper k3EstimateMapper;

	public K3EstimateService(K3EstimateMapper k3EstimateMapper) {
		this.k3EstimateMapper = k3EstimateMapper;
	}
	
	//견적서 삭제처리
	public void k3DeleteEstimate(String estimateNum) {
		k3EstimateMapper.k3DeleteEstimate(estimateNum);
		k3EstimateMapper.k3DeleteDetailEstimate(estimateNum);
	}
	
	//견적서 수정처리
	public int k3ModifyEstimate(K3Estimate k3Estimate) {
		int result = k3EstimateMapper.k3ModifyEstimate(k3Estimate);
		return result;
	}
	
	//견적서 송장 수정처리
	public int k3ModifyInvoiceDetailEstimate(K3Estimate k3Estimate) {
		int result = k3EstimateMapper.k3ModifyWareDetailEstimate(k3Estimate);
		result += k3EstimateMapper.k3ModifyInvoiceDetailEstimate(k3Estimate);
		return result;
	}
	
	//견적서 차량 수정처리
	public int k3ModifyCarDetailEstimate(K3Estimate k3Estimate) {
		int result = k3EstimateMapper.k3ModifyWareDetailEstimate(k3Estimate);
		result += k3EstimateMapper.k3ModifyCarDetailEstimate(k3Estimate);
		result += k3EstimateMapper.k3ModifyDistanceDetailEstimate(k3Estimate);
		return result;
	}
	
	//견적서 송장 수정 페이지로 이동
	public List<K3Estimate> k3GetModifyInvoiceEstimate(String estimateNum) {
		
		List<K3Estimate> k3Estimate = k3EstimateMapper.k3GetModifyInvoiceEstimate(estimateNum);
		
		return k3Estimate;
		
	}
	
	//견적서 차량 수정 페이지로 이동
	public List<K3Estimate> k3GetModifyCarEstimate(String estimateNum) {
		
		List<K3Estimate> k3Estimate = k3EstimateMapper.k3GetModifyCarEstimate(estimateNum);
		
		return k3Estimate;
		
	}
	
	//견적서 등록 k3_tb_estimate
	public int k3AddEstimate(K3Estimate k3Estimate) {
		int result = k3EstimateMapper.k3AddEstimate(k3Estimate);
		
		return result;
	}
	
	//견적서 창고 등록 k3_tb_estimate_detail
	public int k3AddWareEstimate(K3Estimate k3Estimate) {
		int result = k3EstimateMapper.k3AddWareEstimate(k3Estimate);
				
		return result;
	}
	
	//견적서 송장 등록 k3_tb_estimate_detail
	public int k3AddInvoiceilEstimate(K3Estimate k3Estimate) {
		int result = k3EstimateMapper.k3AddInvoiceilEstimate(k3Estimate);
		
		return result;
	}
	
	//견적서 차량 등록 k3_tb_estimate_detail
	public int k3AddCarEstimate(K3Estimate k3Estimate) {
		int result = k3EstimateMapper.k3AddCarEstimate(k3Estimate);
		
		return result;
	}
	
	//견적서 거리 등록 k3_tb_estimate_detail
	public int k3AddDistanceEstimate(K3Estimate k3Estimate) {
		int result = k3EstimateMapper.k3AddDistanceEstimate(k3Estimate);
		
		return result;
	}
	
	//등록페이지 값 정해주기
	public List<Map<String, Object>> getEstimateDef(){
		
		List<Map<String, Object>> estimateDef = k3EstimateMapper.getEstimateDef(); 
		
		return estimateDef;
		
	}
	
	//견적서 등록페이지 거래처 모달창
	public List<K3Contractor> K3GetContractor(){
		
		List<K3Contractor> K3Contractor = k3EstimateMapper.K3GetContractor();
		
		return K3Contractor;
		
	}
	
	//견적서 상세정보 모달창
	public List<K3Estimate> k3GetDetailEstimate(String estimateNum) {
		
		List<K3Estimate> k3DetailEstimate = k3EstimateMapper.k3GetDetailEstimate(estimateNum);
		
		return k3DetailEstimate;
	}
	
	//단가표 모달창
	public List<K3Unit> k3GetUnit() {
		List<K3Unit> k3Unit = k3EstimateMapper.k3GetUnit();
		
		return k3Unit;
	}
	
	//견적서 검색기능
	public Map<String, Object> K3SearchEstimateList(String searchKey, String estimateMeasureDateStart, String estimateMeasureDateEnd, String searchValue, int currentPage) 
	{
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		List<Map<String,Object>> estimateListCount = k3EstimateMapper.K3SearchEstimateCount(paramMap, searchKey, estimateMeasureDateStart, estimateMeasureDateEnd, searchValue);
		
		
		currentPage = 1;
		
		// 검색된 견적서 투플 수(페이징)
		double rowCount = estimateListCount.size();
		
		// 보여줄 행의 개수
		int rowPerPage = 1;
		if(rowCount < 4) {
			rowPerPage = (int) rowCount;
		}else {
			rowPerPage = 4;
		}
		System.out.println("몇개일까" + rowCount + "얼마나 보여줄까" + rowPerPage);
		
		//마지막 페이지
		int lastPage = (int) Math.ceil((rowCount / rowPerPage));
		if(rowPerPage == 0) {
			lastPage = 1;
		}
		
		//페이지 알고리즘
		int startNum = (currentPage - 1) * rowPerPage;
		
		// 보여줄 시작 페이지 번호
		int startPageNum = 1;
		
		// 보여줄 마지막 페이지 번호
		int endPageNum = 0;
		if(lastPage > 5) {
			endPageNum = 5;
		}else {
			endPageNum = lastPage;
		}
		
		// 동적 페이지 구성 (7페이지 부터)
		if(currentPage > 5) {
			startPageNum = currentPage - 2;
			endPageNum = currentPage + 2;
			if(endPageNum > lastPage) {
				startPageNum = lastPage - 4;
				endPageNum = lastPage;
			}
		}

		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String,Object>> estimateList = k3EstimateMapper.K3SearchEstimateList(paramMap, searchKey, estimateMeasureDateStart, estimateMeasureDateEnd, searchValue);

		paramMap.clear();
		
		paramMap.put("lastPage", lastPage);
		paramMap.put("estimateList", estimateList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
		
	}
	
	//견적서 현황에 견적서 불러오기
	public Map<String, Object> K3GetEstimateList(int currentPage){
		
		//거래처 정보 테이블 행의 개수
		double rowCount = k3EstimateMapper.K3GetEstimateCount();
		
		// 보여줄 행의 개수
		int rowPerPage = 0;
		if(rowCount < 4) {
			rowPerPage = (int) rowCount;
		}else {
			rowPerPage = 4;
		}
		
		
		//마지막 페이지
		int lastPage = (int) Math.ceil((rowCount / rowPerPage));
		if(rowPerPage == 0) {
			lastPage = 1;
		}
		
		//페이지 알고리즘
		int startNum = (currentPage - 1) * rowPerPage;
		
		// 보여줄 시작 페이지 번호
		int startPageNum = 1;
		
		// 보여줄 마지막 페이지 번호
		int endPageNum = 0;
		if(lastPage > 5) {
			endPageNum = 5;
		}else {
			endPageNum = lastPage;
		}
		
		System.out.println("보여줄 페이지 마지막번호 : "+ endPageNum+ "-->끝");
		
		// 동적 페이지 구성 (7페이지 부터)
		if(currentPage > 5) {
			startPageNum = currentPage - 2;
			endPageNum = currentPage + 2;
			if(endPageNum > lastPage) {
				startPageNum = lastPage - 4;
				endPageNum = lastPage;
			}
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String,Object>> estimateList = k3EstimateMapper.K3GetEstimateList(paramMap);
		
		paramMap.clear();
		
		paramMap.put("lastPage", lastPage);
		paramMap.put("estimateList", estimateList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
	}

	
	

}



