package k3.warehousing.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.warehousing.ahs.dto.K3Warehousing;
import k3.warehousing.ahs.mapper.K3WarehousingMapper;

@Service
public class K3WarehousingService {
	
	private K3WarehousingMapper k3WarehousingMapper;
	
	public K3WarehousingService(K3WarehousingMapper k3WarehousingMapper) {
		this.k3WarehousingMapper = k3WarehousingMapper;
	}
	
	public List<K3Warehousing> k3GetWarehousingList() {
		List<K3Warehousing> K3LaydownCheck = k3WarehousingMapper.k3GetWarehousingList();
		return K3LaydownCheck;
	}
}
