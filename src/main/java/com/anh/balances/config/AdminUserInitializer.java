package com.anh.balances.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import com.anh.balances.model.entity.Account;
import com.anh.balances.model.entity.consts.Role;
import com.anh.balances.model.repo.AccountRepo;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Configuration
@PropertySource(value = "classpath:/admin-user.properties")
@PropertySource(value = "classpath:/patch.properties")
@RequiredArgsConstructor
public class AdminUserInitializer {

	private final PasswordEncoder passwordEncoder;
	private final AccountRepo accountRepo;
	
	@Value("${app.admin.username}")
	private String username;
	@Value("${app.admin.password}")
	private String password;
	
	@PostConstruct //to initially works this method when building bean this class
	@Transactional
	public void initialize() {
		 
		if(accountRepo.count() ==0L) {
			var admin = new Account();
			admin.setUsername(username);
			admin.setPassword(passwordEncoder.encode(password));
			admin.setRole(Role.Admin);
			admin.setActive(true);
			accountRepo.save(admin);
		}
		
	}
	
}
