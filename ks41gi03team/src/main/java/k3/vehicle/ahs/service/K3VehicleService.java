package k3.vehicle.ahs.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.vehicle.ahs.dto.K3Vehicle;
import k3.vehicle.ahs.mapper.K3VehicleMapper;



@Service
@Transactional
public class K3VehicleService {
	
	private K3VehicleMapper k3VehicleMapper;
	
	
	public K3VehicleService(K3VehicleMapper k3VehicleMapper) {
		this.k3VehicleMapper = k3VehicleMapper;
	}
	
	//중복확인
	public Integer getOverlappedVehicleCode(String vehicleCode) {
		Integer result = 0;
		result += k3VehicleMapper.getOverlappedVehicleCode(vehicleCode);
		return result;
	}
	
	//현황
	public List<K3Vehicle> getVehicleList(){
		List<K3Vehicle> vehicleList = k3VehicleMapper.getVehicleList();
		return vehicleList;
	}
	
	//등록
	public Integer addVehicle(K3Vehicle k3Vehicle) {
		Integer result = k3VehicleMapper.addVehicle(k3Vehicle);
		return result;
	}
	
	//수정 화면
	public K3Vehicle getModifyVehicle(String vehicleCode) {
		return k3VehicleMapper.getModifyVehicle(vehicleCode);
	}
	
	//수정
	public Integer modifyVehicle(K3Vehicle k3Vehicle) {
		return k3VehicleMapper.modifyVehicle(k3Vehicle);
	}
	
	//검색
	public List<K3Vehicle> k3SearchVehicleList(String vehicleKey, String vehicleValue){
		List<K3Vehicle> k3VehicleList = k3VehicleMapper.k3SearchVehicleList(vehicleKey, vehicleValue);
		return k3VehicleList;
	}
	
	//단건 삭제
	/*
	 * public Integer k3DeleteVehicle(String vehicleCode) { Integer result =
	 * k3VehicleMapper.k3DeleteVehicle(vehicleCode); return result; }
	 */
	
	//체크 삭제
	public Integer k3DeleteVehicle(List<String> deleteList) {
		Integer result = k3VehicleMapper.k3DeleteVehicle(deleteList);
		return result;
	}
	
	//모달
	public List<Map<String, Object>> k3SelectVehicleMemberId() {
		List<Map<String, Object>> searchId = k3VehicleMapper.k3SelectVehicleMemberId(null);
		return searchId;
	}
	
	
}
