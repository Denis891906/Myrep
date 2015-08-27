package test.timetest;

import org.testng.annotations.Test;

public class TimeSuite {
	@Test
	public void timetestOne() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println("Time test method one");
	}

	@Test
	public void timeTestTwo() throws InterruptedException{
		Thread.sleep(400);
		System.out.println("Time test method 2");
		
	}
}
