package k3.loginstate.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/team03/companymanagement/login")
public class K3LoginStateController {
	@GetMapping("/k3MemberUserLogin")
	public String K3Login() {
		return "team03/companymanagement/login/k3MemberUserLogin";
		
	}

}
