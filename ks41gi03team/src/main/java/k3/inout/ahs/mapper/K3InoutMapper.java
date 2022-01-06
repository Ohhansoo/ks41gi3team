package k3.inout.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.inout.ahs.dto.K3Inout;
import k3.subject.ahs.dto.K3Subject;


@Mapper
public interface K3InoutMapper {
	

	//계정과목 수정 폼으로 이동
	public K3Inout getModifyInout(String inoutRec);	
	
	//입출금 내역 등록처리
	public int addInout(K3Inout k3Inout);
	
	//입출금 내역 현황(초기화면)
	List<K3Inout> getInoutList();
	
}
