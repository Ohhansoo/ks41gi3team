package k3.memberuser.ahs.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import k3.memberuser.ahs.controller.K3MemberUserController;
import k3.memberuser.ahs.dto.K3MemberUser;
import k3.memberuser.ahs.service.K3MemberUserService;

@Controller
@RequestMapping(value="/team03/companymanagement/member")
public class K3MemberUserController {
	
	private static final Logger log = LoggerFactory.getLogger(K3MemberUserController.class);
	
	private K3MemberUserService memberuserService;
	
	public K3MemberUserController(K3MemberUserService memberuserService) {
		this.memberuserService = memberuserService;
	}

	//중복확인 
	@PostMapping("/k3IdCheck")
	@ResponseBody
	public boolean idCheck(@RequestParam(value="memberId", required = false) String memberId) {
		boolean checkResult = false;
		
		int check = memberuserService.getMemberByMemberId(memberId);
		
		if(check > 0) checkResult = true;
		
		return checkResult;
	}
	 
	 
	//01 직원조회(초기화면)
	@GetMapping("/k3MemberUserList")
	public String getMemberUserList(Model model) {
		System.out.println("02 220106 getMemberUserList K3MemberUserController.java");
		
		List<K3MemberUser> memberuserList = memberuserService.getMemberUserList();
		
		model.addAttribute("title", "직원관리");
		model.addAttribute("memberuserList", memberuserList);
		return "team03/companymanagement/member/k3MemberUserList";
		
	}
	
	//02 직원등록화면(이동)
	@GetMapping("/k3AddMemberUserList")
	public String AddMemberUser(Model model) {
		model.addAttribute("title", "직원관리");
		model.addAttribute("subtitle","직원등록");
		return "team03/companymanagement/member/k3AddMemberUserList";
	}
	
	//03 직원등록 처리 
	@PostMapping("/k3AddMemberUserList")
	public String k3MoveToAddMemberUserForm(K3MemberUser k3memberuser) {
		memberuserService.AddMemberUser(k3memberuser);
		return "redirect:/team03/companymanagement/member/k3MemberUserList";
	}
	
	//04 직원정보 수정폼 이동
	@GetMapping("/k3ModifyMemberUserList") 
	  public String k3ModifyMemberUser(@RequestParam(value="memberId", required = false) String memberId, Model model) { 
		  log.info("memberId = {}", memberId);
		  System.out.println("01 220106 k3ModifyMemberUser K3MemberUserController.java");
	  
		  if(memberId != null && !"".equals(memberId)) {
			  K3MemberUser k3MemberUserInfo = memberuserService.K3MemberUserInfoBycode(memberId);
			  model.addAttribute("k3MemberUserInfo", k3MemberUserInfo);
		  }
		  model.addAttribute("title","직원정보 관리");
		  model.addAttribute("subtitle","직원정보 수정");
		  return "team03/companymanagement/member/k3ModifyMemberUserList"; 
	  }
	
	  //05 직원정보 수정처리
	  @PostMapping("/k3ModifyMemberUserInfo") 
	  	public String k3ModifyMemberUserInfo(K3MemberUser k3memberuser) {
		  System.out.println("03 220106 k3ModifyMemberUserInfo K3MemberUserController.java");

		  int result = memberuserService.k3ModifyMemberUserInfo(k3memberuser);
		  log.info("k3ModifyMemberUserList 메소드 수정 리스트 : " + k3memberuser);
		  log.info("k3ModifyMemberUserList 메소드 수정 결과  : " + result);
		  return "redirect:/team03/companymanagement/member/k3MemberUserList"; 
	  }
	  
	  //06 직원정보 삭제처리 ( 한줄 삭제 )
	  @GetMapping("/k3DeleteMemberUser")
//		public String k3DeleteMemberUser(@RequestParam(value="deleteList[]", required = false) List<String>deleteList) {
		public String k3DeleteMemberUser(@RequestParam(value="memberId", required = false) String memberId, Model model) {			
			  System.out.println("04 220106 k3DeleteMemberUser K3MemberUserController.java");

			int result = memberuserService.k3DeleteMemberUser(memberId);
			log.info("DeleteMemberUser 전송결과 : "  + result);
			return "redirect:/team03/companymanagement/member/k3MemberUserList";
	  }
	  
