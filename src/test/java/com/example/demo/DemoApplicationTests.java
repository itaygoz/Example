package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(classes = { DemoApplication.class })
class DemoApplicationTests extends AbstractTestNGSpringContextTests {

	@Autowired
	private DemoService service;

	@Test
	void contextLoads() {
		service.someMethod();
	}

}
