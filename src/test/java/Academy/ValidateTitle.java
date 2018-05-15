package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;

public class ValidateTitle extends BaseUd {
	@Test
	
//																																	
	public void basePageNavigation() throws IOException
	{
	  BaseUd base=new ValidateTitle();
	 driver= base.intializeDriver();
	 driver.get("http://www.qaclickacademy.com/");
//	 base.geturl("http://www.qaclickacademy.com/");
	 
	LandingPage lp=new LandingPage(driver);
	String expect=lp.getTitle().getText();
	System.out.println(expect);
	Assert.assertEquals(expect, "FEATURED COURSES");
	
	//compare text with browser text
	driver.close();
	
	
	}
	
	
}