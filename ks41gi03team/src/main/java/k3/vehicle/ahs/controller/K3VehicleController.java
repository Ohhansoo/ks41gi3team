package k3.vehicle.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k3.vehicle.ahs.dto.K3Vehicle;
import k3.vehicle.ahs.service.K3VehicleService;


@Controller
@RequestMapping(value="/team03/delivery/vehicle")
public class K3VehicleController {
	
	private static final Logger log = LoggerFactory.getLogger(K3VehicleController.class);
	
	private K3VehicleService k3VehicleService;
	
	public K3VehicleController(K3VehicleService k3VehicleService) {
		this.k3VehicleService = k3VehicleService;
	}
	
	@PostMapping("/k3AddVehicle")
	public String addVehicle(K3Vehicle k3Vehicle) {
		Integer result = k3VehicleService.addVehicle(k3Vehicle);
		log.info("AddVehicle" + result);
		log.info("AddVehicle" + k3Vehicle);
		return "redirect:/team03/delivery/vehicle/k3VehicleList";
	}
	
	@GetMapping("/k3AddVehicle")
	public String addVehicle(Model model) {
		return "team03/delivery/vehicle/k3AddVehicle";
	}

	@GetMapping("/k3VehicleList")
	public String getVehicleList(Model model) {
		List<K3Vehicle> vehicleList = k3VehicleService.getVehicleList();
		model.addAttribute("title", "입출하 기록 관리");
		model.addAttribute("vehicleList", vehicleList);
		
		return "team03/delivery/vehicle/k3VehicleList";
	}
	
	@GetMapping("/k3ModifyVehicle")
	public String k3ModifyVehicle(@RequestParam(value="vehicleCode", required = false) String vehicleCode, Model model) {
		
		log.info("k3ModifyVehicle vehicleCode:{}", vehicleCode);
		
		if(vehicleCode != null && !"".equals(vehicleCode)) {
			K3Vehicle vehicleInfo = k3VehicleService.getModifyVehicle(vehicleCode);
			model.addAttribute("vehicleInfo", vehicleInfo);
		}
		model.addAttribute("title", "차량수정화면");
	
		return "team03/delivery/vehicle/k3ModifyVehicle";

	}
}