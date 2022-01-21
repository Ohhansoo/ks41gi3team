package k3.retiredmemberuser.ahs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	  
	  //퇴사직원 검색
	  public List<K3RetiredMemberUser> k3GetRetiredMemberUserSearch(Map<String, Object> searchCondition){
		  List<K3RetiredMemberUser> retiredmemberuserList = retiredmemberuserMapper.k3GetRetiredMemberUserSearch(searchCondition);
		  
		  return retiredmemberuserList;
	  }
}
