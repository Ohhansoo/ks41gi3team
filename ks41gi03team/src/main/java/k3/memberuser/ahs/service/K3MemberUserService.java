package k3.memberuser.ahs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.memberuser.ahs.dto.K3MemberUser;
import k3.memberuser.ahs.mapper.K3MemberUserMapper;

@Service
@Transactional
public class K3MemberUserService {
	
	private K3MemberUserMapper memberuserMapper;
	
	public K3MemberUserService(K3MemberUserMapper memberuserMapper) {
		this.memberuserMapper = memberuserMapper;
	}
	/*//로그인
		public List<K3MemberUser> MemberUserList(String searchKey, String searchValue) {
			List<K3MemberUser> memberuserList = memberuserMapper.getMemberUserListBySearchKey(searchKey, searchValue);
			
			if(memberuserList != null) {
				
				for(K3MemberUser k3memberuser : memberuserList) {
					String levelMemberCode = k3memberuser.getLevelMemberCode();
					
					if(levelMemberCode != null) {
						if("GM".equals(levelMemberCode)) {
							k3memberuser.setLevelMemberCode("관리자");
						}else if("TM".equals(levelMemberCode)) {
							k3memberuser.setLevelMemberCode("팀장");
						}else if("ST".equals(levelMemberCode)) {
							k3memberuser.setLevelMemberCode("사원");
						}else if("CT".equals(levelMemberCode)) {
							k3memberuser.setLevelMemberCode("거래처");
						}
					}
				}
			}
			return memberuserList; */
		
		//01 직원현황(초기화면)
		public List<K3MemberUser> getMemberUserList() {
			List<K3MemberUser> memberuserList = memberuserMapper.getMemberUserList();
			return memberuserList;
		}
		
		//02 직원등록 등록처리
		public int AddMemberUser(K3MemberUser k3memberuser) {
			int result = memberuserMapper.AddMemberUser(k3memberuser);
			return result;
		}
		
		//03 수정폼 이동
		  public K3MemberUser K3MemberUserInfoBycode(String memberId) { 
			  K3MemberUser k3MemberUser = memberuserMapper.K3MemberUserInfoBycode(memberId);
			  return k3MemberUser; 
		  }
		  
		//04 수정처리
		public int k3ModifyMemberUserInfo(K3MemberUser k3memberuser) {
			return memberuserMapper.k3ModifyMemberUserInfo(k3memberuser);
		}
		  
		//05 직원 삭제처리(한줄)
		public int k3DeleteMemberUser(String memberId) {
			System.out.println("05 220107 k3DeleteMemberUser K3MemberUserService.java");

			int result = memberuserMapper.k3DeleteMemberUser(memberId);
			return result;
		}
		
		//06 직원정보 삭제 처리
		public int k3RemoveMemberUser(List<String> removeList) {
			int result = memberuserMapper.k3RemoveMemberUser(removeList);
			return result;
		}
	
		//07 직원여부체크(중복확인) 
		public int getMemberByMemberId(String memberId) {
			int result = 0;
			result += memberuserMapper.getMemberByMemberId(memberId);
			return result;
		}
		
	
	  //08 직원검색 
	  public List<K3MemberUser> k3GetMemberUserSearchList(Map<String,Object> searchCondition){ 
		  List<K3MemberUser> memberuserSearchList = memberuserMapper.k3GetMemberUserSearchList(searchCondition); 
		  
		  return memberuserSearchList; 
	  }
	 
	/*
	 * // 검색 public Map<String, Object> k3GetMemberUserSearchList(String searchKey,
	 * String searchValue, String searchStartDate, String searchEndDate, int
	 * currentPage) { Map<String, Object> paramMap = new HashMap<String, Object>();
	 * 
	 * List<Map<String, Object>> memberuserListCount =
	 * memberuserMapper.k3GetMemberUserSearchList(paramMap, searchKey, searchValue,
	 * searchStartDate, searchEndDate);
	 * 
	 * currentPage = 1;
	 * 
	 * double rowCount = memberuserListCount.size();
	 * 
	 * //보여줄 행의 개수 int rowPerPage = 1; if(rowCount < 5) { rowPerPage = (int)
	 * rowCount; }else { rowPerPage = 5; } System.out.println("몇개인지 " + rowCount +
	 * "얼마나 보여주는지 " + rowPerPage);
	 * 
	 * //마지막 페이지 int lastPage = (int) Math.ceil((rowCount / rowPerPage));
	 * if(rowPerPage == 0) { lastPage = 1; }
	 * 
	 * //페이지 알고리즘 int startNum = (currentPage - 1) * rowPerPage;
	 * 
	 * // 보여줄 시작 페이지 번호 int startPageNum = 1;
	 * 
	 * // 보여줄 마지막 페이지 번호 int endPageNum = 0; if(lastPage > 5) { endPageNum = 5;
	 * }else { endPageNum = lastPage; }
	 * 
	 * // 동적 페이지 구성 (7페이지 부터) if(currentPage > 5) { startPageNum = currentPage - 2;
	 * endPageNum = currentPage + 2; if(endPageNum > lastPage) { startPageNum =
	 * lastPage - 4; endPageNum = lastPage; } }
	 * 
	 * paramMap.put("startNum", startNum); paramMap.put("rowPerPage", rowPerPage);
	 * 
	 * List<Map<String, Object>> memberuserList =
	 * memberuserMapper.k3GetMemberUserSearchList(paramMap, searchKey, searchValue,
	 * searchStartDate, searchEndDate);
	 * 
	 * paramMap.clear();
	 * 
	 * paramMap.put("lastPage", lastPage); paramMap.put("memberuserList",
	 * memberuserList); paramMap.put("startPageNum", startPageNum);
	 * paramMap.put("endPageNum", endPageNum);
	 * 
	 * return paramMap; }
	 */
		
		//09 모달
		public List<Map<String, Object>> k3GetMemberUserModalList() {
			List<Map<String, Object>> modalList = memberuserMapper.k3GetModalList(null);
			return modalList;
		}
		//09 모달
		public List<Map<String, Object>> k3GetOurCompanyModalList() {
			List<Map<String, Object>> ocmodalList = memberuserMapper.k3GetOurCompanyModalList(null);
			return ocmodalList;
			
		}
	 
	
	
	
	
	
	
	

}
