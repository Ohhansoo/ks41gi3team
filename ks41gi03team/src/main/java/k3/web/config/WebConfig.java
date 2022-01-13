package k3.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import k3.login.ahs.interceptor.CommonInterceptor;
import k3.login.ahs.interceptor.LoginInterceptor;


@Configuration
public class WebConfig implements WebMvcConfigurer{
		
		private final CommonInterceptor commonInterceptor;
		private final LoginInterceptor loginInterceptor;
	
		public WebConfig(CommonInterceptor commonInterceptor, LoginInterceptor loginInterceptor) {
			this.commonInterceptor = commonInterceptor;
			this.loginInterceptor = loginInterceptor;
		}
	
		@Override
		public void addInterceptors(InterceptorRegistry registry) {
			
			registry.addInterceptor(commonInterceptor)
					.addPathPatterns("/**")
					.excludePathPatterns("/adminLTE/**")
					.excludePathPatterns("/css/**")
					.excludePathPatterns("/image/**")
					.excludePathPatterns("/js/**")
					.excludePathPatterns("/favicon.ico");
			
//			registry.addInterceptor(loginInterceptor)
//						.addPathPatterns("/**")
//						.excludePathPatterns("/adminLTE/**")
//						.excludePathPatterns("/css/**")
//						.excludePathPatterns("/image/**")
//						.excludePathPatterns("/js/**")
//						.excludePathPatterns("/favicon.ico")
//						.excludePathPatterns("/k3AddMemberUserList")
//						.excludePathPatterns("/team03/ourcompany/k3AddOurCompanyList")
//						.excludePathPatterns("/team03/retiredmemberuser/k3AddRetiredMemberUserList")
//						.excludePathPatterns("/team03/loginstate/k3AddMemberUserLoginState");
//			
			
			
			WebMvcConfigurer.super.addInterceptors(registry);
		}
}
