package k3.warehousing.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.warehousing.ahs.dto.K3Warehousing;
import k3.warehousing.ahs.dto.K3WarehousingSort;
import k3.warehousing.ahs.mapper.K3WarehousingMapper;

@Service
public class K3WarehousingService {
	
	private K3WarehousingMapper k3WarehousingMapper;
	
	public K3WarehousingService(K3WarehousingMapper k3WarehousingMapper) {
		this.k3WarehousingMapper = k3WarehousingMapper;
	}
	
	//입고 분류 현황
	public List<K3WarehousingSort> k3GetWarehousingSortList() {
		List<K3WarehousingSort> sortList = k3WarehousingMapper.k3GetWarehousingSortList();
		return sortList;
	}
	//입고 현황
	public List<K3Warehousing> k3GetWarehousingList() {
		List<K3Warehousing> K3LaydownCheck = k3WarehousingMapper.k3GetWarehousingList();
		return K3LaydownCheck;
	}

}
