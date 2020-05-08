package wangxinping.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import wangxinping.utils.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

/**
 * 项目名称：OnePillTest   
 * 类名称：UserInfoPage   
 * 类描述： 
 * @author wangxinping 
 * @version  
 */
public class UserInfoPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public UserInfoPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}

	private AndroidElement user_login() {
		return this.driver.findElementById("linear_patient");
	}

	private AndroidElement input_phone() {
		return this.driver.findElementById("edit_phone");
	}

	private AndroidElement input_password() {
		return this.driver.findElementById("edit_password");
	}

	private AndroidElement btn_submit() {
		return this.driver.findElementById("btn_login");
	}
	
	private AndroidElement btn_me() {
		return this.driver.findElementById("iv_me");
	}
	
	private AndroidElement btn_setting() {
		return this.driver.findElementById("iv_setting");
	}
	
	private AndroidElement setting_nickName() {
		return this.driver.findElementById("setting_lin_nickName");
	}
	
	private AndroidElement setting_phone() {
		return this.driver.findElementById("setting_lin_phone");
	}
	
	
	private AndroidElement edit_nickName() {
		return this.driver.findElementById("edit_user_info_nickName");
	}
	
	private AndroidElement edit_PID() {
		return this.driver.findElementById("edit_user_info_PID");
	}
	
	private AndroidElement edit_password() {
		return this.driver.findElementById("edit_user_info_password");
	}
	
	private AndroidElement edit_phone() {
		return this.driver.findElementById("edit_user_info_phone");
	}
	
	private AndroidElement btn_save() {
		return this.driver.findElementById("edit_user_info_save");
	}
	private AndroidElement user_info_back() {
		return this.driver.findElementById("edit_user_info_back");
	}
	

	public AddressPage login(String phone, String password) throws InterruptedException {

		action.click(user_login());
		Thread.sleep(2000);
		action.type(input_phone(), phone);
		action.type(input_password(), password);
		action.click(btn_submit());

		return new AddressPage(driver);
	}
	
	public void to_setting() throws InterruptedException{
		action.click(btn_me());
		Thread.sleep(2000);
		action.click(btn_setting());
		Thread.sleep(2000);
	}
	
//	个人信息——修改昵称   成功
	public String edit_user_nickname_success(String nickname) throws InterruptedException{
		Thread.sleep(3000);
		action.click(setting_nickName());
		Thread.sleep(2000);
		action.typeAndclear(edit_nickName(),nickname);
		action.click(btn_save());
		return action.getToast();
	}

//	个人信息——修改昵称  失败
	public String edit_user_nickname_fail(String nickname) throws InterruptedException{
		Thread.sleep(3000);
		
		if(driver.getPageSource().contains("设置")){
			action.click(setting_nickName());
			Thread.sleep(2000);
		}
		action.typeAndclear(edit_nickName(),nickname);
		action.click(btn_save());	
		return action.getToast();

//		AssertJUnit.assertTrue(driver.isTextPresent("admin"));

	}
	
//	个人信息——修改身份证号码
	public String edit_user_PID(String PID) throws InterruptedException{
		Thread.sleep(3000);
		action.click(setting_nickName());
		Thread.sleep(2000);
		action.typeAndclear(edit_PID(), PID);
		action.click(btn_save());
		
		return action.getToast();
	}
	
//	个人信息——修改密码
	public String edit_user_password(String pwd) throws InterruptedException{
	
		Thread.sleep(3000);
		action.click(setting_nickName());
		Thread.sleep(2000);
		action.typeAndclear(edit_password(),pwd);
		action.click(btn_save());
	   	
		return action.getToast();
	}
	
//	点击返回
	public void click_back() throws InterruptedException{
		action.click(user_info_back());
		Thread.sleep(3000);
		action.click(setting_phone());
		Thread.sleep(3000);
	}

//	个人信息——修改手机号码
	public String edit_user_phone(String phone) throws InterruptedException{
		Thread.sleep(3000);
		action.typeAndclear(edit_phone(), phone);
		action.click(btn_save());
		
		return action.getToast();
	}
	
}