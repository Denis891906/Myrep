package test.depends.groups;

import org.testng.annotations.Test;

public class MultiGroupXmlDependency {
	@Test(groups={"dependent-group"})
	public void testOne(){
		System.out.println("Group test method 1");
	}
	@Test(groups={"test-group-one"})
	public void testTwo(){
		System.out.println("Group test method 2");
	}
	
	@Test(groups={"test-group-two"})
	public void testThree(){
		System.out.println("Group test method 3");
	}
}

