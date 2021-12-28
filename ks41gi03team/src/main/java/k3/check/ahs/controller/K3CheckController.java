package k3.check.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/team03/check")
public class K3CheckController {
	
	//출하검수 등록이동
	@GetMapping("/k3AddShipmentCheck")
	public String k3AddShipmentCheck(){
		
		return "team03/check/k3AddShipmentCheck";
	}
	//입하검수 등록이동
	@GetMapping("/k3AddlLaydownCheck")
	public String k3AddLaydownCheck(){
		
		return "team03/check/k3AddlLaydownCheck";
	}
	//출하검수 현황이동
	@GetMapping("/k3ShipmentCheckList")
	public String k3GetShipmentCheckList() {
		
		return "team03/check/k3ShipmentCheckList";
	}
	//입하검수 현황이동
	@GetMapping("/k3LaydownCheckList")
	public String k3GetLaydownCheckList() {
		
		return "team03/check/k3LaydownCheckList";
	}
	
}
