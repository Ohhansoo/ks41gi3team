package k3.driver.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.driver.ahs.dto.K3Driver;

@Mapper
public interface K3DriverMapper {
	
	public List<K3Driver> getDriverList();
	
	public Integer addDriver(K3Driver k3Driver);
	
	public K3Driver getModifyDriver(String driverId);
}
