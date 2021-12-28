package k3.release.ahs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/team03/release")
public class K3ReleaseController {

		//출하 승인폼 이동
		@GetMapping("/k3AllowRelease")
		public String k3GetShipmentCheckList(){
			
			return "team03/release/k3AllowRelease";
		}
		//출고 등록폼 이동
		@GetMapping("/k3AddRelease")
		public String k3AddRelease() {
			
			return "team03/release/k3AddRelease";
		}
		//출고 현황이동
		@GetMapping("/k3ReleaseList")
		public String k3GetReleaseList() {
			
			return "team03/release/k3ReleaseList";
		}
}
