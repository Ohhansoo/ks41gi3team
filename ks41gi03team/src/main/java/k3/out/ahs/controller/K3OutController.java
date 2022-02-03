package k3.out.ahs.controller;

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

import k3.in.ahs.dto.K3MainBusinessCode;
import k3.out.ahs.dto.K3Out;
import k3.out.ahs.service.K3OutService;
import k3.subject.ahs.dto.K3Subject;

	@Controller
	@RequestMapping(value="/team03/finance/out")
	public class K3OutController {
	
	private static final Logger log = LoggerFactory.getLogger(K3OutController.class);
		
		private K3OutService k3OutService;
		
		public K3OutController(K3OutService k3OutService) {
			this.k3OutService = k3OutService;
	}
	
	//계정과목코드와 계정과목 이름 등록 버튼 모달 컨트롤러
	@PostMapping("/findSubjectInfo")
	@ResponseBody
	public List<Map<String, Object>> k3FindSubjectInfo(){
		List<Map<String, Object>> result = k3OutService.findSubjectInfo();
		System.out.println(result + "findSubjectInfo result");
		return result;
	}
		
	//비용 검색
	@PostMapping("/k3SearchOutList")
	public String searchOutList(@RequestParam(value="outKey", required = false) String outKey,
								@RequestParam(value="outValue", required = false) String outValue,
								Model model) {
		if(outKey != null && "asName".equals(outKey)) {
			outKey = "asName";
		}else if(outKey != null && "outCode".equals(outKey)){
			outKey = "outCode";
		}else if(outKey != null && "outMemo".equals(outKey)){
			outKey = "outMemo";
		}
		List<K3Out> outList = k3OutService.searchOutList(outKey, outValue);
		
		model.addAttribute("outList", outList);
		System.out.println(outKey +"outKey");
		System.out.println(outValue +"outValue");
		return "team03/finance/out/k3OutList";
	}

	//비용 삭제처리
	@PostMapping("/k3DeleteOut")
	public String deleteOut(@RequestParam(value="deleteList[]", required = false) List<String> deleteList) {
		int result = k3OutService.deleteOut(deleteList);
		log.info("DeleteOut 전송결과 : " + result);
		return "redirect:/team03/finance/out/k3OutList";
	}		
		
	//비용 수정 처리
	@PostMapping("/k3ModifyOut")
	public String modifyOut(K3Out k3Out) {
		//비용 수정
		k3OutService.modifyOut(k3Out);
		System.out.println("비용수정처리 컨트롤러");
		return "redirect:/team03/finance/out/k3OutList";
	}
		
	//비용 수정 폼으로 이동(값 할당해서 넣기)
	@GetMapping("/k3ModifyOut")
	public String modifyOut(@RequestParam(value="outCode", required = false) String outCode, Model model) {
		if(outCode != null && !"".equals(outCode)) {
			K3Out outInfo = k3OutService.getModifyOut(outCode);
			model.addAttribute("outInfo", outInfo);
			System.out.println("비용 수정 폼으로 이동  컨트롤러");
		}
		model.addAttribute("title", "계정과목 수정화면");
		return "team03/finance/out/k3ModifyOut";
	}		
		
		
	//비용 등록처리(이동)
	@PostMapping("/k3AddOut")
	public String addOut(K3Out k3Out) {
		int result = k3OutService.addOut(k3Out);
		log.info("addOut 메서드 인서트 결과 : " + result);
		log.info("addOut 메서드 인서트 결과 : " + k3Out);
		System.out.println("addOut 등록처리");
		return "redirect:/team03/finance/out/k3OutList";
	}
	
	//비용 등록화면(이동)
	@GetMapping("/k3AddOut")
	public String goToOutAddForm(Model model) {
		model.addAttribute("title", "비용 내역 관리");
		model.addAttribute("subtitle", "비용 내역 등록");
		System.out.println("addOut 컨트롤러");
		
		List<K3MainBusinessCode>  getMainBusinessCodeList =	k3OutService.getMainBusinessCodeList();
		System.out.println("-----메인지즈니스코드----");
		System.out.println(getMainBusinessCodeList + "메인비즈니스코드");
		model.addAttribute("getMainBusinessCodeList", getMainBusinessCodeList);

		
		return "/team03/finance/out/k3AddOut";
	}
	
	//비용 내역 현황(초기화면)
	@GetMapping("/k3OutList")
	public String OutList(Model model) {
		List<K3Out> outList = k3OutService.getOutList();
		model.addAttribute("title", "비용 내역 관리");
		model.addAttribute("subtitle", "비용 내역 현황");
		model.addAttribute("outList", outList);
		System.out.println("outList 컨트롤러");
		
		return "/team03/finance/out/k3OutList";
	}	
		
}
