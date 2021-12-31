package k3.check.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.check.ahs.dto.K3LaydownCheck;

@Mapper
public interface K3CheckMapper {
	
	//입하검수 초기화면
	public List<K3LaydownCheck> k3GetLaydownCheckList();
}
