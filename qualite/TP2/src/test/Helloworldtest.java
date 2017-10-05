package test;
import static org.junit.Assert.*;

import org.junit.Test;

import testing.HelloWorld;

public class Helloworldtest {

	@Test
	public void test() {
		HelloWorld h = new HelloWorld();
		assertEquals(h.hello(), "hello world");

	}
}
