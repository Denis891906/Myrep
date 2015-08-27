package test.classes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExampleTest {
	private String param="";
	
	public ExampleTest(String param){
		this.param=param;
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class executed.");
	}
	@Test
	public void testMethod(){
		System.out.println("The parameter value is "+param);
	}
	
	
}
