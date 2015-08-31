package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	@BeforeTest
	public void Before(){
		System.out.print("Hello");
	}
	@Test
	public void Test(){
		System.out.print("Hello");
		
	}
	
	@Test
	public void CreateWebDriver(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://10.35.104.75:24721");
		}

}
