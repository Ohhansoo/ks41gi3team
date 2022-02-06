package k3.warehousing.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.warehousing.ahs.dto.K3Warehousing;

@Mapper
public interface K3LaydownCheckMapper {
	//입하검수 삭제처리
	public int k3DeleteLaydown(List<String> deleteList);
	//입하검수현황 조회처리
	public List<Map<String,Object>> k3GetLaydownSearchList(Map<String, Object> searchCondition, Map<String,Object> paramMap);
	//입하검수 등록하기
	public int k3AddLaydownCheck(K3Warehousing k3Warehousing);
	//<모달>-입하검수 등록을 위한 입하검수코드 조회
	public List<Map<String, Object>> k3GetLaydownCheckCodeList(Map<String, Object> map);
	//입하검수 등록/수정 페이지 이동(물품명, 개수 세팅)
	public List<K3Warehousing> k3GetLaydownCheckUpdateList(String warehousingCode, String type);
	//입하현황 정보 불러오기(입하검수 할 목록)
	public List<K3Warehousing> k3GetLaydownCheckList();
	//입하검수현황 초기화면
	public List<Map<String,Object>> k3GetLaydownCheck(Map<String,Object> paramMap);
	//입하검수현황 튜플 수
	public int k3GetLaydownCheckCount(String countType, Map<String, Object> searchCondition);
}
