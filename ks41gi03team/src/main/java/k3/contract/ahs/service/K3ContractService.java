package k3.contract.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.contract.ahs.dto.K3Contract;
import k3.contract.ahs.mapper.K3ContractMapper;
import k3.contractor.ahs.dto.K3Contractor;

@Service
@Transactional
public class K3ContractService {

	private K3ContractMapper k3ContractMapper;
	
	public K3ContractService(K3ContractMapper k3ContractMapper) {
		this.k3ContractMapper = k3ContractMapper;
	}
	
	
	public List<K3Contract> k3GetContractList(){
		List<K3Contract> contractList = k3ContractMapper.k3GetContractList();
		
		return contractList;
	}

}
