package k3.ourcompany.ahs.controller;

import java.util.List;

import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k3.ourcompany.ahs.dto.K3OurCompany;
import k3.ourcompany.ahs.service.K3OurcompanyService;

@Controller
@RequestMapping(value="/team03/ourcompany")
public class K3OurcompanyController {
	
	private K3OurcompanyService ourcompanyService;
	
	private static final Logger log = LoggerFactory.getLogger(K3OurcompanyController.class);
	
	public K3OurcompanyController(K3OurcompanyService ourcompanyService) {
		this.ourcompanyService = ourcompanyService;
	}
	/*
	 * //수정
	 * 
	 * @GetMapping("ourcompany/k3ModifyOurCompanyAdmin") public String
	 * modifyOurCompanyAdmin(@RequestParam(value="ourCompanyCode", required = false)
	 * String ourCompanyCode, Model model) {
	 * 
	 * log.info("k3ModifyOurCompanyAdmin ourCompanyCode:{}", ourCompanyCode);
	 * 
	 * return "team03/ourcompany/k3OurCompanyList"; }
	 */
	
	@PostMapping("/ourcompany/k3AddOurCompanyList")
	public String AddOurCompany(K3OurCompany k3ourcompany) {
		return "redirect:/ourcompany/k3OurCompanyList";
	}
	
	@GetMapping("/k3OurCompanyList")
	public String getOurCompanyList(Model model) {
		List<K3OurCompany> ourcompanyList = ourcompanyService.getOurCompanyList();
		
		model.addAttribute("title","자사정보 조회");
		model.addAttribute("ourcompanyList",ourcompanyList);
		return "team03/ourcompany/k3OurCompanyList";
	}

	
}
