package k3.login.ahs.service;

import java.lang.reflect.Member;

import org.springframework.stereotype.Service;

import k3.login.ahs.mapper.K3LoginMapper;
import k3.memberuser.ahs.dto.K3MemberUser;

@Service
public class K3LoginService {
	
	private K3LoginMapper loginMapper;
	
	public K3LoginService(K3LoginMapper loginMapper) {
		this.loginMapper = loginMapper;
	}

	public K3MemberUser getMemberInfoByMemberId(String memberId) {
		return null;
	}
	
}
