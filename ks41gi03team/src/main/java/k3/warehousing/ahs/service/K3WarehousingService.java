package k3.warehousing.ahs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import k3.check.ahs.dto.K3LaydownCheck;
import k3.contract.ahs.dto.K3Contract;
import k3.stock.ahs.dto.K3Stock;
import k3.warehousing.ahs.dto.K3Warehousing;
import k3.warehousing.ahs.dto.K3WarehousingSort;
import k3.warehousing.ahs.mapper.K3WarehousingMapper;

@Service
public class K3WarehousingService {
	
	private final K3WarehousingMapper k3WarehousingMapper;
	
	public K3WarehousingService(K3WarehousingMapper k3WarehousingMapper) {
		this.k3WarehousingMapper = k3WarehousingMapper;
	}
	//로케이션 테이블에 사용현황 업데이트
	public int k3UpdateLocationState(K3Stock k3Stock) {
		int locationStateResult = k3WarehousingMapper.k3UpdateLocationState(k3Stock);
		return locationStateResult;
	}
	//입고분류여부 업데이트
	public int k3UpdateSorting(K3Stock k3Stock) {
		int soringResult = k3WarehousingMapper.k3UpdateSorting(k3Stock);
		return soringResult;
	}
	
	//입고분류 등록처리
	public int k3AddWarehousingSort(K3Stock k3Stock) {		
		int result = k3WarehousingMapper.k3AddWarehousingSort(k3Stock);
		return result;
	}
	
	//입하검수현황 조회 처리
	public Map<String, Object> k3GetLaydownSearchList(Map<String, Object> searchCondition, int currentPage) {
		// 보여줄 행의 개수
		int rowPerPage = 7;
		
		// 로그인 이력 테이블 행의 개수
		String countType = "search";
		double rowCount = k3WarehousingMapper.k3GetLaydownCheckCount(countType, searchCondition);
		
		// 마지막 페이지
		int lastPage = (int) Math.ceil((rowCount / rowPerPage));
		
		// 페이지 알고리즘
		int startNum = (currentPage - 1) * rowPerPage;
		
		//보여줄 시작 페이지 번호
		int startPageNum = 1;
		//보여줄 마지막 페이지 번호
		int endPageNum = 10;
		// 동적 페이지 구정( 7페이지 부터)
		if(currentPage > 6) {
			startPageNum = currentPage - 5;
			endPageNum = currentPage + 4;
			if(endPageNum >= lastPage) {
				startPageNum = lastPage - 9;
				endPageNum = lastPage;
			}
		}
		
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> laydownCheck = k3WarehousingMapper.k3GetLaydownSearchList(searchCondition, paramMap);
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("laydownCheck", laydownCheck);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);

