package k3.category.ahs.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k3.category.ahs.dto.K3Category;
import k3.category.ahs.service.K3CategoryService;

@Controller
@RequestMapping(value="/team03/goodsManagement/category")
public class K3CategoryController {
	
	private static final Logger log = LoggerFactory.getLogger(K3CategoryController.class);
	
	private final K3CategoryService k3CategoryService;
	
	public K3CategoryController(K3CategoryService k3CategoryService) {
		this.k3CategoryService = k3CategoryService;
	}
	//카테고리 조회
	@PostMapping("/k3CategoryList")
	public String k3GetCategorySearchList(@RequestParam(value="categoryKey", required = false) String categoryKey,
										  @RequestParam(value="categoryValue", required = false) String categoryValue,
										  Model model) {
		if(categoryKey != null && "large".equals(categoryKey)) {
			categoryKey = "largeCategory";
		}else if(categoryKey != null && "medium".equals(categoryKey)) {
			categoryKey = "mediumCategory";
		}else if(categoryKey != null && "small".equals(categoryKey)) {
			categoryKey = "smallCategory";
		}
		
		List<K3Category> categoryList = k3CategoryService.k3GetCategorySearchList(categoryKey, categoryValue);
		model.addAttribute("title", "카테고리 관리");
		model.addAttribute("subtitle", "카테고리 현황");
		model.addAttribute("categoryList", categoryList);
		
		return "team03/goodsManagement/category/k3CategoryList";
	}
	//카테고리 삭제처리
	@PostMapping("/k3DeleteCategory")
	public String k3DeleteCategory(@RequestParam(value="deleteList[]", required = false) List<String> deleteList) {
		int result = k3CategoryService.k3DeleteCategory(deleteList);
		//Map<String, List<String>> map = new HashMap<String, List<String>>();
		//map.put("deleteList", deleteList);
		//log.info("DeleteCategory 전송결과 : " + map.values());
		log.info("DeleteCategory 전송결과 : " + result);
		return "redirect:/team03/goodsManagement/category/k3CategoryList";
	}

		
	//카테고리 수정처리
	@PostMapping("/k3ModifyCategory")
	public String k3ModifyLabel(K3Category k3Category) {
		int result = k3CategoryService.k3ModifyCategory(k3Category);
		log.info("AddCategory 메서드 인서트 결과 : " + k3Category);
		return "redirect:/team03/goodsManagement/category/k3CategoryList";
	}
	
	
	//카테고리 수정폼 이동
	@GetMapping("/k3ModifyCategory")
	public String k3ModifyCategory(@RequestParam(value="categoryCode", required = false) String categoryCode, Model model) {
		log.info("category code = {}", categoryCode );
		
		K3Category k3Category = k3CategoryService.k3GetCategoryInfoBycode(categoryCode);
		model.addAttribute("title", "카테고리관리");
		model.addAttribute("subtitle", "카테고리 수정");
		model.addAttribute("k3Category", k3Category);
		return "team03/goodsManagement/category/k3ModifyCategory";
	}
		
	
	//카테고리 등록처리
	@PostMapping("/k3AddCategory")
	public String k3AddCategory(K3Category k3Category) {
		int result = k3CategoryService.k3AddCategory(k3Category);
		log.info("AddCategory 메서드 인서트 결과 : " + result);
		log.info("AddCategory 메서드 인서트 결과 : " + k3Category);
		return "redirect:/team03/goodsManagement/category/k3CategoryList";
	}
	
	//카테고리 등록화면(이동)
	@GetMapping("/k3AddCategory")
	public String k3MoveToAddCategoryForm(Model model) {
		model.addAttribute("title", "카테고리 관리");
		model.addAttribute("subtitle", "카테고리 등록");
		return "team03/goodsManagement/category/k3AddCategory";
	}
	
	//카테고리 현황(초기화면)
	@GetMapping("/k3CategoryList")
	public String k3GetCategoryList(Model model) {
		List<K3Category> categoryList = k3CategoryService.k3GetCategoryList();
		model.addAttribute("title", "카테고리 관리");
		model.addAttribute("subtitle", "카테고리 현황");
		model.addAttribute("categoryList", categoryList);
		
		return "team03/goodsManagement/category/k3CategoryList";
	}
	
}
