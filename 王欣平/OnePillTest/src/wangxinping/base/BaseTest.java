package wangxinping.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.net.URL;

public abstract class BaseTest {

	private static AppiumDriverLocalService service;
	protected AndroidDriver<AndroidElement> driver;

	@BeforeSuite
	public void globalSetup() throws IOException {
		// service = AppiumDriverLocalService.buildDefaultService();
		// service.start();

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "127.0.0.1:5037");
		capabilities.setCapability("appPackage", "com.onepilltest");
		capabilities.setCapability("appActivity", ".welcome.WelcomeActivity");
		
		capabilities.setCapability("noReset", "true");

//		driver = new AndroidDriver<WebElement>(new URL("http://127.0.01:4723/wd/hub"), capabilities);
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.01:4723/wd/hub"), capabilities);

	}

//	@AfterSuite
//	public void globalTearDown() {
//		// service.stop();
//		this.driver.quit();
//	}

	public URL getServiceUrl() {
		return service.getUrl();
	}

}
