package k3.in.ahs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.estimate.ahs.dto.K3Estimate;
import k3.in.ahs.dto.K3In;
import k3.in.ahs.dto.K3MainBusinessCode;
import k3.in.ahs.mapper.K3InMapper;


@Service
@Transactional

public class K3InService {
	
	private K3InMapper k3InMapper;
	
	public K3InService(K3InMapper k3InMapper) {
		this.k3InMapper=k3InMapper;
	}
	
	
	
	//결제정보 버튼 모달
	public List<Map<String, Object>> inPayInfo(String inCode) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("inCode", inCode);
		List<Map<String, Object>> resultList = k3InMapper.inPayInfo(paramMap);
		return resultList;
	}
	
	//견적정보 등록 버튼 모달
		public List<Map<String, Object>> findEstimateInfo() {
			List<Map<String, Object>> resultList = k3InMapper.findEstimateInfo();
			return resultList;
		}
		
	
	//매출 내역 현황 조회 처리
		public Map<String, Object> getSearchInList(Map<String, Object> searchCondition, int currentPage){
			// 보여줄 행의 개수
			int rowPerPage = 7;
			
			// 로그인 이력 테이블 행의 개수
			String countType = "search";
			double rowCount = k3InMapper.getInCount(countType, searchCondition);
			
			// 마지막 페이지
			int lastPage = (int) Math.ceil((rowCount / rowPerPage));
			
			// 페이지 알고리즘
			int startNum = (currentPage - 1) * rowPerPage;
			
			//보여줄 시작 페이지 번호
			int startPageNum = 1;
			//보여줄 마지막 페이지 번호
			int endPageNum = 10;
			// 동적 페이지 구정( 7페이지 부터)
			if(currentPage > 6) {
				startPageNum = currentPage - 5;
				endPageNum = currentPage + 4;
				if(endPageNum >= lastPage) {
					startPageNum = lastPage - 9;
					endPageNum = lastPage;
				}
			}
			
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("startNum", startNum);
			paramMap.put("rowPerPage", rowPerPage);
			
			List<Map<String, Object>> inList = k3InMapper.getSearchInList(searchCondition, paramMap);
			paramMap.clear();
			paramMap.put("lastPage", lastPage);
			paramMap.put("inList", inList);
			paramMap.put("startPageNum", startPageNum);
			paramMap.put("endPageNum", endPageNum);
			return paramMap;
			

		}
	
	
	
	
	
	
	
	//견적번호 가져오기
	public List<K3Estimate> getEstimateNum() {
		return k3InMapper.getEstimateNum();
	}
	
	//사업장별 대표코드 가져오기
	public List<K3MainBusinessCode> getMainBusinessCodeList() {
		return k3InMapper.getMainBusinessCodeList();
	}
	
	/*
	 * //매출 내역 검색 public List<K3In> searchInList(String inKey, String inValue,
	 * currentPage){ List<K3In> k3InList = k3InMapper.searchInList(inKey, inValue);
	 * return k3InList; }
	 */
	
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
	public Map<String, Object> getInList(int currentPage) {
		
		int rowPerPage = 7;
		
		// 매출내역 테이블 행의 개수
		String countType = "normal";
		
		double rowCount = k3InMapper.getInCount(countType, null);
		
		// 마지막 페이지
		int lastPage = (int) Math.ceil((rowCount / rowPerPage));
		
		// 페이지 알고리즘
		int startNum = (currentPage - 1) * rowPerPage;
		
		//보여줄 시작 페이지 번호
		int startPageNum = 1;
		//보여줄 마지막 페이지 번호
		int endPageNum = 0;
		if(lastPage > 5) {
			endPageNum = 5;
		}else {
			endPageNum = lastPage;
		}
		// 동적 페이지 구정( 7페이지 부터)
		if(currentPage > 5) {
			startPageNum = currentPage - 2;
			endPageNum = currentPage + 2;
			if(endPageNum > lastPage) {
				startPageNum = lastPage - 4;
				endPageNum = lastPage;
			}
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> inList = k3InMapper.getInList(paramMap);
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("inList", inList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
			
		return paramMap;
		
		/*
		 * List<K3In> inList = k3InMapper.getInList();
		 * System.out.println("매출 조회 서비스 실행"); return inList;
		 */
		
	}
}
