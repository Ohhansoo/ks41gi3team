package k3.loginstate.ahs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.loginstate.ahs.dto.K3LoginState;
import k3.loginstate.ahs.service.K3LoginStateService;

@Controller
@RequestMapping(value="/team03/companymanagement/loginstate")
public class K3LoginStateController {
	
	private K3LoginStateService loginstateService;
	
	public K3LoginStateController(K3LoginStateService loginstateService) {
		this.loginstateService = loginstateService;
	}
	//01 로그인현황 조회
	@GetMapping("k3MemberUserLoginState")
	public String getLoginStateList(Model model) {
		List<K3LoginState> loginstateList = loginstateService.getLoginStateList();
		System.out.println(loginstateList);
		model.addAttribute("title","로그인 관리");
		model.addAttribute("subtitle","로그인내역 조회");
		model.addAttribute("loginstateList",loginstateList);
		return "team03/companymanagement/loginstate/k3MemberUserLoginState";
		
	}

}
