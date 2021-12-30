package k3.receive.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.receive.ahs.dto.K3Receive;
import k3.receive.ahs.mapper.K3ReceiveMapper;

@Service
public class K3ReceiveService {
	private K3ReceiveMapper k3ReceiveMapper;
	
	public K3ReceiveService(K3ReceiveMapper k3ReceiveMapper) {
		this.k3ReceiveMapper=k3ReceiveMapper;
	}
	
	//미수금 내역 등록
	public int receiveAdd(K3Receive k3Receive) {
		int result = k3ReceiveMapper.receiveAdd(k3Receive);
		return result;
	}
	
	//미수금 내역 조회(초기화면)
	public List<K3Receive> getReceiveList(){
		List<K3Receive> receiveList = k3ReceiveMapper.getReceiveList();
		return receiveList;
	}
}
