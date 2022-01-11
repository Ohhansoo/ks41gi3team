package k3.out.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.out.ahs.dto.K3Out;
import k3.out.ahs.mapper.K3OutMapper;
import k3.subject.ahs.dto.K3Subject;

@Service
public class K3OutService {

		private final K3OutMapper k3OutMapper;
		
		public K3OutService(K3OutMapper k3OutMapper) {
			this.k3OutMapper=k3OutMapper;
		}

		//비용 수정 처리
		public int modifyOut(K3Out k3Out) {
			System.out.println("비용 수정 처리 서비스");
			return k3OutMapper.modifyOut(k3Out);
		}
		
		//비용 수정 폼으로 이동
		public K3Out getModifyOut(String outCode) {
			System.out.println("비용 수정 폼 서비스");
			return k3OutMapper.getModifyOut(outCode);
		}
		
		//비용 내역 등록
		public int addOut(K3Out k3Out) {
			int result = k3OutMapper.addOut(k3Out);
			return result;
		}
		
		//비용 내역 조회(초기화면)
		public List<K3Out> getOutList(){
			List<K3Out> outList = k3OutMapper.getOutList();
			return outList;
		}
		
}
