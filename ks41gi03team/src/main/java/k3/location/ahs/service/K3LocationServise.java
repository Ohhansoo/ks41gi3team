package k3.location.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.location.ahs.dto.K3Location;
import k3.location.ahs.mapper.K3LocationMapper;

@Service
public class K3LocationServise {
	
	private K3LocationMapper k3LocationMapper;
	public K3LocationServise(K3LocationMapper k3LocationMapper) {
		this.k3LocationMapper = k3LocationMapper;
	}

	
	public int k3AddLocation(List<K3Location> k3LocationList) { 
		return k3LocationMapper.k3AddLocation(k3LocationList); 
	}
}
