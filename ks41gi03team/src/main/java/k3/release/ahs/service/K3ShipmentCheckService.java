package k3.release.ahs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import k3.release.ahs.dto.K3Release;
import k3.release.ahs.mapper.K3ShipmentCheckMapper;

@Service
public class K3ShipmentCheckService {
	
	private final K3ShipmentCheckMapper k3ShipmentCheckMapper;

	public K3ShipmentCheckService(K3ShipmentCheckMapper k3ShipmentCheckMapper) {
		this.k3ShipmentCheckMapper = k3ShipmentCheckMapper;
	}

	//출하검수 등록처리
	public int k3AddShipmentCheck(K3Release k3Release) {
		int result = k3ShipmentCheckMapper.k3AddShipmentCheck(k3Release);
		return result;
	}
	
	//출하검수 등록/수정 페이지 이동(물품명, 개수 세팅)
	public List<K3Release> k3GetShipmentCheckUpdateList(String releaseCode, String type) {
		List<K3Release> shipmentCheck = k3ShipmentCheckMapper.k3GetShipmentCheckUpdateList(releaseCode, type);
		return shipmentCheck;
	}
	//출하현황 이동(출하검수 할 목록)
	public List<K3Release> k3GetShipmentCheckList() {
		List<K3Release> shipmentCheck = k3ShipmentCheckMapper.k3GetShipmentCheckList();
		return shipmentCheck;
	}

	//출하검수현황 조회 처리
	public Map<String, Object> k3GetShipmentSearchList(Map<String, Object> searchCondition, int currentPage) {
		// 보여줄 행의 개수
		int rowPerPage = 7;
		
		// 출하검수 테이블 행의 개수
		String countType = "search";
		double rowCount = k3ShipmentCheckMapper.k3GetShipmentCheckCount(countType, searchCondition);
		
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
		
		List<Map<String, Object>> shipemntCheck = k3ShipmentCheckMapper.k3GetShipmentSearchList(searchCondition, paramMap);
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("laydownCheck", shipemntCheck);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);

		return paramMap;
	}
	
	//검수 현황(초기화면)
	public Map<String, Object> k3GetShipmentCheck(int currentPage) {
		// 보여줄 행의 개수
		int rowPerPage = 7;
		
		//검수현황 테이블 행의 개수
		String countType = "normal";
		double rowCount = k3ShipmentCheckMapper.k3GetShipmentCheckCount(countType, null);
		
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
		
		List<Map<String, Object>> shipmentCheck = k3ShipmentCheckMapper.k3GetShipmentCheck(paramMap);
		
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("laydownCheck", shipmentCheck);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
	}
}
