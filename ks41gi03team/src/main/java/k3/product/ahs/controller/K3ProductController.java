package k3.product.ahs.controller;

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
import org.springframework.web.bind.annotation.ResponseBody;

import k3.product.ahs.dto.K3Product;
import k3.product.ahs.service.K3ProductService;

@Controller
@RequestMapping(value="/team03/goodsManagement/product")
public class K3ProductController {
	
	
	private static final Logger log = LoggerFactory.getLogger(K3ProductController.class);

	
	private final K3ProductService k3ProductService;
	
	public K3ProductController(K3ProductService k3ProductService) {
		this.k3ProductService = k3ProductService;
	}
	//<모달> - 상품정보리스트
	@PostMapping("/getModalProductList")
	@ResponseBody
	public List<K3Product> k3GetModalProductList() {
		List<K3Product> productList = k3ProductService.k3GetModalProductList();
		return productList;
	}
	
	//상품 수정 처리
	@PostMapping("/k3ModifyProduct")
	public String k3ModifyProduct(K3Product k3Product) {
		
		int result = k3ProductService.k3ModifyProduct(k3Product);
		
		return "redirect:/team03/goodsManagement/product/k3ProductList";
	}
	
	//상품 수정폼 이동
	@GetMapping("/k3ModifyProduct")
	public String k3ModifyProduct(@RequestParam(value="productCode", required = false) String productCode,
								  Model model) {
		List<K3Product> productInfo = k3ProductService.K3GetProductInfo(productCode);
		model.addAttribute("title", "상품관리");
		model.addAttribute("title", "상품수정");
		model.addAttribute("productInfo", productInfo);
		return "team03/goodsManagement/product/k3ModifyProduct";
	}
	
	//상품 등록 처리
	@PostMapping("/k3AddProduct")
	public String k3AddProduct(K3Product k3Product) {
		log.info("product 컨트롤러 --- 상품등록처리 k3Product {}",k3Product);
		int result = k3ProductService.k3AddProduct(k3Product);
		log.info("product 컨트롤러 --- 상품등록처리 결과 result {}",result);	
		return "redirect:/team03/goodsManagement/product/k3ProductList";
	}
	
	//상품 등록폼 이동
	@GetMapping("/k3AddProduct")
	public String k3AddProduct() {
		
		return "team03/goodsManagement/product/k3AddProduct";
	}
	
	//상품 조회 처리
	@PostMapping("/k3ProductList")
	public String k3GetProductList(@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage,
								   @RequestParam(value="searchType", required = false) String searchType,
								   @RequestParam(value="productKey", required = false) String productKey,
								   @RequestParam(value="productValue", required = false) String productValue,
								   @RequestParam(value="categoryKey", required = false) String categoryKey,
								   @RequestParam(value="categoryValue", required = false) String categoryValue,
								   Model model) {
		//productList.html에서 받아온 검색 조건과 검색값 map에 담기
		Map<String, Object> searchCondition = new HashMap<String, Object>();
		searchCondition.put("searchType", searchType);
		searchCondition.put("productKey", productKey);
		searchCondition.put("productValue", productValue);
		searchCondition.put("categoryKey", categoryKey);
		searchCondition.put("categoryValue", categoryValue);
		
		//현재페이지와 map 값을 전달해 검색 조건에 따른 결과값 리턴받기
		Map<String, Object> productListMap = k3ProductService.k3GetProductSearchList(currentPage, searchCondition);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("productList", productListMap.get("productList"));
		model.addAttribute("lastPage", productListMap.get("lastPage"));
		model.addAttribute("productStartPageNum", productListMap.get("startPageNum"));
		model.addAttribute("productCheckEndPageNum", productListMap.get("endPageNum"));
		
		return "team03/goodsManagement/product/k3ProductList";
	}
	
	//상품 현황(초기화면)
	@GetMapping("/k3ProductList")
	public String k3GetProductList(@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage, 
								   Model model) {
		//현재페이지를 전달해 상품리스트 받아오기
		Map<String, Object> productListMap = k3ProductService.k3GetProductList(currentPage);
		log.info("상품 컨트롤러 - 상품현황 ------->>>>>>>>>>>{}", productListMap);
		model.addAttribute("title", "상품관리");
		model.addAttribute("subtutle", "상품현황");
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("productList", productListMap.get("productList"));
		model.addAttribute("lastPage", productListMap.get("lastPage"));
		model.addAttribute("productStartPageNum", productListMap.get("startPageNum"));
		model.addAttribute("productCheckEndPageNum", productListMap.get("endPageNum"));
		
		return "team03/goodsManagement/product/k3ProductList";
	}
}
