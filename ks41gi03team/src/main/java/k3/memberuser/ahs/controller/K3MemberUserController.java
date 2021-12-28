package k3.memberuser.ahs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.memberuser.ahs.dto.K3MemberUser;
import k3.memberuser.ahs.service.K3MemberUserService;

@Controller
@RequestMapping(value="/team03")
public class K3MemberUserController {
	
	private K3MemberUserService memberuserService;
	
	public K3MemberUserController(K3MemberUserService memberuserService) {
		this.memberuserService = memberuserService;
	}
	
	@GetMapping("member/k3MemberUserList")
	public String getMemberUserList(Model model) {
		List<K3MemberUser> memberuserList = memberuserService.getMemberUserList();
		
		model.addAttribute("title", "회원조회");
		model.addAttribute("memberuserList", memberuserList);
		return "team03/member/k3MemberUserList";
		
	}

}
