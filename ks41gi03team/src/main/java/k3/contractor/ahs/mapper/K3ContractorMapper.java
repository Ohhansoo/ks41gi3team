package k3.contractor.ahs.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface K3ContractorMapper {

	//거래처아이디 중복체크
	public int k3AddContractorCheck(String contractorId);
	
	
}
