package Academy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

import pageObjects.LandingPage;
//adding logs
//generating html reports
//screenshot on failure
//jenkins integration

public class ValidateNavigationBar extends BaseUd {
	public String url;
	public static Logger log=LogManager.getLogger(BaseUd.class.getName());
	
	@BeforeTest
	public void intialize() throws IOException
	{
		BaseUd base=new ValidateTitle();
		  driver= base.intializeDriver();
		  log.info("Driver in intialized");
			url= base.geturl("url");
		 driver.get(url);
		  log.info("Navigated to Home Page");

	}
	@Test
	
//																																	
	public void basePageNavigation() throws IOException
	{
	 
	 
	LandingPage lp=new LandingPage(driver);
	
	WebElement tab=lp.gettab();
	
	AssertJUnit.assertTrue(tab.isDisplayed());
//	Assert.assertFalse(tab.isDisplayed());

	
	
	}
	
	@AfterTest
	public void Closebrowser()
	{
		driver.close();
	}
	
}