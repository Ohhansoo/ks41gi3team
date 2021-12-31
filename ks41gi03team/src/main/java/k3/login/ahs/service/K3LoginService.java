package k3.login.ahs.service;

import org.springframework.stereotype.Service;

import k3.login.ahs.mapper.K3LoginMapper;

@Service
public class K3LoginService {
	
	private K3LoginMapper loginMapper;
	
	public K3LoginService(K3LoginMapper loginMapper) {
		this.loginMapper = loginMapper;
	}
	
}
