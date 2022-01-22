package k3.check.ahs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import k3.check.ahs.dto.K3LaydownCheck;
import k3.check.ahs.dto.K3ShipmentCheck;
import k3.check.ahs.mapper.K3CheckMapper;
import k3.release.ahs.dto.K3Release;
import k3.stock.ahs.dto.K3Stock;
import k3.warehousing.ahs.dto.K3Warehousing;

@Service
public class K3CheckService {
	private final K3CheckMapper k3CheckMapper;
	
	public K3CheckService(K3CheckMapper k3CheckMapper) {
		this.k3CheckMapper = k3CheckMapper;
	}
	//출하검수 현황 이동
	public List<K3Release> k3GetShipmentCheckList() {
		List<K3Release> K3ShipmentCheck = k3CheckMapper.k3GetShipmentCheckList();
		return K3ShipmentCheck;
	}
	
	//--------------------------------------------- 입하검수 -----------------------------------------------
	
	//입하검수현황 조회 처리
	public Map<String, Object> k3GetLaydownSearchList(Map<String, Object> searchCondition, int currentPage) {
		// 보여줄 행의 개수
		int rowPerPage = 7;
		
		// 로그인 이력 테이블 행의 개수
		String countType = "search";
		double rowCount = k3CheckMapper.k3GetLaydownCheckCount(countType, searchCondition);
		
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
		
		List<Map<String, Object>> laydownCheck = k3CheckMapper.k3GetLaydownSearchList(searchCondition, paramMap);
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("laydownCheck", laydownCheck);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);

		return paramMap;
	}
	
	//입하검수 등록처리
	public int k3AddLaydownCheck(K3Warehousing k3Warehousing) {
		int result = k3CheckMapper.k3AddLaydownCheck(k3Warehousing);
		return result;
	}
	
	//<모달>-입하검수 등록을 위한 입하검수코드 조회
	public List<Map<String, Object>> k3GetLaydownCheckCodeList() {
		List<Map<String, Object>> laydownCheckCodeList = k3CheckMapper.k3GetLaydownCheckCodeList(null);
		return laydownCheckCodeList;
	}
	
	//입하검수 등록/수정 페이지 이동(물품명, 개수 세팅)
	public List<K3Warehousing> getLaydownCheckList(String warehousingCode, String type) {
		List<K3Warehousing> laydownCheckList = k3CheckMapper.getLaydownCheckList(warehousingCode, type);		
		return laydownCheckList;
	}
	
	//입하현황 정보 불러오기(입하검수 할 목록)
	public List<K3Warehousing> k3GetLaydownCheckList() {
		List<K3Warehousing> laydownCheck = k3CheckMapper.k3GetLaydownCheckList();
		return laydownCheck;
	}
	
	//검수 현황(초기화면)
	public Map<String, Object> k3GetLaydownCheck(int currentPage) {
		// 보여줄 행의 개수
		int rowPerPage = 7;
		
		// 로그인 이력 테이블 행의 개수
		String countType = "normal";
		double rowCount = k3CheckMapper.k3GetLaydownCheckCount(countType, null);
		
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
		
		List<Map<String, Object>> laydownCheck = k3CheckMapper.k3GetLaydownCheck(paramMap);
		
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("laydownCheck", laydownCheck);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
	}

}
