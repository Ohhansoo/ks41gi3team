package k3.tax.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.tax.ahs.dto.K3Tax;

@Mapper
public interface K3TaxMapper {
	
	//세금계산서 등록처리
	public int taxAdd(K3Tax k3Tax);
	
	//세금계산서 내역 조회
	List<K3Tax> getTaxList();
}
