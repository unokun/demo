package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.GenericFilterBean;

import com.example.demo.filter.AccessControl;
import com.example.demo.filter.IpFilter;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<GenericFilterBean> ipFilter() {
        // FilterをnewしてFilterRegistrationBeanのコンストラクタに渡す
        FilterRegistrationBean<GenericFilterBean> bean = new FilterRegistrationBean<>();
        bean.setFilter(new IpFilter());
        // Filterのurl-patternを指定（可変長引数なので複数指定可能）
        bean.addUrlPatterns("/*");
        // Filterの実行順序。整数値の照準に実行される
        bean.setOrder(Integer.MIN_VALUE);
        return bean;
    }

    @Bean
    public AccessControl accessControl() {
    	return new AccessControl();
    }
}
