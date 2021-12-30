package k3.check.ahs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.check.ahs.dto.K3LaydownCheck;
import k3.check.ahs.service.K3CheckService;

@Controller
@RequestMapping(value="/team03/goodsManagement/check")
public class K3CheckController {
	private K3CheckService k3CheckService;
	
	public K3CheckController(K3CheckService k3CheckService) {
		this.k3CheckService = k3CheckService;
	}
	
	//출하검수 등록이동
	@GetMapping("/k3AddShipmentCheck")
	public String k3AddShipmentCheck(){
		
		return "team03/goodsManagement/check/k3AddShipmentCheck";
	}
	//입하검수 등록이동
	@GetMapping("/k3AddlLaydownCheck")
	public String k3AddLaydownCheck(){
		
		return "team03/goodsManagement/check/k3AddlLaydownCheck";
	}
	//출하검수 현황이동
	@GetMapping("/k3ShipmentCheckList")
	public String k3GetShipmentCheckList() {
		
		return "team03/goodsManagement/check/k3ShipmentCheckList";
	}
	//입하검수 현황이동(초기화면)
	@GetMapping("/k3LaydownCheckList")
	public String k3GetLaydownCheckList(Model model) {
		
		List<K3LaydownCheck> K3LaydownCheck = k3CheckService.k3GetLaydownCheckList();
		model.addAttribute("title", "입고관리");
		model.addAttribute("subtitle", "입고관리현황");
		model.addAttribute("K3LaydownCheck", K3LaydownCheck);
		
		return "team03/goodsManagement/check/k3LaydownCheckList";
	}
	
}
