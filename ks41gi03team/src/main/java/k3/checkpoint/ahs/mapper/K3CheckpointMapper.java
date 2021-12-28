package k3.checkpoint.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.checkpoint.ahs.dto.K3Checkpoint;

@Mapper
public interface K3CheckpointMapper {
	
	public List<K3Checkpoint> getCheckpointList();
	
	public int addCheck(K3Checkpoint k3Checkpoint);

}
