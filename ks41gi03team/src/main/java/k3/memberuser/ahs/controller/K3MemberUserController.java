package k3.memberuser.ahs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.memberuser.ahs.dto.K3MemberUser;
import k3.memberuser.ahs.service.K3MemberUserService;

@Controller
@RequestMapping(value="/team03/companymanagement/member")
public class K3MemberUserController {
	
	private K3MemberUserService memberuserService;
	
	public K3MemberUserController(K3MemberUserService memberuserService) {
		this.memberuserService = memberuserService;
	}
	//직원등록
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
	
	//직원조회
	@GetMapping("k3MemberUserList")
	public String getMemberUserList(Model model) {
		List<K3MemberUser> memberuserList = memberuserService.getMemberUserList();
		
		model.addAttribute("title", "회원조회");
		model.addAttribute("memberuserList", memberuserList);
		return "team03/companymanagement/member/k3MemberUserList";
		
	}

}
