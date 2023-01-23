//package com.nayomie.cms_backend.jwt;
//
//import io.jsonwebtoken.Claims;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//public class JwtFilter extends OncePerRequestFilter {
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @Autowired CustomerUsersDetailsService service;
//
//    Claims claims = null;
//    private String userName = null;
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//
//        if (httpServletRequest.getServletPath().matches("/user/login"|/"/user/forgotPassword|/user/signup")){
//            filterChain.doFilter(httpServletRequest, httpServletResponse);
//        }
//        else{
//            String authorizationHeader = httpServletRequest.getHeader("Authorization");
//            String token = null;
//
//            if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")){
//                token = authorizationHeader.substring(7);
//                userName = jwtUtil.extractUsername(token);
//                claims = jwtUtil.extractAllClaims(token);
//            }
//        }
//
//    }
//}
