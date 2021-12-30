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
@RequestMapping("/team03/spaceBusiness/warehouse")
public class K3WarehouseController {
	/**
	 * 생성자메서드 의존성,K3WarehouseService와 연결
	 */
	private K3WarehouseService k3WarehouseService;
	public K3WarehouseController(K3WarehouseService k3WarehouseService) {
		this.k3WarehouseService = k3WarehouseService;
	}
	/**
	 * 창고등록(처리)
	 */
	@PostMapping("/addWarehouse")
	public String addWarehouse(K3Warehouses k3Warehouses,Model model) {
		k3WarehouseService.addWarehouse(k3Warehouses);
		return "redirect:/team03/spaceBusiness/warehouse/warehouseList";
	}
	/**
	 * 창고등록(페이지이동)
	 */
	@GetMapping("/addWarehouse")
	public String addWarehouse(Model model) {
		model.addAttribute("title","창고등록");
		return "team03/spaceBusiness/warehouse/addWarehouse";
	}
	/**
	 * 창고 전체 조회
	 */
	@GetMapping("/warehouseList")
	public String warehouseList(Model model) {
		List<K3Warehouses> K3Warehouses = k3WarehouseService.getWarehouseList();
		System.out.println("K3WarehouseController: "+K3Warehouses);
		model.addAttribute("title","창고조회");
		model.addAttribute("K3Warehouses",K3Warehouses);
		return "team03/spaceBusiness/warehouse/warehouseList";
	}
	/**
	 * 창고수정(페이지이동)
	 */
	@GetMapping("/updateWarehouse")
	public String updateWarehouse(Model	model) {
		model.addAttribute("title","창고수정");
		return "team03/spaceBusiness/warehouse/updateWarehouse";
	}
	/**
	 * 창고수정(처리)
	 */
	@PostMapping("/updateWarehouse")
	public String getUpdateWarehouseName(K3Warehouses k3Warehouses) {
		return "redirect:/team03/spaceBusiness/warehouse/warehouseList";
	}
	/**
	 * 창고삭제(페이지이동
	 */
	@GetMapping("/removeWarehouse")
	public String removeWarehouse(Model model) {
		model.addAttribute("title", "창고삭제");
		return "team03/spaceBusiness/warehouse/removeWarehouse";
	}
	/**
	 * 창고삭제(처리)
	 */
	@PostMapping("/removeWarehouse")
	public String removeWarehouse(K3Warehouses k3Warehouses) {
		return "redirect:/team03/spaceBusiness/warehouse/removeWarehouse";
	}
}
