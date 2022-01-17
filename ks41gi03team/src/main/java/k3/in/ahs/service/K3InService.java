package k3.in.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.estimate.ahs.dto.K3Estimate;
import k3.in.ahs.dto.K3In;
import k3.in.ahs.dto.K3MainBusinessCode;
import k3.in.ahs.mapper.K3InMapper;
import k3.inout.ahs.dto.K3Inout;
import k3.out.ahs.dto.K3Out;

@Service
@Transactional

public class K3InService {
	
	private K3InMapper k3InMapper;
	
	public K3InService(K3InMapper k3InMapper) {
		this.k3InMapper=k3InMapper;
	}
	
	//견적번호 가져오기
	public List<K3Estimate> getEstimateNum() {
		return k3InMapper.getEstimateNum();
	}
	
	//사업장별 대표코드 가져오기
	public List<K3MainBusinessCode> getMainBusinessCodeList() {
		return k3InMapper.getMainBusinessCodeList();
	}
	
	//매출 내역 검색
	public List<K3In> searchInList(String inKey, String inValue){
		List<K3In> k3InList = k3InMapper.searchInList(inKey, inValue);
		return k3InList;
	}
	
	//매출내역 삭제처리
	public int deleteIn(List<String> deleteList) {
		int result = k3InMapper.deleteIn(deleteList);
		return result;
	}
	
	//매출 내역 수정 처리
	public int getModifyIn(K3In k3In) {
		return k3InMapper.modifyIn(k3In);
	}
	
	//매출 내역 수정 폼으로 이동
	public K3In getModifyIn(String inCode) {
		System.out.println( inCode + "  << getmodifyIn @ service");
		return k3InMapper.getModifyIn(inCode);
	}
	
	
	//매출 내역 등록
	public int addIn(K3In k3In) {
		int result = k3InMapper.addIn(k3In);
		System.out.println(result + "result값");
		System.out.println("매출 내역 등록 서비스 실행");
		return result;
	}
	
	//매출 내역 현황
	public List<K3In> getInList() {
		List<K3In> inList = k3InMapper.getInList();
		System.out.println("매출 조회 서비스 실행");
		return inList;
		
	}
}
