package yangjiupeng.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {
	 public AndroidDriver<AndroidElement> driver;

	  @BeforeClass
	  public void startUp() throws MalformedURLException {
	    DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability("platformName", "Android");
	    cap.setCapability("deviceName", "127.0.0.1:62001");
	    cap.setCapability("appPackage", "com.onepilltest");
	    cap.setCapability("appActivity", ".welcome.WelcomeActivity");
	    cap.setCapability("noReset", "true");


	    driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	  
	  @AfterClass
	  public void tearDown() {
	    driver.quit();
	  }
}
