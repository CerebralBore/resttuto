package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private GreetingService greetingService;

	@Test
	public void contextLoads() {
		assertEquals(new Greeting("Hello", "Klaus"), greetingService.helloGreeting("Klaus"));
	}

}
