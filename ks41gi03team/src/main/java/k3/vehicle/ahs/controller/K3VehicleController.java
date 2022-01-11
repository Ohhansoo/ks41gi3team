package k3.vehicle.ahs.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import k3.memberuser.ahs.service.K3MemberUserService;
import k3.vehicle.ahs.dto.K3Vehicle;
import k3.vehicle.ahs.service.K3VehicleService;


@Controller
@RequestMapping(value="/team03/delivery/vehicle")
public class K3VehicleController {
	
	private static final Logger log = LoggerFactory.getLogger(K3VehicleController.class);
	
	private K3VehicleService k3VehicleService;
	private K3MemberUserService k3MemberUserService; //의존성 검사
	
	public K3VehicleController(K3VehicleService k3VehicleService, K3MemberUserService k3MemberUserService) {
		this.k3VehicleService = k3VehicleService;
		this.k3MemberUserService = k3MemberUserService;
	}
	
	//현황
	@GetMapping("/k3VehicleList")
	public String getVehicleList(Model model) {
		List<K3Vehicle> vehicleList = k3VehicleService.getVehicleList();
		model.addAttribute("title", "입출하 기록 관리");
		model.addAttribute("vehicleList", vehicleList);
		
		return "team03/delivery/vehicle/k3VehicleList";
	}
	
	//등록 화면
	@GetMapping("/k3AddVehicle")
	public String addVehicle(Model model) {
		return "team03/delivery/vehicle/k3AddVehicle";
	}
	
	//등록 진행
	@PostMapping("/k3AddVehicle")
	public String addVehicle(K3Vehicle k3Vehicle) {
		Integer result = k3VehicleService.addVehicle(k3Vehicle);
		log.info("AddVehicle" + result);
		log.info("AddVehicle" + k3Vehicle);
		return "redirect:/team03/delivery/vehicle/k3VehicleList";
	}
	
	//수정 화면
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
	
	//수정 등록
	@PostMapping("/k3ModifyVehicle")
	public String modifyVehicle(K3Vehicle k3Vehicle) {
		
		k3VehicleService.modifyVehicle(k3Vehicle);
		
		return "redirect:/team03/delivery/vehicle/k3VehicleList";
	}
	
	//검색
	@PostMapping("/k3VehicleList")
	public String k3SearchVehicleList(@RequestParam(value="vehicleKey", required = false) String vehicleKey,
										@RequestParam(value="vehicleValue", required = false) String vehicleValue,
										Model model) {
		if(vehicleKey != null && "vehicle".equals(vehicleKey)) {
			vehicleKey = "vehicleCode";
		}
		
		List<K3Vehicle> vehicleList = k3VehicleService.k3SearchVehicleList(vehicleKey, vehicleValue);
		
		model.addAttribute("title", "차량 관리");
		model.addAttribute("vehicleList", vehicleList);
		
		return "team03/delivery/vehicle/k3VehicleList";
	}
	
	//단건 삭제
	@GetMapping("/k3DeleteVehicle")
	public String k3DeleteVehicle(@RequestParam(value="vehicleCode", required=false) String vehicleCode, Model model) {
		System.out.println("k3DeleteVehicle");
		
		Integer result = k3VehicleService.k3DeleteVehicle(vehicleCode);
		log.info("DeleteVehicle" + result);
		return "redirect:/team03/delivery/vehicle/k3VehicleList";
	}
	
	//담당자 선택처리 (@ResponseBody 중요)
	@PostMapping("/vehicleMemberId")
	@ResponseBody
	public List<Map<String, Object>> k3SelectVehicleMemberId(){
		List<Map<String, Object>> searchId = k3MemberUserService.k3GetMemberUserModalList();
		return searchId;
	}
}
