package k3.dispatch.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.dispatch.ahs.dto.K3Dispatch;


@Mapper
public interface K3DispatchMapper {
	
	//현황
	public List<K3Dispatch> getDispatchList();
	
	//등록
	public Integer addDispatch(K3Dispatch k3Dispatch);
	
	//수정 화면
	public K3Dispatch getModifyDispatch(String dispatchCode);
	
	//수정 등록
	public Integer modifyDispatch(K3Dispatch k3Dispatch);
	
	//검색
	public List<K3Dispatch> k3SearchDispatchList(String dispatchKey, String dispatchValue);
	
	//모달
	public List<Map<String, Object>> k3SelectDispatchMemberId(Map<String,Object> paraMap);
}
