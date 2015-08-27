package test.parallelism;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleClassTwo {
	@BeforeClass
	public void beforeClass(){
		long id=Thread.currentThread().getId();
		System.out.println("Before test-Class. Thread id is: "+id);
	}
	
	@Test
	public void testMethodOne(){
		long id=Thread.currentThread().getId();
		System.out.println("Simple test-method 1. Thread id is: "+id);
	}

	@Test
	public void testMethodTwo(){
		long id=Thread.currentThread().getId();
		System.out.println("Simple test-method 2. Thread id is: "+id);
	}
	@AfterClass
	public void afterClass(){
		long id=Thread.currentThread().getId();
		System.out.println("After test-Class.Thread id is: "+id);
}
}
