package k3.retiredmemberuser.ahs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import k3.retiredmemberuser.ahs.dto.K3RetiredMemberUser;

@Mapper
public interface K3RetiredMemberUserMapper {
	
	//퇴사회원 등록
	public int AddRetiredMemberUser(K3RetiredMemberUser k3RetiredMemberUser);
	
	//퇴사회원 현황(초기화면)
	public List<K3RetiredMemberUser> getRetiredMemberUserList();

	//퇴사직원 검색
	public List<K3RetiredMemberUser> k3GetRetiredMemberUserSearch(Map<String, Object> searchCondition);
}
