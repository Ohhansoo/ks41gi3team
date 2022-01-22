package k3.release.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.release.ahs.dto.K3Release;

@Mapper
public interface K3ReleaseMapper {
	
	//<모달>-출하 상품명 리스트 가져오기
	public List<Map<String, Object>> findProductNameList(Map<String, Object> productMap);
	//출고 승인
	public List<K3Release> k3RequestAllowRelease();
	//출고 등록처리(출고 요청)
	public int k3AddRelease(K3Release k3Release);
	//출고 현황
	public List<K3Release> k3GetReleaseList();

}
