package test.depends;

import org.testng.annotations.Test;

public class SimpleDependencyTest {
	@Test(dependsOnMethods={"testTwo"})
	public void testOne(){
		System.out.println("Test 1");
	}
	
	@Test
	public void testTwo(){
		System.out.println("Test 2");
	}
}
