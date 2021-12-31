package k3.loginstate.ahs.service;

import org.springframework.stereotype.Service;

import k3.loginstate.ahs.mapper.K3LoginStateMapper;

@Service
public class K3LoginStateService {
	
	private K3LoginStateMapper loginstateMapper;
	
	public K3LoginStateService(K3LoginStateMapper loginstateMapper) {
		this.loginstateMapper = loginstateMapper;
	}

}