	  //07 직원정보 삭제처리
	  @PostMapping("/k3RemoveMemberUser")
	  	public String k3RemoveMemberUser(@RequestParam(value="removeList[]", required = false) List<String> removeList) {
		  System.out.println("04 220106 k3DeleteMemberUser K3MemberUserController.java");
		  int result = memberuserService.k3RemoveMemberUser(removeList);
		  return "redirect:/team03/companymanagement/retiredmemberuser/k3RetiredMemberUserList	";
	  }
	  
	
	  //08 직원정보 검색
	  @PostMapping("/k3MemberUserList") 
	  public String k3GetMemberUserSearchList(@RequestParam(value="memberuserKey", required = false) String memberuserKey,
			  								  @RequestParam(value="memberuserValue", required = false) String memberuserValue,
			  								  @RequestParam(value="searchStartDate", required = false) String searchStartDate,
			  								  @RequestParam(value="searchEndDate", required = false) String searchEndDate,
			  								  @RequestParam(value="memberuserDateKey", required = false) String memberuserDateKey,
			  								  Model model) { 
		  
			  Map<String, Object> searchCondition = new HashMap<String, Object>();

		  	  if(memberuserKey != null && "memberId".equals(memberuserKey)) {
			      memberuserKey = "memberId"; 
			  }else if(memberuserKey != null && "memberPassword".equals(memberuserKey)) {
			     memberuserKey = "memberPassword"; 
			  }else if(memberuserKey != null && "mainBusinessCode".equals(memberuserKey)) { 
				 memberuserKey = "mainBusinessCode"; 
			  }else if(memberuserKey != null &&"memberName".equals(memberuserKey)) {
				  memberuserKey = "memberName"; 
			  }else if(memberuserKey != null &&"levelMemberCode".equals(memberuserKey)) {
				  memberuserKey = "levelMemberCode"; 
			  }else if(memberuserKey != null && "memberGender".equals(memberuserKey)) {
		          memberuserKey = "memberGender";
			  }else if(memberuserKey != null && "memberPhone".equals(memberuserKey)) {
		          memberuserKey = "memberPhone"; 
		      }else if(memberuserKey != null &&"memberResidentRegistrationNumber".equals(memberuserKey)) { 
		    	  memberuserKey ="memberResidentRegistrationNumber"; 
		      }else if(memberuserKey != null &&"memberState".equals(memberuserKey)) { 
		    	  memberuserKey = "memberState"; 
		      }else if(memberuserKey != null && "memberRegDate".equals(memberuserKey)) {
		          memberuserKey = "memberRegDate"; 
		      }else if(memberuserKey != null && "memberHiredDate".equals(memberuserKey)) { 
		    	  memberuserKey = "memberHiredDate";
		      }else if(memberuserKey != null && "memberRetiredReason".equals(memberuserKey)) { 
		    	  memberuserKey = "memberRetiredReason";
		      }else if(memberuserKey != null && "memberRetiredDate".equals(memberuserKey)) { 
		    	  memberuserKey = "memberRetiredDate";
		      }else if(memberuserKey != null && "memberRetirementSignedDate".equals(memberuserKey)) { 
		    	  memberuserKey = "memberRetirementSignedDate";
		      }else if(memberuserKey != null && "memberpostaladdress".equals(memberuserKey)) { 
		    	  memberuserKey = "memberpostaladdress";
		      }else if(memberuserKey != null && "memberstreetaddress".equals(memberuserKey)) { 
		    	  memberuserKey = "memberstreetaddress";
		      }else if(memberuserKey != null && "memberdetailaddress".equals(memberuserKey)) { 
		    	  memberuserKey = "memberdetailaddress";
		      } 
		  	  if(memberuserDateKey != null && "memberuserRegDate".equals(memberuserDateKey)) {
		  		memberuserDateKey = "memberuserRegDate";
		  	  }else if(memberuserDateKey != null && "memberuserHiredDate".equals(memberuserDateKey)) {
		  		memberuserDateKey = "memberuserHiredDate";
		  	  }	
		  	  searchCondition.put("memberuserKey", memberuserKey);
		  	  searchCondition.put("memberuserValue", memberuserValue);
		  	  searchCondition.put("searchStarDate", searchStartDate);
		  	  searchCondition.put("searchEndDate", searchEndDate);
		  	  searchCondition.put("memberuserDateKey", memberuserDateKey);
		  	  System.out.println("05 220106 k3GetMemberUSerSearchList K3MemberUserController.java");
		  	  List<K3MemberUser> memberuserList = memberuserService.k3GetMemberUserSearchList(searchCondition);
		  	  model.addAttribute("memberuserList",memberuserList);
		  		
		  	  return "team03/companymanagement/member/k3MemberUserList";
	}	
	  //모달
		@PostMapping("/k3membermodal")
		@ResponseBody
		public List<Map<String, Object>> k3GetMemberUserModalList(){
			List<Map<String, Object>> modalList  =memberuserService.k3GetMemberUserModalList();
			return modalList;
		}
		
		}
		
		
		
		
		
		
		