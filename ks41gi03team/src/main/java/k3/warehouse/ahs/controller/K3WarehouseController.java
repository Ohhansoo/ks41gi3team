package k3.warehouse.ahs.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.warehouse.ahs.dto.K3Warehouses;
import k3.warehouse.ahs.service.K3WarehouseService;

@Controller
@RequestMapping(value="/team03/warehouse")
public class K3WarehouseController {
	/**
	 * 생성자메서드 의존성,K3WarehouseService와 연결
	 */
	private K3WarehouseService k3WarehouseService;
	public K3WarehouseController(K3WarehouseService k3WarehouseService) {
		this.k3WarehouseService = k3WarehouseService;
	}
	/**
	 * 
	 * @param 창고 전체 조회
	 * @return
	 */
	@GetMapping("/warehouseList")
	public String warehouseList(Model model) {
		List<K3Warehouses> K3Warehouses = k3WarehouseService.getWarehouseList();
		model.addAttribute("title","창고조회");
		model.addAttribute("K3Warehouses",K3Warehouses);
		return "team03/warehouse/warehouseList";
	}
	
	@GetMapping("/addWarehouse")
	public String addWarehouse(Model model) {
		model.addAttribute("title", "창고등록");
		return "team03/warehouse/addWarehouse";
	}
}
