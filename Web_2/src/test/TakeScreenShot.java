package test;


import java.io.File;
import java.sql.Driver;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.steadystate.css.util.Output;
import com.sun.jna.platform.FileUtils;


public class TakeScreenShot extends AbstractWebDriverEventListener {
	public WebDriver driver;
	
	@BeforeTest
	public void btest(){
		driver = new FirefoxDriver();
		driver.get("google.com");
	}
	@Test
	public void Test1(){
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\selenium\\screenshot1.png"), true);
	}
	
	/*@Override
	public void onException(Throwable throwable, WebDriver webdriver){
		System.out.println("Caught Exception");
		File scrFile=((TakeScreenShot)webdriver).ge
		
	}
	*/
}

