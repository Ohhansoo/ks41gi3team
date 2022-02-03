package k3.loginstate.ahs.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@GetMapping("/k3MemberUserLoginState")
	public String getLoginStateList(Model model) {
		List<K3LoginState> loginstateList = loginstateService.getLoginStateList();
		System.out.println(loginstateList);
		model.addAttribute("title","로그인 관리");
		model.addAttribute("subtitle","로그인내역 조회");
		model.addAttribute("loginstateList",loginstateList);
		return "team03/companymanagement/loginstate/k3MemberUserLoginState";
	}
	
	//02 로그인 정보 검색
	@PostMapping("/k3MemberUserLoginState")
	public String k3GetLoginStateSearchList(@RequestParam(value="loginstateKey", required = false) String loginstateKey,
											@RequestParam(value="loginstateValue", required = false)String loginstateValue,
											Model model) {
		Map<String, Object> searchCondition = new HashMap<String, Object>();
		
		if(loginstateKey != null && "loginCode".equals(loginstateKey)) {
			loginstateKey = "loginCode";
		}else if(loginstateKey != null && "mainBusinessCode".equals(loginstateKey)) {
			loginstateKey = "mainBusinessCode";
		}else if(loginstateKey != null && "memberId".equals(loginstateKey)) {
			loginstateKey = "memberId";
		}else if(loginstateKey != null && "loginDate".equals(loginstateKey)) {
			loginstateKey = "loginDate";
		}else if(loginstateKey != null && "loginFailCount".equals(loginstateKey)) {
			loginstateKey = "loginFailCount";
		}else if(loginstateKey != null && "loginLatestTryDate".equals(loginstateKey)) {
			loginstateKey = "loginLatestTryDate";
		}else if(loginstateKey != null && "loginAccessState".equals(loginstateKey)) {
			loginstateKey = "loginAccessState";
		}else if(loginstateKey != null && "loginLogoutDate".equals(loginstateKey)) {
			loginstateKey = "loginLogoutDate";
		}else if(loginstateKey != null && "loginIpAddress".equals(loginstateKey)) {
			loginstateKey = "loginIpAddress";
		}else if(loginstateKey != null && "loginMacAddress".equals(loginstateKey)) {
			loginstateKey = "loginMacAddress";
		} 
		
		model.addAttribute("title", "로그인 관리");
		model.addAttribute("subtitle", "로그인현황 검색");
		
		searchCondition.put("loginstateKey", loginstateKey);
		searchCondition.put("loginstateValue", loginstateValue);
		System.out.println("01 220203 k3GetLoginStateSearchList-----------");

		List<K3LoginState> loginstateList = loginstateService.k3GetLoginStateSearchList(searchCondition);
		model.addAttribute("loginstateList", loginstateList);
		
		return "team03/companymanagement/loginstate/k3MemberUserLoginState";
		
		}
	}