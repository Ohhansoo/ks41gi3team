package k3.inout.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k3.in.ahs.dto.K3In;
import k3.inout.ahs.dto.K3Inout;
import k3.inout.ahs.service.K3InoutService;
import k3.subject.ahs.dto.K3Subject;

@Controller
@RequestMapping(value="/team03/finance/inout")
public class K3InoutController {
	//로그
	private static final Logger log = LoggerFactory.getLogger(K3InoutController.class);
	
	//의존성 주입
	private final K3InoutService k3InoutService;
	
	public K3InoutController(K3InoutService k3InoutService) {
		this.k3InoutService = k3InoutService;
	}
	
	
	
	
	//계정과목 수정 폼으로 이동(값 할당해서 넣기)
	@GetMapping("/k3ModifyInout")
	public String modifyInout(@RequestParam(value="inoutRec", required = false) String inoutRec, Model model) {
		if(inoutRec != null && !"".equals(inoutRec)) {
			K3Inout inoutInfo = k3InoutService.getModifyInout(inoutRec);
			model.addAttribute("inoutInfo", inoutInfo);
		}
		model.addAttribute("title", "계정과목 수정화면");
		return "team03/finance/inout/k3ModifyInout";
	}

	
	//입출금 내역 등록처리
	@PostMapping("/k3AddInout")
	public String addInout(K3Inout k3Inout) {
		int result = k3InoutService.addInout(k3Inout);
		log.info("inoutAdd 메서드 인서트 결과 : " + result);
		log.info("inoutAdd 메서드 인서트 결과 : " + k3Inout);
		return "redirect:/team03/finance/inout/k3InoutList";
	}
	
	//입출금 내역 등록화면(이동)
	@GetMapping("/k3AddInout")
	public String goToInoutAddForm(Model model) {
		return "/team03/finance/inout/k3AddInout";
	}
	
	//입출금 내역 조회
	@GetMapping("/k3InoutList")
	public String InoutList(Model model) {
		List<K3Inout> inoutList = k3InoutService.getInoutList();
		model.addAttribute("title", "입출금 내역");
		model.addAttribute("subtitle", "입출금 내역 조회");
		model.addAttribute("inoutList", inoutList);
		
		return "/team03/finance/inout/k3InoutList";
	}
}
