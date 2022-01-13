package k3.check.ahs.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import k3.check.ahs.dto.K3LaydownCheck;
import k3.check.ahs.dto.K3ShipmentCheck;
import k3.check.ahs.mapper.K3CheckMapper;
import k3.stock.ahs.dto.K3Stock;
import k3.warehousing.ahs.dto.K3Warehousing;

@Service
public class K3CheckService {
	private final K3CheckMapper k3CheckMapper;
	
	public K3CheckService(K3CheckMapper k3CheckMapper) {
		this.k3CheckMapper = k3CheckMapper;
	}
	//입하검수 등록하기
	public int k3AddLaydownCheck(K3LaydownCheck K3LaydownCheck) {
		int result = k3CheckMapper.k3AddLaydownCheck(K3LaydownCheck);
		return result;
	}
	////모달 입하검수 등록을 위한 입하검수코드 조회
	public List<Map<String, Object>> k3GetLaydownCheckCodeList() {
		List<Map<String, Object>> laydownCheckCodeList = k3CheckMapper.k3GetLaydownCheckCodeList(null);
		return laydownCheckCodeList;
	}
	//입하검수 등록 페이지 이동(물품명, 개수 세팅)
	public List<K3LaydownCheck> getLaydownCheckList(String warehousingCode) {
		List<K3LaydownCheck> laydownCheckList = k3CheckMapper.getLaydownCheckList(warehousingCode);		
		return laydownCheckList;
	}
	//출하검수 현황 이동
	public List<K3ShipmentCheck> k3GetShipmentCheckList() {
		List<K3ShipmentCheck> K3ShipmentCheck = k3CheckMapper.k3GetShipmentCheckList();
		return K3ShipmentCheck;
	}
	//입하검수 정보 불러오기
	public List<K3LaydownCheck> k3GetLaydownCheckList() {
		List<K3LaydownCheck> laydownCheck = k3CheckMapper.k3GetLaydownCheckList();
		return laydownCheck;
	}
	
}
