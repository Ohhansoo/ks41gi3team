package k3.estimate.ahs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.estimate.ahs.dto.K3Estimate;
import k3.estimate.ahs.dto.K3Unit;
import k3.estimate.ahs.mapper.K3EstimateMapper;

@Service
@Transactional
public class K3EstimateService {
	
	private K3EstimateMapper k3EstimateMapper;
	
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
	
	public K3EstimateService(K3EstimateMapper k3EstimateMapper) {
		this.k3EstimateMapper = k3EstimateMapper;
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



