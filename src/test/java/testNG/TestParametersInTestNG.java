package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import core.Base;

public class TestParametersInTestNG extends Base{

	@Test
	@Parameters("p1")
	public void testMethod1(String p1) {
		
		System.out.println("method 1 in TestParametersInTestNG");
		System.out.println("This is the value of the parameter: " + p1);
	}
}
