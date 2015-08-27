package test.depends.groups;

import org.testng.annotations.Test;

public class DifferentClassDependency {
	@Test(dependsOnGroups={"test-group","same-class"})
	public void testOne(){
		System.out.println("Test 1");
	}
	
	@Test(groups={"same-class"})
	public void testTwo(){
		System.out.println("Test 2");
	}
	
	@Test(groups={"same-class"})
	public void testThree(){
		System.out.println("Test 3");
	}
}
