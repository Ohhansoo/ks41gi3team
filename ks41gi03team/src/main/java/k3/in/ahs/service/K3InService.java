package k3.in.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.in.ahs.dto.K3In;
import k3.in.ahs.mapper.K3InMapper;

@Service
public class K3InService {
	
	private K3InMapper k3InMapper;
	
	public K3InService(K3InMapper k3InMapper) {
		this.k3InMapper=k3InMapper;
	}
	
	//매출 내역 등록
	public int inAdd(K3In k3In) {
		int result = k3InMapper.inAdd(k3In);
		return result;
	}
	
	//매출 내역 현황
	public List<K3In> getInList() {
		List<K3In> inList = k3InMapper.getInList();
		return inList;
		
	}
}
