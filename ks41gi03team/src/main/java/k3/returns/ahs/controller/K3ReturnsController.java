package k3.returns.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/team03/goodsManagement/returns")
public class K3ReturnsController {
	
	//반품 등록폼 이동
	@GetMapping("/k3AddReturns")
	public String k3AddReturns(){
		
		return "team03/goodsManagement/returns/k3AddReturns";
	}
	//입출하하자품 등록폼 이동
	@GetMapping("/k3AddFlaw")
	public String k3AddFlaw(){
		
		return "team03/goodsManagement/returns/k3AddFlaw";
	}
	
	//반품 현황 이동
	@GetMapping("/k3ReturnsList")
	public String k3GetReturnsList() {
		
		return "team03/goodsManagement/returns/k3ReturnsList";
	}

	//입출하하자품 현황 이동
	@GetMapping("/k3FlawList")
	public String k3GetFlawList() {
		
		return "team03/goodsManagement/returns/k3FlawList";
	}
}
