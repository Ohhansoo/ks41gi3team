package k3.stock.ahs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import k3.stock.ahs.dto.K3Stock;
import k3.stock.ahs.mapper.K3StockMapper;
import k3.warehousing.ahs.dto.K3WarehousingSort;

@Service
public class K3StockService {
	private K3StockMapper k3StockMapper;
	
	public K3StockService(K3StockMapper k3StockMapper) {
		this.k3StockMapper = k3StockMapper;
	}
	//간단재고 현황 조회처리
	public Map<String, Object> k3GetSimpleStockSearchList(Map<String, Object> searchCondition, int currentPage) {
		// 보여줄 행의 개수
		int rowPerPage = 7;
		
		// 재고현황 테이블 행의 개수
		String countType = "search";
		double rowCount = k3StockMapper.k3GetDetailCount(countType, searchCondition);
		
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
		if(lastPage < 11) endPageNum = lastPage;
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> simpleStockList = k3StockMapper.k3GetSimpleStockSearchList(searchCondition, paramMap);
		
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("simpleStockList", simpleStockList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
	}
	
	//상세재고 현황 조회처리
	public Map<String, Object> k3GetDetailStockSearchList(Map<String, Object> searchCondition, int currentPage) {
		// 보여줄 행의 개수
		int rowPerPage = 7;
		
		// 재고현황 테이블 행의 개수
		String countType = "search";
		double rowCount = k3StockMapper.k3GetDetailCount(countType, searchCondition);
		
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
		if(lastPage < 11) endPageNum = lastPage;
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> detailStockList = k3StockMapper.k3GetDetailStockSearchList(searchCondition, paramMap);
		
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("detailStockList", detailStockList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
	}
	
	//로케이션 상태 바꾸기(사용중 -> 비었음)
	public int K3ReturnLocationState(String beforelocationCode) {
		int returnLocationState = k3StockMapper.K3ReturnLocationState(beforelocationCode);
		return returnLocationState;
	}
	//로케이션 상태 바꾸기(비었음 -> 사용중)
	public int K3InputLocationState(String locationCode) {
		int inputLocationState = k3StockMapper.K3InputLocationState(locationCode);
		return inputLocationState;
	}
	//재고 수정폼 처리
	public int K3ModifyStock(K3Stock k3Stock) {
		int result = k3StockMapper.K3ModifyStock(k3Stock);
		return result;
	}
	
	//재고 수정폼 이동
	public List<K3Stock> K3GetStockInfo(String stockCode) {
		List<K3Stock> modifyList = k3StockMapper.K3GetStockInfo(stockCode);
		return modifyList;
	}
	
	//로케이션 테이블에 사용현황 업데이트
	public int k3UpdateLocationState(K3Stock k3Stock) {
		int locationStateResult = k3StockMapper.k3UpdateLocationState(k3Stock);
		return locationStateResult;
	}
	//재고등록 업데이트
	public int k3UpdateSorting(K3Stock k3Stock) {
		int soringResult = k3StockMapper.k3UpdateSorting(k3Stock);
		return soringResult;
	}
	
	//재고 등록처리
	public int k3AddStock(K3Stock k3Stock) {		
		int result = k3StockMapper.k3AddStock(k3Stock);
		return result;
	}
	
	//재고 등록 리스트 이동
	public List<K3Stock> k3AddStockList() {
		List<K3Stock> requestSort = k3StockMapper.k3AddStockList();
		return requestSort;
	}
	
	
	//재고현황 상세조회(초기화면)2
	public Map<String, Object> k3GetStockByLocation(int currentPage) {
			// 보여줄 행의 개수
			int rowPerPage = 7;
			
			// 재고현황 테이블 행의 개수
			String countType = "normal";
			double rowCount = k3StockMapper.k3GetDetailCount(countType, null);
			
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
			if(lastPage < 11) endPageNum = lastPage;
			
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("startNum", startNum);
			paramMap.put("rowPerPage", rowPerPage);
			
			List<Map<String, Object>> detailStockList = k3StockMapper.k3GetStockByLocation(paramMap);
			
			paramMap.clear();
			paramMap.put("lastPage", lastPage);
			paramMap.put("detailStockList", detailStockList);
			paramMap.put("startPageNum", startPageNum);
			paramMap.put("endPageNum", endPageNum);
			
			return paramMap;

	}
	
	//재고현황 간단조회(초기화면)
	public Map<String, Object> k3GetStockByStockName(int currentPage) {
			// 보여줄 행의 개수
			int rowPerPage = 7;
			
			// 재고현황 테이블 행의 개수
			String countType = "normal";
			double rowCount = k3StockMapper.k3GetSimpleCount(countType, null);
			
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
			
			if(lastPage < 11) endPageNum = lastPage;
			
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("startNum", startNum);
			paramMap.put("rowPerPage", rowPerPage);
			
			List<Map<String, Object>> simpleStockList = k3StockMapper.k3GetStockByStockName(paramMap);
			
			paramMap.clear();
			paramMap.put("lastPage", lastPage);
			paramMap.put("simpleStockList", simpleStockList);
			paramMap.put("startPageNum", startPageNum);
			paramMap.put("endPageNum", endPageNum);
			
			return paramMap;
	}

}
