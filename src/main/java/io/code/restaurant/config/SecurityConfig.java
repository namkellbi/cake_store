//package io.code.restaurant.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import javax.servlet.http.HttpServletResponse;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//  public static final String[] pathArray = new String[] { "/api/v1/admin/login", "/swagger-ui.html", "/v2/api-docs",
//    "/swagger-resources/**", "/webjars/**", "/api/v1/system/**", "/api/v1/admin/refresh-token"};
//
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    http.cors().and().httpBasic().disable().csrf().disable().authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**")
//      .anonymous().antMatchers(pathArray).permitAll().anyRequest().authenticated().and().exceptionHandling()
//      .authenticationEntryPoint(unauthorizedEntryPoint()).and()
//      .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//  }
//
//  @Bean
//  public AuthenticationEntryPoint unauthorizedEntryPoint() {
//    return (request, response, authException) -> response
//      .sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
//  }
//}
