package com.nayomie.cms_backend.jwt;

import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class jwtUtils {

    private String secret = "cms";
    public <T> T extractClaims(String token, Function<Claims, T> claimsResolver){

    }
}
