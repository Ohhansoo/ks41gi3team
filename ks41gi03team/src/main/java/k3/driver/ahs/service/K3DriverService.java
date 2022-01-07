package k3.driver.ahs.service;

import java.util.List;

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
	
	public List<K3Driver> getDriverList(){
		List<K3Driver> driverList = k3DriverMapper.getDriverList();
		return driverList;
	}
	
	public Integer addDriver(K3Driver k3Driver) {
		Integer result = k3DriverMapper.addDriver(k3Driver);
		return result;
	}
	
	public K3Driver getModifyDriver(String driverId) {
		return k3DriverMapper.getModifyDriver(driverId);
	}
	
	public Integer modifyDriver(K3Driver k3Driver) {
		return k3DriverMapper.modifyDriver(k3Driver);
	}
}