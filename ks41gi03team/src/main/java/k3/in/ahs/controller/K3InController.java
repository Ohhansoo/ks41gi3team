package k3.in.ahs.controller;

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
import k3.in.ahs.service.K3InService;
import k3.inout.ahs.controller.K3InoutController;
import k3.inout.ahs.dto.K3Inout;
import k3.inout.ahs.service.K3InoutService;
import k3.out.ahs.dto.K3Out;

@Controller
@RequestMapping(value="/team03/finance/in")
public class K3InController {
	//로그
		private static final Logger log = LoggerFactory.getLogger(K3InController.class);
		
		//의존성 주입
		private final K3InService k3InService;
		
		public K3InController(K3InService k3InService) {
			this.k3InService = k3InService;
		}

		//매출 내역 삭제처리
		@PostMapping("/k3DeleteIn")
		public String deleteIn(@RequestParam(value="deleteList[]", required = false) List<String> deleteList) {
			int result = k3InService.deleteIn(deleteList);
			return "redirect:/team03/finance/in/k3InList";
		}		
		
		
		//매출 내역 수정처리
		@PostMapping("/k3ModifyIn")
		public String modifyIn(K3In k3In) {
			k3InService.getModifyIn(k3In);
			return "redirect:/team03/finance/in/k3InList";
		}
		
		
		//매출 내역 수정 폼으로 이동(값 할당해서 넣기)
		@GetMapping("/k3ModifyIn")
		public String modifyIn(@RequestParam(value="inCode", required = false) String inCode, Model model) {
			System.out.println(inCode);
			if(inCode != null && !"".equals(inCode)) {
				K3In inInfo = k3InService.getModifyIn(inCode);
				model.addAttribute("inInfo", inInfo);
			}
			
			model.addAttribute("title", "계정과목 수정화면");
			return "team03/finance/in/k3ModifyIn";
		}
		
		
		//매출  내역 등록처리(이동)
		@PostMapping("/k3AddIn")
		public String addIn(K3In k3In) {
			int result = k3InService.addIn(k3In);
			log.info("inAdd 메서드 인서트 결과 : " + result);
			log.info("inAdd 메서드 인서트 결과 : " + k3In);
			return "redirect:/team03/finance/in/k3InList";
		}
		
		//매출 내역 등록화면(이동)
		@GetMapping("/k3AddIn")
		public String goToInAddForm(Model model) {
			model.addAttribute("title", "입출금내역 관리");
			model.addAttribute("subtitle", "입출금내역 등록");
			System.out.println("매출 내역 등록 컨트롤러 실행");
			System.out.println(model + "model 값");
			return "/team03/finance/in/k3AddIn";
		}

		//매출 내역 조회
		@GetMapping("/k3InList")
		public String InList(Model model) {
			List<K3In> inList = k3InService.getInList();
			model.addAttribute("title", "입출금 내역");
			model.addAttribute("subtitle", "입출금 내역 조회");
			model.addAttribute("inList", inList);
			System.out.println("매출 내역 조회 컨트롤러 실행");
			
			return "/team03/finance/in/k3InList";
		}
}
