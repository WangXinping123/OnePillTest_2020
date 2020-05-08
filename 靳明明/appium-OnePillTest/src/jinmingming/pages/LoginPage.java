package jinmingming.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import jinmingming.utils.BaseAction;
/**
 * 项目名称：OnePillTest   
 * 类名称：LoginPage   
 * 类描述： 
 * @author jinmingming
 * @version  
 */
public class LoginPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public LoginPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	//登录按钮
	public AndroidElement edit_login(){
		return this.driver.findElementById("linear_patient");
	}
	//用户手机号
	public AndroidElement edit_phone() {
		return this.driver.findElementById("edit_phone");
	}
	//用户密码
	public AndroidElement edit_password() {
		return this.driver.findElementById("edit_password");
	}
	//提交按钮
	public AndroidElement btn_submit() {
		return this.driver.findElementById("btn_login");
	}
	public HomePage loginSuccess(String phone, String password) throws Exception {
		action.click(edit_login());
		Thread.sleep(2000);
		action.type(edit_phone(), phone);
		action.type(edit_password(), password);
		action.click(btn_submit());

		return new HomePage(driver);
	}

}
