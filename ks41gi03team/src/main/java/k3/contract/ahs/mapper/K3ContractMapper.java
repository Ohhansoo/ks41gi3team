package k3.contract.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.contract.ahs.dto.K3Contract;
import k3.contractor.ahs.dto.K3Contractor;


@Mapper
public interface K3ContractMapper {

	
	//계약 대표코드 중복검사
	public int contractCodeCheck(String contractCode);
	
	//비용 등록페이지 거래처 모달창
	public List<K3Contractor> K3GetContractor();
	
	//비용 체결날짜 정해주기
	public List<Map<String, Object>> contractSingningDate();
	
	//계약 상세정보 모달창
	public List<K3Contract> k3GetDetailContract(String contractCode,String contractorDevision);

	//검색된 계약 투플 수 (동적 페이징)
	public List<Map<String, Object>> K3SearchContractCount(Map<String, Object> paramMap, String searchKey, String contractSingningDateStart, String contractSingningDateEnd, String searchValue);
	
	//계약 조회(검색)
	public List<Map<String, Object>> K3SearchContractList(Map<String, Object> paramMap, String searchKey, String contractSingningDateStart, String contractSingningDateEnd, String searchValue);
	
	//계약 테이블 투플의 총 개수
	public int k3GetContractCount();
	
	//계약 목록 받아오기
	public List<Map<String,Object>> k3GetContractList(Map<String, Object> paramMap);

}
