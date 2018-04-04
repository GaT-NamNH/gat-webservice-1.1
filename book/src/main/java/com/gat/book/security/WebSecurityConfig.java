package com.gat.book.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * WebSecurityConfig class
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/**").permitAll()
                .anyRequest().authenticated();
                //.and()
                // Filter Ordering: http://docs.spring.io/spring-security/site/docs/3.0.x/reference/security-filter-chain.html item-7.3
                // And filter other requests to check the presence of JWT in header
                //.addFilterBefore(new JWTAuthenticationFilter(getApplicationContext()), UsernamePasswordAuthenticationFilter.class);
    }

}