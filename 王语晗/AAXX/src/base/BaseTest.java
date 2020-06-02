package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseTest {
	private static AppiumDriverLocalService service;
	public AndroidDriver<AndroidElement> driver;
	@BeforeSuite
	public void globalSetup() throws MalformedURLException{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "127.0.0.1:62001");
		//运行某个app
		cap.setCapability("appPackage", "com.vphone.launcher");
		//运行某个Activity
		cap.setCapability("appActivity", ".LoginActivity");
		cap.setCapability("noReset", "true");
		driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	}
	@AfterSuite
	public void globalTearDown(){
		this.driver.quit();
	}
	public URL getServiceUrl(){
		return service.getUrl();
	}
}
