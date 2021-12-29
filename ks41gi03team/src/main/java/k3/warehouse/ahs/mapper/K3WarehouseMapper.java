package k3.warehouse.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.warehouse.ahs.dto.K3Warehouses;

@Mapper
public interface K3WarehouseMapper {
	
	public List<K3Warehouses> getWarehouseList();
	public List<K3Warehouses> getWarehouseListSample();
}
