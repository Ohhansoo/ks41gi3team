package k3.inout.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.inout.ahs.dto.K3Inout;
import k3.inout.ahs.mapper.K3InoutMapper;
import k3.subject.ahs.dto.K3Subject;




@Service
@Transactional
public class K3InoutService {
			
	
	//매퍼에게 의존성 주입
	private final K3InoutMapper k3InoutMapper;
	
	public K3InoutService(K3InoutMapper k3InoutMapper) {
		this.k3InoutMapper = k3InoutMapper;
	}
	
	//입출금내역 삭제처리
	public int deleteInout(List<String> deleteList) {
		int result = k3InoutMapper.deleteInout(deleteList);
		return result;
	}
	
	//입출금내역 수정 처리
	public int getModifyInout(K3Inout k3Inout) {
		return k3InoutMapper.modifyInout(k3Inout);
	}
	
	//입출금내역 수정 폼으로 이동
	public K3Inout getModifyInout(String inoutRec) {
		
		System.out.println( inoutRec + "  << getmodifyinout @ service");
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
