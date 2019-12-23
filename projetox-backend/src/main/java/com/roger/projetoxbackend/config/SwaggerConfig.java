package com.roger.projetoxbackend.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket swaggerAuthenticationConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Authentication")
				.select() // Get Docket Builder Object --> ApiSelectorBuilder
				.paths(PathSelectors.ant("/api/auth/*")) // What the path for the resources
				.apis(RequestHandlerSelectors.basePackage("com.roger.projetoxbackend")) // What packages to look for	
				.build()
				.apiInfo(getAuthenticationApiDetails()); // Build the Docket Object				
	}
	
	@Bean
	public Docket swaggerAlunosConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Alunos")
				.select() // Get Docket Builder Object --> ApiSelectorBuilder
				.paths(PathSelectors.ant("/api/alunos/**"))
				.apis(RequestHandlerSelectors.basePackage("com.roger.projetoxbackend")) // What packages to look for	
				.build()
				.apiInfo(getAlunosApiDetails()); // Build the Docket Object				
	}
	
	private ApiInfo getAuthenticationApiDetails() {
		//TODO: Colocar essas propriedades em um arquivo externo
		return new ApiInfo(
				"Projeto Backend - Authentication Resources",
				"Use this endpoint for authentication",
				"1.0",
				"Free to use",
				new Contact("Rogerio Takashi","http://rogeriotakashi.com" ,"rogeriotakashi@hotmail.com"),
				"API License",
				"http://rogeriotakashi.com",
				Collections.emptyList()
				);				
	}
	
	private ApiInfo getAlunosApiDetails() {
		//TODO: Colocar essas propriedades em um arquivo externo
		return new ApiInfo(
				"Projeto Backend - Alunos Resources",
				"Simple API for training basic stuffs",
				"1.0",
				"Free to use",
				new Contact("Rogerio Takashi","http://rogeriotakashi.com" ,"rogeriotakashi@hotmail.com"),
				"API License",
				"http://rogeriotakashi.com",
				Collections.emptyList()
				);				
	}
}
