package com.example;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration

@EnableWebSecurity

@EnableGlobalMethodSecurity(securedEnabled=true)

public class SecurityConfig extends WebSecurityConfigurerAdapter{

  @Autowired
 private DataSource dataSource;

protected void configure(AuthenticationManagerBuilder auth) throws Exception {

  auth
      .jdbcAuthentication()
          .dataSource(dataSource)
          .usersByUsernameQuery("select username as principal, password as credentials,true from users where username=?")
          .authoritiesByUsernameQuery("select users_username as principal,roles_role as role from users_roles where users_username=?")
          .rolePrefix("ROLE_");
         // .passwordEncoder(new Md5PasswordEncoder());
}

@Override
protected void configure(HttpSecurity http) throws Exception {


  http
  .csrf().disable()

      .authorizeRequests().antMatchers("/css/**","/js/**","/images/**").permitAll()
      .anyRequest().authenticated();
      http
      .formLogin().failureUrl("/auth?error")
          .loginPage("/auth").permitAll()
          
          .and().logout().invalidateHttpSession(true).logoutUrl("/logout").permitAll();
   
      
    
     
      http.authorizeRequests().antMatchers("/inventairelist").hasRole("USER");
      http.authorizeRequests().antMatchers("/form").hasRole("ADMIN");


http.exceptionHandling().accessDeniedPage("/403");

}
}