package k3.shipping.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.shipping.ahs.dto.K3Shipping;

@Mapper
public interface K3ShippingMapper {
	
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
}

