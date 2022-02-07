package k3.release.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import k3.release.ahs.dto.K3Release;
import k3.release.ahs.service.K3ShipmentCheckService;
import k3.stock.ahs.service.K3StockService;


@Controller
@RequestMapping(value="/team03/goodsManagement/release")
public class K3ShipmentCheckController {

	
	private static final Logger log = LoggerFactory.getLogger(K3ShipmentCheckController.class);

	private final K3ShipmentCheckService k3ShipmentCheckService;
	private final K3StockService k3StockService;

	public K3ShipmentCheckController(K3ShipmentCheckService k3ShipmentCheckService, K3StockService k3StockService) {
		this.k3ShipmentCheckService = k3ShipmentCheckService;
		this.k3StockService = k3StockService;
	}
	
	//출하검수 삭제처리
	@PostMapping("/k3DeleteShipment")
	@ResponseBody
	public int k3DeleteShipment(@RequestParam(value="deleteList[]", required = false) List<String> deleteList) {
		int result = k3ShipmentCheckService.k3DeleteShipment(deleteList);
		log.info("DeleteCategory 전송결과 : " + result);
		return result;
	}
	 //출하검수 수정처리
	 @PostMapping("/k3ModifyShipmentCheck")
	 public String K3ModifyShipmentCheck(@RequestParam(value="modifyGoodsCount", required=false)int modifyGoodsCount,
			 							 @RequestParam(value="stockCode", required=false)String stockCode,
			 							 K3Release k3Release){
		 log.info("K3CheckController/ 출하검수 수정처리 전----->>>>>>>>>>{}", k3Release);
		 int modifyResult = k3ShipmentCheckService.k3AddShipmentCheck(k3Release, modifyGoodsCount);	
		 log.info("K3CheckController/ 출하검수 수정페이지 이동 처리결과----->>>>>>>>>>{}", modifyResult);
			if(modifyResult > 0) {
				String type = "modify";
				int releaseGoodCount = Integer.parseInt(k3Release.getReleaseGoodsCount());
				System.out.println(stockCode);
				k3StockService.k3SubtractStock(stockCode, type, modifyGoodsCount, releaseGoodCount);
			}

		 return "redirect:/team03/goodsManagement/release/k3ReleaseList";
	 }
	 
	 //출하검수 수정폼이동
	 @GetMapping("/k3ModifyShipmentCheck")
	 public String K3ModifyShipmentCheck(@RequestParam(value="releaseCode", required=false)String releaseCode, 
			 Model model){
		 log.info("K3CheckController/ 출하검수 수정페이지 이동 전----->>>>>>>>>>{}", releaseCode);
		 //수정 관련 정보 받아오기
		 String type = "modify";
		 List<K3Release> shipmentModifyList = k3ShipmentCheckService.k3GetShipmentCheckUpdateList(releaseCode, type);		
		 log.info("K3CheckController/ 출하검수 수정페이지 이동 처리결과----->>>>>>>>>>{}", shipmentModifyList);
		 model.addAttribute("title", "출고관리");
		 model.addAttribute("subtitle", "출하검수수정");
		 model.addAttribute("shipmentModifyList", shipmentModifyList);
		 return "team03/goodsManagement/release/k3ModifyShipmentCheck";
	 }
	
	//출하검수 등록처리
	@PostMapping("/k3AddShipmentCheck") 
	public String k3AddShipmentCheck(@RequestParam(value="modifyGoodsCount", required=false)int modifyGoodsCount,
									 @RequestParam(value="stockCode", required=false)String stockCode,
									 K3Release k3Release){
		log.info("K3ShipmentCheckController---- 출하검수 등록페이지 이동----->>>>>>>>>>", k3Release);
		int addResult = k3ShipmentCheckService.k3AddShipmentCheck(k3Release, modifyGoodsCount);
		if(addResult > 0) {
			String type = "add";
			int releaseGoodCount = Integer.parseInt(k3Release.getReleaseGoodsCount());
			k3StockService.k3SubtractStock(stockCode, type, modifyGoodsCount, releaseGoodCount);
		}
		return "redirect:/team03/goodsManagement/release/k3ShipmentCheckList"; 
	}
	
	//출하검수 등록폼 이동
	@GetMapping("/k3AddShipmentCheck")
	public String k3AddShipmentCheck(@RequestParam(value="releaseCode", required=false)String releaseCode,
									 Model model){
		log.info("K3ShipmentCheckController --- 출하검수 등록페이지 이동----->>>>>>>>>>{}", releaseCode);
		//등록 관련 정보 받아오기
		String type = "add";
		List<K3Release> shipmentCheck = k3ShipmentCheckService.k3GetShipmentCheckUpdateList(releaseCode, type);
		log.info("K3ShipmentCheckController 컨트롤러 --- 출하검수 이동 결과값 shipmentCheck --- >>>>> {}", shipmentCheck);
		model.addAttribute("title", "출고관리");
		model.addAttribute("subtitle", "출하검수 등록");
		model.addAttribute("shipmentCheck", shipmentCheck);
		return "team03/goodsManagement/release/k3AddShipmentCheck";
	}
	
	//출하검수 목록현황
	@GetMapping("/k3ShipmentCheckList")
	public String k3ShipmentCheckList(Model model){
		//출하현황
		List<K3Release> shipmentCheck = k3ShipmentCheckService.k3GetShipmentCheckList();
		log.info("K3ShipmentCheckController 컨트롤러 --- 출하현황 이동 결과값 shipmentCheck --- >>>>> {}", shipmentCheck);
		model.addAttribute("title", "출고관리");
		model.addAttribute("subtitle", "출하현황");
		model.addAttribute("shipmentCheck", shipmentCheck);
		return "team03/goodsManagement/release/k3ShipmentCheckList";
	}
	
	
}
