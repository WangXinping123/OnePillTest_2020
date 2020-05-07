package pages;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.apache.xmlbeans.impl.xb.xsdschema.impl.PublicImpl;
import org.openqa.selenium.By;
import org.seleniumhq.jetty9.security.authentication.LoginAuthenticator;

import utils.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class FindMedicinal {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public FindMedicinal(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	
	private AndroidElement user_login() {
		return driver.findElementById("com.onepilltest:id/linear_patient");
	}
	private AndroidElement user_name() {
		return driver.findElementById("com.onepilltest:id/edit_phone");
	}
	private AndroidElement user_password() {
		return driver.findElementById("com.onepilltest:id/edit_password");
	}
	private AndroidElement btn_userlogin() {
		return driver.findElementById("com.onepilltest:id/btn_login");
	}
	private AndroidElement find_medicinal() {
		return driver.findElementById("com.onepilltest:id/iv_find_medicine");
	}
	private AndroidElement search_text() {
		return driver.findElementById("com.onepilltest:id/findpatient_select");
	}
	private AndroidElement search_btn() {
		return driver.findElementById("com.onepilltest:id/img_findpa_select");
	}
	private AndroidElement olders_medicinal() {
		return driver.findElementById("com.onepilltest:id/findpatient_olds");
	}
	
	private AndroidElement buluofen() {
		return driver.findElementById("com.onepilltest:id/btn_1");
	}
	private AndroidElement btn_follow() {
		return driver.findElementByXPath("//*[@text='收藏']");
	}
	private AndroidElement btn_unfollow() {
		return driver.findElementByXPath("//*[@text='已收藏']");
	}
	private AndroidElement btn_ask() {
		return driver.findElementByXPath("//*[@text='咨询']");
	}
	private AndroidElement btn_summary() {
		return driver.findElementByXPath("//*[@text='概述']");
	}
	private AndroidElement btn_func() {
		return driver.findElementByXPath("//*[@text='功能主治']");
	}
	private AndroidElement btn_effect() {
		return driver.findElementByXPath("//*[@text='副作用']");
	}
	private AndroidElement btn_use() {
		return driver.findElementByXPath("//*[@text='使用说明']");
	}
	private AndroidElement btn_shop() {
		return driver.findElementByXPath("//*[@text='添加至购物车']");
	}
	
	private AndroidElement btn_tel() {
		return driver.findElementByXPath("//*[@text='联系电话']");
	}
	
	private AndroidElement btn_back() {
		return driver.findElementById("com.onepilltest:id/findpatient_left");
	}
	private AndroidElement btn_doc_back() {
		return driver.findElementById("com.onepilltest:id/dc_details_back");
	}
	private AndroidElement btn_doc_fol(){
		return driver.findElementById("com.onepilltest:id/doctor_focus_img");
	}
	public void find(){
		action.click(find_medicinal());
	}
	public void search(String content) throws InterruptedException {
		action.click(find_medicinal());
		Thread.sleep(2000);
		action.type(search_text(), content);
		Thread.sleep(2000);
		action.click(search_btn());
		
	}
	public void login(String username,String password) throws InterruptedException{
		action.click(user_login());
		Thread.sleep(2000);
		action.type(user_name(), username);
		Thread.sleep(2000);
		action.type(user_password(), password);
		Thread.sleep(2000);
		action.click(btn_userlogin());
	}
	public void blf() throws InterruptedException{
		action.click(find_medicinal());
		Thread.sleep(2000);
		action.click(buluofen());
	}
	public void follow(){
		action.click(btn_follow());
	}
	public void unfollow(){
		action.click(btn_unfollow());
	}
	public void buy(){
		action.click(btn_shop());
	}
	public void func(){
		action.click(btn_func());
	}
	public void effect(){
		action.click(btn_effect());
	}
	public void use(){
		action.click(btn_use());
	}
	public void ask(){
		action.click(btn_ask());
	}
	public void swip(PointOption fromOption, PointOption toOption){
		action.swip(fromOption, toOption);
	}
	public void doc_fol(){
		action.click(btn_doc_fol());
	}
	public void back(){
		action.click(btn_back());
	}
	public void doc_back(){
		action.click(btn_doc_back());
	}
}
