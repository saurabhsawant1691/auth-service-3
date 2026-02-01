package org.dnyanyog.service;

import org.dnyanyog.dto.ApiResponse;
import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.SignupRequest;
import org.dnyanyog.entity.User;
import org.dnyanyog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

	@Autowired
	private UserRepository userRepository;
	
	public ApiResponse loginUser(LoginRequest loginRequest) {
		ApiResponse response = new ApiResponse();
		
		// Check if login
		if(userRepository.findByUsername(loginRequest.getUsernameOrEmail()) != null) {
			System.out.println("User:- " + userRepository.findByUsername(loginRequest.getUsernameOrEmail()));
		}
		response.setStatus("Success");
		response.setMessage("Login Successful");
		return response;
	}
	
	public ApiResponse registerUser(SignupRequest signupRequest) {
		ApiResponse response = new ApiResponse();
		
		// Check if username exists
		if(userRepository.findByUsername(signupRequest.getUsername()) != null) {
			System.out.println("Username is taken!");
		}
		
		// Check if email exists
		if(userRepository.findByEmail(signupRequest.getEmail()) != null) {
			System.out.println("Email is taken !");
		}
		
		// Create new User
		User user = new User();
		user.setFullname(signupRequest.getFullname());
		user.setEmail(signupRequest.getEmail());
		user.setPassword(signupRequest.getPassword());
		user.setUsername(signupRequest.getUsername());
		
		user = userRepository.save(user);
		
		response.setStatus("success");
		response.setMessage("User registered successfully");
		response.setData(user);
		return response;
	}
}
