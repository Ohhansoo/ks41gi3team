package k3.check.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.check.ahs.dto.K3LaydownCheck;
import k3.check.ahs.dto.K3ShipmentCheck;
import k3.warehousing.ahs.dto.K3Warehousing;

@Mapper
public interface K3CheckMapper {
	
	//입하검수 등록하기
	public int k3AddLaydownCheck(K3LaydownCheck K3LaydownCheck);
	//입하검수 등록 페이지 이동(물품명, 개수 세팅)
	public List<K3LaydownCheck> getLaydownCheckList(String warehousingCode);
	//출하검수 초기화면
	public List<K3ShipmentCheck> k3GetShipmentCheckList();
	//입하검수 정보 불러오기
	public List<K3LaydownCheck> k3GetLaydownCheckList();
}
