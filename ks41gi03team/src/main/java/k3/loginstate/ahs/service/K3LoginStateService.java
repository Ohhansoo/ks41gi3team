package k3.loginstate.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.loginstate.ahs.dto.K3LoginState;
import k3.loginstate.ahs.mapper.K3LoginStateMapper;

@Service
public class K3LoginStateService {
	
	private K3LoginStateMapper loginstateMapper;
	
	public K3LoginStateService(K3LoginStateMapper loginstateMapper) {
		this.loginstateMapper = loginstateMapper;
	}
	//로그인 현황(초기화면)
	public List<K3LoginState> getLoginStateList(){
		List<K3LoginState> loginstateList = loginstateMapper.getLoginStateList();
			return loginstateList;
	}

}

