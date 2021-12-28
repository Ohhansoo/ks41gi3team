package k3.warehousing.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/team03/warehousing")
public class K3WarehousingController {

	//입고 승인폼 이동
	@GetMapping("/k3AllowWarehousing")
	public String k3GetLaydownCheckList(){
		
		return "team03/warehousing/k3AllowWarehousing";
	}
	
	//입고분류 등록폼 이동
	@GetMapping("/k3AddSort")
	public String k3AddWarehousingSort() {
		
		return "team03/warehousing/k3AddSort";
	}
	//입고 등록폼 이동
	@GetMapping("/k3AddWarehousing")
	public String k3AddWarehousing() {
		
		return "team03/warehousing/k3AddWarehousing";
	}

	//입고분류 현황이동
	@GetMapping("/k3SortList")
	public String k3GetWarehousingSortList() {
		
		return "team03/warehousing/k3SortList";
	}
	//입고 현황이동
	@GetMapping("/k3WarehousingList")
	public String k3GetWarehousingList() {
		
		return "team03/warehousing/k3WarehousingList";
	}
}
