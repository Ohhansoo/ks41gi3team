package k3.memberuser.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.memberuser.ahs.dto.K3MemberUser;

@Mapper
public interface K3MemberUserMapper {
	
	//직원 정보 찾기(수정)
	public K3MemberUser K3MemberUserInfoBycode(String memberId);
	
	//직원등록
	public int AddMemberUser(K3MemberUser k3MemberUser);

	//회원전체 조회
	public List<K3MemberUser> getMemberUserList();
	
}
