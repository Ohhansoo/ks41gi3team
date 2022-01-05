package k3.location.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k3.location.ahs.dto.K3Location;
import k3.location.ahs.service.K3LocationServise;


@Controller
@RequestMapping("/team03/spaceBusiness/location")
public class K3LocationController {
	
	private K3LocationServise k3LocationServise;
	public K3LocationController(K3LocationServise k3LocationServise) {
		this.k3LocationServise = k3LocationServise;
	}
	@GetMapping("/k3LocationList")
	public String k3LocationList() {
		return "team03/spaceBusiness/location/k3LocationList";
	}

	@GetMapping("/k3AddLocation")
	public String k3AddLocation(Model model) {
		
		//db select model 키 값 
		//model.addAttribute("LocationCode", LocationCode);

		return "team03/spaceBusiness/location/k3AddLocation";
	}

	@PostMapping("/k3AddLocation")
	public String k3AddLocation(@RequestParam(value = "centerCode", required = false) String centerCode,
								@RequestParam(value = "brandCode", required = false) String brandCode,
								@RequestParam(value = "lineCode", required = false) String lineCode,
								@RequestParam(value = "rackCode", required = false) String rackCode,
								@RequestParam(value = "cellCode", required = false) String cellCode, K3Location k3Location) {
		
		String allCode = "";
		String[] centerCodeList = centerCode.split(",");
		String[] brandeCodeList = brandCode.split(",");
		String[] lineCodeList = lineCode.split(",");
		String[] rackCodeList = rackCode.split(",");
		String[] cellCodeList = cellCode.split(",");
			
			for (int i = 0; i < centerCodeList.length; i++) {
				for (int j = 0; j < brandeCodeList.length; j++) {
					for (int k = 0; k < lineCodeList.length; k++) {
						for (int l = 0; l < rackCodeList.length; l++) {
							for (int g = 0; g < cellCodeList.length; g++) {
									allCode = centerCodeList[i] + "-" + brandeCodeList[j] + "-" + lineCodeList[k] + "-"
											  + rackCodeList[l] + "-" + cellCodeList[g];
									 		k3LocationServise.k3AddLocation(allCode);
							}
						}
					}
				}
			}	
		return "redirect:/team03/spaceBusiness/location/k3LocationList";
	}
	
	@GetMapping("/k3ModifyLocation")
	public String k3ModifyLocation() {
		return "team03/spaceBusiness/location/k3ModifyLocation";
	}

	@GetMapping("k3DeleteLocation")
	public String k3DeleteLocation() {
		return "team03/spaceBusiness/location/k3DeleteLocation";
	}
}
