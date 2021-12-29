package k3.label.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/team03/goodsManagement/label")
public class K3LabelController {
	
	//라벨 현황 이동
	@GetMapping("/k3LabelList")
	public String k3GetLabelList() {
		
		return "team03/goodsManagement/label/k3LabelList";
	}
	//라벨 등록폼 이동
	@GetMapping("/k3AddLabel")
	public String k3AddLabel(){
		
		return "team03/goodsManagement/label/k3AddLabel";
	}
}
