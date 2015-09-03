package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PDCLogiWebPage {
	public PDCLogiWebPage(WebDriver driver,String text) {
		this.driver=driver;
		this.init(this.driver);
		driver.get(text);
	}
	
	private WebDriver driver;
	@FindBy(id="j_username")
	private WebElement usernameField;
	
	@FindBy(id="j_password")
	private WebElement passwordField;
	
	@FindBy(name="Login")
	private WebElement LoginButton;
	
	
	public void Login(String user, String password){
		usernameField.sendKeys(user);
		passwordField.sendKeys(password);
		LoginButton.click();
		}
		
	public void init(final WebDriver driver){
			PageFactory.initElements(driver,this);
			
		}

	public void CheckTitle(String text){
		/*
		System.out.println(driver.getTitle());
		System.out.println(text);
		*/
		Assert.assertEquals(driver.getTitle(), text);
		}
		 
	}



