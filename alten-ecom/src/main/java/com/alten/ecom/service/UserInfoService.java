package com.alten.ecom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.alten.ecom.entity.Users;
import com.alten.ecom.repository.UsersRepository;
import com.alten.ecom.config.UsersDetails;

import java.util.Optional;

@Service

public class UserInfoService implements UserDetailsService {

    @Autowired
    private UsersRepository repository;

    @Autowired
    private PasswordEncoder encoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> userDetail = repository.findByEmail(username);

        System.out.println("loadUserByUsername ---> " + userDetail.get());


        UserDetails dd =  userDetail.map(UsersDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));

        System.out.println("dd ---> " + dd.getAuthorities());
        return dd;
    }

    public String addUser(Users users) {

        users.setPassword(encoder.encode(users.getPassword()));
        repository.save(users);
        return "User Added Successfully";
    }
}
