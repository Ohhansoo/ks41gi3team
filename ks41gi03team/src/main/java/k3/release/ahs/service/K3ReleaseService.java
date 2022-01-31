package k3.release.ahs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import k3.release.ahs.dto.K3Release;
import k3.release.ahs.mapper.K3ReleaseMapper;

@Service
public class K3ReleaseService {

	private K3ReleaseMapper k3ReleaseMapper;
	
	public K3ReleaseService(K3ReleaseMapper k3ReleaseMapper){
		this.k3ReleaseMapper = k3ReleaseMapper;
	}
	
	//<ajax> 요청 리스트 개수 전달(요청 알림)
	public int k3CountRequestReleaseList() {
		int requestCount = k3ReleaseMapper.k3CountRequestReleaseList();
		return requestCount;
	}
	
	//<모달>-통합출고코드 생성코드 전달
	public String k3CreateReleaseMergeCode() {
		String releaseMergeCode = k3ReleaseMapper.k3CreateReleaseMergeCode();
		return releaseMergeCode;
	}
	
	//<모달>-통합출고코드 리스트 가져오기
	public List<Map<String, Object>> k3FindReleaseMergeCode() {
		List<Map<String, Object>> releaseMergeCodeList = k3ReleaseMapper.k3FindReleaseMergeCode();
		return releaseMergeCodeList;
	}
	
	//<모달>-출하 상품명 리스트 가져오기
	public List<Map<String, Object>> k3FindProductNameList() {
		List<Map<String, Object>> ProductNameList = k3ReleaseMapper.k3FindProductNameList(null);
		return ProductNameList;	
	}
	
	//출고 승인/반려 처리
	public int k3AllowRelease(Map<String, Object> releaseList) {
		int result = k3ReleaseMapper.k3AllowRelease(releaseList);
		return result;
	}
	
	//출고승인폼 이동
	public List<K3Release> k3RequestAllowRelease() {
		List<K3Release>	RequestAllowRelease = k3ReleaseMapper.k3RequestAllowRelease();
		return RequestAllowRelease;
	}
	//출고 등록처리(출고 요청)
	public int k3AddRelease(K3Release k3Release) {
		int result = k3ReleaseMapper.k3AddRelease(k3Release);
		return result;
	}

	//출고 현황 조회 처리
	public Map<String, Object> k3GetReleaseSearchList(Map<String, Object> searchCondition, int currentPage){
		// 보여줄 행의 개수
		int rowPerPage = 7;
		
		// 출고 현황 테이블 행의 개수
		String countType = "search";
		double rowCount = k3ReleaseMapper.k3GetReleaseCount(countType, searchCondition);
		
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
		
		List<Map<String, Object>> releaseList = k3ReleaseMapper.k3GetReleaseSearchList(searchCondition, paramMap);
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("warehousingList", releaseList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		return paramMap;	
	}
	//출고 현황(초기화면)
	public Map<String, Object> k3GetReleaseList(int currentPage) {
		// 보여줄 행의 개수
		int rowPerPage = 7;
		
		//출고 현황 테이블 행의 개수
		String countType = "normal";
		double rowCount = k3ReleaseMapper.k3GetReleaseCount(countType, null);
		
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
		
		List<Map<String, Object>> releaseList = k3ReleaseMapper.k3GetReleaseList(paramMap);
		
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("warehousingList", releaseList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
	}


}
