package k3.product.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.product.ahs.dto.K3Product;

@Mapper
public interface K3ProductMapper {
	//<모달> - 상품정보리스트
	public List<K3Product> k3GetModalProductList();
	//상품 수정 처리
	public int k3ModifyProduct(K3Product k3Product);
	//상품 수정폼 이동
	public List<K3Product> K3GetProductInfo(String productCode);
	//상품 등록 처리
	public int k3AddProduct(K3Product k3Product);
	//상품 조회현황 처리
	public List<Map<String, Object>> k3GetProductSearchList(Map<String, Object> searchCondition, Map<String, Object> paramMap);
	//상품 현황
	public List<Map<String, Object>> k3GetProductList(Map<String, Object> paramMap);
	//상품 테이블 튜플 수
	public int k3GetProductCount(String countType, Map<String, Object> searchCondition);


}
