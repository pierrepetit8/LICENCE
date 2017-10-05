package test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

import testing.ManipulationString;

public class testManipulationString {
	private ManipulationString ms;
	@Test
	public void setUp() {
		ms = new ManipulationString();
		int expected = 100;
		assertEquals(expected, ms.sum("d"));
		expected = 0;
		try {
			assertEquals ( expected , ms. sum(null));
		}catch(InvalidParameterException e) {
			
		}
		
	}
	@Test (expected=java.lang.NullPointerException.class)
	public void test2() throws Exception {
		ms.sum(null);
	}
	

}
