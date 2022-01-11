package k3.loginstate.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.loginstate.ahs.dto.K3LoginState;

@Mapper
public interface K3LoginStateMapper {
	
	//01 로그인현황 조회 (초기화면)
	public List<K3LoginState> getLoginStateList();

}
