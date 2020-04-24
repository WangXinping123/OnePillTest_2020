package wangxinping.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import wangxinping.utils.BaseAction;

public class AddressPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public AddressPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	
	private AndroidElement btn_me() {
		return this.driver.findElementById("iv_me");
	}
	
	private AndroidElement btn_setting() {
		return this.driver.findElementById("iv_setting");
	}
	
	private AndroidElement setting_address() {
		return this.driver.findElementById("setting_user_address");
	}
	
	private AndroidElement first_address() {
		List<AndroidElement> list=this.driver.findElementsById("user_address_item_name");
		return list.get(0);
//		return this.driver.findElementById("user_address_item_name");
	}
	
	
	private AndroidElement edit_address_name() {
		return this.driver.findElementById("edit_address_name");
	}
	
	private AndroidElement edit_address_phoneNumber() {
		return this.driver.findElementById("edit_address_phoneNumber");
	}
	
	private AndroidElement edit_address_address() {
		return this.driver.findElementById("edit_address_address");
	}
	
	private AndroidElement edit_address_more() {
		return this.driver.findElementById("edit_address_more");
	}
	
	private AndroidElement edit_address_postalCode() {
		return this.driver.findElementById("edit_address_postalCode");
	}
	
	private AndroidElement btn_address_save() {
		return this.driver.findElementById("edit_address_save");
	}
	
	private AndroidElement btn_address_delet() {
		return this.driver.findElementById("edit_address_delet");
	}
	
	private AndroidElement user_info_back() {
		return this.driver.findElementById("edit_user_info_back");
	}
	
	public void to_setting() throws InterruptedException{
		action.click(btn_me());
		Thread.sleep(2000);
		action.click(btn_setting());
		Thread.sleep(2000);
		action.click(setting_address());
		Thread.sleep(2000);
	}
	
//	修改地址——收货人
	public String edit_address_name(String address_name) throws InterruptedException{
		Thread.sleep(3000);
		action.click(first_address());
		Thread.sleep(1000);
		action.typeAndclear(edit_address_name(), address_name);
		action.click(btn_address_save());
		return action.getToast();
	}
	
//	修改地址——手机号
	public String edit_address_phone(String address_phone) throws InterruptedException{
		Thread.sleep(3000);
		action.click(first_address());
		Thread.sleep(1000);
		action.typeAndclear(edit_address_phoneNumber(), address_phone);
		action.click(btn_address_save());
		return action.getToast();
	}
	
//	修改地址——地区信息
	public String edit_address_address(String address_address) throws InterruptedException{
		Thread.sleep(3000);
		action.click(first_address());
		Thread.sleep(1000);
		action.typeAndclear(edit_address_address(), address_address);
		action.click(btn_address_save());
		return action.getToast();
	}

//	修改地址——详细地址
	public String edit_address_more(String address_more) throws InterruptedException{
		Thread.sleep(3000);
		action.click(first_address());
		Thread.sleep(1000);
		action.typeAndclear(edit_address_more(),address_more);
		action.click(btn_address_save());
		return action.getToast();
	}
	
//	修改地址——邮政编码
	public String edit_address_postalCode(String address_code) throws InterruptedException{
		Thread.sleep(3000);
		action.click(first_address());
		Thread.sleep(1000);
		action.typeAndclear(edit_address_postalCode(),address_code);
		action.click(btn_address_save());
		return action.getToast();
	}
	


}

