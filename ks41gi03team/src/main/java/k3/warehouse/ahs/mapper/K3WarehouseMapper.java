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
	
	/**
	 * 창고수정
	 */
	//창고코드로 조회
	public K3Warehouses getK3ModifyWarehouseInfoByWarehouseCode(int warehouseCode);
	//창고수정처리
	public int k3ModifyWarehouseInfo(K3Warehouses k3Warehouses);
	
	/**
	 * 창고고유코드로 삭제
	 */
	public int deleteWarehouseCode(int warehouseCode);
}
