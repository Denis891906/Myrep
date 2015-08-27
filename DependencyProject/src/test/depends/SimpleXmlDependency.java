package test.depends;

import org.testng.annotations.Test;

public class SimpleXmlDependency {
	@Test(groups={"dependent-group"})
	public void testOne(){
		System.out.println("Test 1");
	}
	
	@Test(groups={"test-group"})
	public void testTwo(){
		System.out.println("Test 2");
	}
	
	@Test(groups={"test-group"})
	public void testThree(){
		System.out.println("Test 3");
	}
}
