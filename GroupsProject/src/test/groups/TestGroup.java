package test.groups;

import org.testng.annotations.Test;

public class TestGroup {

	@Test(groups="test-group")
	public void testMethodOne(){
		System.out.println("Test 1");
	}
	
	@Test
	public void testMethodTwo(){
		System.out.println("Test 2");
	}
	@Test(groups="test-group")
	public void testMethodThree(){
		System.out.println("Test 3");
	}
}
