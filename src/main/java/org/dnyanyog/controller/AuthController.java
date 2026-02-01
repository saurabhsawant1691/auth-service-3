package org.dnyanyog.controller;

import org.dnyanyog.dto.ApiResponse;
import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.SignupRequest;
import org.dnyanyog.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class AuthController {

	@Autowired
	private AuthService authService;
	
	@PostMapping("/v1/login")
	public ResponseEntity<ApiResponse> loginUser(@Valid @RequestBody LoginRequest loginRequest){
		ApiResponse response = authService.loginUser(loginRequest);
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/v1/signup")
	public ResponseEntity<ApiResponse> registerUser(@Valid @RequestBody SignupRequest signupRequest){
		ApiResponse response = authService.registerUser(signupRequest);
		return ResponseEntity.ok(response);
	}
}
