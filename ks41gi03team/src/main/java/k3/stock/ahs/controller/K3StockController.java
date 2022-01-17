package k3.stock.ahs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.stock.ahs.dto.K3Stock;
import k3.stock.ahs.service.K3StockService;

@Controller
@RequestMapping(value="/team03/goodsManagement/stock")
public class K3StockController {
	
	private K3StockService k3StockService;
	
	public K3StockController(K3StockService k3StockService) {
		this.k3StockService = k3StockService;
	}
	//재고 수정폼 이동
	@GetMapping("/K3ModifyStock")
	public String K3ModifyStock(){
		
		return "team03/goodsManagement/stock/K3ModifyStock";
	}
	
	
	//재고 등록폼 이동
	@GetMapping("/k3AddStock")
	public String k3AddStock(){
		
		return "team03/goodsManagement/stock/k3AddStock";
	}
	
	//재고 현황 이동
	@GetMapping("/k3StockList")
	public String k3StockList(Model model) {
		//재고현황 간단조회
		List<K3Stock> stockList = k3StockService.k3GetStockByLocation();
		//재고현황 상세조회
		List<K3Stock> stockList2 = k3StockService.k3GetStockByStockName();
		model.addAttribute("title", "재고관리");
		model.addAttribute("subtitle", "재고현황");
		model.addAttribute("stockList", stockList);
		model.addAttribute("stockList2", stockList2);
		return "team03/goodsManagement/stock/k3StockList";
	}

}
