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
	
	public K3Vehicle getModifyVehicle(String vehicleCode) {
		return k3VehicleMapper.getModifyVehicle(vehicleCode);
	}
}
