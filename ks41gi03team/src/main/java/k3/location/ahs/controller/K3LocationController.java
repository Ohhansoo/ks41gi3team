package k3.location.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/team03/spaceBusiness/location")
public class K3LocationController {

	@GetMapping("/k3LocationList")
	public String k3LocationList() {
		return "team03/spaceBusiness/location/k3LocationList";
	}
	
	@GetMapping("/k3AddLocation")
	public String k3AddLocation() {
		return "team03/spaceBusiness/location/k3AddLocation";
	}
	
	@GetMapping("/k3ModifyLocation")
	public String k3ModifyLocation() {
		return "team03/spaceBusiness/location/k3ModifyLocation";
	}
	
	@GetMapping("k3DeleteLocation")
	public String k3DeleteLocation() {
		return "team03/spaceBusiness/location/k3DeleteLocation";
	}
}
