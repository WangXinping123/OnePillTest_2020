/*
 * 李晓月
 * 2017011749
 * 主要内容：找医生、帮助与反馈、关注与收藏
 */

package lixiaoyue.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import liixaoyue.utils.BaseAction;

public class WePage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public WePage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	
	
	//我的
	private AndroidElement bt_we() {
		return driver.findElementById("iv_me");
	}
	
	//帮助与反馈
	private AndroidElement bt_help() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.TextView");
	}
	
	//问题框
	private AndroidElement edit_question() {
		return driver.findElementById("add_content");
	}
	
	//提交按钮
	private AndroidElement bt_submit() {
		return driver.findElementById("help_submit");
	}
	
	//电话
	private AndroidElement edit_tel() {
		return driver.findElementById("help_tel");
	}
		
	//问题概述
	private AndroidElement edit_help() {
		return driver.findElementById("help_question");
	}
	
	//QQ
	private AndroidElement edit_QQ() {
		return driver.findElementById("help_QQ");
			
	}
	
	//关注与收藏
	private AndroidElement bt_get() {
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.widget.TextView");
			
	}
	
	//医生
	private AndroidElement bt_doc() {
		return driver.findElementById("focus_list_tab1");
				
	}	
	
	//药品
	private AndroidElement bt_med() {
		return driver.findElementById("focus_list_tab2");
				
	}
	
	//返回
	private AndroidElement bt_back() {
		return driver.findElementById("focus_list_back");
				
	}
	
	
//**********************************找医生*******************************//
	//首页
	private AndroidElement bt_first() {
		return driver.findElementById("iv_home");
	}
	
	//找医生
//	com.onepilltest:id/iv_find_doctor
	private AndroidElement bt_doctor() {
		return driver.findElementById("iv_find_doctor");
	}
	
	//搜索框
//	com.onepilltest:id/findoctor_select
	private AndroidElement select_find() {
		return driver.findElementById("findoctor_select");
	}
	
	//搜索按钮
	private AndroidElement btn_select() {
		return driver.findElementById("img_select");
	}
	
	
	//病症
	private AndroidElement btn_ill(String ill) {
		return driver.findElementById(ill);
	}

	//返回键
	private AndroidElement btn_back() {
		return driver.findElementById("dc_details_back");
	}
	
	
//**************************************方法*******************************************//	
	
	
	
				//*****************帮助与反馈*************//	
	//点击我们
	public void click_we() throws Exception {
		action.click(bt_we());
		Thread.sleep(2000);
	}
	
	//输入问题
	public void edit_question(String help) throws InterruptedException{
		action.click(bt_help());
		Thread.sleep(3000);
		action.typeAndclear(edit_question(), help);
		Thread.sleep(2000);
		action.click(bt_submit());
		Thread.sleep(2000);
	}
	
	//输入问题和电话
	public void edit_question_tel(String tel) throws InterruptedException{
		action.click(bt_help());
		Thread.sleep(3000);
		action.typeAndclear(edit_question(), "哈哈哈");
		Thread.sleep(2000);
		action.typeAndclear(edit_tel(), tel);
		Thread.sleep(2000);
		action.click(bt_submit());
		Thread.sleep(2000);
	}
	
	//输入问题、电话、问题概述
	public void edit_question_tel_help(String question) throws InterruptedException{
		action.click(bt_help());
		Thread.sleep(3000);
		action.typeAndclear(edit_question(), "哈哈哈");
		Thread.sleep(2000);
		action.typeAndclear(edit_tel(), "12345678945");
		Thread.sleep(2000);
		action.typeAndclear(edit_help(), question);
		Thread.sleep(2000);
		action.click(bt_submit());
		Thread.sleep(2000);
	}
	
	//输入问题、电话、问题概述、QQ
	public void edit_question_tel_help_QQ(String QQ) throws InterruptedException{
		action.click(bt_help());
		Thread.sleep(3000);
		action.typeAndclear(edit_question(), "哈哈哈");
		Thread.sleep(2000);
		action.typeAndclear(edit_tel(), "12345678945");
		Thread.sleep(2000);
		action.typeAndclear(edit_help(), "呵呵呵");
		Thread.sleep(2000);
		action.typeAndclear(edit_QQ(), QQ);
		Thread.sleep(2000);
		action.click(bt_submit());
		Thread.sleep(2000);
	}
	
	         //***************关注与收藏*****************//	
	//点击关注与收藏
	public void click_get() throws Exception {
		Thread.sleep(1000);
		action.click(bt_get());
		Thread.sleep(2000);
	}
	
	//点击医生
	public void click_doc() throws Exception {
		Thread.sleep(1000);
		action.click(bt_doc());
		Thread.sleep(2000);
	}
	
	//点击药品
	public void click_med() throws Exception {
		Thread.sleep(1000);
		action.click(bt_med());
		Thread.sleep(2000);
	}
	
	//点击返回
	public void click_back() throws Exception {
		Thread.sleep(1000);
		action.click(bt_back());
		Thread.sleep(2000);
	}
	
	
           //*****************找医生******************//		
		
	//点击首页
	public void click_first() throws Exception {
		action.click(bt_first());
		Thread.sleep(2000);
	}
	
	
	
	//找医生
	public void find_Doctor() throws Exception {
		action.click(bt_doctor());
		Thread.sleep(2000);
	}
		
	//输入搜索信息
	public String select_Doctor(String data) throws InterruptedException{
		Thread.sleep(3000);
		action.typeAndclear(select_find(), data);
		Thread.sleep(2000);
		action.click(btn_select());
		Thread.sleep(2000);
		return action.getToast();
	}
		
	//点击病症搜索
	public void select_ill1(String ill) throws InterruptedException{
		Thread.sleep(1000);
		action.click(btn_ill(ill));
		Thread.sleep(4000);
		action.click(btn_back());
		Thread.sleep(1500);
	}
}
