package k3.contractor.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.contractor.ahs.dto.K3Contractor;
import k3.contractor.ahs.dto.K3DetailContractor;
import k3.contractor.ahs.mapper.K3ContractorMapper;

@Service
public class K3ContractorService {
	
	//생성자 메서드 주입
	private K3ContractorMapper k3ContractorMapper;
	
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
	
	//거래처 리스트(상세) 모달창
	public List<K3DetailContractor> K3GetDetailContractorList(){
		List<K3DetailContractor> detailContractorList = k3ContractorMapper.K3GetDetailContractorList(); 
		
		return detailContractorList;
	}
	
	//거래처 리스트(간단) 현황에 불러오기
	public List<K3Contractor> K3GetContractorList(){
		List<K3Contractor> contractorList = k3ContractorMapper.K3GetContractorList();
		
		return contractorList;
	}



}
