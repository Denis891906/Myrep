package test.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SameClaseDataProvider {
	@DataProvider(name="data-provider")
	public Object[] [] dataProviderMethod(){
		return new Object[][]{{"data-one"},{"data two"},{"date 3"},{"4"}};
		
	} 
	@Test(dataProvider="data-provider")
	public void testMethod(String data){
		System.out.println("Data is: " + data);
				
	}
	
}
