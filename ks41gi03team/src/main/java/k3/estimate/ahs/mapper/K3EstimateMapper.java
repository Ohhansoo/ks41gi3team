package k3.estimate.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.estimate.ahs.dto.K3Estimate;
import k3.estimate.ahs.dto.K3Unit;


@Mapper
public interface K3EstimateMapper {
	
	//단가표 모달창
	public List<K3Unit> k3GetUnit();
	
	//견적서 목록 받아오기
	public List<K3Estimate> K3GetEstimateList();
	
}