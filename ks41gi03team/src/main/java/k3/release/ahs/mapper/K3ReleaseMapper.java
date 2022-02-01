package k3.release.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.release.ahs.dto.K3Release;

@Mapper
public interface K3ReleaseMapper {
	//<ajax> 요청 리스트 개수 전달(요청 알림)
	public int k3CountRequestReleaseList();
	//<모달>-통합출고코드 생성코드 전달
	public String k3CreateReleaseMergeCode();
	//<모달>-통합출고코드 리스트 가져오기
	public List<Map<String, Object>> k3FindReleaseMergeCode();
	//<모달>-출하 상품명 리스트 가져오기
	public List<Map<String, Object>> k3FindProductNameList(Map<String, Object> productMap);
	//출고 승인/반려 처리
	public int k3AllowRelease(Map<String, Object> releaseList);
	//출고 승인폼 이동
	public List<K3Release> k3RequestAllowRelease();
	//출고 등록처리(출고 요청)
	public int k3AddRelease(K3Release k3Release);
	//출고 현황 조회처리
	public List<Map<String, Object>> k3GetReleaseSearchList(Map<String, Object> searchCondition, Map<String, Object> paramMap);
	//출고 현황
	public List<Map<String, Object>> k3GetReleaseList(Map<String, Object> paramMap);
	//출고 현황 테이블 행의 개수
	public int k3GetReleaseCount(String countType, Map<String, Object> searchCondition);


}
