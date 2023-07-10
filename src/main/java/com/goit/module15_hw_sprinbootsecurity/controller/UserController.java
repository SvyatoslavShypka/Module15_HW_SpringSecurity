package com.goit.module15_hw_sprinbootsecurity.controller;

import com.goit.module15_hw_sprinbootsecurity.entity.UserAccountEntity;
import com.goit.module15_hw_sprinbootsecurity.repository.UserAccountRepository;
import com.goit.module15_hw_sprinbootsecurity.service.UserAccountService;
import jakarta.servlet.ServletRequest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class UserController {
    private PasswordEncoder passwordEncoder;

    @GetMapping("/users")
    @Secured({"USER"})
    public String users(ServletRequest request, Authentication authentication) {

        return "admin@email.com";
    }

    @GetMapping("/users/super-admin")
    @Secured({"ADMIN", "SUPER_ADMIN"})
    public String usersSuperAdmin(ServletRequest request, Authentication authentication) {

        return "super_admin@email.com";
    }
}
