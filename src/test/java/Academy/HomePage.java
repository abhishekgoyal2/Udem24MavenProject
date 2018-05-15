package Academy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends BaseUd {
@Test(dataProvider="getData")
//	@Test
	public void basePageNavigation(String username,String Password,String text) throws IOException, InterruptedException
	{
	  BaseUd base=new HomePage();
	 driver= base.intializeDriver();
	 driver.get("http://www.qaclickacademy.com/");
	 
	LandingPage lp=new LandingPage(driver);
	lp.getLogin().click();
	Thread.sleep(300);
	LoginPage log=new LoginPage(driver);
	log.getemail().sendKeys(username);
	log.getpassword().sendKeys(Password);
	log.loginbutton().click();
	System.out.println(text);
	Thread.sleep(300);
	driver.close();
	
	
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//row stands for different data types test should run
		//column stands for how many values per each test
		Object[][] data	=new Object[2][3];
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		data[0][2]="restricted user";
		
		data[1][0]="restricteduser@qw.com";
				data[1][1]="2345";
				data[1][2]="nonrestricteduser";
				
				return data;
	}
}
