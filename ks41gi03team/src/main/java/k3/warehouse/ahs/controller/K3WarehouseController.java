package k3.warehouse.ahs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@PostMapping("/k3AddWarehouse")
	public String getK3AddWarehouse(K3Warehouses k3Warehouses) {
		k3WarehouseService.k3AddWarehouse(k3Warehouses);
		return "redirect:/team03/spaceBusiness/warehouse/k3WarehouseList";
	}

	/**
	 * 창고등록(페이지이동)
	 */
	@GetMapping("/k3AddWarehouse")
	public String k3AddWarehouse(Model model) {
		model.addAttribute("title", "창고등록");
		return "team03/spaceBusiness/warehouse/k3AddWarehouse";
	}

	/**
	 * 창고 목록 조회
	 */
	@PostMapping("/k3WarehouseList")
	public String getWarehouseListBySearchKey(
			@RequestParam(value = "warehouseKey", required = false) String warehouseKey,
			@RequestParam(value = "warehouseValue", required = false) String warehouseValue, Model model) {

		if (warehouseKey != null && "warehouseName".equals(warehouseKey)) {
			warehouseKey = "warehouseName";
		} else if (warehouseKey != null && "floorNumber".equals(warehouseKey)) {
			warehouseKey = "floorNumber";
		} else if (warehouseKey != null && "warehouseNumber".equals(warehouseKey)) {
			warehouseKey = "warehouseNumber";
		} else if (warehouseKey != null && "warehouseArea".equals(warehouseKey)) {
			warehouseKey = "warehouseArea";
		} else if (warehouseKey != null && "warehouseType".equals(warehouseKey)) {
			warehouseKey = "warehouseType";
		} else {
			warehouseKey = "warehouseOperation";

		}
		List<K3Warehouses> K3Warehouses = k3WarehouseService.getWarehouseListBySearchKey(warehouseKey, warehouseValue);

		System.out.println("controller------------>" + K3Warehouses);
		model.addAttribute("title", "창고목록조회");
		model.addAttribute("K3Warehouses", K3Warehouses);

		return "redirect:/team03/spaceBusiness/warehouse/k3WarehouseList";
	}

	/**
	 * 창고 전체 조회
	 */
	@GetMapping("/k3WarehouseList")
	public String warehouseList(Model model) {
		List<K3Warehouses> K3Warehouses = k3WarehouseService.getK3WarehouseList();
		System.out.println("K3WarehouseController: " + K3Warehouses);

		model.addAttribute("title", "창고조회");
		model.addAttribute("K3Warehouses", K3Warehouses);

		return "team03/spaceBusiness/warehouse/k3WarehouseList";
	}

	/**
	 * 창고수정(페이지이동)
	 */
	@GetMapping("/k3ModifyWarehouse")
	public String k3ModifyWarehouse(@RequestParam(value = "warehouseCode", required = false) String warehouseCode,
			Model model) {
		K3Warehouses k3Warehouses = k3WarehouseService.getK3ModifyWarehouseInfoByWarehouseCode(warehouseCode);
		System.out.println(warehouseCode + "< --- ----K3WarehouseController");
		model.addAttribute("title", "창고수정");
		model.addAttribute("k3Warehouses", k3Warehouses);
		return "team03/spaceBusiness/warehouse/k3ModifyWarehouse";
	}

	/**
	 * 창고수정(처리)
	 */
	@PostMapping("/k3ModifyWarehouse")
	public String k3ModifyWarehouseInfo(K3Warehouses k3Warehouses) {
		k3WarehouseService.k3ModifyWarehouseInfo(k3Warehouses);
		System.out.println(k3Warehouses + "<<<<<<<<Controller!!@!@!@");
		return "redirect:/team03/spaceBusiness/warehouse/k3WarehouseList";
	}

	/**
	 * 창고삭제(페이지이동)
	 *//*
		 * @GetMapping("/k3DeleteWarehouse") public String k3DeleteWarehouse(Model
		 * model) { model.addAttribute("title", "창고삭제"); return
		 * "team03/spaceBusiness/warehouse/k3DeleteWarehouse"; }
		 */

	/**
	 * 창고삭제(처리)
	 */
	@PostMapping("/k3DeleteWarehouse")
	public String getK3DeleteWarehouse(@RequestParam String warehouseCode) {

		System.out.println("controller-------> " + warehouseCode);
		k3WarehouseService.deleteWarehouseCode(warehouseCode);
		return "team03/spaceBusiness/warehouse/k3WarehouseList";
	}
}
