package k3.damageError.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.damageError.ahs.dto.K3DamageError;


@Mapper
public interface K3DamageErrorMapper {
	
	/**
	 * 입출고 AS현황
	 */
	//AS입고대기현황
	public List<K3DamageError> k3DamageErrorListIn(K3DamageError K3DamageErrorIn);
	//AS촐고대기현황
	public List<K3DamageError> k3DamageErrorListOut(K3DamageError K3DamageErrorOut);
	
	public int k3InAddDamageError(K3DamageError k3DamageError);
}
