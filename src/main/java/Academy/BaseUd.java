package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


@SuppressWarnings("unused")
public class BaseUd {
	public WebDriver driver;

	public WebDriver intializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\udemy prac\\Udem24MavenProject\\src\\main\\java\\Academy\\datadriven.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");

		// Execute in Firefox driver
		if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("pass");
		}

		// Execute in Chrome driver

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		}

//		driver.get(prop.getProperty("url"));

		// Execute in IE driver

		if (browsername.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Projects\\IEDriverServer_x64_2.53.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	
}