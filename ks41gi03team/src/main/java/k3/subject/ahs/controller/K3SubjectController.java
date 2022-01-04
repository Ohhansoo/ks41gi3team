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
	
	
	//계정과목 삭제처리
	@PostMapping("/k3DeleteSubject")
	public String deleteCategory(@RequestParam(value="deleteList[]", required = false) List<String> deleteList) {
		int result = k3SubjectService.deleteSubject(deleteList);
		log.info("DeleteSubject 전송결과 : " + result);
		return "redirect:/team03/finance/subject/k3SubjectList";
	}
	
	
	//계정과목 수정 처리
	@PostMapping("/k3ModifySubject")
	public String modifySubject(K3Subject k3subject) {
		//계정과목 수정
		k3SubjectService.modifySubject(k3subject);
		
		return "redirect:/team03/finance/subject/k3SubjectList";
	}
	
	//계정과목 수정 폼으로 이동(값 할당해서 넣기)
	@GetMapping("/k3ModifySubject")
	public String modifySubject(@RequestParam(value="subjectCode", required = false) String subjectCode, Model model) {
		if(subjectCode != null && !"".equals(subjectCode)) {
			K3Subject subjectInfo = k3SubjectService.getModifySubject(subjectCode);
			model.addAttribute("subjectInfo", subjectInfo);
		}
		model.addAttribute("title", "계정과목 수정화면");
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
