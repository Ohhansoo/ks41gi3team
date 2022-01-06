package k3.inout.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.inout.ahs.dto.K3Inout;
import k3.inout.ahs.mapper.K3InoutMapper;
import k3.subject.ahs.dto.K3Subject;



@Service
public class K3InoutService {
			
	
	//매퍼에게 의존성 주입
	private final K3InoutMapper k3InoutMapper;
	
	public K3InoutService(K3InoutMapper k3InoutMapper) {
		this.k3InoutMapper = k3InoutMapper;
	}
	
	
	//계정과목 수정 폼으로 이동
	public K3Inout getModifyInout(String inoutRec) {
		return k3InoutMapper.getModifyInout(inoutRec);
	}
	
	//입출금 내역 등록
	public int addInout(K3Inout k3Inout) {
		int result = k3InoutMapper.addInout(k3Inout);
		return result;
	}
	
	
	//입출금 내역 현황(초기화면)
		public List<K3Inout> getInoutList(){		
			List<K3Inout> inoutList = k3InoutMapper.getInoutList();
			return inoutList;
		}
}
