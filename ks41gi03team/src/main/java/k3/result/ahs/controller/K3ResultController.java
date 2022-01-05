package k3.result.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.result.ahs.dto.K3Result;
import k3.result.ahs.service.K3ResultService;


@Controller
@RequestMapping(value="/team03/result")
public class K3ResultController {

	private static final Logger log = LoggerFactory.getLogger(K3ResultController.class);
	
	private K3ResultService k3ResultService;
	
	public K3ResultController(K3ResultService k3ResultService) {
		this.k3ResultService = k3ResultService;	
	}
	
	//결산 등록처리(이동)
	@PostMapping("/k3ResultAdd")
	public String ResultAdd(K3Result k3Result) {
		int result = k3ResultService.resultAdd(k3Result);
		log.info("receiveAdd 메서드 인서트 결과 : " + result);
		log.info("receiveAdd 메서드 인서트 결과 : " + k3Result);
		return "redirect:/team03/finance/result/k3ReceiveList";
	}
	
	//결산 등록화면(이동)
	@GetMapping("/k3ResultAdd")
	public String goToReceiveAddForm(Model model) {
		return "/team03/finance/result/k3ResultAdd";
	}
	
	//결산 내역 현황(초기화면)
	@GetMapping("/k3ResultList")
	public String OutList(Model model) {
		List<K3Result> resultList = k3ResultService.getResultList();
		model.addAttribute("title", "계정과목 관리");
		model.addAttribute("subtitle", "계정과목 현황");
		model.addAttribute("ResultList", resultList);
		return "/team03/finance/result/k3ResultList";
	}	
}