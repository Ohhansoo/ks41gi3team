package k3.result.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.result.ahs.dto.K3Result;

@Mapper
public interface K3ResultMapper {
	
	//미수금 내역 등록처리
	public int resultAdd(K3Result k3Result);
	
	//미수금 내역 조회
	List<K3Result> getResultList();
}
