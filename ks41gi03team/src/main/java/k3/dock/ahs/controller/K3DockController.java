package k3.dock.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/team03/spaceBusiness/dock")
public class K3DockController {
	
	@GetMapping("/k3DockList")
	public String k3DockList() {
		return "team03/spaceBusiness/dock/k3DockList";
	}
	@GetMapping("/k3AddDock")
	public String k3AddDock() {
		return "team03/spaceBusiness/dock/k3AddDock";
	}
	@GetMapping("/k3ModifyDock")
	public String k3ModifyDock() {
		return "team03/spaceBusiness/dock/k3ModifyDock";
	}
	@GetMapping("/k3DeleteDock")
	public String k3DeleteDock() {
		return "team03/spaceBusiness/dock/k3DeleteDock";
	}
}
