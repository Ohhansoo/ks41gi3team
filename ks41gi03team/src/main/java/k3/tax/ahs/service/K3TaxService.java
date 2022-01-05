package k3.tax.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.tax.ahs.dto.K3Tax;
import k3.tax.ahs.mapper.K3TaxMapper;


@Service
public class K3TaxService {
	private K3TaxMapper k3TaxMapper;
	
	public K3TaxService(K3TaxMapper k3TaxMapper) {
		this.k3TaxMapper=k3TaxMapper;
	}
	
	//미수금 내역 등록
	public int taxAdd(K3Tax k3Tax) {
		int result = k3TaxMapper.taxAdd(k3Tax);
		return result;
	}
	
	//미수금 내역 조회(초기화면)
	public List<K3Tax> getTaxList(){
		List<K3Tax> taxList = k3TaxMapper.getTaxList();
		return taxList;
	}
}