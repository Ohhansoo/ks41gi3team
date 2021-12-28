package k3.ourcompany.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.ourcompany.ahs.dto.K3OurCompany;

@Mapper
public interface K3OurcompanyMapper {

	//자사정보조회
	List<K3OurCompany> getOurCompanyList();
	
	//자사정보등록
	public int AddOurCompany(K3OurCompany k3ourcompany);
	
	//
	/*
	 * //public ourcompany getOurCompanyInfoByourCompanyCode(String ourCompanyCode)
	 * {
	 * 
	 * return K3OurcompanyMapper.getOurCompanyInfoByourCompanyCode(ourCompanyCode);
	 * }
	 */
}
