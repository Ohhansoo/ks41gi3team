package k3.out.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.in.ahs.dto.K3MainBusinessCode;
import k3.out.ahs.dto.K3Out;
import k3.subject.ahs.dto.K3Subject;

@Mapper
public interface K3OutMapper {
	
	//계정과목코드와 계정과목 이름가져오기
	public List<Map<String, Object>> findSubjectInfo();
	
	//사업장별 대표코드 가져오기
	public List<K3MainBusinessCode> getMainBusinessCodeList();
	
	//비용 검색
	public List<K3Out> searchOutList(String outKey, String outValue);
	 
	//비용 삭제처리
	public int deleteOut(List<String> deleteList);
	
	//비용 수정처리
	public int modifyOut(K3Out k3Out);
		
	//비용 수정 폼으로 이동
	public K3Out getModifyOut(String outCode);	
	
	//비용 내역 등록처리
	public int addOut(K3Out k3Out);
	
	//비용 내역 조회(초기화면)
	 List<K3Out> getOutList();
}
