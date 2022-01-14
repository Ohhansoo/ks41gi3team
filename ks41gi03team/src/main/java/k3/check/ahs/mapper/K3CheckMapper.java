package k3.check.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.check.ahs.dto.K3LaydownCheck;
import k3.check.ahs.dto.K3ShipmentCheck;
import k3.warehousing.ahs.dto.K3Warehousing;

@Mapper
public interface K3CheckMapper {
	
	//입하검수 등록하기
	public int k3AddLaydownCheck(K3LaydownCheck K3LaydownCheck);
	//모달 입하검수 등록을 위한 입하검수코드 조회
	public List<Map<String, Object>> k3GetLaydownCheckCodeList(Map<String, Object> map);
	//입하검수 등록/수정 페이지 이동(물품명, 개수 세팅)
	public List<K3LaydownCheck> getLaydownCheckList(String warehousingCode, String type);
	//출하검수 초기화면
	public List<K3ShipmentCheck> k3GetShipmentCheckList();
	//입하검수 정보 불러오기
	public List<K3LaydownCheck> k3GetLaydownCheckList();
}
