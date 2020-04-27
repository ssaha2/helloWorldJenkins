package src.com.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import src.com.code.HelloJava;

public class HelloJavaTest {

	@Test
	public void addTest() {
		HelloJava helloJava = new HelloJava();
		assertTrue("Incorrect !!", helloJava.getsum(1, 2) == 3);
				
	}
	
}
