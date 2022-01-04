package k3.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		String requestUri = request.getRequestURI();
		
		String sessionId = (String) session.getAttribute("SID");
		String sessionLevel = (String) session.getAttribute("SLEVEL");
		
		if(sessionId == null) {
			response.sendRedirect("/login");
			
			return false;
		}else {
			requestUri = requestUri.trim();
			
			//관리자 GM
			//memberList, modifyMember, deleteMember 
			if("GM".equals(sessionLevel)) {
				if(requestUri.indexOf("memberList") > -1 ||
				   requestUri.indexOf("Modifymember") > -1 ||
				   requestUri.indexOf("deletemember") > -1 ) {
					
					response.sendRedirect("/");
					return false;
				}
			}
			//팀장 TM
			if("TM".equals(sessionLevel)) {
				if(requestUri.indexOf("memberList") > -1 ||
				   requestUri.indexOf("Modifymember") > -1 ||
				   requestUri.indexOf("deletemember") > -1 ) {
					
					response.sendRedirect("/");
					return false;
			}
		}		
			//사원 ST
			if("ST".equals(sessionLevel)) {
				if(requestUri.indexOf("memberList") > -1 ||
						requestUri.indexOf("Modifymember") > -1 ||
						requestUri.indexOf("deletemember") > -1 ) {
					
					response.sendRedirect("/");
					return false;
				}
			}		
			//거래처 CT
			if("CT".equals(sessionLevel)) {
				if(requestUri.indexOf("memberList") > -1 ||
						requestUri.indexOf("Modifymember") > -1 ||
						requestUri.indexOf("deletemember") > -1 ) {
					
					response.sendRedirect("/");
					return false;
				}
			}		
	}
	return true;
	}
}
