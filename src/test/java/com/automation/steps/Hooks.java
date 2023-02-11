package com.automation.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	// This method will get executed before each scenario
	@Before
	public void setUp() {
		System.out.println("Before");
	}

	// This method will get executed after each scenario
	@After
	public void cleanUp() {
		System.out.println("After");
	}

}
