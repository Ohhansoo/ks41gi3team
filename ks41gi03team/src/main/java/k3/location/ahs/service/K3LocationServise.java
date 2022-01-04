package k3.location.ahs.service;

import org.springframework.stereotype.Service;

import k3.location.ahs.dto.K3Location;
import k3.location.ahs.mapper.K3LocationMapper;

@Service
public class K3LocationServise {
	
	private K3LocationMapper k3LocationMapper;
	public K3LocationServise(K3LocationMapper k3LocationMapper) {
		this.k3LocationMapper = k3LocationMapper;
	}

	/*
	 * public int k3AddLocationCode(String allCode) { return
	 * k3LocationMapper.k3AddLocationCode(allCode); }
	 */
	public int k3AddLocation(String allCode) {
		return k3LocationMapper.k3AddLocation(allCode);
	}
}
