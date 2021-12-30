package k3.out.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.out.ahs.dto.K3Out;
import k3.out.ahs.service.K3OutService;

	@Controller
	@RequestMapping(value="/team03/out")
	public class K3OutController {
	
	private static final Logger log = LoggerFactory.getLogger(K3OutController.class);
		
		private K3OutService k3OutService;
		
		public K3OutController(K3OutService k3OutService) {
			this.k3OutService = k3OutService;
	}
		
	//비용 등록처리(이동)
	@PostMapping("/k3OutAdd")
	public String outAdd(K3Out k3Out) {
		int result = k3OutService.outAdd(k3Out);
		log.info("subjectAdd 메서드 인서트 결과 : " + result);
		log.info("subjectAdd 메서드 인서트 결과 : " + k3Out);
		return "redirect:/team03/finance/out/k3OutList";
	}
	
	//비용 등록화면(이동)
	@GetMapping("/k3OutAdd")
	public String goToOutAddForm(Model model) {
		return "/team03/finance/out/k3OutAdd";
	}
	
	//비용 내역 현황(초기화면)
	@GetMapping("/k3OutList")
	public String OutList(Model model) {
		List<K3Out> outList = k3OutService.getOutList();
		model.addAttribute("title", "계정과목 관리");
		model.addAttribute("subtitle", "계정과목 현황");
		model.addAttribute("outList", outList);
		
		return "/team03/finance/out/k3OutList";
	}	
		
}
