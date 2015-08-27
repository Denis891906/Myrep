package test.classes;

import org.testng.annotations.Test;

public class ParameterTest {
	private int param;
	public ParameterTest(int param){
		this.param=param;
	}
	@Test
	public void methodOne(){
		int opValue=param+1;
		System.out.println("Test method one output: "+opValue);
	}
	
	@Test
	public void methodTwo(){
		int opValue=param+2;
		System.out.println("Test method two output: "+opValue);
	}
	

}
