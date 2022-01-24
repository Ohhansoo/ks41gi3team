package k3.ourcompany.ahs.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import k3.ourcompany.ahs.dto.K3OurCompany;
import k3.ourcompany.ahs.service.K3OurcompanyService;

@Controller
@RequestMapping(value="/team03/companymanagement/ourcompany")
public class K3OurcompanyController {
	
	private static final Logger log = LoggerFactory.getLogger(K3OurcompanyController.class);
	
	private K3OurcompanyService ourcompanyService;
	
	public K3OurcompanyController(K3OurcompanyService ourcompanyService) {
		this.ourcompanyService = ourcompanyService;
	}
	//01 자사조회
	@GetMapping("/k3OurCompanyList")
	public String getOurCompanyList(Model model) {
		List<K3OurCompany> ourcompanyList = ourcompanyService.getOurCompanyList();
		
		model.addAttribute("title","사업장 관리");
		model.addAttribute("subtitle","사업장 현황");
		model.addAttribute("ourcompanyList",ourcompanyList);
		return "team03/companymanagement/ourcompany/k3OurCompanyList";
		
	}
	
	//02 자사 등록화면(이동)
	@GetMapping("/k3AddOurCompanyList")
	public String AddOurCompany(Model model) {
		model.addAttribute("title","사업장 관리");
		model.addAttribute("subtitle","사업장 등록");
		//return "redirect:/team03/ourcompany/k3OurCompanyList";
		return "team03/companymanagement/ourcompany/k3AddOurCompanyList";
		
	}
	
	//03 자사 등록처리
	@PostMapping("/k3AddOurCompanyList")
	public String k3MoveToAddOurCompanyForm(K3OurCompany k3ourcompany) {
		ourcompanyService.AddOurCompany(k3ourcompany);
		return "redirect:/team03/companymanagement/ourcompany/k3OurCompanyList";
	}

	//04 자사 수정폼 이동
	@GetMapping("/k3ModifyOurCompanyList")
	public String k3ModifyOurCompany(@RequestParam(value="ourCompanyCode", required = false) String ourCompanyCode, Model model) {
		  System.out.println("04 220109 k3ModifyOurCompany K3OurcompanyController.java");
		  
		  if(ourCompanyCode != null && !"".equals(ourCompanyCode)) {
			  K3OurCompany k3OurCompanyInfo = ourcompanyService.K3OurCompanyInfoBycode(ourCompanyCode);
			  model.addAttribute("k3OurCompanyInfo", k3OurCompanyInfo);
		  }
		  model.addAttribute("title","자사정보 관리");
		  model.addAttribute("subtitle","자사정보 수정");
		  return "team03/companymanagement/ourcompany/k3ModifyOurCompanyList";
		  
	}
	//05 자사 수정처리
	@PostMapping("/k3ModifyOurCompanyInfo")
	public String k3ModifyOurCompanyInfo(K3OurCompany k3ourcompany) {
		  System.out.println("05 220109 k3ModifyOurCompanyInfo K3OurcompanyController.java");
		  
		  int result = ourcompanyService.k3ModifyOurCompanyInfo(k3ourcompany);
		  
		  return "redirect:/team03/companymanagement/ourcompany/k3OurCompanyList";
	}
	  //06 자사 정보 검색
	  
	  @PostMapping("/k3OurCompanyList") 
	  public String k3GetOurCompanySearchList(@RequestParam(value="ourcompanyKey", required = false) String ourcompanyKey,
			  															  @RequestParam(value="ourcompanyValue", required = false) String ourcompanyValue, 
			  															  Model model) {
	  
	  Map<String, Object> searchCondition = new HashMap<String, Object>();
	  
	  if(ourcompanyKey != null && "ourCompanyCode".equals(ourcompanyKey)) { 
		  ourcompanyKey = "ourCompanyCode"; 
	  }else if(ourcompanyKey != null && "ourCompanyBusinessPlaceCode".equals(ourcompanyKey)) { 
		  ourcompanyKey = "ourCompanyBusinessPlaceCode"; 
	  }else if(ourcompanyKey != null && "ourCompanyBusinessName".equals(ourcompanyKey)) { 
		  ourcompanyKey = "ourCompanyBusinessName"; 
	  }else if(ourcompanyKey != null && "ourCompanyBusinessCheifName".equals(ourcompanyKey)) {
		  ourcompanyKey = "ourCompanyBusinessCheifName";
	  }else if(ourcompanyKey != null && "ourCompanyStatus".equals(ourcompanyKey)) {
		  ourcompanyKey = "ourCompanyStatus";
	  }else if(ourcompanyKey != null && "ourCompanyWorkType".equals(ourcompanyKey)) {
		  ourcompanyKey = "ourCompanyWorkType";
	  }else if(ourcompanyKey != null && "ourCompanyEmail".equals(ourcompanyKey)) {
		  ourcompanyKey = "ourCompanyEmail";
	  }else if(ourcompanyKey != null && "ourcompanypostaladdress".equals(ourcompanyKey)) {
		  ourcompanyKey = "ourcompanypostaladdress";
	  }else if(ourcompanyKey != null && "ourcompanystreetaddress".equals(ourcompanyKey)) {
		  ourcompanyKey = "ourcompanystreetaddress";
	  }else if(ourcompanyKey != null && "ourcompanydetailaddress".equals(ourcompanyKey)) {
		  ourcompanyKey = "ourcompanydetailaddress";
	  }
	 
	  searchCondition.put("ourcompanyKey", ourcompanyKey);
	  searchCondition.put("ourcompanyValue", ourcompanyValue);
	  System.out.println("01 20220122 k3GetOurCompanySearchList");
	  
	  //public method k3GetOurCompanySearchList(String ourcompanyKey, String ourcompanyValu() { }
	  List<K3OurCompany> ourcompanyList = ourcompanyService.k3GetOurCompanySearchList(searchCondition);
	  model.addAttribute("ourcompanyList",ourcompanyList);
	  
	  return "team03/companymanagement/ourcompany/k3OurCompanyList";
	
	  }
	  
	  //모달
	  @PostMapping("/k3ourcompanymodal")
	  @ResponseBody
	  public List<Map<String, Object>> k3GetOurCompanyModalList(){
		  List<Map<String, Object>> ourcompanymodalList = ourcompanyService.k3GetOurCompanyModalList();
			System.out.println("2022 01 24 "+ ourcompanymodalList);
				  return ourcompanymodalList;
	  }
}
	
