package k3.contractor.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.contractor.ahs.dto.K3Contractor;
import k3.contractor.ahs.dto.K3ContractorDetail;
import k3.contractor.ahs.mapper.K3ContractorMapper;

@Service
public class K3ContractorService {
	
	//생성자 메서드 주입
	private K3ContractorMapper k3ContractorMapper;
	
	public K3ContractorService(K3ContractorMapper k3ContractorMapper) {
		this.k3ContractorMapper = k3ContractorMapper;
	}

	public int k3AddContractor(K3ContractorDetail k3ContractorDetail) {
		int result = k3ContractorMapper.k3AddContractor(k3ContractorDetail);
		
		return result;
	}
	
	//거래처 리스트(간단) 현황에 불러오기
	public List<K3Contractor> K3GetContractorList(){
		List<K3Contractor> contractorList = k3ContractorMapper.K3GetContractorList();
		
		return contractorList;
	}



}
