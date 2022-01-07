package k3.ourcompany.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.ourcompany.ahs.dto.K3OurCompany;

@Mapper
public interface K3OurcompanyMapper {

	//자사정보등록
	public int AddOurCompany(K3OurCompany k3ourcompany);

	//자사정보현황(초기화면)
	public List<K3OurCompany> getOurCompanyList();
	
	//자사정보 수정처리
	public int k3ModifyOurCompanyInfoBycode(K3OurCompany k3ourcompany);
	
	//자사정보 찾기 (수정)
	public K3OurCompany K3OurCompanyInfoBycode(String ourCompanyCode);
	/*
	 * //public ourcompany getOurCompanyInfoByourCompanyCode(String ourCompanyCode)
	 * {
	 * 
	 * return K3OurcompanyMapper.getOurCompanyInfoByourCompanyCode(ourCompanyCode);
	 * }
	 */
}
