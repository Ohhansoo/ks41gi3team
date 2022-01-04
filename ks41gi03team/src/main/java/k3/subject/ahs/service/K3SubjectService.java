package k3.subject.ahs.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.category.ahs.dto.K3Category;
import k3.subject.ahs.dto.K3Subject;
import k3.subject.ahs.mapper.K3SubjectMapper;
import k3.vehicle.ahs.dto.K3Vehicle;


@Service
@Transactional
public class K3SubjectService {
	
	private final K3SubjectMapper k3SubjectMapper;
	
	public K3SubjectService(K3SubjectMapper k3SubjectMapper) {
		this.k3SubjectMapper = k3SubjectMapper;
	}
	
	//계정과목 수정 처리
	public int modifySubject(K3Subject k3Subject) {
		return k3SubjectMapper.modifySubject(k3Subject);
	}
	
	//계정과목 수정 폼으로 이동
	public K3Subject getModifySubject(String subjectCode) {
		return k3SubjectMapper.getModifySubject(subjectCode);
	}

	//계정과목 등록
	public int addSubject(K3Subject k3Subject) {
		int result = k3SubjectMapper.addSubject(k3Subject);
		return result;
	}
	
	//계정과목 현황(초기화면)
	public List<K3Subject> getSubjectList(){		
		List<K3Subject> subjectList = k3SubjectMapper.getSubjectList();
		return subjectList;
	}
	
}
