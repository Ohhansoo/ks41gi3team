package k3.release.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.release.ahs.dto.K3Release;

@Mapper
public interface K3ReleaseMapper {
	
	
	//출고 승인
	public List<K3Release> k3RequestAllowRelease();
	//출고 현황
	public List<K3Release> k3GetReleaseList();

}
