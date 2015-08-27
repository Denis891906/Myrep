package test;

import org.testng.annotations.Test;

public class DisableTestClass {

	@Test(enabled=true)
	public void testMethodOne() {
		System.out.println("test method one.");
	}
	@Test(enabled=false)
	public void testMethodTwo(){
		System.out.println("test method 2.");
	}
	@Test
	public void tetsMethodThree(){
		System.out.println("test method 3.");
	}
}
