package k3.release.ahs.service;

import java.util.List;

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
	//출하검수 초기화면
	public List<K3Release> k3GetShipmentCheck() {
		List<K3Release> shipmentCheck = k3ShipmentCheckMapper.k3GetShipmentCheck();
		return shipmentCheck;
	}
}
