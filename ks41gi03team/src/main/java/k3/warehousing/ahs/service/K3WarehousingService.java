package k3.warehousing.ahs.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import k3.contract.ahs.dto.K3Contract;
import k3.warehousing.ahs.dto.K3Warehousing;
import k3.warehousing.ahs.dto.K3WarehousingSort;
import k3.warehousing.ahs.mapper.K3WarehousingMapper;

@Service
public class K3WarehousingService {
	
	private K3WarehousingMapper k3WarehousingMapper;
	
	public K3WarehousingService(K3WarehousingMapper k3WarehousingMapper) {
		this.k3WarehousingMapper = k3WarehousingMapper;
	}
	//입고 현황 조회 처리
	public List<K3Warehousing> k3GetWarehousingSearchList(Map<String, Object> searchCondition){
		List<K3Warehousing> warehousingSearchList = k3WarehousingMapper.k3GetWarehousingSearchList(searchCondition);
		return warehousingSearchList;
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
	//입고 현황
	public List<K3Warehousing> k3GetWarehousingList() {
		List<K3Warehousing> K3LaydownCheck = k3WarehousingMapper.k3GetWarehousingList();
		return K3LaydownCheck;
	}

}
