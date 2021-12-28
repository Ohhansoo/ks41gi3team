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
	
	public int addCheck(K3Checkpoint k3Checkpoint) {
		int result = k3CheckpointMapper.addCheck(k3Checkpoint);
		return result;
	}
	
	public List<K3Checkpoint> getCheckpointList(){
		List<K3Checkpoint> checkpointList = k3CheckpointMapper.getCheckpointList();
		return checkpointList;
	}
}
