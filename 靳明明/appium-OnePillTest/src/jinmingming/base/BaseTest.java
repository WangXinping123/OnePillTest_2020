package jinmingming.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.net.URL;
/**
 * 项目名称：OnePillTest   
 * 类名称：BaseTest   
 * 类描述： 
 * @author jinmingming 
 * @version  
 */
public class BaseTest {
	private static AppiumDriverLocalService service;
	public AndroidDriver<AndroidElement> driver;

	@BeforeSuite
	public void globalSetup() throws Exception {
		// service = AppiumDriverLocalService.buildDefaultService();
		// service.start();

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName","Pixel_XL_API_R");
		capabilities.setCapability("appPackage", "com.onepilltest");
		capabilities.setCapability("appActivity", ".welcome.WelcomeActivity");

		capabilities.setCapability("noReset", "true");

		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
	}

	@AfterSuite
	public void globalTearDown() {
		// service.stop();
		this.driver.quit();
	}

	public URL getServiceUrl() {
		return service.getUrl();
	}
}
