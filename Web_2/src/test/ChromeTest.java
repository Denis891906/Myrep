package test;

import org.apache.xerces.util.URI.MalformedURIException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.PDCLogiWebPage; 
public class ChromeTest {
	private WebDriver driver;
	@BeforeTest
	@Parameters({"browser"})
	public void setUp(String browser) throws MalformedURIException{
		if (browser.equalsIgnoreCase("FireFox")){
			System.out.println("Running FireFox");
				driver = new FirefoxDriver(); 
		}else if (browser.equalsIgnoreCase("chrome")){
			System.out.println("Running Chrome");
			System.setProperty("webdriver.chrome.driver","E:\\Own_Project\\Web_2\\lib\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}
	}
	@Test
	public void PDCLogin(){
		
		PDCLogiWebPage web=new PDCLogiWebPage(driver,"https://10.35.204.56:24721");
		web.Login("PDCAdmin", "p@ssw0rd");
		web.CheckTitle("PhasorPoint PDC");
		
	}
	
	@AfterTest
	public void AfterTest(){
		driver.close();
	}
}
