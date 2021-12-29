package k3.warehouse.ahs.mapper;

import org.apache.ibatis.annotations.Mapper;

import k3.warehouse.ahs.dto.K3Warehouses;

@Mapper
public interface K3WarehouseMapper {
	
	/**
	 * 창고등록처리
	 */
	public int addWarehouse(K3Warehouses k3Warehouses);
}
