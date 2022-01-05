package k3.dispatch.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.dispatch.ahs.dto.K3Dispatch;


@Mapper
public interface K3DispatchMapper {
	
	public List<K3Dispatch> getDispatchList();
	
	public Integer addDispatch(K3Dispatch k3Dispatch);
	
	public K3Dispatch getModifyDispatch(String dispatchCode);
	
	public Integer modifyDispatch(K3Dispatch k3Dispatch);
}
