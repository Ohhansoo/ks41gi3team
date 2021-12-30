package k3.check.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.check.ahs.dto.K3LaydownCheck;
import k3.check.ahs.mapper.K3CheckMapper;

@Service
public class K3CheckService {
	private K3CheckMapper k3CheckMapper;
	
	public K3CheckService(K3CheckMapper k3CheckMapper) {
		this.k3CheckMapper = k3CheckMapper;
	}
	
	public List<K3LaydownCheck> k3GetLaydownCheckList() {
		List<K3LaydownCheck> K3LaydownCheck = k3CheckMapper.k3GetLaydownCheckList();
		return K3LaydownCheck;
	}
	
}
