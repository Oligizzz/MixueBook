package com.oligizzz.mixueadmin.config;

import com.oligizzz.mixueadmin.web.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: GNMD
 * @Description:
 * @Date: 2021/6/26
 * @Modify By:
 */
public class MyWebMvcConfiguration implements WebMvcConfigurer {

//    @Bean
//    public LoginInterceptor loginInterceptor(){
//        return new LoginInterceptor();
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(loginInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html");
//
//    }
}
