//package com.example.assessment.assessment.security;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
////import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//
//import javax.crypto.SecretKey;
//import java.util.Date;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends SecurityConfigurerAdapter {
//    
//    // Replace with a strong, secret key
//    private final SecretKey secretKey = Keys.hmacShaKeyFor("yourSecretKey".getBytes());
//    
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//            .addFilterBefore(new JwtTokenVerifier(secretKey), UsernamePasswordAuthenticationFilter.class)
//            .authorizeRequests()
////            .chainRequestMatchers("/api/signup").permitAll()
//            .anyRequest().authenticated();
//    }
//    
//    @Bean
//    public JwtProvider jwtProvider() {
//        return new JwtProvider(secretKey);
//    }
//}
