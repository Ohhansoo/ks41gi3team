package k3.driver.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k3.driver.ahs.dto.K3Driver;
import k3.driver.ahs.service.K3DriverService;


@Controller
@RequestMapping(value="/team03/delivery/driver")
public class K3DriverController {
	
	
	private static final Logger log = LoggerFactory.getLogger(K3DriverController.class);

	private K3DriverService k3DriverService;
	
	public K3DriverController(K3DriverService k3DriverService) {
		this.k3DriverService = k3DriverService;
	}
	
	@GetMapping("/k3DriverList")
	public String getDriverList(Model model) {
		List<K3Driver> driverList = k3DriverService.getDriverList();
		model.addAttribute("title", "기사 관리");
		model.addAttribute("driverList", driverList);
		
		return "team03/delivery/driver/k3DriverList";
	}
	
	
	@GetMapping("/k3AddDriver")
	public String driverCheck(Model model) {
		model.addAttribute("title", "차량기사 등록");
		return "team03/delivery/driver/k3AddDriver";
	}

	@PostMapping("/k3AddDriver")
	public String addDriver(K3Driver k3Driver) {
		Integer result = k3DriverService.addDriver(k3Driver);
		log.info("AddDriver" + result);
		log.info("AddDriver" + k3Driver);
		return "redirect:/team03/delivery/driver/k3DriverList";
	}
	
	
	@PostMapping("/k3ModifyDriver")
	public String modifyDriver(K3Driver k3Driver) {
		
		k3DriverService.modifyDriver(k3Driver);
		
		return "redirect:/team03/delivery/driver/k3DriverList";
	}

	@GetMapping("/k3ModifyDriver")
	public String k3ModifyDriver(@RequestParam(value="driverId", required = false) String driverId, Model model) {
		
		
		log.info("k3ModifyDriver driverId:{}", driverId);
		
		if(driverId != null && !"".equals(driverId)) {
			K3Driver driverInfo = k3DriverService.getModifyDriver(driverId);
			model.addAttribute("driverInfo", driverInfo);
		}
		model.addAttribute("title", "기사수정화면");
		
		return "team03/delivery/driver/k3ModifyDriver";
	}
}