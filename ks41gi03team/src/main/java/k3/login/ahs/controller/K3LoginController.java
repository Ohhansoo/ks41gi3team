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
	//로그인처리
	@PostMapping("k3MemberUserLogin")
	public String K3LoginId(@RequestParam(value="loginId", required=false) String memberId,
							@RequestParam(value="loginPw", required=false) String memberPassword,
							HttpSession session) {
		K3MemberUser memberuser = loginService.getMemberInfoByMemberId(memberId);
		
		if(memberuser != null && memberuser.getMemberPassword() != null) {
			
		}
		return "redirect:/team03/companymanagement/login/k3MemberUserLogin";
		
	}
	

	//로그인화면
	@GetMapping("/k3MemberUserLogin")
	public String K3Login() {
		return "team03/companymanagement/login/k3MemberUserLogin";
	}
}
