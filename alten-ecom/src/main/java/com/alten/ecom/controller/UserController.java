package com.alten.ecom.controller;

import com.alten.ecom.dto.AuthRequestDto;
import com.alten.ecom.dto.AuthResponse;
import com.alten.ecom.entity.Users;
import com.alten.ecom.service.JwtService;
import com.alten.ecom.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserInfoService service;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/account")
    public String addNewUser(@RequestBody Users user) {

        System.out.println("----> " + user);

        user.setRoles("ROLE_USER");

        return service.addUser(user);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/token")
    public AuthResponse authenticateAndGetToken(@RequestBody AuthRequestDto authRequestDto) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequestDto.getUsername(), authRequestDto.getPassword())
        );
        if (authentication.isAuthenticated()) {
            return new AuthResponse(jwtService.generateToken(authRequestDto.getUsername()));
        } else {
            throw new UsernameNotFoundException("Invalid user request!");
        }
    }

}
