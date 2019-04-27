package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/user/home").setViewName("/user/home");
        registry.addViewController("/user/").setViewName("/user/home");
        registry.addViewController("/user/hello").setViewName("/user/hello");

        registry.addViewController("/admin/home").setViewName("/admin/home");
        registry.addViewController("/admin/").setViewName("/admin/home");
        registry.addViewController("/admin/hello").setViewName("/admin/hello");

    }
}
