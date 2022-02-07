package k3.ourcompany.ahs.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import k3.ourcompany.ahs.dto.K3OurCompany;
import k3.ourcompany.ahs.mapper.K3OurcompanyMapper;

@Service
public class K3OurcompanyService {

	private K3OurcompanyMapper ourcompanyMapper;
	
	public K3OurcompanyService(K3OurcompanyMapper ourcompanyMapper) {
		this.ourcompanyMapper = ourcompanyMapper;
	}
	/*
	 * //자사정보 수정처리 public int K3OurCompanyInfoBycode(K3OurCompany k3OurCompany) {
	 * return ourcompanyMapper.K3OurCompanyInfoBycode(k3OurCompany); }
	 * 
	 * //자사정보 수정폼 이동 public K3OurCompany K3OurCompanyInfoBycode(String
	 * ourCompanyCode) { K3OurCompany k3OurCompany =
	 * ourcompanyMapper.K3OurCompanyInfoBycode(ourCompanyCode); return k3OurCompany;
	 * }
	 */
	
	//01 자사정보현황(초기화면)
		public List<K3OurCompany> getOurCompanyList(){
			List<K3OurCompany> ourcompanyList = ourcompanyMapper.getOurCompanyList();
				return ourcompanyList;
		}
		
	//02 자사정보 등록처리
	public int AddOurCompany(K3OurCompany k3OurCompany) {
		int result = ourcompanyMapper.AddOurCompany(k3OurCompany);
		return result;
	}
	
	//03 수정폼이동
	public K3OurCompany K3OurCompanyInfoBycode(String ourCompanyCode) {
		K3OurCompany k3OurCompany = ourcompanyMapper.K3OurCompanyInfoBycode(ourCompanyCode);
		return k3OurCompany;
	}
	
	//04 수정처리
	public int k3ModifyOurCompanyInfo(K3OurCompany k3OurCompany) {
		return ourcompanyMapper.k3ModifyOurCompanyInfo(k3OurCompany);
	}
	
	//05 검색
	public List<K3OurCompany> k3GetOurCompanySearchList(Map<String, Object> searchCondition){
		List<K3OurCompany> ourcompanySearchList = ourcompanyMapper.k3GetOurCompanySearchList(searchCondition);
			
			return ourcompanySearchList;
	}
	
	// 모달
	public List<Map<String, Object>> k3GetOurCompanyModalList(){
		List<Map<String, Object>> ourcompanymodalList = ourcompanyMapper.k3GetOurCompanyModalList(null);
		return ourcompanymodalList;
	}
	
	//사업장별 대표코드 여부 체크(중복확인)
	public int getOurcompanyByMainBusinessCode(String mainBusinessCode) {
		int result = 0;
		result += ourcompanyMapper.getOurcompanyByMainBusinessCode(mainBusinessCode);
		return result;
	}

}
