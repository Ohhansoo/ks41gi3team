package k3.receive.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.receive.ahs.dto.K3Receive;

@Mapper
public interface K3ReceiveMapper {
	
	//미수금 내역 등록처리
	public int receiveAdd(K3Receive k3Receive);
	
	//미수금 내역 조회
	List<K3Receive> getReceiveList();
}
