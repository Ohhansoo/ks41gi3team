package k3.retiredmemberuser.ahs.controller;

import java.util.List;

import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.ourcompany.ahs.controller.K3OurcompanyController;
import k3.retiredmemberuser.ahs.dto.K3RetiredMemberUser;
import k3.retiredmemberuser.ahs.service.K3RetiredMemberUserService;

@Controller
@RequestMapping(value="/team03/companymanagement/retiredmemberuser")
public class K3RetiredMemberUserController {
	
	private K3RetiredMemberUserService retiredmemberuserService;
	
	private static final Logger log = LoggerFactory.getLogger(K3OurcompanyController.class);
	
	public K3RetiredMemberUserController(K3RetiredMemberUserService retiredmemberuserService) {
		this.retiredmemberuserService =retiredmemberuserService;
	}
	
	//퇴사회원 등록처리 
	@PostMapping("/k3AddRetiredMemberUserList")
	public String k3MoveToAddRetiredMemberUserForm(K3RetiredMemberUser k3RetiredMemberUser) {
		retiredmemberuserService.AddRetiredMemberUser(k3RetiredMemberUser);
		return "redirect:/team03/companymanagement/retiredmemberuser/k3RetiredMemberUserList";
	}
	
	//퇴사회원 등록화면(이동)
	@GetMapping("/k3AddRetiredMemberUserList")
	public String AddRetiredMemberUser(Model model) {
		model.addAttribute("title","퇴사회원관리");
		model.addAttribute("subtitle","퇴사회원등록");
		return "team03/companymanagement/retiredmemberuser/k3AddRetiredMemberUserList";
	}
	
	
	//퇴사회원 조회
	@GetMapping("/k3RetiredMemberUserList")
	public String getRetiredMemberUserList(Model model) {
		List<K3RetiredMemberUser> retiredmemberuserList = retiredmemberuserService.getRetiredMemberUserList();
		
		model.addAttribute("title", "퇴사회원 조회");
		model.addAttribute("retiredmemberuserList", retiredmemberuserList);
		return "team03/companymanagement/retiredmemberuser/k3RetiredMemberUserList";
		
	}
}
