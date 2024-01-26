package com.min.edu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class LoggerFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		
		String url = StringUtils.defaultIfEmpty(req.getRequestURL().toString(), "-");
		String queryString = StringUtils.defaultIfEmpty(req.getQueryString(), "-");
		String remoteAddr = StringUtils.defaultIfEmpty(req.getRemoteAddr(), "-"); // client 실제 IP 주소
		
		String userAgent =  StringUtils.defaultIfEmpty(req.getHeader("User-Agent"), "-"); // 접속정보
		String referer = StringUtils.defaultIfEmpty(req.getHeader("Referer"), "-"); // 이전페이지
		
		String log = String.format("%s ? %s : %s \n %s %s \n", url, queryString, remoteAddr, userAgent, referer);
		
		LoggerFilter.log.info(log);
		
		chain.doFilter(request, response);
	}

}
