package k3.login.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.login.ahs.service.K3LoginService;

@Controller
@RequestMapping(value="/team03/companymanagement/login")
public class K3LoginController {
	
	private K3LoginService loginService;
	
	public K3LoginController(K3LoginService loginService) {
		this.loginService = loginService;
	}

	//로그인화면
	@GetMapping("/k3MemberUserLogin")
	public String K3Login() {
		return "team03/companymanagement/login/k3MemberUserLogin";
	}
}
