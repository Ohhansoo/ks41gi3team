package k3.shipping.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.shipping.ahs.dto.K3Shipping;

@Mapper
public interface K3ShippingMapper {
	List<K3Shipping> getShippingList();
}

