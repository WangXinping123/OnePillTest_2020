package yangshuo.pages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import yangshuo.utils.BaseAction;
/**
 * 
 * @author 鏉ㄤ箙楣�
 *
 */
public class LoginPage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public LoginPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	
	public AndroidElement edit_phone(){
		return this.driver.findElementById("edit_phone");
	}
	
	public AndroidElement edit_password(){
		return this.driver.findElementById("edit_password");
	}
	
	public AndroidElement btn_login(){
		return this.driver.findElementById("btn_login");
	}
	
	public AndroidElement btn_login_ceshi() {
		return this.driver.findElementById("ceshi");
	}
	
	public HomePage loginSuccess(String name, String password) {

		action.type(edit_phone(), name);
		action.type(edit_password(), password);
		action.click(btn_login());

		return new HomePage(driver);
	}
}
