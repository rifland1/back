package com.tuto.security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Rifland on 30/10/2019.
 */
@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Autowired
    AuthenticationInterceptor  interceptor;

    @Override
    public void addInterceptors (InterceptorRegistry interceptorRegistry) {

        System.out.println("this method will get invoked by container while deployment");
        System.out.println("value of interceptor is "+interceptor);
        //adding custom interceptor
        interceptorRegistry.addInterceptor(interceptor).addPathPatterns("/api/admin/users");
    }
}
