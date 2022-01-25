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
	public int k3ModifyCategory(K3Category k3Category) {
		int result = k3CategoryMapper.k3ModifyCategory(k3Category);
		return result;
	}
	//수정폼 이동
	public K3Category k3GetCategoryInfoBycode(String categoryCode) {
		K3Category k3Category = k3CategoryMapper.k3GetCategoryInfoBycode(categoryCode);
		return k3Category;
	}
	
	//카테고리 등록처리
	public int k3AddCategory(K3Category k3Category) {
		int result = k3CategoryMapper.k3AddCategory(k3Category);
		return result;
	}
	
	//카테고리 현황(초기화면)
	public List<K3Category> k3GetCategoryList(){		
		List<K3Category> categoryList = k3CategoryMapper.k3GetCategoryList();
		return categoryList;
	}
	//카테고리 현황(초기화면2)
	public List<Map<String, Object>> k3GetCategoryListByMap(){		
		List<Map<String, Object>> categoryList = k3CategoryMapper.k3GetCategoryListByMap(null);
		return categoryList;
	}

	
}
