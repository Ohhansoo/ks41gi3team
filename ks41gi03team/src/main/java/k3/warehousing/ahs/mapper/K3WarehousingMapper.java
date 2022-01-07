package k3.warehousing.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.contract.ahs.dto.K3Contract;
import k3.warehousing.ahs.dto.K3Warehousing;
import k3.warehousing.ahs.dto.K3WarehousingSort;

@Mapper
public interface K3WarehousingMapper {
	//입고현황 조회처리
	public List<K3Warehousing> k3GetWarehousingSearchList(Map<String, Object> searchCondition);
	//입고 요청 등록 처리
	public int k3AddWarehousing(K3Warehousing k3Warehousing);
	//계약처명 불러오기
	public List<K3Contract> k3FindContractorNameByCode();
	//입고 요청 현황
	public List<K3Warehousing> k3RequestAllowWarehousing();
	//입고 분류 현황(요청목록)
	public List<K3WarehousingSort> k3GetWarehousingRequestSort();
	//입고 분류 현황(완료목록)
	public List<K3WarehousingSort> k3GetWarehousingSortList();
	//입고현황 조회
	public List<K3Warehousing> k3GetWarehousingList();


}
