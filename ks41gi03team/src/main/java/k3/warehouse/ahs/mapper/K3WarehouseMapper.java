package k3.warehouse.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.warehouse.ahs.dto.K3Warehouses;

@Mapper
public interface K3WarehouseMapper {
	
	/**
	 * 창고등록처리
	 */
	public int k3AddWarehouse(K3Warehouses k3Warehouses);
	
	/**
	 * 창고전체조회
	 */
	public List<K3Warehouses> getK3WarehouseList();

}
