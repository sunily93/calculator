package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMappingApplicationTests {

	
	@Test
	public void testAdd() throws Exception {
	    assertEquals(0, Calculator.add(""));
	    assertEquals(1, Calculator.add("1"));
	    assertEquals(3, Calculator.add("1,2"));
	    assertEquals(6, Calculator.add("1\n2,3"));
	    assertEquals(3, Calculator.add("//;\n1;2"));
	    assertThrows(Exception.class, () ->Calculator.add("-1,2,-3"));
	}
}
