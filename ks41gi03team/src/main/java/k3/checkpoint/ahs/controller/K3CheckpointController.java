package k3.checkpoint.ahs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k3.checkpoint.ahs.dto.K3Checkpoint;
import k3.checkpoint.ahs.service.K3CheckpointService;

@Controller
@RequestMapping(value="/team03/delivery/checkpoint")
public class K3CheckpointController {
	
	private static final Logger log = LoggerFactory.getLogger(K3CheckpointController.class);
	
	private K3CheckpointService k3CheckpointService;
	
	public K3CheckpointController(K3CheckpointService k3CheckpointService) {
		this.k3CheckpointService = k3CheckpointService;
	}
	
	//현황
	@GetMapping("/k3CheckpointList")
	public String getCheckpointList(Model model) {
		List<K3Checkpoint> checkpointList = k3CheckpointService.getCheckpointList();
		model.addAttribute("checkpointList", checkpointList);
		
		return "team03/delivery/checkpoint/k3CheckpointList";
	}
	
	//삭제
	@PostMapping("/k3DeleteCheckpoint")
	public String k3DeleteCheckpoint(@RequestParam(value="deleteList[]", required = false) List<String> deleteList) {
		Integer result = k3CheckpointService.k3DeleteCheckpoint(deleteList);
		log.info("DeleteCheckpoint 전송결과 : " + result);
		return "redirect:/team03/delivery/checkpoint/k3CheckpointList";
	}
	
	//등록 화면
	@GetMapping("/k3AddCheckpoint")
	public String chekcpointCheck(Model model) {
		model.addAttribute("title", "입출차 차량 기록 등록");
		return "team03/delivery/checkpoint/k3AddCheckpoint";
	}
	
	//등록 진행
	@PostMapping("/k3AddCheckpoint")
	public String addCheck(K3Checkpoint k3Checkpoint) {
		
		Integer result = k3CheckpointService.addCheck(k3Checkpoint);
		log.info("AddCheck" + result);
		return "redirect:/team03/delivery/checkpoint/k3CheckpointList";
	}
	
	//수정 화면
	@GetMapping("/k3ModifyCheckpoint")
	public String k3ModifyCheckpoint(@RequestParam(value="vehicleCheckpointCode", required = false) String vehicleCheckpointCode, Model model) {
		
		log.info("k3ModifyCheckpoint vehicleCheckpointCode:{}", vehicleCheckpointCode);
		
		if(vehicleCheckpointCode != null && !"".equals(vehicleCheckpointCode)) {
			K3Checkpoint checkpointInfo = k3CheckpointService.getModifyCheckpoint(vehicleCheckpointCode);
			model.addAttribute("checkpointInfo", checkpointInfo);
		}
		model.addAttribute("title", "입출하수정화면");
		
		return "team03/delivery/checkpoint/k3ModifyCheckpoint";
	}
	
	//수정 진행
	@PostMapping("/k3ModifyCheckpoint")
	public String modifyCheckpoint(K3Checkpoint k3Checkpoint) {
		
		k3CheckpointService.modifyCheckpoint(k3Checkpoint);
		
		return "redirect:/team03/delivery/checkpoint/k3CheckpointList";
	}
	
	
}