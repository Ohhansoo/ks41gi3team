package k3.memberuser.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.memberuser.ahs.dto.K3MemberUser;
import k3.memberuser.ahs.mapper.K3MemberUserMapper;

@Service
public class K3MemberUserService {
	
	private K3MemberUserMapper memberuserMapper;
	
	public K3MemberUserService(K3MemberUserMapper memberuserMapper) {
		this.memberuserMapper = memberuserMapper;
	}
	
	public List<K3MemberUser> getMemberUserList() {
		List<K3MemberUser> memberuserList = memberuserMapper.getMemberUserList();
		return memberuserList;
	}
	

}
