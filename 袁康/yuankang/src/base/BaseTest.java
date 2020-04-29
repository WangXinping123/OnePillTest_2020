package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {
	URL url;
	public AndroidDriver<AndroidElement> driver;
	Dimension dimension;

	@BeforeClass
	public void startUp() throws MalformedURLException {
		url = new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "127.0.0.1:5037");
		cap.setCapability("appPackage", "com.onepilltest");
		cap.setCapability("appActivity", ".welcome.WelcomeActivity");
		cap.setCapability("noReset","true");
		
		driver = new AndroidDriver<AndroidElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dimension = driver.manage().window().getSize();
		System.out.println(driver);
	
	}
}