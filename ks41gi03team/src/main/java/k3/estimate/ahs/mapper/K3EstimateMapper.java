package k3.estimate.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.estimate.ahs.dto.K3Unit;


@Mapper
public interface K3EstimateMapper {
	
	//단가표 모달창
	public List<K3Unit> k3GetUnit();

	//검색된 견적서 투플수(동적 페이징) 
	public List<Map<String, Object>> K3SearchEstimateCount(Map<String, Object> paramMap, String searchKey, String estimateMeasureDateStart, String estimateMeasureDateEnd, String searchValue);

	//견적서 조회(검색) 
	public List<Map<String, Object>> K3SearchEstimateList(Map<String, Object> paramMap, String searchKey, String estimateMeasureDateStart, String estimateMeasureDateEnd, String searchValue);
	
	//견적서 테이블 투플의 총 개수
	public int K3GetEstimateCount();
	
	//견적서 목록 받아오기
	public List<Map<String,Object>> K3GetEstimateList(Map<String, Object> paramMap);
	
}