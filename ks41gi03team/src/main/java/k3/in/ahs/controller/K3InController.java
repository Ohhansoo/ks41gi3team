package k3.in.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.in.ahs.dto.K3In;
import k3.in.ahs.service.K3InService;
import k3.inout.ahs.controller.K3InoutController;
import k3.inout.ahs.dto.K3Inout;
import k3.inout.ahs.service.K3InoutService;
import k3.out.ahs.dto.K3Out;

@Controller
@RequestMapping(value="/team03/in")
public class K3InController {
	//로그
		private static final Logger log = LoggerFactory.getLogger(K3InController.class);
		
		//의존성 주입
		private K3InService k3InService;
		
		
		public K3InController(K3InService k3InService) {
			this.k3InService = k3InService;
		}
		
		//매출  내역 등록처리(이동)
		@PostMapping("/k3InAdd")
		public String inAdd(K3In k3In) {
			int result = k3InService.inAdd(k3In);
			log.info("inAdd 메서드 인서트 결과 : " + result);
			log.info("inAdd 메서드 인서트 결과 : " + k3In);
			return "redirect:/team03/finance/out/k3InList";
		}
		
		//매출 내역 등록화면(이동)
		@GetMapping("/k3InAdd")
		public String goToInAddForm(Model model) {
			return "/team03/finance/in/k3InAdd";
		}
		
		
		//매출 내역 조회
		@GetMapping("/k3InList")
		public String InList(Model model) {
			List<K3In> inList = k3InService.getInList();
			model.addAttribute("title", "입출금 내역");
			model.addAttribute("subtitle", "입출금 내역 조회");
			model.addAttribute("inList", inList);
			
			return "/team03/finance/in/k3InList";
		}
}
