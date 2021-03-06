package yangshuo.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import yangshuo.utils.BaseAction;


public class WelcamePage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public WelcamePage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	
	public AndroidElement linear_patient(){
		return this.driver.findElementById("linear_patient");		
	}
	public AndroidElement linear_doctor(){
		return this.driver.findElementById("linear_doctor");		
	}
	public LoginPage patientLogin() {
		
		action.click(linear_patient());
		return new LoginPage(driver);
	}
}