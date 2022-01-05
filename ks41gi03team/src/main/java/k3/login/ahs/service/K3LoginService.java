package k3.login.ahs.service;

import java.lang.reflect.Member;

import org.springframework.stereotype.Service;

import k3.login.ahs.mapper.K3LoginMapper;
import k3.memberuser.ahs.dto.K3MemberUser;

@Service
public class K3LoginService {
	
	private final K3LoginMapper k3LoginMapper;
	
	public K3LoginService(K3LoginMapper k3LoginMapper) {
		this.k3LoginMapper = k3LoginMapper;
	}
	/*
	 * //로그인 public List<K3MemberUser> getMemberInfoByMemberId(String searchKey,
	 * String searchValue) { List<K3MemberUser> memberuserList =
	 * k3LoginMapper.getMemberUserListBySearchKey(searchKey, searchValue);
	 * 
	 * if(memberuserList != null) {
	 * 
	 * for(K3MemberUser k3memberuser : memberuserList) { String levelMemberCode =
	 * k3memberuser.getLevelMemberCode();
	 * 
	 * if(levelMemberCode != null) { if("GM".equals(levelMemberCode)) {
	 * k3memberuser.setLevelMemberCode("관리자"); }else
	 * if("TM".equals(levelMemberCode)) { k3memberuser.setLevelMemberCode("팀장");
	 * }else if("ST".equals(levelMemberCode)) {
	 * k3memberuser.setLevelMemberCode("사원"); }else if("CT".equals(levelMemberCode))
	 * { k3memberuser.setLevelMemberCode("거래처"); } } } } return memberuserList; }
	 */

	public K3MemberUser getMemberInfoByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
