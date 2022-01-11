package k3.category.ahs.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import k3.category.ahs.dto.K3Category;
import k3.category.ahs.mapper.K3CategoryMapper;

@Service
public class K3CategoryService {
	private K3CategoryMapper k3CategoryMapper;
	
	public K3CategoryService(K3CategoryMapper k3CategoryMapper) {
		this.k3CategoryMapper = k3CategoryMapper;
	}
	
	//조회
	public List<K3Category> k3GetCategorySearchList(String categoryKey, String categoryValue) {
		List<K3Category> k3CategoryList = k3CategoryMapper.k3GetCategorySearchList(categoryKey, categoryValue);
		return k3CategoryList;
	}
	//카테고리 삭제처리
	public int k3DeleteCategory(List<String> deleteList) {
		int result = k3CategoryMapper.k3DeleteCategory(deleteList);
		return result;
	}
	
	//수정 처리
	public int K3ModifyLabel(K3Category k3Category) {
		int result = k3CategoryMapper.K3ModifyLabel(k3Category);
		return result;
	}
	//수정폼 이동
	public K3Category K3GetCategoryInfoBycode(String categoryCode) {
		K3Category k3Category = k3CategoryMapper.K3GetCategoryInfoBycode(categoryCode);
		return k3Category;
	}
	
	//카테고리 등록처리
	public int AddCategory(K3Category k3Category) {
		int result = k3CategoryMapper.AddCategory(k3Category);
		return result;
	}
	
	//카테고리 현황(초기화면)
	public List<K3Category> getCategoryList(){		
		List<K3Category> categoryList = k3CategoryMapper.getCategoryList();
		return categoryList;
	}
	//카테고리 현황(초기화면2)
	public List<Map<String, Object>> getCategoryListByMap(){		
		List<Map<String, Object>> categoryList = k3CategoryMapper.getCategoryListByMap(null);
		return categoryList;
	}

	
}
