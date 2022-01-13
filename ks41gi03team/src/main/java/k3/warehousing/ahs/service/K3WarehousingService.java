package k3.warehousing.ahs.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import k3.check.ahs.dto.K3LaydownCheck;
import k3.contract.ahs.dto.K3Contract;
import k3.stock.ahs.dto.K3Stock;
import k3.warehousing.ahs.dto.K3Warehousing;
import k3.warehousing.ahs.dto.K3WarehousingSort;
import k3.warehousing.ahs.mapper.K3WarehousingMapper;

@Service
public class K3WarehousingService {
	
	private final K3WarehousingMapper k3WarehousingMapper;
	
	public K3WarehousingService(K3WarehousingMapper k3WarehousingMapper) {
		this.k3WarehousingMapper = k3WarehousingMapper;
	}
	//로케이션 테이블에 사용현황 업데이트
	public int k3UpdateLocationState(K3Stock k3Stock) {
		int locationStateResult = k3WarehousingMapper.k3UpdateLocationState(k3Stock);
		return locationStateResult;
	}
	//입고분류여부 업데이트
	public int k3UpdateSorting(K3Stock k3Stock) {
		int soringResult = k3WarehousingMapper.k3UpdateSorting(k3Stock);
		return soringResult;
	}
	//입고분류 등록처리
	public int k3AddWarehousingSort(K3Stock k3Stock) {
		int result = k3WarehousingMapper.k3AddWarehousingSort(k3Stock);
		return result;
	}
	//입고 현황 조회 처리
	public List<K3Warehousing> k3GetWarehousingSearchList(Map<String, Object> searchCondition){
		List<K3Warehousing> warehousingSearchList = k3WarehousingMapper.k3GetWarehousingSearchList(searchCondition);
		return warehousingSearchList;
	}
	//입고 승인/반려 처리
	public int k3AllowWarehousing(Map<String, Object> warehousingList) {
		int result = k3WarehousingMapper.k3AllowWarehousing(warehousingList);
		return result;
	}
	//입고 요청 등록 처리 
	public int k3AddWarehousing(K3Warehousing k3Warehousing) {
		int result = k3WarehousingMapper.k3AddWarehousing(k3Warehousing);
		return result;
	}
	//입고 요청폼에서 모달 조회 처리
	public List<Map<String, Object>> k3FindContractorName() {
		List<Map<String, Object>> resultList = k3WarehousingMapper.k3FindContractorName(null);
		return resultList;
	}
	//계약처 이름 찾아오기
	public List<K3Contract> k3FindContractorNameByCode(){
		List<K3Contract> nameList = k3WarehousingMapper.k3FindContractorNameByCode();
		return nameList;
	}
	
	//입고 요청 현황
	public List<K3Warehousing> k3RequestAllowWarehousing() {
		List<K3Warehousing> K3RequestAllow = k3WarehousingMapper.k3RequestAllowWarehousing();
		return K3RequestAllow;
	}

	//입고분류 등록폼 이동
	/*
	 * public List<K3Warehousing> k3GetSortInfo(String warehousingCode) {
	 * List<K3Warehousing> warehousingSort =
	 * k3WarehousingMapper.k3GetSortInfo(warehousingCode); return warehousingSort; }
	 */
	//입고 분류 현황(요청목록)
	public List<K3WarehousingSort> k3GetWarehousingRequestSort() {
		List<K3WarehousingSort> requestSort = k3WarehousingMapper.k3GetWarehousingRequestSort();
		return requestSort;
	}
	//입고 분류 현황(완료목록)
	public List<K3WarehousingSort> k3GetWarehousingSortList() {
		List<K3WarehousingSort> sortList = k3WarehousingMapper.k3GetWarehousingSortList();
		return sortList;
	}
	//검수 현황(초기화면)
	public List<K3Warehousing> k3GetLaydownCheck() {
		List<K3Warehousing> laydownCheck = k3WarehousingMapper.k3GetLaydownCheck();
		return laydownCheck;
	}
	//입고 현황(초기화면)
	public List<K3Warehousing> k3GetWarehousingList() {
		List<K3Warehousing> warehousingList = k3WarehousingMapper.k3GetWarehousingList();
		return warehousingList;
	}





}
