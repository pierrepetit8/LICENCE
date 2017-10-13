package test;

import static org.junit.Assert.*;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.ExoTP;

public class ExoTPTest {
	ExoTP exo;
	@Before
	public void setUp() {
		 exo = new ExoTP();
	}
	
	@Test
	public void test() {
		exo.test();
		System.out.println(exo.getDriver().getCurrentUrl());
		assertThat(exo.getDriver().getCurrentUrl(), IsEqual.equalTo("http://www.basesdelacuisine.com/Index/index1c.htm"));
	}

}