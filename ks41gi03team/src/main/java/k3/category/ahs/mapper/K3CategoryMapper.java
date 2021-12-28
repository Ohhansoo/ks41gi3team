package k3.category.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.category.ahs.dto.K3Category;

@Mapper
public interface K3CategoryMapper {
	
	//카테고리 조회
	public List<K3Category> k3GetCategorySearchList(String categoryKey, String categoryValue);
	
	//카테고리 삭제처리
	public int k3DeleteCategory(List<String> deleteList);
	
	//카테고리 수정처리
	public int K3ModifyLabel(K3Category k3Category);
	
	//카테고리 정보찾기(수정)
	public K3Category K3GetCategoryInfoBycode(String categoryCode);
	
	//카테고리 등록처리
	public int AddCategory(K3Category k3Category);
	
	//카테고리 현황(초기화면)
	public List<K3Category> getCategoryList();



	




	

	
}
