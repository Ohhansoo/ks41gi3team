package k3.memberuser.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.memberuser.ahs.dto.K3MemberUser;

@Mapper
public interface K3MemberUserMapper {
	
	//회원전체 조회
	public List<K3MemberUser> getMemberUserList();
	
}
