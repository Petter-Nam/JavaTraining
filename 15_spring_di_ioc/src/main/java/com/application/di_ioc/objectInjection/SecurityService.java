package com.application.di_ioc.objectInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {

	// before
	//private PasswordEncoder encoder = new BCryptPasswordEncoder();
	
	//after
	@Autowired
	private PasswordEncoder encoder;
	
	
}
