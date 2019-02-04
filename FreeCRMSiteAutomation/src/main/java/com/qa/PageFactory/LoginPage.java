package com.qa.PageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base_Class;

public class LoginPage extends Base_Class 
{
	//public WebDriver driver;
	
	@FindBy(css=".navbar-brand")
    WebElement Logo;
	@FindBy(name="username")
	WebElement usrname;
	@FindBy(name="password")
	WebElement passwd;
	@FindBy(css=".btn btn-small")
	WebElement LoginBtn;
	@FindBy(css=".logo_text")
	WebElement HomePageLogo;
	@FindBy(xpath="//img[@class=\"img-responsive\" and @src=\"https://d19rqa8v8yb76c.cloudfront.net/img/freecrm.jpg\"]")
	WebElement CRMLogo;
	
	public LoginPage() 
	{
		
		PageFactory.initElements(driver, this);
	}
	public String ValidateLoginPage()
	{
		String LoginPageLogo=Logo.getText();
		return LoginPageLogo;
		
	}
	public boolean ValidateCRMLogo()
	{
		return CRMLogo.isDisplayed();
	}
	public HomePage Login(String UName,String Pass)
	{
		usrname.sendKeys(UName);
		passwd.sendKeys(Pass);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].click();",LoginBtn);
		
		return new HomePage();
		
		
	}

}
