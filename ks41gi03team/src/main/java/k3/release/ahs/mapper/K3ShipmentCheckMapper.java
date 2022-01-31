package k3.release.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.release.ahs.dto.K3Release;

@Mapper
public interface K3ShipmentCheckMapper {

	//출하검수 등록처리
	public int k3AddShipmentCheck(K3Release k3Release);
	//출하검수 등록/수정 페이지 이동(물품명, 개수 세팅)
	public List<K3Release> k3GetShipmentCheckUpdateList(String releaseCode, String type);
	//출하현황 이동(출하검수 할 목록)
	public List<K3Release> k3GetShipmentCheckList();
	//출하검수 조회 처리
	public List<Map<String, Object>> k3GetShipmentSearchList(Map<String, Object> searchCondition, Map<String, Object> paramMap);
	//출하검수 초기화면
	public List<Map<String, Object>> k3GetShipmentCheck(Map<String, Object> paramMap);
	//검수현황 테이블 행의 개수(튜플 수)
	public int k3GetShipmentCheckCount(String countType, Map<String, Object> searchCondition);

}
