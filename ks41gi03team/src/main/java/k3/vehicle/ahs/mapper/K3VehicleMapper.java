package k3.vehicle.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.vehicle.ahs.dto.K3Vehicle;

@Mapper
public interface K3VehicleMapper {
	List<K3Vehicle> getVehicleList();
}
