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
	
	//재고현황 상세조회(초기화면)2
	public List<K3Stock> k3GetStockByLocation() {
		List<K3Stock> stockList = k3StockMapper.k3GetStockByLocation();
		return stockList;
	}
	//재고현황 간단조회(초기화면)
	public List<K3Stock> k3GetStockByStockName() {
		List<K3Stock> stockList2 = k3StockMapper.k3GetStockByStockName();
		return stockList2;
	}

}
