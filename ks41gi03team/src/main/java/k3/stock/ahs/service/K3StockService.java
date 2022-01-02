package k3.stock.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.stock.ahs.dto.K3Stock;
import k3.stock.ahs.mapper.K3StockMapper;

@Service
public class K3StockService {
	private K3StockMapper k3StockMapper;
	
	public K3StockService(K3StockMapper k3StockMapper) {
		this.k3StockMapper = k3StockMapper;
	}
	
	//재고 현황(초기화면)
	public List<K3Stock> k3GetAllowStock() {
		List<K3Stock> stockList = k3StockMapper.k3GetAllowStock();
		return stockList;
	}

}
