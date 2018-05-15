package Academy;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;

public class ValidateNavigationBar extends BaseUd {
	public String url;
	@Test
	
//																																	
	public void basePageNavigation() throws IOException
	{
	  BaseUd base=new ValidateNavigationBar();
	 driver= base.intializeDriver();
	url= base.geturl("url");
 driver.get(url);
	 
	LandingPage lp=new LandingPage(driver);
	
	WebElement tab=lp.gettab();
	
	Assert.assertTrue(tab.isDisplayed());
//	Assert.assertFalse(tab.isDisplayed());

	driver.close();
	
	
	}
	
	
}