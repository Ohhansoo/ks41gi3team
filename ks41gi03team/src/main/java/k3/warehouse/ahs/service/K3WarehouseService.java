package k3.warehouse.ahs.service;

import org.springframework.stereotype.Service;

import k3.warehouse.ahs.dto.K3Warehouses;
import k3.warehouse.ahs.mapper.K3WarehouseMapper;

@Service
public class K3WarehouseService {
	
	private K3WarehouseMapper k3WarehouseMapper;
	public K3WarehouseService(K3WarehouseMapper k3WarehouseMapper) {
		this.k3WarehouseMapper = k3WarehouseMapper;
	}
	
	/**
	 * 창고 등록처리
	 */
	public int addWarehouse(K3Warehouses k3Warehouses) {
		int result = k3WarehouseMapper.addWarehouse(k3Warehouses);
		return result;
	}
}
