package com.example.HelloWorldWeb.filters;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@WebFilter
@Slf4j
public class LogFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    throws IOException, ServletException {

    log.info("Filter Invoked");

    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    String browserType = httpServletRequest.getHeader("user-agent");

//    if(browserType.contains("Chrome")) {
//      chain.doFilter(request, response);
//    } else {
//      throw new SecurityException();
//    }

//    Enumeration<String> attributeNames = request.getAttributeNames();
//    Collections.list(attributeNames).forEach(a -> System.out.println(a));

//    chain.doFilter(request, response);
  }

  @Bean
  public FilterRegistrationBean<LogFilter> loggingFilter() {
    FilterRegistrationBean<LogFilter> registrationBean
      = new FilterRegistrationBean<>();

    registrationBean.setFilter(new LogFilter());
    registrationBean.addUrlPatterns("/hello");

    return registrationBean;
  }
}
