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
	//수정폼 이동
	public K3MemberUser K3MemberUserInfoBycode(String memberId) {
		K3MemberUser k3MemberUser = memberuserMapper.K3MemberUserInfoBycode(memberId);
		return k3MemberUser;
	}
	//직원여부체크
	public int getMemberByMemberId(String memberId) {
		return memberuserMapper.getMemberInfoByMemberId(memberId);
	}
	
	//직원등록 등록처리
	public int AddMemberUser(K3MemberUser k3memberuser) {
		int result = memberuserMapper.AddMemberUser(k3memberuser);
		return result;
	}
	
	//직원현황(초기화면)
	public List<K3MemberUser> getMemberUserList() {
		List<K3MemberUser> memberuserList = memberuserMapper.getMemberUserList();
		return memberuserList;
	}
	

}
