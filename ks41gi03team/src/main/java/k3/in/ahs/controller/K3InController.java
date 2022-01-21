package k3.in.ahs.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import k3.estimate.ahs.dto.K3Estimate;
import k3.in.ahs.dto.K3In;
import k3.in.ahs.dto.K3MainBusinessCode;
import k3.in.ahs.service.K3InService;

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

		//결제 정보 모달 컨트롤러
		@PostMapping("/findInPayInfo")
		@ResponseBody
		public List<Map<String, Object>> k3FindInPayInfo() {
			
			List<Map<String, Object>> result = k3InService.findEstimateInfo();
			System.out.println(result + "findPayInfo controller");
			
			return result;
		}
		
		
		
		
		//견적정보 모달 컨트롤러
		@PostMapping("/findEstimateInfo")
		@ResponseBody
		public List<Map<String, Object>> k3FindEstimateInfo() {
			List<Map<String, Object>> resultList = k3InService.findEstimateInfo();
			System.out.println(resultList + "findEstimateInfo resultList");
			return resultList;
		}
		
		//매출내역 검색
		@PostMapping("/k3SearchInList")
		public String k3GetInList(@RequestParam(value="inKey", required = false) String inKey,
								   @RequestParam(value="inValue", required = false) String inValue,
								   @RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage,
								   Model model) {
			Map<String, Object> searchCondition = new HashMap<String, Object>();
			searchCondition.put("inKey", inKey);
			searchCondition.put("inValue", inValue);
		
			
			Map<String, Object> inListMap = k3InService.getSearchInList(searchCondition, currentPage);
			model.addAttribute("currentPage", currentPage);
			model.addAttribute("lastPage", inListMap.get("lastPage"));
			model.addAttribute("inList", inListMap.get("inList"));
			model.addAttribute("startPageNum", inListMap.get("startPageNum"));
			model.addAttribute("endPageNum", inListMap.get("endPageNum"));

			return "team03/finance/in/k3InList";
		}

		//매출 내역 삭제처리
		@PostMapping("/k3DeleteIn")
		public String deleteIn(@RequestParam(value="deleteList[]", required = false) List<String> deleteList) {
			int result = k3InService.deleteIn(deleteList);
			System.out.println("매출내역삭제 성공");
			log.info("DeleteIn 전송결과 : " + result);
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
			model.addAttribute("title", "매출 내역 관리");
			model.addAttribute("subtitle", "매출 내역 등록");
			
			List<K3MainBusinessCode>  getMainBusinessCodeList =	k3InService.getMainBusinessCodeList();
			System.out.println("-----메인지즈니스코드----");
			System.out.println(getMainBusinessCodeList + "메인비즈니스코드");
			model.addAttribute("getMainBusinessCodeList", getMainBusinessCodeList);
			
			List<K3Estimate> getEstimateNum = k3InService.getEstimateNum();
			System.out.println("-----견적번호-----");
			System.out.println(getEstimateNum + "견적번호");
			model.addAttribute("getEstimateNum", getEstimateNum);
			
			
			System.out.println("매출 내역 등록 컨트롤러 실행");
			System.out.println(model + "model 값");
			return "/team03/finance/in/k3AddIn";
		}

		//매출 내역 조회
		@GetMapping("/k3InList")
		public String InList(@RequestParam(value = "currentPage", required = false, defaultValue = "1")int currentPage,
							Model model) {
			
			Map<String, Object> inListMap = k3InService.getInList(currentPage);
			model.addAttribute("title", "매출 내역 관리");
			model.addAttribute("subtitle", "매출 내역 조회");
			model.addAttribute("currentPage", currentPage);
			model.addAttribute("lastPage", inListMap.get("lastPage"));
			model.addAttribute("inList", inListMap.get("inList"));
			model.addAttribute("startPageNum", inListMap.get("startPageNum"));
			model.addAttribute("endPageNum", inListMap.get("endPageNum"));		
			System.out.println(model+ "model--------------------");
			System.out.println(inListMap + "inList값");
			System.out.println("매출 내역 조회 컨트롤러 실행");
			return "/team03/finance/in/k3InList";
		}
}
