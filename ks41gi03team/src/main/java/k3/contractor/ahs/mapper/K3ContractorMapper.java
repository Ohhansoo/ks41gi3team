package k3.contractor.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.contractor.ahs.dto.K3DetailContractor;

@Mapper
public interface K3ContractorMapper {
	
	//거래처 삭제처리(체크박스)
	public void k3DeleteContractor(String contractorCode);

	//거래처 사업장 코드 중복확인
	public int k3ContractorCodeCheck(String contractorCode);
	
	//거래처 사업장 등록번호 중복확인
	public int k3ContractorBusinessNumCheck(String contractorBusinessNum);
	
	//거래처 종사업장 번호 중복확인
	public int k3ContractorBusinessClientNumCheck(String contractorBusinessClientNum);

	//거래처 수정처리 k3_tb_contractor
	public int k3ModifyDetailContractor(K3DetailContractor k3DetailContractor);
	
	//거래처 수정처리 k3_tb_contractor_staff
	public int k3ModifyContractor(K3DetailContractor k3DetailContractor);
	
	//거래처 수정으로 화면 전환
	public K3DetailContractor k3GetModifyContractor(String contractorCode);
	
	//등록페이지에 거래처 아이디 정해주기
	public List<Map<String, Object>> getContractorIdPw();
	
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
