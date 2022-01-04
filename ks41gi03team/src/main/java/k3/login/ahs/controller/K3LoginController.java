package k3.login.ahs.controller;

import java.lang.reflect.Member;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k3.login.ahs.service.K3LoginService;
import k3.memberuser.ahs.dto.K3MemberUser;

@Controller
@RequestMapping(value="/team03/companymanagement/login")
public class K3LoginController {
	
	private K3LoginService loginService;
	
	public K3LoginController(K3LoginService loginService) {
		this.loginService = loginService;
	}
	//로그아웃
	@GetMapping("logout")
	public String K3logout(HttpSession session) {
		session.invalidate();
		return "redirect:/team03/companymanagement/login/k3MemberUserLogin";
	}
	
	//로그인처리
	@PostMapping("k3MemberUserLogin")
	public String K3LoginId(@RequestParam(value="loginId", required=false) String memberId,
							@RequestParam(value="loginPw", required=false) String memberPassword,
							HttpSession session) {
		
		 if(memberId !=null && !"".equals(memberId)
			      && memberPassword!=null && !"".equals(memberPassword)){
			 		K3MemberUser k3memberuser = loginService.getMemberInfoByMemberId(memberId);
			         if(k3memberuser != null && k3memberuser.getMemberPassword()!= null 
			               && memberPassword.equals(k3memberuser.getMemberPassword())) {
			            //로그인 비밀번호 일치시  세션에 정보값을 넣는다.
			            session.setAttribute("SID", memberId);
			            session.setAttribute("SNAME", k3memberuser.getMemberName());
			            session.setAttribute("SLEVEL", k3memberuser.getLevelMemberCode());
			            return "redirect:/";
			         }
			      }
			      //로그인 비밀번호 불일치시
			      return "redirect:/team03/companymanagement/login/k3MemberUserLogin";
			   }
	
	//로그인화면
	@GetMapping("/k3MemberUserLogin")
	public String K3Login() {
		return "team03/companymanagement/login/k3MemberUserLogin";
	}
}
