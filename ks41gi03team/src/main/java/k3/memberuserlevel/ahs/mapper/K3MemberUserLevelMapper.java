package k3.memberuserlevel.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.memberuserlevel.ahs.dto.K3MemberUserLevel;

@Mapper
public interface K3MemberUserLevelMapper {
	
	//01 회원권한현황(초기화면)
	public List<K3MemberUserLevel> getMemberUserLevelList();

	//02 등록
	//public int AddMemberUserLevel(K3MemberUserLevel k3MemberUserLevel);
	
	
}
