package k3.inout.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.inout.ahs.dto.K3Inout;
import k3.subject.ahs.dto.K3Subject;


@Mapper
public interface K3InoutMapper {
	
	
	//입출금 내역 삭제처리
	public int deleteInout(List<String> deleteList);

	//입출금 내역 수정처리
	public int modifyInout(K3Inout k3inout);
	
	//입출금 내역 수정 폼으로 이동
	public K3Inout getModifyInout(String inoutRec);
	
	//입출금 내역 등록처리
	public int addInout(K3Inout k3Inout);
	
	//입출금 내역 현황(초기화면)
	List<K3Inout> getInoutList();
	
}
