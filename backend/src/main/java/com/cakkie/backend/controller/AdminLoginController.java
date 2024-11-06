package com.cakkie.backend.controller;
import com.cakkie.backend.service.AdminLoginService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AdminLoginController {
    AdminLoginService adminLoginService;
    public AdminLoginController(AdminLoginService adminLoginService) {
        this.adminLoginService = adminLoginService;
    }

    @PostMapping("/admin-login")
        String jwt = adminLoginService.loginAdmin(login);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        else {
            return ResponseEntity.ok(response);
        }
    }
}
