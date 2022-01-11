package k3.warehouse.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.warehouse.ahs.dto.K3Warehouses;
import k3.warehouse.ahs.mapper.K3WarehouseMapper;

@Service
public class K3WarehouseService {
	/**
	 * 생성자 메서드 의존성,k3WarehouseMapper와 연결
	 */
	private K3WarehouseMapper k3WarehouseMapper;
	public K3WarehouseService(K3WarehouseMapper k3WarehouseMapper) {
		this.k3WarehouseMapper = k3WarehouseMapper;
	}
	/**
	 * 창고 목록 조회
	 */
	public List<K3Warehouses> getWarehouseListBySearchKey(String warehouseKey, String warehouseValue){
		List<K3Warehouses> k3Warehouses = k3WarehouseMapper.getWarehouseListBySearchKey(warehouseKey, warehouseValue);
		System.out.println("service------------>"+ k3Warehouses);
		
		return k3Warehouses;
	}
	
	/**
	 * 창고 등록
	 */
	public int k3AddWarehouse(K3Warehouses k3Warehouses) {
		int result = k3WarehouseMapper.k3AddWarehouse(k3Warehouses);
		return result;
	}
	/**
	 * 창고전체 조회
	 */
	public List<K3Warehouses> getK3WarehouseList(){
		List<K3Warehouses> K3Warehouses = k3WarehouseMapper.getK3WarehouseList();
		System.out.println("K3WarehouseService: "+K3Warehouses);
		return K3Warehouses;
	}
	/**
	 * 창고수정
	 */
	//창고코드로 조회
	public K3Warehouses getK3ModifyWarehouseInfoByWarehouseCode(String warehouseCode) {	
		return k3WarehouseMapper.getK3ModifyWarehouseInfoByWarehouseCode(warehouseCode);
	}
	//창고수정처리
	public int k3ModifyWarehouseInfo(K3Warehouses k3Warehouses) {
		System.out.println("k3ModifyWarehouseInfo Service >>>>>>> "+ k3Warehouses);
		return k3WarehouseMapper.k3ModifyWarehouseInfo(k3Warehouses);
	}
	
	/**
	 * 창고고유고드로 창고삭제
	 */
	public int deleteWarehouseCode(String warehouseCode) {
		
		return k3WarehouseMapper.deleteWarehouseCode(warehouseCode);
	}
	
}
