package k3.stock.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/team03/stock")
public class K3StockController {
	
	//재고 현황 이동
	@GetMapping("/k3StockList")
	public String k3StockList() {
		
		return "team03/stock/k3StockList";
	}
	//재고 등록폼 이동
	@GetMapping("/k3AddStock")
	public String k3AddStock(){
		
		return "team03/stock/k3AddStock";
	}

}
