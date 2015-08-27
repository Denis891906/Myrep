package test.depends;

import org.testng.annotations.Test;

public class MultiDependencyTest {

	@Test(dependsOnMethods={"testTwo","testThree"})
	public void testOne(){
		System.out.println("Test 1");
	}
	
	@Test
	public void testTwo(){
		System.out.println("Test 2");
	}
	@Test
	public void testThree(){
		System.out.println("Test 3");
	}
}
