package test.parallelism;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.ParametersDelegate;

public class SampleTestSuite {
	String testName="";
	
	@BeforeTest
	@Parameters({"test-name"})
	public void beforeTest(String testName){
		this.testName=testName;
		long id= Thread.currentThread().getId();
		System.out.println("before test "+testName+" . Thread id is : "+id);
		
	}
	
	@BeforeClass
	public void beforeClass(){
		long id= Thread.currentThread().getId();
		System.out.println("before test-class "+testName+" . Thread id is : "+id);
	}
	@Test
	public void testMethodOne(){
		long id= Thread.currentThread().getId();
		System.out.println("before test-method "+testName+" . Thread id is : "+id);
		
	}
	@AfterClass
	public void afterClass(){
		long id= Thread.currentThread().getId();
		System.out.println("After test-class "+testName+" . Thread id is : "+id);
	}
	
	@AfterTest
	public void afterTest(){
		long id= Thread.currentThread().getId();
		System.out.println("After test "+testName+" . Thread id is : "+id);
	}
}