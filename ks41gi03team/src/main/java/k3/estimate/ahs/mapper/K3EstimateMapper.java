package k3.estimate.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.contractor.ahs.dto.K3Contractor;
import k3.estimate.ahs.dto.K3Estimate;
import k3.estimate.ahs.dto.K3Unit;


@Mapper
public interface K3EstimateMapper {

	//견적서 삭제처리
	public void k3DeleteEstimate(String estimateNum);
	
	//견적서 수정처리
	public int k3ModifyEstimate(K3Estimate k3Estimate);
	
	//견적서 창고 수정처리
	public int k3ModifyWareDetailEstimate(K3Estimate k3Estimate);
	
	//견적서 송장 수정처리
	public int k3ModifyInvoiceDetailEstimate(K3Estimate k3Estimate);
	
	//견적서 차량 수정처리
	public int k3ModifyCarDetailEstimate(K3Estimate k3Estimate);
	
	//견적서 거리 수정처리
	public int k3ModifyDistanceDetailEstimate(K3Estimate k3Estimate);
	
	//견적서 송장 수정 페이지로 이동
	public List<K3Estimate> k3GetModifyInvoiceEstimate(String estimateNum);

	//견적서 차량 수정 페이지로 이동
	public List<K3Estimate> k3GetModifyCarEstimate(String estimateNum);
	
	//견적서 등록 k3_tb_estimate
	public int k3AddEstimate(K3Estimate k3Estimate);
	
	//견적서 창고 등록 k3_tb_estimate_detail
	public int k3AddWareEstimate(K3Estimate k3Estimate);
	
	//견적서 송장 등록 k3_tb_estimate_detail
	public int k3AddInvoiceilEstimate(K3Estimate k3Estimate);
	
	//견적서 차량 등록 k3_tb_estimate_detail
	public int k3AddCarEstimate(K3Estimate k3Estimate);
	
	//견적서 거리 등록 k3_tb_estimate_detail
	public int k3AddDistanceEstimate(K3Estimate k3Estimate);
	
	//등록페이지 값 정해주기
	public List<Map<String, Object>> getEstimateDef();
	
	//견적서 등록페이지 거래처 모달창
	public List<K3Contractor> K3GetContractor();
	
	//견적서 상세정보 모달창
	public List<K3Estimate> k3GetDetailEstimate(String estimateNum);
	
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