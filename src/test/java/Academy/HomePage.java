package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class HomePage extends BaseUd {

	@Test
	public void basePageNavigation() throws IOException
	{
	  BaseUd base=new HomePage();
	 driver= base.intializeDriver();
	 driver.get("http://www.qaclickacademy.com/");
	 
	LandingPage lp=new LandingPage(driver);
	lp.getLogin().click();
	}
}
