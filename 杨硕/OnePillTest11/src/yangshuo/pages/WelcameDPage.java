package yangshuo.pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import yangshuo.utils.BaseAction;


public class WelcameDPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public WelcameDPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	

	public AndroidElement linear_doctor(){
		return this.driver.findElementById("linear_doctor");		
	}
	public LoginPage patientLogin() {
		
		action.click(linear_doctor());
		return new LoginPage(driver);
	}







}