		return paramMap;
	}
	
	//입고 현황 조회 처리
	public Map<String, Object> k3GetWarehousingSearchList(Map<String, Object> searchCondition, int currentPage){
		// 보여줄 행의 개수
		int rowPerPage = 7;
		
		// 로그인 이력 테이블 행의 개수
		String countType = "search";
		double rowCount = k3WarehousingMapper.k3GetWarehousingCount(countType, searchCondition);
		
		// 마지막 페이지
		int lastPage = (int) Math.ceil((rowCount / rowPerPage));
		
		// 페이지 알고리즘
		int startNum = (currentPage - 1) * rowPerPage;
		
		//보여줄 시작 페이지 번호
		int startPageNum = 1;
		//보여줄 마지막 페이지 번호
		int endPageNum = 10;
		// 동적 페이지 구정( 7페이지 부터)
		if(currentPage > 6) {
			startPageNum = currentPage - 5;
			endPageNum = currentPage + 4;
			if(endPageNum >= lastPage) {
				startPageNum = lastPage - 9;
				endPageNum = lastPage;
			}
		}
		
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> warehousingList = k3WarehousingMapper.k3GetWarehousingSearchList(searchCondition, paramMap);
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("warehousingList", warehousingList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		return paramMap;
		

	}
	//입고 승인/반려 처리
	public int k3AllowWarehousing(Map<String, Object> warehousingList) {
		int result = k3WarehousingMapper.k3AllowWarehousing(warehousingList);
		return result;
	}
	//입고 요청 등록 처리 
	public int k3AddWarehousing(K3Warehousing k3Warehousing) {
		int result = k3WarehousingMapper.k3AddWarehousing(k3Warehousing);
		return result;
	}
	//입고 요청폼에서 모달 조회 처리
	public List<Map<String, Object>> k3FindContractorName() {
		List<Map<String, Object>> resultList = k3WarehousingMapper.k3FindContractorName(null);
		return resultList;
	}
	//계약처 이름 찾아오기
	public List<K3Contract> k3FindContractorNameByCode(){
		List<K3Contract> nameList = k3WarehousingMapper.k3FindContractorNameByCode();
		return nameList;
	}
	
	//입고 요청 현황
	public List<K3Warehousing> k3RequestAllowWarehousing() {
		List<K3Warehousing> K3RequestAllow = k3WarehousingMapper.k3RequestAllowWarehousing();
		return K3RequestAllow;
	}

	//입고분류 등록폼 이동
	/*
	 * public List<K3Warehousing> k3GetSortInfo(String warehousingCode) {
	 * List<K3Warehousing> warehousingSort =
	 * k3WarehousingMapper.k3GetSortInfo(warehousingCode); return warehousingSort; }
	 */
	//입고 분류 현황(요청목록)
	public List<K3WarehousingSort> k3GetWarehousingRequestSort() {
		List<K3WarehousingSort> requestSort = k3WarehousingMapper.k3GetWarehousingRequestSort();
		return requestSort;
	}
	
	//입고 분류 현황(완료목록)
	public List<K3WarehousingSort> k3GetWarehousingSortList() {
		List<K3WarehousingSort> sortList = k3WarehousingMapper.k3GetWarehousingSortList();
		return sortList;
	}
	
	//검수 현황(초기화면)
	public Map<String, Object> k3GetLaydownCheck(int currentPage) {
		// 보여줄 행의 개수
		int rowPerPage = 7;
		
		// 로그인 이력 테이블 행의 개수
		String countType = "normal";
		double rowCount = k3WarehousingMapper.k3GetLaydownCheckCount(countType, null);
		
		// 마지막 페이지
		int lastPage = (int) Math.ceil((rowCount / rowPerPage));
		
		// 페이지 알고리즘
		int startNum = (currentPage - 1) * rowPerPage;
		
		//보여줄 시작 페이지 번호
		int startPageNum = 1;
		//보여줄 마지막 페이지 번호
		int endPageNum = 10;
		// 동적 페이지 구정( 7페이지 부터)
		if(currentPage > 6) {
			startPageNum = currentPage - 5;
			endPageNum = currentPage + 4;
			if(endPageNum >= lastPage) {
				startPageNum = lastPage - 9;
				endPageNum = lastPage;
			}
		}
		
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> laydownCheck = k3WarehousingMapper.k3GetLaydownCheck(paramMap);
		
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("laydownCheck", laydownCheck);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
	}
	
	//입고 현황(초기화면)
	public Map<String, Object> k3GetWarehousingList(int currentPage) {
		// 보여줄 행의 개수
		int rowPerPage = 7;
		
		// 로그인 이력 테이블 행의 개수
		String countType = "normal";
		double rowCount = k3WarehousingMapper.k3GetWarehousingCount(countType, null);
		
		// 마지막 페이지
		int lastPage = (int) Math.ceil((rowCount / rowPerPage));
		
		// 페이지 알고리즘
		int startNum = (currentPage - 1) * rowPerPage;
		
		//보여줄 시작 페이지 번호
		int startPageNum = 1;
		//보여줄 마지막 페이지 번호
		int endPageNum = 10;
		// 동적 페이지 구정( 7페이지 부터)
		if(currentPage > 6) {
			startPageNum = currentPage - 5;
			endPageNum = currentPage + 4;
			if(endPageNum >= lastPage) {
				startPageNum = lastPage - 9;
				endPageNum = lastPage;
			}
		}
		
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> warehousingList = k3WarehousingMapper.k3GetWarehousingList(paramMap);
		
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("warehousingList", warehousingList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
	}
}
