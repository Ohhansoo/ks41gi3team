package k3.login.ahs.interceptor;

import java.util.Set;
import java.util.StringJoiner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class CommonInterceptor implements HandlerInterceptor{
	
	private static final Logger log = LoggerFactory.getLogger(CommonInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception{
		Set<String> paramKeySet = request.getParameterMap().keySet();
		
		StringJoiner param = new StringJoiner(",");
		
		for(String key : paramKeySet) {
			param.add(key + "=" + request.getParameter(key));
		}
		
		request.getParameter("memberId");
		
		log.info("CommonInterceptor =======================================Start");
		log.info("Access Info ==============================================Start");
		log.info("SEVERNAME =============================================Start");
		log.info("HTTP METHOD ===========================================Start");
		log.info("URI ====================================================Start");
		log.info("PARAMETER =============================================Start");
		log.info("CommonInterceptor =======================================Start");
		log.info("Access Info ======= =======================================end");
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
						ModelAndView modelAndView) throws Exception{
//		log.info("CommonInterceptor =======================================Start");
		
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			 throws Exception{
		//log.info("CommonInterceptor =======================================Start");
		
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
}
