package com.example.Rc.Rc.data.common;

import com.example.Rc.Rc.security.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(value = "http://localhost:4200")
@RequestMapping("/api/v1/currentuser")

@RequiredArgsConstructor
public class Currentuser {
    @JsonProperty("user")
    private String user;
    @Autowired
    ObjectMapper objectMapper;
    @GetMapping
    public <userPrincipal> ResponseEntity Currentuser(Authentication authentication) throws JsonProcessingException {
        User userPrincipal = (User) authentication.getPrincipal();

        return ResponseEntity.status(HttpStatus.OK)
                .body( objectMapper.writeValueAsString(userPrincipal.getLastname()));

    }
}