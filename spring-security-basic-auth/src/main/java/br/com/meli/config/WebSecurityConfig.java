package br.com.meli.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("/anuncios").permitAll()
			.anyRequest().authenticated()
		.and()
			//.httpBasic();
		.formLogin();
	}
	
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("kenyo")
				.password("123")
				.roles("")
				.build();
		return new InMemoryUserDetailsManager(user);
	}
}
