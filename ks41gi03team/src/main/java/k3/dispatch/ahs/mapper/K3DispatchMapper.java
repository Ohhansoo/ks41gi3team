package k3.dispatch.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.dispatch.ahs.dto.K3Dispatch;


@Mapper
public interface K3DispatchMapper {
	List<K3Dispatch> getDispatchList();
}
