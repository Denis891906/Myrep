package test.groups;

import org.testng.annotations.Test;

public class MultiGroup {
	
	@Test(groups="group-one")
	public void testMethodOne(){
		System.out.println("Test 1, group - 1");
	}
	
	@Test(groups={"group-one", "group-two"})
	public void testMethodTwo(){
		System.out.println("Test 2,group - 1 and 2");
	}
	@Test(groups="group-one")
	public void testMethodThree(){
		System.out.println("Test 3 ,group - 1");
	}

}
