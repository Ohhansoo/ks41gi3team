package k3.subject.ahs.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.category.ahs.dto.K3Category;
import k3.subject.ahs.dto.K3Subject;
import k3.vehicle.ahs.dto.K3Vehicle;

@Mapper
public interface K3SubjectMapper {
	
	//계정과목 수정 폼으로 이동
	public K3Subject getModifySubject(String subjectCode);
	
	//계정과목 등록처리
	public int addSubject(K3Subject k3Subject);
	
	//카테고리 현황(초기화면)
	List<K3Subject> getSubjectList();
}
