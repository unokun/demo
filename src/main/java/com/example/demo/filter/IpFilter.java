package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.filter.OncePerRequestFilter;

public class IpFilter extends OncePerRequestFilter {
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// 前処理
	    WebApplicationContext webApplicationContext =
	            WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
	    AccessControl accessControl = (AccessControl)webApplicationContext.getBean("accessControl");
		String ip = request.getRemoteAddr();
		if (!accessControl.isAccessible(ip)) {
			// アクセス禁止
			response.setStatus(HttpServletResponse.SC_FORBIDDEN);
			return;
		}

		filterChain.doFilter(request, response);
	}

}
