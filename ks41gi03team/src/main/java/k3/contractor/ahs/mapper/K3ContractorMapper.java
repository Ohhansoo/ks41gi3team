package k3.contractor.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.contractor.ahs.dto.K3DetailContractor;

@Mapper
public interface K3ContractorMapper {
	
	//거래처 수정처리 k3_tb_contractor
	public int k3ModifyDetailContractor(K3DetailContractor k3DetailContractor);
	
	//거래처 수정처리 k3_tb_contractor_staff
	public int k3ModifyContractor(K3DetailContractor k3DetailContractor);
	
	//거래처 수정으로 화면 전환
	public K3DetailContractor k3GetModifyContractor(String contractorCode);
	
	//거래처 등록
	public int k3AddContractor(K3DetailContractor k3DetailContractor);
	
	public int k3AddDetailContractor(K3DetailContractor k3DetailContractor);

	
	//검색된 거래처 투플수(동적 페이징) 
	public List<Map<String, Object>> K3SearchContractorCount(Map<String, Object> paramMap, String searchKey, String contractorRegistrationDateStart, String contractorRegistrationDateEnd, String searchValue);

	//거래처 조회(검색) 
	public List<Map<String, Object>> K3SearchContractorList(Map<String, Object> paramMap, String searchKey, String contractorRegistrationDateStart, String contractorRegistrationDateEnd, String searchValue);
	 	
	//거래처 상세정보 받아오기
	public K3DetailContractor K3GetDetailContractor(String contractorCode);
	
	//거래처 테이블 투플의 총 개수;
	public int K3GetContractorCount();
	
	//거래처 목록 받아오기
	public List<Map<String,Object>> K3GetContractorList(Map<String, Object> paramMap);
	
	
}
