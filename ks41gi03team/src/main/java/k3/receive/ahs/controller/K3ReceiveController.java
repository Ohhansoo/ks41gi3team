package k3.receive.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.receive.ahs.dto.K3Receive;
import k3.receive.ahs.service.K3ReceiveService;

@Controller
@RequestMapping(value="/team03/receive")
public class K3ReceiveController {

	private static final Logger log = LoggerFactory.getLogger(K3ReceiveController.class);
	
	private K3ReceiveService k3ReceiveService;
	
	public K3ReceiveController(K3ReceiveService k3ReceiveService) {
		this.k3ReceiveService = k3ReceiveService;	
	}
	//미수금 등록처리(이동)
	@PostMapping("/k3ReceiveAdd")
	public String ReceiveAdd(K3Receive k3Receive) {
		int result = k3ReceiveService.receiveAdd(k3Receive);
		log.info("receiveAdd 메서드 인서트 결과 : " + result);
		log.info("receiveAdd 메서드 인서트 결과 : " + k3Receive);
		return "redirect:/team03/receive/k3ReceiveList";
	}
	
	//미수금 등록화면(이동)
	@GetMapping("/k3ReceiveAdd")
	public String goToReceiveAddForm(Model model) {
		return "/team03/finance/receive/k3ReceiveAdd";
	}
	
	//미수금 내역 현황(초기화면)
	@GetMapping("/k3ReceiveList")
	public String OutList(Model model) {
		List<K3Receive> receiveList = k3ReceiveService.getReceiveList();
		model.addAttribute("title", "계정과목 관리");
		model.addAttribute("subtitle", "계정과목 현황");
		model.addAttribute("ReceiveList", receiveList);
		return "/team03/finance/receive/k3ReceiveList";
	}	
}
	

	
