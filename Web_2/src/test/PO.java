package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PO {
	public WebDriver driver;
	@BeforeTest
	public void CreateWebDriver(){
		driver = new FirefoxDriver() ;
		
		}
	
	@Test
	public void Test1(){
		PDCLogiWebPage web=new PDCLogiWebPage(driver);
		driver.get("https://10.35.204.56:24721");
		web.init(driver);
		web.Login("PDCAdmin", "p@ssw0rd");
		web.CheckTitle("Phasor Point PD C");
		
				
	}
	@AfterTest
	public void CloseWebDriver(){
		driver.close(); 
	}


}