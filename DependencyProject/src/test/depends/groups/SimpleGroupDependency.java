package test.depends.groups;

import org.testng.annotations.Test;

public class SimpleGroupDependency {
	@Test(dependsOnGroups={"test-group"})
	public void testOne(){
		System.out.println("Test which dependened from group");
	}
		@Test(groups={"test-group"})
		public void testTwo(){
			System.out.println("Group Test 1");
		}
		
	@Test(groups={"test-group"})
	public void testThree(){
		System.out.println("Group Test 2");
	}
}		
		
