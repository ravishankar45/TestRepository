package com.qa.Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;







public class Base_Class
{
	public static WebDriver driver;

	public static Properties prop;
	
	public Base_Class() 
	{
		try {
			try {
			prop=new Properties();
			FileInputStream fs = new FileInputStream("C:\\Users\\ravis5\\eclipse-workspace\\FreeCRMSiteAutomation\\src\\main\\java\\com\\qa\\Base\\Config.properties");
			
				prop.load(fs);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public static void Intilization()
{
	//String BrowserName=prop.getProperty("Browser");
	//if (BrowserName.equalsIgnoreCase("chrome"))
	if(prop.getProperty("Browser").equals("Chrome"))
			{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ravis5\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
		
			}
	//else if(BrowserName.equalsIgnoreCase("Firefox"))
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("URL"));
}


}
