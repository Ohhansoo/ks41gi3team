package k3.vehicle.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.vehicle.ahs.dto.K3Vehicle;

@Mapper
public interface K3VehicleMapper {
	
	//중복 확인
	public Integer getOverlappedVehicleCode(String vehicleCode);
		
	//현황
	public List<K3Vehicle> getVehicleList();
	
	//등록
	public Integer addVehicle(K3Vehicle k3Vehicle);
	
	//수정화면
	public K3Vehicle getModifyVehicle(String vehicleCode);
	
	//수정
	public Integer modifyVehicle(K3Vehicle k3Vehicle);
	
	//검색
	public List<K3Vehicle> k3SearchVehicleList(String vehicleKey, String vehicleValue);
	
	//단건 삭제
	//public Integer k3DeleteVehicle(String vehicleCode);
	
	//체크 삭제
	public Integer k3DeleteVehicle(List<String> deleteList);
	
	//모달
	public List<Map<String, Object>> k3SelectVehicleMemberId(Map<String,Object> paraMap);
	
	

}
