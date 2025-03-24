package com.neo.karmapath.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.RequestHeaderRequestMatcher;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").permitAll() // Allow Swagger
                        .requestMatchers(new RequestHeaderRequestMatcher("X-MS-CLIENT-PRINCIPAL-NAME")).authenticated() // Requires Azure Auth Header
                        .anyRequest().permitAll()// Or authenticated if all endpoints must be protected
                )
                .logout(logout -> logout.permitAll());
        return http.build();
    }
}