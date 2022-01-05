package k3.retiredmemberuser.ahs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import k3.retiredmemberuser.ahs.dto.K3RetiredMemberUser;

@Mapper
public interface K3RetiredMemberUserMapper {
	
	//퇴사회원 등록
	public int AddRetiredMemberUser(K3RetiredMemberUser k3RetiredMemberUser);
	
	//퇴사회원 현황(초기화면)
	public List<K3RetiredMemberUser> getRetiredMemberUserList();

}
