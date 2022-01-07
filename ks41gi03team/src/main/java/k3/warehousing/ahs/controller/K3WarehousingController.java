package k3.warehousing.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.contract.ahs.dto.K3Contract;
import k3.warehousing.ahs.dto.K3Warehousing;
import k3.warehousing.ahs.dto.K3WarehousingSort;
import k3.warehousing.ahs.service.K3WarehousingService;

@Controller
@RequestMapping(value="/team03/goodsManagement/warehousing")
public class K3WarehousingController {
	
	
	private static final Logger log = LoggerFactory.getLogger(K3WarehousingController.class);

	private K3WarehousingService k3WarehousingService;
	
	public K3WarehousingController(K3WarehousingService k3WarehousingService) {
		this.k3WarehousingService = k3WarehousingService;
	}
	
	//입고 승인폼 이동
	@GetMapping("/k3AllowWarehousing")
	public String k3AllowWarehousing(Model model){
		List<K3Warehousing> K3RequestAllow = k3WarehousingService.k3RequestAllowWarehousing();
		log.info("입고요청 승인 이동 컨트롤러 K3RequestAllow ------ " + K3RequestAllow);
		model.addAttribute("title", "입고관리");
		model.addAttribute("subtitle", "입고승인");
		model.addAttribute("K3RequestAllow", K3RequestAllow);
		return "team03/goodsManagement/warehousing/k3AllowWarehousing";
	}
	
	//입고분류 등록폼 이동
	@GetMapping("/k3AddSort")
	public String k3AddWarehousingSort() {
		
		return "team03/goodsManagement/warehousing/k3AddSort";
	}
	//입고 요청 등록 처리
	@PostMapping("/k3AddWarehousing")
	public String k3AddWarehousing(K3Warehousing k3Warehousing) {
		log.info("입고요청 처리 컨트롤러 값받아오기 : k3Warehousing ------ " + k3Warehousing);
		int result = k3WarehousingService.k3AddWarehousing(k3Warehousing);
		log.info("입고요청 처리 컨트롤러 결과: result ------ " + result);
		return "redirect:/team03/goodsManagement/warehousing/k3WarehousingList";
	}
	
	//입고 요청폼 이동
	@GetMapping("/k3AddWarehousing")
	public String k3AddWarehousing(Model model) {
		List<K3Contract> nameList = k3WarehousingService.k3FindContractorNameByCode();
		model.addAttribute("nameList", nameList);
		return "team03/goodsManagement/warehousing/k3AddWarehousing";
	}

	
	//입고분류 현황이동
	@GetMapping("/k3SortList")
	public String k3GetWarehousingSortList(Model model) {
		List<K3WarehousingSort> sortList = k3WarehousingService.k3GetWarehousingSortList();
		List<K3WarehousingSort> requestSort = k3WarehousingService.k3GetWarehousingRequestSort();
		log.info("입고 분류이동 컨트롤러 sortList ------ " + sortList);
		log.info("입고 분류이동 컨트롤러 requestSort------ " + requestSort);
		model.addAttribute("title", "입고관리");
		model.addAttribute("subtitle", "입고분류현황");
		model.addAttribute("sortList", sortList);	
		model.addAttribute("requestSort", requestSort);	
		return "team03/goodsManagement/warehousing/k3SortList";
	}
	//입고 현황이동
	@GetMapping("/k3WarehousingList")
	public String k3GetWarehousingList(Model model) {
		List<K3Warehousing> K3LaydownCheck = k3WarehousingService.k3GetWarehousingList();
		log.info("입고 현황이동 컨트롤러 K3LaydownCheck------ " + K3LaydownCheck);
		model.addAttribute("title", "입고관리");
		model.addAttribute("subtitle", "입고현황");
		model.addAttribute("K3LaydownCheck", K3LaydownCheck);
		
		return "team03/goodsManagement/warehousing/k3WarehousingList";
	}
}
