package com.test.gradletest;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {

	public String retrieveWelcomeMessage() {
		//Complex Method
		return "Good Morning from IntelliJ Gradle project using spring boot and GIT";
	}
}