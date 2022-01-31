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
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	//중복확인 
	@PostMapping("/shippingCheck")
	@ResponseBody
	public boolean shippingCheck(@RequestParam(value="shippingCode", required = false) String shippingCode) {
		
		boolean checkResult = false;
		
		Integer check = k3ShippingService.getOverlappedShippingCode(shippingCode);
		
		if(check > 0) checkResult = true;
		
		return checkResult;
	}
	
	//현황
	@GetMapping("/k3ShippingList")
	public String getShippingList(Model model) {
		List<K3Shipping> shippingList = k3ShippingService.getShippingList();
		model.addAttribute("title", "배송 관리");
		model.addAttribute("subtitle", "배송 현황");
		model.addAttribute("shippingList", shippingList);
		
		return "team03/delivery/shipping/k3ShippingList";
	}
	
	//등록 화면
	@GetMapping("/k3AddShipping")
	public String addShipping(Model model) {
		
		model.addAttribute("title", "배송 관리");
		model.addAttribute("subtitle", "배송 등록");
		
		return "team03/delivery/shipping/K3AddShipping";
	}
	
	//등록
	@PostMapping("/k3AddShipping")
	public String addShipping(K3Shipping k3Shipping) {
		Integer result = k3ShippingService.addShipping(k3Shipping);
		
		log.info("AddShipping" + result);
		log.info("AddShipping" + result);
		return "redirect:/team03/delivery/shipping/k3ShippingList";
	}
	
	//수정 화면
	@GetMapping("/k3ModifyShipping")
	public String k3ModifyShipping(@RequestParam(value="shippingCode", required = false) String shippingCode, Model model) {
		
		log.info("k3Shipping shippingCode:{}", shippingCode);
		
		if(shippingCode != null && !"".equals(shippingCode)) {
			K3Shipping shippingInfo = k3ShippingService.getModifyShipping(shippingCode);
			model.addAttribute("shippingInfo", shippingInfo);
		}
		model.addAttribute("title", "배송 관리");
		model.addAttribute("subtitle", "배송 수정");
		
		return "team03/delivery/shipping/k3ModifyShipping";
	}
	
	//수정
	@PostMapping("/k3ModifyShipping")
	public String modifyShipping(K3Shipping k3Shipping) {
		
		k3ShippingService.modifyShipping(k3Shipping);
		
		return "redirect:/team03/delivery/shipping/k3ShippingList";
	}
	
	//검색
	@PostMapping("/k3ShippingList")
	public String k3SearchShippingList(@RequestParam(value="shippingKey", required = false) String shippingKey,
										@RequestParam(value="shippingValue", required = false) String shippingValue,
										Model model) {
		if(shippingKey != null && "shipping".equals(shippingKey)) {
			shippingKey = "shippingCode";
		}else if(shippingKey != null && "driver".equals(shippingKey)) {
			shippingKey = "driverId";
		}
		List<K3Shipping> shippingList = k3ShippingService.k3SearchShippingList(shippingKey, shippingValue);
		
		model.addAttribute("title", "배송 관리");
		model.addAttribute("subtitle", "배송 검색");
		model.addAttribute("shippingList", shippingList);
		
		return "team03/delivery/shipping/k3ShippingList";
	}
	
	//체크 삭제
	@PostMapping("/k3DeleteShipping")
	public String k3Deletehipping(@RequestParam(value="deleteList[]", required = false) List<String> deleteList) {
		Integer result = k3ShippingService.k3DeleteShipping(deleteList);
		log.info("DeleteShipping" + result);
		return "redirect:/team03/delivery/shipping/k3ShippingList";
	}
	
	
	
}
