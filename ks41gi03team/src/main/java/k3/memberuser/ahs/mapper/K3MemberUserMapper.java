package k3.memberuser.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.memberuser.ahs.dto.K3MemberUser;

@Mapper
public interface K3MemberUserMapper {
	
	
	//직원중복체크
	public int getMemberUserByMemberId(String memberId);
	
	//직원등록
	public int AddMemberUser(K3MemberUser k3MemberUser);
	
	//직원 정보 수정
	public int modifyMemberUserInfo(K3MemberUser k3MemberUser);

	//회원조회
	public int getMemberInfoByMemberId(String memberId);
	
	//직원 조회
	public List<K3MemberUser> getMemberUserListBySearchKey(String searchKey, String searchValue);
	
	//회원전체 조회(초기)
	public List<K3MemberUser> getMemberUserList();
}
//K3MemberUser