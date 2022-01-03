package k3.retiredmemberuser.ahs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import k3.retiredmemberuser.ahs.dto.K3RetiredMemberUser;
import k3.retiredmemberuser.ahs.mapper.K3RetiredMemberUserMapper;

@Service
public class K3RetiredMemberUserService {
	
	private K3RetiredMemberUserMapper retiredmemberuserMapper;
	
	public K3RetiredMemberUserService(K3RetiredMemberUserMapper retiredmemberuserMapper) {
		this.retiredmemberuserMapper = retiredmemberuserMapper;
	}
	
	
	  //퇴사회원등록처리 
	  public int AddRetiredMemberUser(K3RetiredMemberUser k3RetiredMemberUser) { 
		  int result = retiredmemberuserMapper.AddRetiredMemberUser(k3RetiredMemberUser); 
		  
		  return result; 
	  }
	  //퇴사회원 현황(초기화면) 
	  public List<K3RetiredMemberUser> getRetiredMemberUserList(){
	  List<K3RetiredMemberUser> retiredmemberuserList =retiredmemberuserMapper.getRetiredMemberUserList(); 
	  return retiredmemberuserList; 
	  }
	 
}
