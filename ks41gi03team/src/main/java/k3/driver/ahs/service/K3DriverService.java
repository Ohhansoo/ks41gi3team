package k3.driver.ahs.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.driver.ahs.dto.K3Driver;
import k3.driver.ahs.mapper.K3DriverMapper;



@Service
@Transactional
public class K3DriverService {
	
	private K3DriverMapper k3DriverMapper;
	
	public K3DriverService(K3DriverMapper k3DriverMapper) {
		this.k3DriverMapper = k3DriverMapper;
	}
	
	//중복확인
			public Integer getOverlappedDriverId(String driverId) {
				Integer result = 0;
				result += k3DriverMapper.getOverlappedDriverId(driverId);
				return result;
			}
			
	//현황
	public List<K3Driver> getDriverList(){
		List<K3Driver> driverList = k3DriverMapper.getDriverList();
		return driverList;
	}
	
	//등록
	public Integer addDriver(K3Driver k3Driver) {
		Integer result = k3DriverMapper.addDriver(k3Driver);
		return result;
	}
	
	//수정 화면
	public K3Driver getModifyDriver(String driverId) {
		return k3DriverMapper.getModifyDriver(driverId);
	}
	
	//수정
	public Integer modifyDriver(K3Driver k3Driver) {
		return k3DriverMapper.modifyDriver(k3Driver);
	}
	
	//검색
	public List<K3Driver> k3SearchDriverList(String driverKey, String driverValue){
		List<K3Driver> k3DriverList = k3DriverMapper.k3SearchDriverList(driverKey, driverValue);
		return k3DriverList;
	}
	
	//체크 삭제
	public Integer k3DeleteDriver(List<String> deleteList) {
		Integer result = k3DriverMapper.k3DeleteDriver(deleteList);
		return result;
		
	}
	
	//모달
	public List<Map<String, Object>> k3GetDriverNameModalList() {
		List<Map<String, Object>> modalList = k3DriverMapper.k3GetModalList(null);
		return modalList;
	}

	
}