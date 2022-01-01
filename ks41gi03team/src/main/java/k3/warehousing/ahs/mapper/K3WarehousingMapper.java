package k3.warehousing.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.warehousing.ahs.dto.K3Warehousing;
import k3.warehousing.ahs.dto.K3WarehousingSort;

@Mapper
public interface K3WarehousingMapper {
	
	//입고분류 조회
	public List<K3WarehousingSort> k3GetWarehousingSortList();
	//입고현황 조회
	public List<K3Warehousing> k3GetWarehousingList();

}
