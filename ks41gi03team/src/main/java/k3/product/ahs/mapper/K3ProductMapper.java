package k3.product.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface K3ProductMapper {
	// 상품 조회현황 처리
	public List<Map<String, Object>> k3GetProductSearchList(Map<String, Object> searchCondition, Map<String, Object> paramMap);
	// 상품 현황
	public List<Map<String, Object>> k3GetProductList(Map<String, Object> paramMap);
	// 상품 테이블 튜플 수
	public int k3GetProductCount(String countType, Map<String, Object> searchCondition);

}
