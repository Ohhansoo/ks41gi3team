package k3.location.ahs.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import k3.location.ahs.dto.K3Location;
import k3.location.ahs.service.K3LocationServise;


@Controller
@RequestMapping("/team03/spaceBusiness/location")
public class K3LocationController {
	/**
	 * 의존성주입 생성자 메소드
	 */
	private K3LocationServise k3LocationServise;
	public K3LocationController(K3LocationServise k3LocationServise) {
		this.k3LocationServise = k3LocationServise;
	}

	/**
	 * 로케이션코드 현황
	 */
	@GetMapping("/k3LocationList")
	public String k3LocationList(Model model) {
		List<K3Location> locationData = k3LocationServise.k3LocationList();
		model.addAttribute("locationData",locationData);
		return "team03/spaceBusiness/location/k3LocationList";
	}
	
	/**
	 * 로케이션 코드 등록
	 */
	//화면이동
	@GetMapping("/k3AddLocation")
	public String k3AddLocation(Model model) {
		model.addAttribute("title","로케이션 등록");
		return "team03/spaceBusiness/location/k3AddLocation";
	}
	// ajax로 받은값 입력처리  ajax에서 포워드	
	@PostMapping("/k3AddLocation")
	@ResponseBody
	public void k3AddLocation(@RequestBody List<K3Location> k3LocationList ,Model model) {
		 k3LocationServise.k3AddLocation(k3LocationList);
	}
	
	/**
	 * 로케이션 코드 수청저리
	 */
	@PostMapping("/k3ModifyLocation")
	public String k3ModifyLocation(K3Location k3Location) {
		k3LocationServise.k3ModifyLocationCodeInfo(k3Location);
		System.out.println("controller"+ k3Location);
		return "redirect:/team03/spaceBusiness/location/k3LocationList";
	}
	
	/**
	 * 로케이션 코드 수정을 위한 조회
	 */
	@GetMapping("/k3ModifyLocation")
	public String k3ModifyLocation(@RequestParam(value="locationCode" ,required = false )String locationCode, Model model) {
		K3Location k3Location = k3LocationServise.getK3ModifyLocationInfoByLocationCode(locationCode);
		model.addAttribute("title","로케이션 수정");
		model.addAttribute("k3Location",k3Location);
		return "team03/spaceBusiness/location/k3ModifyLocation";
	}
	/**
	 * 로케이션 코드 삭제처리
	 */
	@PostMapping("/k3LocationList")
	public String k3DeleteLocation(HttpServletRequest request) {
		
		String[] ajaxMsg = request.getParameterValues("valueArr");
		int size = ajaxMsg.length;
		for(int i = 0; i < size; i++) {
			System.out.println("controller-------------size" +size);
			k3LocationServise.deleteLocationCode(ajaxMsg[i]);
			System.out.println("controller-------------ajaxMsg[i]" +ajaxMsg[i]);
		}
		return "redirect:/team03/spaceBusiness/location/k3LocationList";
	}
}
