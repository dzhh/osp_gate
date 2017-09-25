package com.osp.gate.secruity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;


/**
 * 
 * @author fly
 *
 */
@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)//开启security注解
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
    
	@Override
    protected void configure(HttpSecurity http) throws Exception {
	    http.formLogin().loginPage("/login").defaultSuccessUrl("/index").permitAll()
	    	.and()
	        .logout().logoutSuccessUrl("/login").invalidateHttpSession(true)
	        .and().authorizeRequests()
	        .antMatchers("/**/*.css", "/img/**", "/**/*.js","/api/**","/druid/**") // 放开"/api/**",通过oauth2.0来鉴权
	        .permitAll()
	        .and().authorizeRequests().antMatchers("/**").authenticated();
	    
	    http.csrf().disable();
	    http.headers().frameOptions().disable();
	    http.httpBasic();
    }
	
	
	@Autowired
	private UserDetailsService customUserService;
	
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customUserService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
}
