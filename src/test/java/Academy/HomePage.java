package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends BaseUd {

	@Test
	public void basePageNavigation() throws IOException, InterruptedException
	{
	  BaseUd base=new HomePage();
	 driver= base.intializeDriver();
	 driver.get("http://www.qaclickacademy.com/");
	 
	LandingPage lp=new LandingPage(driver);
	lp.getLogin().click();
	Thread.sleep(300);
	LoginPage log=new LoginPage(driver);
	log.getemail().sendKeys("abhi25goel");
	log.getpassword().sendKeys("function@01");
	log.loginbutton().click();
	Thread.sleep(300);
	driver.close();
	
	
	}
}
