package io.laidani.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
		.withUser("user").password("{noop}pass").roles("USER")
		.and()
		.withUser("mohamed").password("{noop}pass").authorities("ADMIN")
		.roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()	
		.antMatchers("/delete/**").hasAuthority("ADMIN")
		.anyRequest().authenticated()
		.and()
		/*
		 * TECH : customize Login & Logout 
		 */
		.formLogin().loginPage("/login").permitAll()
		.loginProcessingUrl("/doLogin")
		.and()
		.logout().permitAll().logoutUrl("/doLogout")
		/*
		 * TECH : Check logout options ...
		 *       .invalidateHttpSession(invalidateHttpSession)
		 *       .logoutSuccessUrl(logoutSuccessUrl)
		 *       .deleteCookies(cookieNamesToClear)
		 */
		.and()
		.csrf().disable();
	}
	
	
	 
}
