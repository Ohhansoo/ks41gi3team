package k3.out.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.out.ahs.dto.K3Out;
import k3.subject.ahs.dto.K3Subject;

@Mapper
public interface K3OutMapper {
	
	
	//비용 수정처리
	public int modifyOut(K3Out k3Out);
		
	//비용 수정 폼으로 이동
	public K3Out getModifyOut(String outCode);	
	
	//비용 내역 등록처리
	public int addOut(K3Out k3Out);
	
	//비용 내역 조회(초기화면)
	 List<K3Out> getOutList();
}
