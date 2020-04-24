package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class LoginPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public LoginPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	//��¼��ť
	public AndroidElement edit_login(){
		return this.driver.findElementById("linear_patient");
	}
	//�û��ֻ���
	public AndroidElement edit_phone() {
		return this.driver.findElementById("edit_phone");
	}
	//�û�����
	public AndroidElement edit_password() {
		return this.driver.findElementById("edit_password");
	}
	//�ύ��ť
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
