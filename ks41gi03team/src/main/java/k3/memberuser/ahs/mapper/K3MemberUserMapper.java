package k3.memberuser.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.memberuser.ahs.dto.K3MemberUser;

@Mapper
public interface K3MemberUserMapper {
	
	//01. 회원전체 조회(초기)
	public List<K3MemberUser> getMemberUserList();
	
	//02. 직원등록
	public int AddMemberUser(K3MemberUser k3MemberUser);
		
	//03. 직원 정보찾기 (수정)
	public K3MemberUser K3ModifyMemberUserInfoBycode(String memberId);
	
	//04. 직원 정보 수정처리
	public int k3ModifyMemberUserInfo(K3MemberUser k3MemberUser);
	
	//05. 직원 정보 삭제처리(한줄)
	public int k3DeleteMemberUser(String memberId);
	
	//06. 직원정보 삭제처리
	public int k3RemoveMemberUser(List<String> removeList);
		
	//07. 직원 검색
	public List<K3MemberUser> getMemberUserListBySearchKey(String searchKey, String searchValue);

	//08. 직원중복체크
	public int getMemberUserByMemberId(String memberId);
	
	// 직원조회 로그인?
	public K3MemberUser K3MemberUserInfoBycode(String memberId);

	//09. 회원조회(중복체크?)
	public int getMemberInfoByMemberId(String memberId);
	
	
}
