package k3.warehouse.ahs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import groovy.transform.AnnotationCollector;
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
	 * 창고전체 조회
	 */
	public List<K3Warehouses> getWarehouseList(){
		List<K3Warehouses> K3Warehouses = k3WarehouseMapper.getWarehouseList();
		return K3Warehouses;
	}
	
	/**
	 * 창고전체 분할조회
	 */
	public List<K3Warehouses> getWarehouseListSample(){
		List<K3Warehouses> K3WarehousesSample = k3WarehouseMapper.getWarehouseListSample();
		return K3WarehousesSample;
	}
}
