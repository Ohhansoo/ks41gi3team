package k3.location.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.location.ahs.dto.K3Location;

@Mapper
public interface K3LocationMapper {
	
	//로케이션 코드 삭제처리
	public void deleteLocationCode(String locationCode);
	
	//로케이션 코드 수정처리
	public int k3ModifyLocationCodeInfo(K3Location k3Location);
	
	//로케이션 코드 수정을 위한 조회
	public K3Location getK3ModifyLocationInfoByLocationCode(String locationCode);
	
	//로케이션 코드 등록 입력처리
	public int k3AddLocation(List<K3Location> k3LocationList);
	
	//로케이션 코드 현황
	public List<K3Location> k3LocationList();
}
