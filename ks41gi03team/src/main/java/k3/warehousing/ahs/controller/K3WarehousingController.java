package k3.warehousing.ahs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.warehousing.ahs.dto.K3Warehousing;
import k3.warehousing.ahs.dto.K3WarehousingSort;
import k3.warehousing.ahs.service.K3WarehousingService;

@Controller
@RequestMapping(value="/team03/goodsManagement/warehousing")
public class K3WarehousingController {
	
	private K3WarehousingService k3WarehousingService;
	
	public K3WarehousingController(K3WarehousingService k3WarehousingService) {
		this.k3WarehousingService = k3WarehousingService;
	}
	
	//입고 승인폼 이동
	@GetMapping("/k3AllowWarehousing")
	public String k3GetLaydownCheckList(){
		
		return "team03/goodsManagement/warehousing/k3AllowWarehousing";
	}
	
	//입고분류 등록폼 이동
	@GetMapping("/k3AddSort")
	public String k3AddWarehousingSort() {
		
		return "team03/goodsManagement/warehousing/k3AddSort";
	}
	//입고 등록폼 이동
	@GetMapping("/k3AddWarehousing")
	public String k3AddWarehousing() {
		
		return "team03/goodsManagement/warehousing/k3AddWarehousing";
	}

	
	//입고분류 현황이동
	@GetMapping("/k3SortList")
	public String k3GetWarehousingSortList(Model model) {
		List<K3WarehousingSort> sortList = k3WarehousingService.k3GetWarehousingSortList();
		List<K3WarehousingSort> requestSort = k3WarehousingService.k3GetWarehousingRequestSort();
		model.addAttribute("title", "입고관리");
		model.addAttribute("subtitle", "입고분류현황");
		model.addAttribute("sortList", sortList);	
		model.addAttribute("requestSort", requestSort);	
		return "team03/goodsManagement/warehousing/k3SortList";
	}
	//입고 현황이동
	@GetMapping("/k3WarehousingList")
	public String k3GetWarehousingList(Model model) {
		List<K3Warehousing> K3LaydownCheck = k3WarehousingService.k3GetWarehousingList();
		model.addAttribute("title", "입고관리");
		model.addAttribute("subtitle", "입고현황");
		model.addAttribute("K3LaydownCheck", K3LaydownCheck);
		
		return "team03/goodsManagement/warehousing/k3WarehousingList";
	}
}
