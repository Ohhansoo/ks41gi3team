package k3.checkpoint.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import k3.checkpoint.ahs.dto.K3Checkpoint;
import k3.checkpoint.ahs.mapper.K3CheckpointMapper;

@Service
@Transactional
public class K3CheckpointService {
	
	private K3CheckpointMapper k3CheckpointMapper;
	
	public K3CheckpointService(K3CheckpointMapper k3CheckpointMapper) {
		this.k3CheckpointMapper = k3CheckpointMapper;
	}
	
	//현황
	public List<K3Checkpoint> getCheckpointList(){
		List<K3Checkpoint> checkpointList = k3CheckpointMapper.getCheckpointList();
		return checkpointList;
	}
	
	//등록
	public Integer addCheck(K3Checkpoint k3Checkpoint) {
		Integer result = k3CheckpointMapper.addCheck(k3Checkpoint);
		return result;
	}
	
	//수정
	public K3Checkpoint getModifyCheckpoint(String vehicleCheckpointCode) {
		return k3CheckpointMapper.getModifyCheckpoint(vehicleCheckpointCode);
	}
	
}
