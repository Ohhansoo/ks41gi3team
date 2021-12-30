package k3.tax.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.tax.ahs.dto.K3Tax;
import k3.tax.ahs.service.K3TaxService;


@Controller
@RequestMapping(value="/team03/tax")
public class K3TaxController {

	private static final Logger log = LoggerFactory.getLogger(K3TaxController.class);
	
	private K3TaxService k3TaxService;
	
	public K3TaxController(K3TaxService k3TaxService) {
		this.k3TaxService = k3TaxService;	
	}
	//세금계산서 등록처리(이동)
	@PostMapping("/k3TaxAdd")
	public String TaxAdd(K3Tax k3Tax) {
		int result = k3TaxService.taxAdd(k3Tax);
		log.info("taxAdd 메서드 인서트 결과 : " + result);
		log.info("taxAdd 메서드 인서트 결과 : " + k3Tax);
		return "redirect:/team03/finance/tax/k3TaxList";
	}
	
	//세금계산서 등록화면(이동)
	@GetMapping("/k3TaxAdd")
	public String goToReceiveAddForm(Model model) {
		return "/team03/finance/tax/k3TaxAdd";
	}
	
	//세금계산서 내역 현황(초기화면)
	@GetMapping("/k3TaxList")
	public String OutList(Model model) {
		List<K3Tax> taxList = k3TaxService.getTaxList();
		model.addAttribute("title", "계정과목 관리");
		model.addAttribute("subtitle", "계정과목 현황");
		model.addAttribute("TaxList", taxList);
		return "/team03/finance/tax/k3TaxList";
	}	
}