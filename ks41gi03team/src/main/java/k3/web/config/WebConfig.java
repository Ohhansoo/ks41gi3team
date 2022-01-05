package k3.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import k3.interceptor.CommonInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{
		
		private final CommonInterceptor commonInterceptor;
	
		public WebConfig(CommonInterceptor commonInterceptor) {
			this.commonInterceptor = commonInterceptor;
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
			
			WebMvcConfigurer.super.addInterceptors(registry);
		}
}
