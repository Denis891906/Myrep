package test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class OptionalTest {
	@Parameters({"optional value"})
	@Test
	public void optionalTest(@Optional("optional value") String value){
		System.out.println("This is:"+value);
		
	}
}
