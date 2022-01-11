package k3.checkpoint.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.checkpoint.ahs.dto.K3Checkpoint;

@Mapper
public interface K3CheckpointMapper {
	
	//현황
	public List<K3Checkpoint> getCheckpointList();
	
	//등록
	public Integer addCheck(K3Checkpoint k3Checkpoint);
	
	//수정
	public K3Checkpoint getModifyCheckpoint(String vehicleCheckpointCode);
	
	//수정 진행
	public Integer modifyCheckpoint(K3Checkpoint k3Checkpoint);
	
	//삭제
	public Integer k3DeleteCheckpoint(List<String> deleteList);
}
