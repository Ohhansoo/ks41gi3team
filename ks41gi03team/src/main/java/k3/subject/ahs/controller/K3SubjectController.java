package k3.subject.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.subject.ahs.dto.K3Subject;
import k3.subject.ahs.service.K3SubjectService;

@Controller
@RequestMapping(value="/team03/subject")
public class K3SubjectController {
	
	private static final Logger log = LoggerFactory.getLogger(K3SubjectController.class);
	
	private K3SubjectService k3SubjectService;
	
	public K3SubjectController(K3SubjectService k3SubjectService) {
		this.k3SubjectService = k3SubjectService;
	}
	
	//계정과목 등록처리(이동)
	@PostMapping("/k3SubjectAdd")
	public String subjectAdd(K3Subject k3Subject) {
		int result = k3SubjectService.subjectAdd(k3Subject);
		log.info("subjectAdd 메서드 인서트 결과 : " + result);
		log.info("subjectAdd 메서드 인서트 결과 : " + k3Subject);
		return "redirect:/team03/finance/subject/k3SubjectList";
	}
	
	//계정과목 등록화면(이동)
	@GetMapping("/k3SubjectAdd")
	public String goToSubjectAddForm(Model model) {
		return "/team03/finance/subject/k3SubjectAdd";
	}
	
	//계정과목 현황(초기화면)
	@GetMapping("/k3SubjectList")
	public String SubjectList(Model model) {
		List<K3Subject> subjectList = k3SubjectService.getSubjectList();
		model.addAttribute("title", "계정과목 관리");
		model.addAttribute("subtitle", "계정과목 현황");
		model.addAttribute("subjectList", subjectList);
		
		return "/team03/finance/subject/k3SubjectList";
	}
}
