package k3.inout.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.inout.ahs.dto.K3Inout;


@Mapper
public interface K3InoutMapper {
	
	//입출금 내역 등록처리
	public int inoutAdd(K3Inout k3Inout);
	
	//입출금 내역 현황(초기화면)
	List<K3Inout> getInoutList();
	
}
