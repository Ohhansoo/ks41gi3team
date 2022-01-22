package k3.product.ahs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import k3.product.ahs.dto.K3Product;
import k3.product.ahs.mapper.K3ProductMapper;

@Service
public class K3ProductService {

	private final K3ProductMapper k3ProductMapper;
	
	public K3ProductService(K3ProductMapper k3ProductMapper) {
		this.k3ProductMapper = k3ProductMapper;
	}
	
	//<모달> - 상품정보리스트
	public List<K3Product> getModalProductList() {
		List<K3Product> productList = k3ProductMapper.getModalProductList();
		return productList;
	}
	
	//상품 수정 처리
	public int k3ModifyProduct(K3Product k3Product) {
		
		int result = k3ProductMapper.k3ModifyProduct(k3Product);
		
		return result;
	}

	//상품 수정폼 이동
	public List<K3Product> K3GetProductInfo(String productCode) {
		
		List<K3Product> productInfo = k3ProductMapper.K3GetProductInfo(productCode);
		
		return productInfo;
	}
	//상품 등록 처리
	public int k3AddProduct(K3Product k3Product) {
		int result = k3ProductMapper.k3AddProduct(k3Product);
		return 0;
	}

	//상품 조회 처리
	public Map<String, Object> k3GetProductSearchList(int currentPage, Map<String, Object> searchCondition) {
		// 보여줄 행의 개수
		int rowPerPage = 7;
		
		//상품 조회 결과 튜플 수
		String countType = "search";
		double rowCount = k3ProductMapper.k3GetProductCount(countType, searchCondition);
		
		//마지막 페이지
		int lastPage = (int) Math.ceil((rowCount / rowPerPage));
		
		//페이지 알고리즘
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
		if(lastPage < 11) endPageNum = lastPage;
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> productList = k3ProductMapper.k3GetProductSearchList(searchCondition, paramMap);
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("productList", productList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;	
		
	}
	
	//상품 현황(초기화면)
	public Map<String, Object> k3GetProductList(int currentPage) {
		// 보여줄 행의 개수
		int rowPerPage = 7;
		
		//상품 테이블 행의 개수
		String countType = "normal";
		double rowCount = k3ProductMapper.k3GetProductCount(countType, null);
		
		//마지막 페이지
		int lastPage = (int) Math.ceil((rowCount / rowPerPage));
		
		//페이지 알고리즘
		int startNum = (currentPage - 1) * rowPerPage;
		
		//보여줄 시작 페이지 번호
		int startPageNum = 1;
		//보여줄 마지막 페이지 번호
		int endPageNum = 10;
		//동적 페이지 구정( 7페이지 부터)
		if(currentPage > 6) {
			startPageNum = currentPage - 5;
			endPageNum = currentPage + 4;
			if(endPageNum >= lastPage) {
				startPageNum = lastPage - 9;
				endPageNum = lastPage;
			}
		}
		if(lastPage < 11) endPageNum = lastPage;
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startNum", startNum);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> productList = k3ProductMapper.k3GetProductList(paramMap);
		
		paramMap.clear();
		paramMap.put("lastPage", lastPage);
		paramMap.put("productList", productList);
		paramMap.put("startPageNum", startPageNum);
		paramMap.put("endPageNum", endPageNum);
		
		return paramMap;	
	}


}
