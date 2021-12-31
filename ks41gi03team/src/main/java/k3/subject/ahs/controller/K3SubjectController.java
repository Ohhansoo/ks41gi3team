package k3.subject.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k3.subject.ahs.dto.K3Subject;
import k3.subject.ahs.service.K3SubjectService;

@Controller
@RequestMapping(value="/team03/finance/subject")
public class K3SubjectController {
	
	private static final Logger log = LoggerFactory.getLogger(K3SubjectController.class);
	
	private K3SubjectService k3SubjectService;
	
	public K3SubjectController(K3SubjectService k3SubjectService) {
		this.k3SubjectService = k3SubjectService;
	}
	
	
	
	//계정과목 수정처리
	@PostMapping("/modifySubject")
	public String modifySubject(K3Subject k3Subject) {
		log.info("수정화면에서 입력 받은 subject정보 : {}", k3Subject );
		
		//계정과목 수정
		k3SubjectService.modifySubjectInfo(k3Subject);
		
		return "redirect:/team03/finance/subject/k3SubjectList";
	}
	
	//계정과목 수정화면
	@GetMapping("/k3modifySubject")
	public String k3ModifySubject(@RequestParam(value="subjectCode", required = false) String subjectCode
							   , Model model) {
		//subjectCode 콘솔에 출력(log4j)
		log.info("modifySubject subjectCode: {}", subjectCode);
		
		//계정과목의 정보
		if(subjectCode != null && !"".equals(subjectCode)) {
			K3Subject subjectInfo = k3SubjectService.getSubjectInfoBySubjectCode(subjectCode);
			model.addAttribute("subjectInfo", subjectInfo);
		}
		model.addAttribute("title", "계정과목수정화면");
		return "team03/finance/subject/k3ModifySubject";
	}
	
	//계정과목 등록처리
	@PostMapping("/k3SubjectList")
	public String addSubject(K3Subject k3Subject) {
		int result = k3SubjectService.addSubject(k3Subject);
		log.info("addSubject 메서드 인서트 결과 : " + result);
		log.info("addSubject 메서드 인서트 결과 : " + k3Subject);
		return "redirect:/team03/finance/subject/k3SubjectList";
	}
	
	//계정과목 등록화면(이동)
	@GetMapping("/k3AddSubject")
	public String goToAddSubjectForm(Model model) {
		model.addAttribute("title", "계정과목 관리");
		model.addAttribute("subtitle", "계정과목 등록");
		return "/team03/finance/subject/k3AddSubject";
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
