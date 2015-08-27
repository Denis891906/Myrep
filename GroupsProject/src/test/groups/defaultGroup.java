package test.groups;

import org.testng.annotations.Test;

public class defaultGroup {
	@Test(groups={"dafault-group"})
	public void testMethodOne(){
		System.out.println("Test 1, group - 1");
	}
	
	public void testMethodTwo(){
		System.out.println("Test 1, group - 2");
	}
	
	@Test(groups={"test-group"})
	public void testMethodThree(){
		System.out.println("Test 1, group - 3");
	}
}
