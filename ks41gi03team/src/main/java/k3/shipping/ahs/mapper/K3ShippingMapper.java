package k3.shipping.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.shipping.ahs.dto.K3Shipping;

@Mapper
public interface K3ShippingMapper {
	public List<K3Shipping> getShippingList();
	
	public Integer addShipping(K3Shipping k3Shipping);
	
	public K3Shipping getModifyShipping(String shippingCode);
	
	public Integer modifyShipping(K3Shipping k3Shipping);
}

