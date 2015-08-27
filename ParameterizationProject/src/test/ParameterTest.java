package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	@Parameters({"suite-param"})
	@Test
	public void parameterTestOne(String param){
		System.out.println("Test one suite param is:"+param);
	}
	
	@Parameters({"test-two-param"})
	@Test
	public void parametertestTwo(String param){
		System.out.println("Test 2 param is:"+param);
		
	}
	
	@Parameters({"suite-param","test-three-param"})
	@Test
	public void parameterTestThree(String param, String paramTwo){
		System.out.println("Test 3 suite param is:"+param);
		System.out.println("Test 3 param is:"+paramTwo);
		
	}
	
}
