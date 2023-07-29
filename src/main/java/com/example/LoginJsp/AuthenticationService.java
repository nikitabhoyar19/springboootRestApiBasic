package com.example.LoginJsp;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    
	public boolean authenticate(String username, String pswd) {
		boolean isValidName = username.equalsIgnoreCase("nik");
		boolean isValidPswd = pswd.equalsIgnoreCase("12345");

		return isValidName && isValidPswd;
	}
}
