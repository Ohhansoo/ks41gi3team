package k3.out.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.out.ahs.dto.K3Out;

@Mapper
public interface K3OutMapper {
	
	//지출내역 등록처리
	public int outAdd(K3Out k3Out);
	
	//지출내역 조회(초기화면)
	 List<K3Out> getOutList();
}
