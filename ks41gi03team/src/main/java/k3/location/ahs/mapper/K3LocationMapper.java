package k3.location.ahs.mapper;

import org.apache.ibatis.annotations.Mapper;

import k3.location.ahs.dto.K3Location;

@Mapper
public interface K3LocationMapper {

	/* public int k3AddLocationCode(String allCode); */
	
	public int k3AddLocation(String allCode);
}
