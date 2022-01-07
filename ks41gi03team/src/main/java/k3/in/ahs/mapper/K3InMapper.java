package k3.in.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.in.ahs.dto.K3In;
import k3.inout.ahs.dto.K3Inout;


	
	@Mapper
	public interface K3InMapper {
		//입출금 내역 삭제처리
		public int deleteIn(List<String> deleteList);
		
		//입출금 내역 수정처리
		public int modifyIn(K3In k3in);
		
		//입출금 내역 수정 폼으로 이동
		public K3In getModifyIn(String inCode);	
		
		//매출 내역 등록처리
		public int addIn(K3In k3In);
		
		//매출 내역 현황(초기화면)
		List<K3In> getInList();
}
