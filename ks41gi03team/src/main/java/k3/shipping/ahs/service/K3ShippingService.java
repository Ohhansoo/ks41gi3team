package k3.shipping.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.shipping.ahs.dto.K3Shipping;
import k3.shipping.ahs.mapper.K3ShippingMapper;



@Service
public class K3ShippingService {
	private K3ShippingMapper k3ShippingMapper;
	
	public K3ShippingService(K3ShippingMapper k3ShippingMapper) {
		this.k3ShippingMapper = k3ShippingMapper;
	}
	
	public List<K3Shipping> getShippingList(){
		List<K3Shipping> shippingList = k3ShippingMapper.getShippingList();
		return shippingList;
	}
	
	public Integer addShipping(K3Shipping k3Shipping) {
		Integer result = k3ShippingMapper.addShipping(k3Shipping);
		return result;
	}
	
	public K3Shipping getModifyShipping(String shippingCode) {
		return k3ShippingMapper.getModifyShipping(shippingCode);
	}
	
	public Integer modifyShipping(K3Shipping k3Shipping) {
		return k3ShippingMapper.modifyShipping(k3Shipping);
	}
}
