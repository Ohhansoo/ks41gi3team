package k3.release.ahs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.release.ahs.dto.K3Release;
import k3.release.ahs.service.K3ReleaseService;

@Controller
@RequestMapping(value="/team03/goodsManagement/release")
public class K3ReleaseController {

	private K3ReleaseService k3ReleaseService;
	
	public K3ReleaseController(K3ReleaseService k3ReleaseService){
		this.k3ReleaseService = k3ReleaseService;
	}
	
	//출하 승인폼 이동
	@GetMapping("/k3AllowRelease")
	public String k3AllowRelease(Model model){
		List<K3Release>	RequestAllowRelease = k3ReleaseService.k3RequestAllowRelease();
		model.addAttribute("title", "출고관리");
		model.addAttribute("subtitle", "출고승인");
		model.addAttribute("RequestAllowRelease", RequestAllowRelease);
		return "team03/goodsManagement/release/k3AllowRelease";
	}
	//출고 등록폼 이동
	@GetMapping("/k3AddRelease")
	public String k3AddRelease() {
		
		return "team03/goodsManagement/release/k3AddRelease";
	}
	//출고 현황이동
	@GetMapping("/k3ReleaseList")
	public String k3GetReleaseList(Model model) {
		List<K3Release>	releaseList = k3ReleaseService.k3GetReleaseList();
		model.addAttribute("title", "출고관리");
		model.addAttribute("subtitle", "출고현황");
		model.addAttribute("releaseList", releaseList);
		return "team03/goodsManagement/release/k3ReleaseList";
	}
}
