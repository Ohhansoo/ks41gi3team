package k3.ourcompany.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.ourcompany.ahs.dto.K3OurCompany;
import k3.ourcompany.ahs.mapper.K3OurcompanyMapper;

@Service
public class K3OurcompanyService {

	private K3OurcompanyMapper ourcompanyMapper;
	
	public K3OurcompanyService(K3OurcompanyMapper ourcompanyMapper) {
		this.ourcompanyMapper = ourcompanyMapper;
	}
	//자사정보 등록처리
	public int AddOurCompany(K3OurCompany k3OurCompany) {
		int result = ourcompanyMapper.AddOurCompany(k3OurCompany);
		return result;
	}
	
	//자사정보현황(초기화면)
	public List<K3OurCompany> getOurCompanyList(){
		List<K3OurCompany> ourcompanyList = ourcompanyMapper.getOurCompanyList();
			return ourcompanyList;
	
				
	}
	
}
