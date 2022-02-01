package k3.contract.ahs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.contract.ahs.mapper.K3ContractMapper;

@Service
@Transactional
public class K3ContractService {

	private K3ContractMapper k3ContractMapper;
	
	public K3ContractService(K3ContractMapper k3ContractMapper) {
		this.k3ContractMapper = k3ContractMapper;
	}

	//계약 검색기능
	public Map<String, Object> K3SearchContractList(String searchKey, String contractSingningDateStart, String contractSingningDateEnd, String searchValue, int currentPage) 
	{
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		List<Map<String,Object>> contractListCount = k3ContractMapper.K3SearchContractCount(paramMap, searchKey, contractSingningDateStart, contractSingningDateEnd, searchValue);
		
		
		currentPage = 1;
		
		// 검색된 견적서 투플 수(페이징)
		double rowCount = contractListCount.size();
		
		// 보여줄 행의 개수
		int rowPerPage = 1;
		if(rowCount < 5) {
			rowPerPage = (int) rowCount;
		}else {
			rowPerPage = 5;
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
		
		List<Map<String,Object>> contractList = k3ContractMapper.K3SearchContractList(paramMap, searchKey, contractSingningDateStart, contractSingningDateEnd, searchValue);

		paramMap.clear();
		
		paramMap.put("lastPage", lastPage);
		paramMap.put("contractList", contractList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
		
	}	
	
	//계약현황에 계약목록 불러오기
	public Map<String, Object> k3GetContractList(int currentPage){

		//계약 정보 테이블 행의 개수
		double rowCount = k3ContractMapper.k3GetContractCount();
		
		// 보여줄 행의 개수
		int rowPerPage = 0;
		if(rowCount < 5) {
			rowPerPage = (int) rowCount;
		}else {
			rowPerPage = 5;
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
		
		List<Map<String,Object>> contractList = k3ContractMapper.k3GetContractList(paramMap);
		
		paramMap.clear();
		
		paramMap.put("lastPage", lastPage);
		paramMap.put("contractList", contractList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
	}

}
