package k3.checkpoint.ahs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import k3.checkpoint.ahs.dto.K3Checkpoint;
import k3.checkpoint.ahs.service.K3CheckpointService;

@Controller
@RequestMapping(value="/team03")
public class K3CheckpointController {
	
	private K3CheckpointService k3CheckpointService;
	
	public K3CheckpointController(K3CheckpointService k3CheckpointService) {
		this.k3CheckpointService = k3CheckpointService;
	}
	
	@PostMapping("/delivery/k3AddCheckpoint")
	public String addCheck(K3Checkpoint k3Checkpoint) {
		
		System.out.println("K3CheckpointController 회원등록 화면에서 입력받은 값: " + k3Checkpoint);

		
		String vehicleCheckpointCode = k3Checkpoint.getVehicleCheckpointCode();
		if(vehicleCheckpointCode != null && !"".equals(vehicleCheckpointCode)) {
			k3CheckpointService.addCheck(k3Checkpoint);
		}
		return "redirect:/team03/delivery/k3CheckpointList";
	}
	
	@GetMapping("/delivery/k3AddCheckpoint")
	public String addCheck(Model model) {
		return "team03/delivery/k3AddCheckpoint";
	}

	@GetMapping("/delivery/k3CheckpointList")
	public String getCheckpointList(Model model) {
		List<K3Checkpoint> checkpointList = k3CheckpointService.getCheckpointList();
		model.addAttribute("checkpointList", checkpointList);
		
		return "team03/delivery/k3CheckpointList";
	}
}