package k3.estimate.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.estimate.ahs.dto.K3Estimate;
import k3.estimate.ahs.mapper.K3EstimateMapper;

@Service
@Transactional
public class K3EstimateService {
	
	private K3EstimateMapper k3EstimateMapper;
	
	public K3EstimateService(K3EstimateMapper k3EstimateMapper) {
		this.k3EstimateMapper = k3EstimateMapper;
	}
	
	public List<K3Estimate> K3GetEstimateList(){
	
		List<K3Estimate> estimateList = k3EstimateMapper.K3GetEstimateList();

		return estimateList;
	}
	
	

}
