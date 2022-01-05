package k3.location.ahs.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;


import k3.location.ahs.dto.K3Location;
import k3.location.ahs.mapper.K3LocationMapper;

@Service
public class K3LocationServise {
	
	private final K3LocationMapper k3LocationMapper;
	public K3LocationServise(K3LocationMapper k3LocationMapper) {
		this.k3LocationMapper = k3LocationMapper;
	}
	
	
	
	public int k3AddLocation(List<K3Location> k3LocationList) { 
	
		  Map<String,Object> insertMap = new HashMap<String,Object>(); 
		  insertMap.put("list", k3LocationList);
		return k3LocationMapper.k3AddLocation(insertMap); 
	}
}
