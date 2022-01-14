package k3.location.ahs.service;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;


import k3.location.ahs.dto.K3Location;
import k3.location.ahs.mapper.K3LocationMapper;

@Service
public class K3LocationServise {
	
	/**
	 * 의존성 주입 생성자메소드
	 */
	private final K3LocationMapper k3LocationMapper;
	public K3LocationServise(K3LocationMapper k3LocationMapper) {
		this.k3LocationMapper = k3LocationMapper;
	}
	
	/**
	 * 로케이션 코드 삭제
	 */
	public void deleteLocationCode(String locationCode) {
		System.out.println("service--------------" +locationCode);
		 k3LocationMapper.deleteLocationCode(locationCode);
	}
	
	
	/**
	 * 로케이션 코드 수정처리
	 */
	public int k3ModifyLocationCodeInfo(K3Location k3Location) {
		System.out.println("service"+ k3Location);
		return k3LocationMapper.k3ModifyLocationCodeInfo(k3Location);
	}
	
	/**
	 * 로케이션 코드수정을 위한 조회
	 */
	public K3Location getK3ModifyLocationInfoByLocationCode(String locationCode){
		return k3LocationMapper.getK3ModifyLocationInfoByLocationCode(locationCode);
	}
	
	/**
	 * 로케이션 코드 입력처리
	 */
	public int k3AddLocation(List<K3Location> k3LocationList) { 	
		return k3LocationMapper.k3AddLocation(k3LocationList);	 
	}
	
	/**
	 * 로케이션 코드 현황
	 */
	public List<K3Location> k3LocationList(){
		List<K3Location> k3LocationList	= k3LocationMapper.k3LocationList();
		return k3LocationList;
	}
	/**
	 * 모달창에 로케이션 list 전달
	 */
	public List<Map<String, Object>> k3GetModalLocationList() {
		List<Map<String, Object>> locationList = k3LocationMapper.k3GetModalLocationList(null);
		return locationList;
	};

	
}
