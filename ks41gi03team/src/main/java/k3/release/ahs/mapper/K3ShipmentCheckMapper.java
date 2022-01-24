package k3.release.ahs.mapper;

import java.util.List;

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
	//출하검수 초기화면
	public List<K3Release> k3GetShipmentCheck();
}
