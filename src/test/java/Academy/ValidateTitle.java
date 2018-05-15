package Academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import pageObjects.LandingPage;

public class ValidateTitle extends BaseUd {
	public String url;
	public static Logger log=LogManager.getLogger(BaseUd.class.getName());

	@BeforeTest
	public void beforetest() throws IOException
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
	  
//	 base.geturl("http://www.qaclickacademy.com/");
	 
	LandingPage lp=new LandingPage(driver);
	String expect=lp.getTitle().getText();
	System.out.println(expect);
	AssertJUnit.assertEquals(expect, "FEATURED COURSES");
	
	//compare text with browser text
	
	
	
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	
}