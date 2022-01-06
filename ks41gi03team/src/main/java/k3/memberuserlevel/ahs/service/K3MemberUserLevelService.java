package k3.memberuserlevel.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.memberuserlevel.ahs.dto.K3MemberUserLevel;
import k3.memberuserlevel.ahs.mapper.K3MemberUserLevelMapper;

@Service
public class K3MemberUserLevelService {
	
	private K3MemberUserLevelMapper memberuserlevelMapper;
	
	public K3MemberUserLevelService(K3MemberUserLevelMapper memberuserlevelMapper) {
		this.memberuserlevelMapper = memberuserlevelMapper;
	}
	//회원권한 등록처리
	public int AddMemberUserLevel(K3MemberUserLevel k3MemberUserLevel) {
		int result = memberuserlevelMapper.AddMemberUserLevel(k3MemberUserLevel);
		return result;
	}
	
	//회원권한 (초기화면)
	public List<K3MemberUserLevel> getMemberUserLevelList(){
		List<K3MemberUserLevel> memberuserlevelList = memberuserlevelMapper.getMemberUserLevelList();
		return memberuserlevelList;
	}
	
}