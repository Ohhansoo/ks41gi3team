package k3.shipping.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k3.shipping.ahs.dto.K3Shipping;
import k3.shipping.ahs.service.K3ShippingService;



@Controller
@RequestMapping(value="/team03/delivery/shipping")
public class K3ShippingController {
	
	private static final Logger log = LoggerFactory.getLogger(K3ShippingController.class);
	
	private K3ShippingService k3ShippingService;
	
	public K3ShippingController(K3ShippingService k3ShippingService) {
		this.k3ShippingService = k3ShippingService;
	}
	

	@GetMapping("/k3ShippingList")
	public String getShippingList(Model model) {
		List<K3Shipping> shippingList = k3ShippingService.getShippingList();
		model.addAttribute("title", "배송 관리");
		model.addAttribute("shippingList", shippingList);
		
		return "team03/delivery/shipping/k3ShippingList";
	}
	
	@GetMapping("/k3AddShipping")
	public String addShipping(Model model) {
		return "team03/delivery/shipping/K3AddShipping";
	}
	
	@PostMapping("/k3AddShipping")
	public String addShipping(K3Shipping k3Shipping) {
		Integer result = k3ShippingService.addShipping(k3Shipping);
		log.info("AddShipping" + result);
		log.info("AddShipping" + result);
		return "redirect:/team03/delivery/shipping/k3ShippingList";
	}
	
	@GetMapping("/k3ModifyShipping")
	public String k3ModifyShipping(@RequestParam(value="shippingCode", required = false) String shippingCode, Model model) {
		
		log.info("k3Shipping shippingCode:{}", shippingCode);
		
		if(shippingCode != null && !"".equals(shippingCode)) {
			K3Shipping shippingInfo = k3ShippingService.getModifyShipping(shippingCode);
			model.addAttribute("shippingInfo", shippingInfo);
		}
		model.addAttribute("title", "배송상태수정");
		
		return "team03/delivery/shipping/k3ModifyShipping";
	}
	
	@PostMapping("/k3ModifyShipping")
	public String modifyShipping(K3Shipping k3Shipping) {
		
		k3ShippingService.modifyShipping(k3Shipping);
		
		return "redirect:/team03/delivery/shipping/k3ShippingList";
	}
	
	
}
