package k3.shipping.ahs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.shipping.ahs.dto.K3Shipping;
import k3.shipping.ahs.service.K3ShippingService;



@Controller
@RequestMapping(value="/team03/delivery/shipping")
public class K3ShippingController {
	
	private K3ShippingService k3ShippingService;
	
	public K3ShippingController(K3ShippingService k3ShippingService) {
		this.k3ShippingService = k3ShippingService;
	}
	
	@GetMapping("/k3AddShipping")
	public String addShipping(Model model) {
		return "team03/delivery/shipping/K3AddShipping";
	}

	@GetMapping("/k3ShippingList")
	public String getShippingList(Model model) {
		List<K3Shipping> shippingList = k3ShippingService.getShippingList();
		model.addAttribute("title", "배송 관리");
		model.addAttribute("shippingList", shippingList);
		
		return "team03/delivery/shipping/k3ShippingList";
	}
}
