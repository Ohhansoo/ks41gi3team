package k3.release.ahs.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import k3.release.ahs.dto.K3Release;
import k3.release.ahs.mapper.K3ReleaseMapper;

@Service
public class K3ReleaseService {

	private K3ReleaseMapper k3ReleaseMapper;
	
	public K3ReleaseService(K3ReleaseMapper k3ReleaseMapper){
		this.k3ReleaseMapper = k3ReleaseMapper;
	}	
	//<모달>-출하 상품명 리스트 가져오기
	public List<Map<String, Object>> findProductNameList() {
		List<Map<String, Object>> ProductNameList = k3ReleaseMapper.findProductNameList(null);
		return ProductNameList;	
	}
	//출고승인
	public List<K3Release> k3RequestAllowRelease() {
		List<K3Release>	RequestAllowRelease = k3ReleaseMapper.k3RequestAllowRelease();
		return RequestAllowRelease;
	}
	//출고 등록처리(출고 요청)
	public int k3AddRelease(K3Release k3Release) {
		int result = k3ReleaseMapper.k3AddRelease(k3Release);
		return result;
	}
	//출고현황
	public List<K3Release> k3GetReleaseList() {
		List<K3Release>	releaseList = k3ReleaseMapper.k3GetReleaseList();
		return releaseList;
	}

}
