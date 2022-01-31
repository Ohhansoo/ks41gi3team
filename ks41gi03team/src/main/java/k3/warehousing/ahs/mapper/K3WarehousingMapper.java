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
	//<sse> - 입고승인목록 개수 보내기
	public int k3CountRequestWarehousingList();
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
	//입고현황 초기화면
	public List<Map<String,Object>> k3GetWarehousingList(Map<String,Object> paramMap);
	//입고현황 튜플 수
	public int k3GetWarehousingCount(String countType, Map<String, Object> searchCondition);







}
