package k3.contractor.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.contractor.ahs.dto.K3Contractor;
import k3.contractor.ahs.dto.K3ContractorDetail;

@Mapper
public interface K3ContractorMapper {
	
	//거래처 등록
	public int k3AddContractor(K3ContractorDetail k3ContractorDetail);
	
	//거래처 목록 받아오기
	public List<K3Contractor> K3GetContractorList();
	
	
}
