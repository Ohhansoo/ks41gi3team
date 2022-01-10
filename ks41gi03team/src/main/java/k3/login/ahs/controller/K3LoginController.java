package k3.login.ahs.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k3.login.ahs.service.K3LoginService;
import k3.memberuser.ahs.dto.K3MemberUser;
import k3.memberuser.ahs.service.K3MemberUserService;

@Controller
@RequestMapping(value="/team03/companymanagement/login")
public class K3LoginController {
	
	
	private static final Logger log = LoggerFactory.getLogger(K3LoginController.class);
	//의존성 주입
	private K3MemberUserService memberuserService;
	public K3LoginController(K3MemberUserService memberuserService) {
		this.memberuserService = memberuserService;
	}
	
	//01 로그인화면
		@GetMapping("/k3MemberUserLogin")
		public String K3Login() {
			System.out.println("01 K3Login 220111");
			return "team03/companymanagement/login/k3MemberUserLogin";
	}
		
	//02 로그인처리
	@PostMapping("/k3MemberUserLogin")
	public String K3LoginId(@RequestParam(value="loginId", required=false) String memberId,
										@RequestParam(value="loginPw", required=false) String memberPassword,
										HttpSession session) {
		System.out.println("02 K3LoginId 220111");

		
		 if(				memberId 				!=null && !"".equals(memberId)
			      && 		memberPassword	!=null && !"".equals(memberPassword)){
			 
			 		K3MemberUser k3memberuser = memberuserService.K3MemberUserInfoBycode(memberId);
			 		
			         if(k3memberuser != null && k3memberuser.getMemberPassword()!= null 
			               && memberPassword.equals(k3memberuser.getMemberPassword())) {
				            
			        	 //로그인 비밀번호 일치시  세션에 정보값을 넣는다.
			            session.setAttribute("SID", k3memberuser.getMemberId());
			            session.setAttribute("SNAME", k3memberuser.getMemberName());
			            session.setAttribute("SLEVEL", k3memberuser.getLevelMemberCode());
			            System.out.println(session.getAttribute("SID"));
			            return "redirect:/team03/companymanagement/login/k3MemberUserLoginSuccess";
			         }
			      }
			      //로그인 비밀번호 불일치시
			      return "redirect:/team03/companymanagement/login/k3MemberUserLogin";
			   }	
		
	//04 로그아웃
	@GetMapping("/logout")
	public String K3Logout(HttpSession session) {
		System.out.println("03 K3logout 220111");
		session.invalidate();
		return "redirect:/team03/companymanagement/login/k3MemberUserLogin";
	}
	
	//로그인 결과 페이지
		@GetMapping("/k3MemberUserLoginSuccess")
		public String K3LoginSuccess() {
			return "/team03/companymanagement/login/k3MemberUserLoginSuccess";
			
		}
	
	
	
}
