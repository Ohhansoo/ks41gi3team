package k3.main.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class K3MainController {
	
	@GetMapping("/index")
	public String homtController() {
		
		return "index";
	}
	
	@GetMapping("/")
	public String mainController() {
		
		return "index";
	}
	
	@GetMapping("/sample1")
	public String sample1Controller() {
		
		return "sample1";
	}
	
	@GetMapping("/sample2")
	public String sample2Controller() {
		
		return "sample2";
	}
	@GetMapping("/sample3")
	public String sample3Controller() {
		return "sample3";
	}
	@GetMapping("/sample5")
	public String sample5Controller() {
		return "sample5";
	}
	
	@GetMapping("/sample_kjw")
	public String sampleKjwController() {
		return "sample_kjw";
	}
	
}
