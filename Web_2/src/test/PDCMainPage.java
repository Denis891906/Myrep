package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PDCMainPage {
	
	private WebDriver driver;

	public PDCMainPage(WebDriver driver){
		driver=this.driver;
	} 
		
	
	@FindBy(linkText="Logout")
	private WebElement LogoutLink;
	
	public void ClickLogout(){
		LogoutLink.click();
	}
	
	public void init(final WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public void CheckTitle(String text){
		 Assert.assertEquals(driver.getTitle(), text);
	}
}
