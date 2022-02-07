package k3.shipping.ahs.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import k3.shipping.ahs.dto.K3Shipping;
import k3.shipping.ahs.mapper.K3ShippingMapper;



@Service
public class K3ShippingService {
	private K3ShippingMapper k3ShippingMapper;
	
	public K3ShippingService(K3ShippingMapper k3ShippingMapper) {
		this.k3ShippingMapper = k3ShippingMapper;
	}
	
	//중복확인
	public Integer getOverlappedShippingCode(String shippingCode) {
		Integer result = 0;
		result += k3ShippingMapper.getOverlappedShippingCode(shippingCode);
		return result;
	}
	
	//현황
	public List<K3Shipping> getShippingList(){
		List<K3Shipping> shippingList = k3ShippingMapper.getShippingList();
		return shippingList;
	}
	
	//등록
	public Integer addShipping(K3Shipping k3Shipping) {
		Integer result = k3ShippingMapper.addShipping(k3Shipping);
		return result;
	}
	
	//수정 화면
	public K3Shipping getModifyShipping(String shippingCode) {
		return k3ShippingMapper.getModifyShipping(shippingCode);
	}
	
	//수정
	public Integer modifyShipping(K3Shipping k3Shipping) {
		return k3ShippingMapper.modifyShipping(k3Shipping);
	}
	
	//검색
	public List<K3Shipping> k3SearchShippingList(String shippingKey, String shippingValue){
		List<K3Shipping> k3ShippingList = k3ShippingMapper.k3SearchShippingList(shippingKey, shippingValue);
		return k3ShippingList;
	}
	
	//체크 삭제
	public Integer k3DeleteShipping(List<String> deleteList) {
		Integer result = k3ShippingMapper.k3DeleteShipping(deleteList);
		return result;
	}
	
	//모달
	public List<Map<String, Object>> k3SelectShippingMemberId() {
		List<Map<String, Object>> searchId = k3ShippingMapper.k3SelectShippingMemberId(null);
		return searchId;
	}
	
	//모달2
	public List<Map<String, Object>> k3SelectShippingDriverName(){
		List<Map<String, Object>> searchName = k3ShippingMapper.k3SelectShippingDriverName(null);
		return searchName;
	}
	
	//모달3
	public List<Map<String, Object>> k3SelectShippingReleaseCode(){
		List<Map<String, Object>> searchCode = k3ShippingMapper.k3SelectShippingReleaseCode(null);
		return searchCode;
	}
		
}
