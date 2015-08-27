package test.parallelism;

import org.testng.annotations.Test;

public class SimpleClass {
	
	@Test
	public void testMethodOne(){
		
		long id=Thread.currentThread().getId();
		System.out.println("Simple test-method one. Thread id is: "+id);
	}
	@Test
	public void testMethodTwo(){
		
		long id=Thread.currentThread().getId();
		System.out.println("Simple test-method two. Thread id is: "+id);
	}
}
