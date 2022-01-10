package k3.memberuserlevel.ahs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.memberuserlevel.ahs.dto.K3MemberUserLevel;
import k3.memberuserlevel.ahs.service.K3MemberUserLevelService;

@Controller
@RequestMapping(value = "/team03/companymanagement/level")
public class K3MemberUserLevelController {

	private K3MemberUserLevelService memberuserlevelService;

	public K3MemberUserLevelController(K3MemberUserLevelService memberuserlevelService) {
		this.memberuserlevelService = memberuserlevelService;
	}
	/*
	 * //회원등록처리
	 * 
	 * @GetMapping("/k3AddMemberUserLevelList") public String
	 * k3MoveToAddMemberUserLevelForm(K3MemberUserLevel k3MemberUserLevel) {
	 * memberuserlevelService.AddMemberUserLevel(k3MemberUserLevel); return null; }
	 */

	//01 회원권한 조회(초기화면)
		@GetMapping("/k3MemberUserLevelList")
		public String getMemberUserLevelList(Model model) {
			System.out.println("02 220107 getMemberUserLevelList K3MemberUserLevelController.java");

			 List<K3MemberUserLevel> memberuserlevelList =memberuserlevelService.getMemberUserLevelList();
			 
			model.addAttribute("title", "회원권한조회");
			 model.addAttribute("memberuserlevelList", memberuserlevelList); 
			return "team03/companymanagement/level/k3MemberUserLevelList";
	}
		
	//02 회원권한등록화면(이동)
	@GetMapping("/k3AddMemberUserLevelList")
	public String AddMemberUserLevelList(Model model) {
		model.addAttribute("title", "회원권한관리");
		model.addAttribute("subtitle", "회원권한등록");
		return "team03/companymanagement/level/k3AddMemberUserLevelList";
	}

	
}