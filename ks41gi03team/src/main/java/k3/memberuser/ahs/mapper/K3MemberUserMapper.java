package k3.memberuser.ahs.mapper;

import java.util.List;
import java.util.Map;

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
	public List<K3MemberUser> k3GetMemberUserSearchList(Map<String,Object> searchCondition);
	 
	/*
	 * //검색된 직원 튜플수 (동적페이징) public List<Map<String, Object>>
	 * k3MemberUserCount(Map<String, Object> paramMap, String searchKey, String
	 * searchValue, String searchStartDate, String searchEndDate);
	 * 
	 * //직원현황 조회(검색) public List<Map<String, Object>>
	 * k3GetMemberUserSearchList(Map<String, Object> paramMap, String searchKey,
	 * String searchValue, String searchStartDate, String searchEndDate);
	 */

	//08. 직원중복체크
	public int getMemberByMemberId(String memberId);
	
	// 직원조회 로그인?
	public K3MemberUser K3MemberUserInfoBycode(String memberId);

	//09. 회원조회(중복체크?)
	public int getMemberInfoByMemberId(String memberId);

	//10 모달창
	public List<Map<String, Object>> k3GetModalList(Map<String, Object> paramMap);
	
	
}
