package k3.in.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.estimate.ahs.dto.K3Estimate;
import k3.in.ahs.dto.K3In;
import k3.in.ahs.dto.K3MainBusinessCode;


	
	@Mapper
	public interface K3InMapper {
		
	
		//견적번호의 견적액 가져오기
		public List<K3Estimate> getEstimatePrice();
		
		//견적번호 가져오기
		public List<K3Estimate> getEstimateNum();
		
		//사업장별 등록코드 가져오기
		public List<K3MainBusinessCode> getMainBusinessCodeList();
		
		//매출 검색
		public List<Map<String,Object>> getSearchInList(Map<String, Object> searchCondition, Map<String,Object> paramMap);
		
		//매출 내역 삭제처리
		public int deleteIn(List<String> deleteList);
		
		//매출 내역 수정처리
		public int modifyIn(K3In k3in);
		
		//매출 내역 수정 폼으로 이동
		public K3In getModifyIn(String inCode);	
		
		//매출 내역 등록처리
		public int addIn(K3In k3In);
		
		//매출 내역 현황(초기화면)
		public List<Map<String,Object>> getInList(Map<String,Object> paramMap);
		//매출내역 튜플 수
		public int getInCount(String countType, Map<String, Object> searchCondition);

}
