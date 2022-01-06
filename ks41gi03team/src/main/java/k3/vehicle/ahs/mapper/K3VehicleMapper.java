package k3.vehicle.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.vehicle.ahs.dto.K3Vehicle;

@Mapper
public interface K3VehicleMapper {
	public List<K3Vehicle> getVehicleList();
	
	public Integer addVehicle(K3Vehicle k3Vehicle);
	
	public K3Vehicle getModifyVehicle(String vehicleCode);
	
	public Integer modifyVehicle(K3Vehicle k3Vehicle);
}
