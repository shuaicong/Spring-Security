package com.imooc.web.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.imooc.web.filter.TimeFilter;
import com.imooc.web.interceptor.Timeinterceptor;

/**
 * 
 * @描述: 
 * @作者: alter
 * @时间：2017年11月26日 下午3:18:15
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
	@Autowired
	private Timeinterceptor timeinterceptor;
	
	@Override
	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		//configurer.registerCallableInterceptors(interceptors)
		super.configureAsyncSupport(configurer);
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//registry.addInterceptor(timeinterceptor);
	}

//	@Bean
	public FilterRegistrationBean timeFilter() {
		FilterRegistrationBean registrationBean  = new FilterRegistrationBean();
		TimeFilter timeFilter = new TimeFilter();
		registrationBean.setFilter(timeFilter);
		List<String> urls = new ArrayList<>();
		urls.add("/*");
		registrationBean.setUrlPatterns(urls);
		return registrationBean;
	}
}
