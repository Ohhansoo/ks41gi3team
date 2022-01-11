package k3.dispatch.ahs.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.dispatch.ahs.dto.K3Dispatch;
import k3.dispatch.ahs.mapper.K3DispatchMapper;


@Service
@Transactional
public class K3DispatchService {
	
	private K3DispatchMapper k3DispatchMapper;
	
	public K3DispatchService(K3DispatchMapper k3DispatchMapper) {
		this.k3DispatchMapper = k3DispatchMapper;
	}
	
	//현황
	public List<K3Dispatch> getDispatchList(){
		List<K3Dispatch> dispatchList = k3DispatchMapper.getDispatchList();
		return dispatchList;
	}
	
	//등록
	public Integer addDispatch(K3Dispatch k3Dispatch) {
		Integer result = k3DispatchMapper.addDispatch(k3Dispatch);
		return result;
	}
	
	//수정 화면
	public K3Dispatch getModifyDispatch(String dispatchCode) {
		return k3DispatchMapper.getModifyDispatch(dispatchCode);
	}
	
	//수정
	public Integer modifyDispatch(K3Dispatch k3Dispatch) {
		return k3DispatchMapper.modifyDispatch(k3Dispatch);
	}
	
	//검색
	public List<K3Dispatch> k3SearchDispatchList(String dispatchKey, String dispatchValue){
		List<K3Dispatch> k3DispatchList = k3DispatchMapper.k3SearchDispatchList(dispatchKey, dispatchValue);
		return k3DispatchList;
	}
	
	//모달
		public List<Map<String, Object>> k3SelectDispatchMemberId() {
			List<Map<String, Object>> searchId = k3DispatchMapper.k3SelectDispatchMemberId(null);
			return searchId;
		}
}
