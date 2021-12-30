package k3.warehouse.ahs.mapper;

<<<<<<< HEAD
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.warehouse.ahs.dto.K3Warehouses;

@Mapper
public interface K3WarehouseMapper {
	
	public List<K3Warehouses> getWarehouseList();
	public List<K3Warehouses> getWarehouseListSample();
=======
import org.apache.ibatis.annotations.Mapper;

import k3.warehouse.ahs.dto.K3Warehouses;

@Mapper
public interface K3WarehouseMapper {
	
	/**
	 * 창고등록처리
	 */
	public int addWarehouse(K3Warehouses k3Warehouses);
>>>>>>> branch 'kjh' of https://github.com/Ohhansoo/ks41gi3team.git
}
