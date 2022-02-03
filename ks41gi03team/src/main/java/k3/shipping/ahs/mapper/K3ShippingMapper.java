package k3.shipping.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.shipping.ahs.dto.K3Shipping;

@Mapper
public interface K3ShippingMapper {
	
	//중복 확인
	public Integer getOverlappedShippingCode(String shippingCode);
	
	//현황
	public List<K3Shipping> getShippingList();
	
	//등록
	public Integer addShipping(K3Shipping k3Shipping);
	
	//수정화면
	public K3Shipping getModifyShipping(String shippingCode);
	
	//수정
	public Integer modifyShipping(K3Shipping k3Shipping);
	
	//검색
	public List<K3Shipping> k3SearchShippingList(String shippingKey, String shippingValue);
	
	//체크 삭제
	public Integer k3DeleteShipping(List<String> deleteList);
	
	//모달
	public List<Map<String, Object>> k3SelectShippingMemberId(Map<String,Object> paraMap);
	
	//모달2
	public List<Map<String, Object>> k3SelectShippingDriverName(Map<String,Object> paraMap);
}

