package k3.subject.ahs.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.subject.ahs.dto.K3Subject;

@Mapper
public interface K3SubjectMapper {
	
	//계정과목 등록처리
	public int subjectAdd(K3Subject k3Subject);
	
	//카테고리 현황(초기화면)
	List<K3Subject> getSubjectList();

	
	
}
