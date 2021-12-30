package k3.contractor.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.contractor.ahs.dto.K3Contractor;
import k3.contractor.ahs.mapper.K3ContractorMapper;

@Service
@Transactional
public class K3ContractorService {

	private K3ContractorMapper k3ContractorMapper;
	
	public K3ContractorService(K3ContractorMapper k3ContractorMapper) {
		this.k3ContractorMapper = k3ContractorMapper;
	}

	public List<K3Contractor> K3GetContractorList(){
		List<K3Contractor> contractorList = k3ContractorMapper.K3GetContractorList();
		
		return contractorList;
	}

}
