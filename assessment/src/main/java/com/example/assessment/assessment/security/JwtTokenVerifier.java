//package com.example.assessment.assessment.security;
//import io.jsonwebtoken.Jwts;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.crypto.SecretKey;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class JwtTokenVerifier extends OncePerRequestFilter {
//
//    private final SecretKey secretKey;
//
//    public JwtTokenVerifier(SecretKey secretKey) {
//        this.secretKey = secretKey;
//    }
//
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        String authorizationHeader = request.getHeader("Authorization");
//        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
//            filterChain.doFilter(request, response);
//            return;
//        }
//
//        String token = authorizationHeader.replace("Bearer ", "");
//
//        try {
//            Jwts.parserBuilder()
//                .setSigningKey(secretKey)
//                .build()
//                .parseClaimsJws(token);
//        } catch (Exception e) {
//            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
//            return;
//        }
//
//        // If the token is valid, set the user as authenticated
//        SecurityContextHolder.getContext().setAuthentication(null);
//
//        filterChain.doFilter(request, response);
//    }
//
//	@Override
//	protected void doFilterInternal(jakarta.servlet.http.HttpServletRequest request,
//			jakarta.servlet.http.HttpServletResponse response, jakarta.servlet.FilterChain filterChain)
//			throws jakarta.servlet.ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//	}
//}
