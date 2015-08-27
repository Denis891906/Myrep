package test.depends;

import org.testng.annotations.Test;

public class InheritedTest extends SimpleDependencyTest {
	@Test(dependsOnMethods={"testOne"})
	public void testThree(){
		System.out.println("Test 3 in the inherited test");
	}
	@Test
	public void testFour(){
		System.out.println("Test 4 in the inherited test");
	}
}
