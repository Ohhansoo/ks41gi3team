package k3.out.ahs.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import k3.in.ahs.dto.K3MainBusinessCode;
import k3.out.ahs.dto.K3Out;
import k3.out.ahs.mapper.K3OutMapper;
import k3.subject.ahs.dto.K3Subject;

@Service
public class K3OutService {

		private final K3OutMapper k3OutMapper;
		
		public K3OutService(K3OutMapper k3OutMapper) {
			this.k3OutMapper=k3OutMapper;
		}

		//계정과목 코드와 이름 가져오는 등록버튼 모달
		public List<Map<String, Object>> findSubjectInfo() {
			List<Map<String, Object>> result = k3OutMapper.findSubjectInfo();
			return result;
		}
		
		
		//비용 내역 검색
		public List<K3Out> searchOutList(String outKey, String outValue){
			List<K3Out> k3OutList = k3OutMapper.searchOutList(outKey, outValue);
			return k3OutList;
		}
		
		//비용 삭제처리
		public int deleteOut(List<String> deleteList) {
			int result = k3OutMapper.deleteOut(deleteList);
			return result;
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
		
		//사업장별 대표코드 가져오기
		public List<K3MainBusinessCode> getMainBusinessCodeList() {
			return k3OutMapper.getMainBusinessCodeList();
		}
		
				//비용 내역 등록
		public int addOut(K3Out k3Out) {
			int result = k3OutMapper.addOut(k3Out);
			System.out.println("등록처리 서비스");
			return result;
		}
		
		//비용 내역 조회(초기화면)
		public List<K3Out> getOutList(){
			List<K3Out> outList = k3OutMapper.getOutList();
			return outList;
		}
		
}
