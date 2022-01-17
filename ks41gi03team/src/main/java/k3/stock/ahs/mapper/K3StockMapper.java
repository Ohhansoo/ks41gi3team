package k3.stock.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.stock.ahs.dto.K3Stock;

@Mapper
public interface K3StockMapper {
	
	//재고 현황 상세조회(초기화면)
	public List<K3Stock> k3GetStockByLocation();
	//재고 현황 간단조회(초기화면)
	public List<K3Stock> k3GetStockByStockName();
	
}
