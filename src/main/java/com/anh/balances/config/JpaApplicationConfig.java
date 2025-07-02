package com.anh.balances.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.anh.balances.model.BaseRepositoryImpl;

@Configuration
@EnableJpaRepositories(
		basePackages = "com.anh.balances.model",
		repositoryBaseClass = BaseRepositoryImpl.class
		)
@EnableJpaAuditing
public class JpaApplicationConfig {
   
}
