package k3.stock.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.stock.ahs.dto.K3Stock;
import k3.warehousing.ahs.dto.K3WarehousingSort;

@Mapper
public interface K3StockMapper {
	//재고삭제 처리
	public int k3DeleteStock(List<String> deleteList);
	//출고에 따른 재고 업데이트 하기
	public int k3SubtractStock(String stockCode, int stockQuantity);
	//기존 재고 확인하기
	public int checkStockQuantity(String stockCode);
	//간단조회 재고현황 조회처리
	public List<Map<String, Object>> k3GetSimpleStockSearchList(Map<String, Object> searchCondition, Map<String, Object> paramMap);
	//상세조회 재고현황 조회처리
	public List<Map<String, Object>> k3GetDetailStockSearchList(Map<String, Object> searchCondition, Map<String, Object> paramMap);
	//로케이션 상태 바꾸기(사용중 -> 비었음)
	public int K3ReturnLocationState(String beforelocationCode);
	//로케이션 상태 바꾸기(비었음 -> 사용중)
	public int K3InputLocationState(String locationCode);
	//재고 수정폼 처리
	public int K3ModifyStock(K3Stock k3Stock);
	//재고 수정폼 이동
	public List<K3Stock> K3GetStockInfo(String stockCode);
	//로케이션 테이블에 사용현황 업데이트
	public int k3UpdateLocationState(K3Stock k3Stock);
	//입고분류여부 업데이트
	public int k3UpdateSorting(K3Stock k3Stock);
	//입고분류 등록처리
	public int k3AddStock(K3Stock k3Stock);
	//재고 등록 리스트(등록 가능한 리스트)
	public List<K3Stock> k3AddStockList();
	//재고현황 상세조회(초기화면)
	public List<Map<String,Object>> k3GetStockByLocation(Map<String,Object> paramMap);
	//재고현황 간단조회 테이블 튜플 수(초기화면)
	public int k3GetDetailCount(String countType, Map<String, Object> searchCondition);
	//재고현황 간단조회(초기화면)
	public List<Map<String,Object>> k3GetStockByStockName(Map<String,Object> paramMap);
	//재고현황 상세조회 테이블 튜플 수(초기화면)
	public int k3GetSimpleCount(String countType, Map<String, Object> searchCondition);




	
}
