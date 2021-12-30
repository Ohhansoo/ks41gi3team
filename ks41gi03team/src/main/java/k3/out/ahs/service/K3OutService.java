package k3.out.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.out.ahs.dto.K3Out;
import k3.out.ahs.mapper.K3OutMapper;

@Service
public class K3OutService {

		private K3OutMapper k3OutMapper;
		
		public K3OutService(K3OutMapper k3OutMapper) {
			this.k3OutMapper=k3OutMapper;
		}

		//비용 내역 등록
		public int outAdd(K3Out k3Out) {
			int result = k3OutMapper.outAdd(k3Out);
			return result;
		}
		
		//비용 내역 조회(초기화면)
		public List<K3Out> getOutList(){
			List<K3Out> outList = k3OutMapper.getOutList();
			return outList;
		}
		
}
