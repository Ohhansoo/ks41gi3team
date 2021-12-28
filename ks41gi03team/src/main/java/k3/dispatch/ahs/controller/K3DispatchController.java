package k3.dispatch.ahs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.dispatch.ahs.dto.K3Dispatch;
import k3.dispatch.ahs.service.K3DispatchService;


@Controller
@RequestMapping(value="/team03")
public class K3DispatchController {
	
	private K3DispatchService k3DispatchService;
	
	public K3DispatchController(K3DispatchService k3DispatchService) {
		this.k3DispatchService = k3DispatchService;
	}
	
	@GetMapping("/delivery/k3AddDispatch")
	public String addDispatch(Model model) {
		return "team03/delivery/k3AddDispatch";
	}

	@GetMapping("/delivery/k3DispatchList")
	public String getDispatchList(Model model) {
		List<K3Dispatch> dispatchList = k3DispatchService.getDispatchList();
		model.addAttribute("title", "일일 배차 관리");
		model.addAttribute("dispatchList", dispatchList);
		
		return "team03/delivery/k3DispatchList";
	}
}