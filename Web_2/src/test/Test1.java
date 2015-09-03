package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.PDCMainPage;

public class Test1 {
	private WebDriver driver;
	public int i=0;
	@BeforeTest
	public void CreateWebDriver(){
		driver = new FirefoxDriver() ;
		}
	
	@Test
	public void test1(){
		OpenWebPage("https://10.35.204.56:24721");
		VerifyTitle("PhasorPoint PDC login");
	}
	
	@Test
	public void test2(){
		OpenWebPage("https://10.35.204.56:24721");
		Login("pdcAdmin","p@ssw0rd");
		VerifyTitle("PhasorPoint PDC");
	}
	
	@Test
	public void test3(){
		OpenWebPage("https://10.35.204.56:24721");
		Login("pdcAdmin","p@ssw0rd");
		VerifyTitle("PhasorPoint PDC login");
		
	}
	private void WebPageClickLink(String string) {
		driver.findElement(By.linkText(string)).click();;
				
	}

	@AfterTest
	public void After(){
		driver.close();
		i++;
		System.out.println("Web Brouser was closed in the " +i + " times");
	}
	
	private void Login(String username, String password) {
		driver.findElement(By.id("j_username")).sendKeys(username);
		driver.findElement(By.id("j_password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
		
	}

	private void VerifyTitle(String string) {
		Assert.assertEquals(driver.getTitle(), string);
		
	}

	private void OpenWebPage(String string) {
		driver.get(string);
		
	}
}
