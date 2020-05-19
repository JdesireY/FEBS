package com.mrbird.febs.register.configure;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@EnableWebSecurity
public class FebsRegisterWebSecurityConfigure extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //该配置类用于开启Eureka服务端端点保护。
       // http.csrf().ignoringAntMatchers("/eureka/**");
        http.csrf().ignoringAntMatchers("/eureka/**");
       // http.csrf().disable();
        super.configure(http);
    }
}
