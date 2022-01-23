package k3.driver.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.driver.ahs.dto.K3Driver;

@Mapper
public interface K3DriverMapper {
	
	//중복 확인
	public Integer getOverlappedDriverId(String driverId);
	//현황
	public List<K3Driver> getDriverList();
	
	//등록
	public Integer addDriver(K3Driver k3Driver);
	
	//수정화면
	public K3Driver getModifyDriver(String driverId);
	
	//수정
	public Integer modifyDriver(K3Driver k3Driver);
	
	//검색
	public List<K3Driver> k3SearchDriverList(String driverKey, String driverValue);
	
	//체크 삭제
	public Integer k3DeleteDriver(List<String> deleteList);
	
	//모달
	public List<Map<String, Object>> k3GetModalList(Map<String, Object> paramMap);

}
