package k3.location.ahs.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import k3.location.ahs.dto.K3Location;
import k3.location.ahs.service.K3LocationServise;


@Controller
@RequestMapping("/team03/spaceBusiness/location")
public class K3LocationController {
	
	private K3LocationServise k3LocationServise;
	public K3LocationController(K3LocationServise k3LocationServise) {
		this.k3LocationServise = k3LocationServise;
	}
	@GetMapping("/k3LocationList")
	public String k3LocationList() {
		return "team03/spaceBusiness/location/k3LocationList";
	}

	@GetMapping("/k3AddLocation")
	public String k3AddLocation(Model model) {
		
		return "team03/spaceBusiness/location/k3AddLocation";
	}

	@PostMapping("/k3AddLocation")
	@ResponseBody
	public String k3AddLocation(@RequestBody List<K3Location> k3LocationList) {
		
		 	k3LocationServise.k3AddLocation(k3LocationList);
		return "redirect:/team03/spaceBusiness/location/k3LocationList";	
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
