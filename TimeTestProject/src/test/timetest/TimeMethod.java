package test.timetest;

import org.testng.annotations.Test;

public class TimeMethod {
	@Test(timeOut=500)
	public void timeTestOne() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println("test 1");
		
	}
	
	@Test
	public void timeTestTwo() throws InterruptedException{
		Thread.sleep(400);
		System.out.println("test 2");
				
	}
	
	
	
	

}
