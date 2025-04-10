package com.projetopratico.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<AuthTokenFilter> authTokenFilter() {
        FilterRegistrationBean<AuthTokenFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new AuthTokenFilter());

        // Exclude specific paths
        registrationBean.addUrlPatterns("/*");
        registrationBean.setUrlPatterns(Arrays.asList("/*"));
        registrationBean.addInitParameter("excludePaths", "/auth,/refresh");

        return registrationBean;
    }
}
