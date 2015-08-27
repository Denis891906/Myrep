package test.dataprovider;

import org.testng.annotations.Test;

public class TestClass {
	@Test(dataProvider="data-provider",dataProviderClass=DataProciderClass.class)
	public void testMethod(String data){
		System.out.println("Data is: "+data);
	}

}
