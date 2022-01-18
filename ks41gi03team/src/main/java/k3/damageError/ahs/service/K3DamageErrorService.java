package k3.damageError.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.damageError.ahs.dto.K3DamageError;
import k3.damageError.ahs.mapper.K3DamageErrorMapper;



@Service
public class K3DamageErrorService {
	/**
	 * 의존성 추가 생성자 메서드
	 */
	private final K3DamageErrorMapper k3DamageErrorMapper;	
	public K3DamageErrorService(K3DamageErrorMapper k3DamageErrorMapper) {
		this.k3DamageErrorMapper = k3DamageErrorMapper;
	}
	
	/**
	 * AS대기현황
	 */
	//AS입고현황
	public List<K3DamageError> k3DamageErrorListIn(K3DamageError K3DamageErrorIn){
		List<K3DamageError> k3DamageErrorInList = k3DamageErrorMapper.k3DamageErrorListIn(K3DamageErrorIn);
		System.out.println("service---------->>>"+k3DamageErrorInList);
		return k3DamageErrorInList;	
	}
	//AS출고현황
	public List<K3DamageError> k3DamageErrorListOut(K3DamageError k3DamageErrorOut){
		List<K3DamageError> k3DamageErrorOutList = k3DamageErrorMapper.k3DamageErrorListOut(k3DamageErrorOut);
			System.out.println("service---------->>>"+k3DamageErrorOutList);
		return k3DamageErrorOutList;	
	}
}
