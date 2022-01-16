package k3.warehousing.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.contract.ahs.dto.K3Contract;
import k3.stock.ahs.dto.K3Stock;
import k3.warehousing.ahs.dto.K3Warehousing;
import k3.warehousing.ahs.dto.K3WarehousingSort;

@Mapper
public interface K3WarehousingMapper {
	//로케이션 테이블에 사용현황 업데이트
	public int k3UpdateLocationState(K3Stock k3Stock);
	//입고분류여부 업데이트
	public int k3UpdateSorting(K3Stock k3Stock);
	//입고분류 등록처리
	public int k3AddWarehousingSort(K3Stock k3Stock);
	//입하검수현황 조회처리
	public List<Map<String,Object>> k3GetLaydownSearchList(Map<String, Object> searchCondition, Map<String,Object> paramMap);
	//입고현황 조회처리
	public List<Map<String,Object>> k3GetWarehousingSearchList(Map<String, Object> searchCondition, Map<String,Object> paramMap);
	//입고 승인/반려 처리
	public int k3AllowWarehousing(Map<String, Object> warehousingList);
	//입고 요청 등록 처리
	public int k3AddWarehousing(K3Warehousing k3Warehousing);
	//입고 요청폼에서 모달 조회 처리
	public List<Map<String,Object>> k3FindContractorName(Map<String,Object> paramMap);
	//계약처명 불러오기
	public List<K3Contract> k3FindContractorNameByCode();
	//입고 요청 현황
	public List<K3Warehousing> k3RequestAllowWarehousing();
	//입고분류 등록폼 이동
	/* public List<K3Warehousing> k3GetSortInfo(String warehousingCode); */
	//입고 분류 현황(요청목록)
	public List<K3WarehousingSort> k3GetWarehousingRequestSort();
	//입고 분류 현황(완료목록)
	public List<K3WarehousingSort> k3GetWarehousingSortList();
	//검수현황 초기화면
	public List<Map<String,Object>> k3GetLaydownCheck(Map<String,Object> paramMap);
	//검수현황 튜플 수
	public int k3GetLaydownCheckCount(String countType, Map<String, Object> searchCondition);
	//입고현황 초기화면
	public List<Map<String,Object>> k3GetWarehousingList(Map<String,Object> paramMap);
	//입고현황 튜플 수
	public int k3GetWarehousingCount(String countType, Map<String, Object> searchCondition);






}
