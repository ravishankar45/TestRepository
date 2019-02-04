package com.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Base.Base_Class;
import com.qa.PageFactory.HomePage;
import com.qa.PageFactory.LoginPage;
import com.qa.util.ReadExcelFile;

public class LoginTest extends Base_Class

{

	public LoginTest()  {
		super();
		
	}
	
	LoginPage loginPage;
	HomePage Homepage;
	
	@BeforeMethod
	public void Setup() 
	{
		Intilization();
		loginPage= new LoginPage();
		
	}
	
	@Test
	public void ValidateTitlePage()
	{
		String Title = loginPage.ValidateLoginPage();
		Assert.assertEquals(Title,"free crm logo" );
	}
	@Test
	public void ValidateCRMLogo()
	{
		boolean Logo=loginPage.ValidateCRMLogo();
		Assert.assertTrue(Logo);
	}
	
	@Test(dataProvider="PassData")
	public void Logintest(String UserName,String Password)
	{
		Homepage=loginPage.Login(prop.getProperty(UserName),prop.getProperty(Password));
	}
	
	@DataProvider
	public Object[][] PassData()
	{
		
		Object[][] data = ReadExcelFile.getTestData("Sheet1", "C:\\\\Users\\\\ravis5\\\\Desktop\\\\ReadExcel.xlsx");
		 return data;
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
