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
	public List<K3OurCompany> getOurCompanyList(){
		List<K3OurCompany> ourcompanyList = ourcompanyMapper.getOurCompanyList();
			return ourcompanyList;
	
				
	}
	
}
