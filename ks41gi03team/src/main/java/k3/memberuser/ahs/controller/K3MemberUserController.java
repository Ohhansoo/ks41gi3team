package k3.memberuser.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import k3.category.ahs.controller.K3CategoryController;
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

	/*
	 * ,mainBusinessCode ,levelMemberCode ,memberName ,memberGender ,memberAddr
	 * ,memberPhone ,memberResidentRegistrationNumber ,memberState ,memberRegDate
	 * ,memberHiredDate
	 */
	 
	 
	//중복확인 
	@PostMapping("/k3IdCheck")
	@ResponseBody
	public boolean idCheck(@RequestParam(value="memberId", required = false) String memberId) {
		boolean checkResult = false;
		
		int check = memberuserService.getMemberByMemberId(memberId);
		
		if(check > 0) checkResult = true;
		
		return checkResult;
	}
	
	//직원등록 처리 
	@PostMapping("/k3AddMemberUserList")
	public String k3MoveToAddMemberUserForm(K3MemberUser k3memberuser) {
		memberuserService.AddMemberUser(k3memberuser);
		return "redirect:/team03/companymanagement/member/k3MemberUserList";
	}
	//직원등록화면(이동)
	@GetMapping("/k3AddMemberUserList")
	public String AddMemberUser(Model model) {
		model.addAttribute("title", "직원관리");
		model.addAttribute("subtitle","직원등록");
		return "team03/companymanagement/member/k3AddMemberUserList";
	}
	
	//02 직원조회(초기화면)
	@GetMapping("/k3MemberUserList")
	public String getMemberUserList(Model model) {
		System.out.println("02 220106 getMemberUserList K3MemberUserController.java");
		
		List<K3MemberUser> memberuserList = memberuserService.getMemberUserList();
		
		model.addAttribute("title", "직원관리");
		model.addAttribute("memberuserList", memberuserList);
		return "team03/companymanagement/member/k3MemberUserList";
		
	}
	//01 직원정보 수정폼 이동
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
	  //03 직원정보 수정처리 - uri 매핑 경로 수정 수정 해야 한다
	  @PostMapping("/k3ModifyMemberUserInfo") 
	  	public String k3ModifyMemberUserInfo(K3MemberUser k3memberuser) {
		  System.out.println("03 220106 k3ModifyMemberUserInfo K3MemberUserController.java");

		  int result = memberuserService.k3ModifyMemberUserInfo(k3memberuser);
		  log.info("k3ModifyMemberUserList 메소드 수정 리스트 : " + k3memberuser);
		  log.info("k3ModifyMemberUserList 메소드 수정 결과  : " + result);
		  return "redirect:/team03/companymanagement/member/k3MemberUserList"; 
	  }
	  //04 직원정보 삭제처리 ( 한줄 삭제 )
	  @GetMapping("/k3DeleteMemberUser")
//		public String k3DeleteMemberUser(@RequestParam(value="deleteList[]", required = false) List<String>deleteList) {
		public String k3DeleteMemberUser(@RequestParam(value="memberId", required = false) String memberId, Model model) {			
			  System.out.println("04 220106 k3DeleteMemberUser K3MemberUserController.java");

			int result = memberuserService.k3DeleteMemberUser(memberId);
			log.info("DeleteMemberUser 전송결과 : "  + result);
			return "redirect:/team03/companymanagement/member/k3MemberUserList";
		}
	/*
	 * //05 직원정보 조회
	 * 
	 * @PostMapping("/k3MemberUserList") public String
	 * k3GetMemberUSerSearchList(@RequestParam(value="memberuserKey", required =
	 * false) String memberuserKey,
	 * 
	 * @RequestParam(value="memberuserValue", required = false) String
	 * memberuserValue, Model model) { if(memberuserKey != null &&
	 * "memberId".equals(memberuserKey)) { memberuserKey = "memberId"; }else
	 * if(memberuserKey != null && "memberPassword".equals(memberuserKey)) {
	 * memberuserKey = "memberPassword"; }else if(memberuserKey != null &&
	 * "mainBusinessCode".equals(memberuserKey)) { memberuserKey =
	 * "mainBusinessCode"; }else if(memberuserKey != null &&
	 * "memberName".equals(memberuserKey)) { memberuserKey = "memberName"; }else
	 * if(memberuserKey != null && "memberGender".equals(memberuserKey)) {
	 * memberuserKey = "memberGender"; }else if(memberuserKey != null &&
	 * "memberAddr".equals(memberuserKey)) { memberuserKey = "memberAddr"; }else
	 * if(memberuserKey != null && "memberPhone".equals(memberuserKey)) {
	 * memberuserKey = "memberPhone"; }else if(memberuserKey != null &&
	 * "memberResidentRegistrationNumber".equals(memberuserKey)) { memberuserKey =
	 * "memberResidentRegistrationNumber"; }else if(memberuserKey != null &&
	 * "memberState".equals(memberuserKey)) { memberuserKey = "memberState"; }else
	 * if(memberuserKey != null && "memberRegDate".equals(memberuserKey)) {
	 * memberuserKey = "memberRegDate"; }else if(memberuserKey != null &&
	 * "memberHiredDate".equals(memberuserKey)) { memberuserKey = "memberHiredDate";
	 * } System.out.
	 * println("05 220106 k3GetMemberUSerSearchList K3MemberUserController.java");
	 * 
	 * 
	 * return "team03/companymanagement/member/k3MemberUserList"; }
	 */
		 
}
