package k3.contract.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.contract.ahs.dto.K3Contract;

@Mapper
public interface K3ContractMapper {

	//계약 목록 받아오기
	public List<K3Contract> k3GetContractList();

}
