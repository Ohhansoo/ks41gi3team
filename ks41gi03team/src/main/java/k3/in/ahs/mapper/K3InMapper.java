package k3.in.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.in.ahs.dto.K3In;


	
	@Mapper
	public interface K3InMapper {
		
		//매출 내역 등록처리
		public int inAdd(K3In k3In);
		
		//매출 내역 현황(초기화면)
		List<K3In> getInList();
}
