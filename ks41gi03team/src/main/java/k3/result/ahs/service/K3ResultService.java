package k3.result.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.result.ahs.dto.K3Result;
import k3.result.ahs.mapper.K3ResultMapper;

@Service
public class K3ResultService {
	private K3ResultMapper k3ResultMapper;
	
	public K3ResultService(K3ResultMapper k3ResultMapper) {
		this.k3ResultMapper=k3ResultMapper;
	}
	
	//미수금 내역 등록
	public int resultAdd(K3Result k3Result) {
		int result = k3ResultMapper.resultAdd(k3Result);
		return result;
	}
	
	//미수금 내역 조회(초기화면)
	public List<K3Result> getResultList(){
		List<K3Result> resultList = k3ResultMapper.getResultList();
		return resultList;
	}
}