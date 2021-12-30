package k3.location.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/team03/spaceBusiness/location")
public class K3LocationController {

	@GetMapping("/locationList")
	public String locationList() {
		return "team03/spaceBusiness/location/locationList";
	}
	
	@GetMapping("/addLocation")
	public String addLocation() {
		return "team03/spaceBusiness/location/addLocation";
	}
}
