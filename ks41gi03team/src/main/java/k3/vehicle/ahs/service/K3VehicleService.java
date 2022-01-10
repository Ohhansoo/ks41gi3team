package k3.vehicle.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.vehicle.ahs.dto.K3Vehicle;
import k3.vehicle.ahs.mapper.K3VehicleMapper;



@Service
public class K3VehicleService {
	
	private K3VehicleMapper k3VehicleMapper;
	
	
	public K3VehicleService(K3VehicleMapper k3VehicleMapper) {
		this.k3VehicleMapper = k3VehicleMapper;
	}
	
	public List<K3Vehicle> getVehicleList(){
		List<K3Vehicle> vehicleList = k3VehicleMapper.getVehicleList();
		return vehicleList;
	}
	
	public Integer addVehicle(K3Vehicle k3Vehicle) {
		Integer result = k3VehicleMapper.addVehicle(k3Vehicle);
		return result;
	}
	
	public K3Vehicle getModifyVehicle(String vehicleCode) {
		return k3VehicleMapper.getModifyVehicle(vehicleCode);
	}
	
	public Integer modifyVehicle(K3Vehicle k3Vehicle) {
		return k3VehicleMapper.modifyVehicle(k3Vehicle);
	}
	
	public List<K3Vehicle> k3SearchVehicleList(String vehicleKey, String vehicleValue){
		List<K3Vehicle> k3VehicleList = k3VehicleMapper.k3SearchVehicleList(vehicleKey, vehicleValue);
		return k3VehicleList;
	}
	
	public Integer k3DeleteVehicle(String vehicleCode) {
		Integer result = k3VehicleMapper.k3DeleteVehicle(vehicleCode);
		return result;
	}
	
	
}
