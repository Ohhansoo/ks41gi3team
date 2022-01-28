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
	//출고현황
	public List<K3Release> k3GetReleaseList() {
		List<K3Release>	releaseList = k3ReleaseMapper.k3GetReleaseList();
		return releaseList;
	}




}
