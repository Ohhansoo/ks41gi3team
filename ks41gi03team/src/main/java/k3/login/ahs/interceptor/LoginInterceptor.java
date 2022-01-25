package k3.login.ahs.interceptor;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception{
		
		HttpSession session = request.getSession();
		String requestUri = request.getRequestURI();
		
		String sessionId = (String) session.getAttribute("SID");
		String sessionLevel = (String) session.getAttribute("SLEVEL");
		System.out.println("01 220112 sessionLevel"+  sessionLevel);
		
		if(sessionId == null) {
			response.sendRedirect("/team03/companymanagement/login/k3MemberUserLogin");
			
			return false;
		}else {
			requestUri = requestUri.trim();
			
		//ST
		//조회만 가능 
		if("ST".equals(sessionLevel)) {
			if(requestUri.indexOf("k3MemberUserList") > -1 ||
					requestUri.indexOf("k3OurCompanyList") > -1 ||
					requestUri.indexOf("k3RetiredMemberUserList") > -1) {
				
				response.sendRedirect("/");
				return false;
			}
		}
		
		//CT	거래처
		if("CT".equals(sessionLevel)) {
			if(requestUri.indexOf("k3SearchContractor") > -1 ||
					requestUri.indexOf("k3SearchContract") > -1 ||
					requestUri.indexOf("k3SearchEstimate") > -1) {
					
					response.sendRedirect("/");
					return false;
			}
		}
		return true;
		
	}
}
}

