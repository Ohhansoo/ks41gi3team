package k3.dispatch.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.dispatch.ahs.dto.K3Dispatch;
import k3.dispatch.ahs.mapper.K3DispatchMapper;



@Service
public class K3DispatchService {
	
	private K3DispatchMapper k3DispatchMapper;
	
	public K3DispatchService(K3DispatchMapper k3DispatchMapper) {
		this.k3DispatchMapper = k3DispatchMapper;
	}
	
	public List<K3Dispatch> getDispatchList(){
		List<K3Dispatch> dispatchList = k3DispatchMapper.getDispatchList();
		return dispatchList;
	}
}
