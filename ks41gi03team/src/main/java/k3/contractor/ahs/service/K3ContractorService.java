package k3.contractor.ahs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.contractor.ahs.dto.K3Contractor;
import k3.contractor.ahs.dto.K3DetailContractor;
import k3.contractor.ahs.mapper.K3ContractorMapper;

@Service
@Transactional
public class K3ContractorService {
	
	
	//생성자 메서드 주입
	private final K3ContractorMapper k3ContractorMapper;
	
	public K3ContractorService(K3ContractorMapper k3ContractorMapper) {
		this.k3ContractorMapper = k3ContractorMapper;
	}
	
	//거래처 수정으로 화면전환
	public int k3GetModifyContractor(K3DetailContractor k3DetailContractor) {
		return k3ContractorMapper.K3ModifyContractorInfo(k3DetailContractor);
	}

	//거래처 등록 k3_tb_contractor_staff
	public int k3AddContractor(K3DetailContractor k3ContractorDetail) {
		int result = k3ContractorMapper.k3AddContractor(k3ContractorDetail);
		
		return result;
	}
	//거래처 등록 k3_tb_contractor
	public int k3AddDetailContractor(K3DetailContractor k3DetailContractor) {
		int result = k3ContractorMapper.k3AddDetailContractor(k3DetailContractor);
				
		return result;
	}
	
	
	//거래처 조회(검색)
	public List<K3Contractor> K3SearchContractorList(String searchKey, String searchValue){

		List<K3Contractor> k3SearchContractorList = k3ContractorMapper.K3SearchContractorList(searchKey, searchValue);

		
		return k3SearchContractorList;
	}
	
	
	
	//거래처 리스트(상세) 모달창
	public K3DetailContractor K3GetDetailContractor(String contractorCode){
		K3DetailContractor k3DetailContractor = k3ContractorMapper.K3GetDetailContractor(contractorCode); 
		
		return k3DetailContractor;
	}
	
	//거래처 리스트(간단) 현황에 불러오기(페이징)
	public Map<String, Object> K3GetContractorList(int currentPage){
		
		// 보여줄 행의 개수
		int rowPerPage = 5;
		
		//거래처 정보 테이블 행의 개수
		double rowCount = k3ContractorMapper.K3GetContractorCount();
		
		//마지막 페이지
		int lastPage = (int) Math.ceil((rowCount / rowPerPage));
		
		//페이지 알고리즘
		int startNum = (currentPage - 1) * rowPerPage;
		
		// 보여줄 시작 페이지 번호
		int startPageNum = 1;
		
		// 보여줄 마지막 페이지 번호
		int endPageNum = 0;
		if(lastPage > 5) {
			endPageNum = 5;
		}else {
			endPageNum = lastPage;
		}
		
		// 동적 페이지 구성 (7페이지 부터)
		if(currentPage > 5) {
			startPageNum = currentPage - 2;
			endPageNum = currentPage + 2;
			if(endPageNum > lastPage) {
				startPageNum = lastPage - 4;
				endPageNum = lastPage;
			}
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String,Object>> contractorList = k3ContractorMapper.K3GetContractorList(paramMap);
		
		paramMap.clear();
		
		paramMap.put("lastPage", lastPage);
		paramMap.put("contractorList", contractorList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;
	}



}
