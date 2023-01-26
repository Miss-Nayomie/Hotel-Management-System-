package com.nayomie.cms_backend.service;

import com.nayomie.cms_backend.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface UserService {
    ResponseEntity<String> signUp(Map<String,String> requestMap);
    ResponseEntity<String> login(Map<String,String> requestMap);
    ResponseEntity<list<User Wrapper>>get AllUsers();
}
