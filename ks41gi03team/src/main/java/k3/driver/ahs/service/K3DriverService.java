package k3.driver.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.driver.ahs.dto.K3Driver;
import k3.driver.ahs.mapper.K3DriverMapper;



@Service
public class K3DriverService {
	
	private K3DriverMapper k3DriverMapper;
	
	public K3DriverService(K3DriverMapper k3DriverMapper) {
		this.k3DriverMapper = k3DriverMapper;
	}
	
	public List<K3Driver> getDriverList(){
		List<K3Driver> driverList = k3DriverMapper.getDriverList();
		return driverList;
	}
	
	public K3Driver getModifyDriver(String driverId) {
		return k3DriverMapper.getModifyDriver(driverId);
	}
}