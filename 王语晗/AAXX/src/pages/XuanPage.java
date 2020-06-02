package pages;



import com.microsoft.schemas.office.visio.x2012.main.impl.VisioDocumentDocument1Impl;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class XuanPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public XuanPage(AndroidDriver<AndroidElement> driver){
		this.driver=driver;
		this.action=new BaseAction(driver);
	}
	
	//进入xuanxuan
	private AndroidElement in_Xuan(){
		return driver.findElementByClassName("android.widget.TextView");
	}
	//登录
	public AndroidElement Login_user(){
		return driver.findElementByClassName("android.widget.EditText");
	}
	public AndroidElement Login_pwd(){
		return driver.findElementByXPath("//*[@text='密码']");
	}
	public AndroidElement Login_btn(){
		return driver.findElementByXPath("//*[@text='登录']");
	}
	
	//页面跳转至讨论组
	private AndroidElement discussGroup(){
		return driver.findElementByXPath("//*[@text='讨论组第 2 个标签，共 4 个']");
	}
	
	//页面跳转至联系人
	private AndroidElement relationship(){
		return driver.findElementByXPath("//*[@text='联系人第 3 个标签，共 4 个']");
	}
	
	//页面跳转至我的
	private AndroidElement mine(){
		return driver.findElementByXPath("//*[@text='我的第 4 个标签，共 4 个']");
	}
	
	//注销
	private AndroidElement out(){
		return driver.findElementByXPath("//*[@text='注销']");
	}
	
	//注销确认
	private AndroidElement out_sure(){
		return driver.findElementByXPath("//*[@text='确认']");
	}
	
	//选择联系人admin1
	private AndroidElement choose_relation(){
		return driver.findElementByXPath("//*[@text='Aadmin1[在线]']");
	}
	//点击开聊
	private AndroidElement start_chat(){
		return driver.findElementByXPath("//*[@text='开聊']");
	}
	//输入聊天内容
	private AndroidElement chat_content(){
		return driver.findElementByClassName("android.view.View");
	}
	//点击发送
	private AndroidElement send_chat(){
		return driver.findElementByXPath("//*[@text='发送']");
	}
	
	//点击聊天
	private AndroidElement chat(){
		return driver.findElementByXPath("//*[@text='聊天第 1 个标签，共 4 个']");
	}
	//回复消息
	private AndroidElement resend_content(){
		return driver.findElementByXPath("//*[@text='发送消息']");
	}

	//查看个人资料
	private AndroidElement person(){
		return driver.findElementByXPath("//*[@text='Aadmin1  @admin1http://192.168.0.104:11443']");
	}
	
	//发送邮件
	private AndroidElement send_email(){
		return driver.findElementByXPath("//*[@text='Email12@qq.com']");
	}
	
	//登录
	public void Xuan_Login(String name,String password) throws InterruptedException{
		action.click(in_Xuan());
		Thread.sleep(3000);
		action.type(Login_user(), name);
		action.type(Login_pwd(), password);
		action.click(Login_btn());
		Thread.sleep(3000);
	}
	
	//页面跳转至讨论组
	public void Xuan_discuss() throws InterruptedException{
		Thread.sleep(3000);
		action.click(discussGroup());
		Thread.sleep(3000);
	}
	
	//页面跳转至联系人
	public void Xuan_relationship() throws InterruptedException{
		Thread.sleep(3000);
		action.click(relationship());
		Thread.sleep(3000);
	}
	
	//页面跳转至我的
	public void Xuan_mine() throws InterruptedException{
		Thread.sleep(3000);
		action.click(mine());
		Thread.sleep(3000);
	}
	
	//注销
	public void Xuan_out() throws InterruptedException{
		action.click(mine());
		Thread.sleep(3000);
		action.click(out());
		Thread.sleep(3000);
		action.click(out_sure());
		Thread.sleep(3000);
	}
	
	//聊天
	public void Xuan_chat(String content) throws InterruptedException{
		action.click(relationship());
		Thread.sleep(3000);
		action.click(choose_relation());
		Thread.sleep(3000);
		action.click(start_chat());
		Thread.sleep(3000);
		action.type(chat_content(), content);
		action.click(send_chat());
		Thread.sleep(3000);
	}
	
	//查看联系人资料
	public void Xuan_rela() throws InterruptedException{
		action.click(relationship());
		Thread.sleep(3000);
		action.click(choose_relation());
		Thread.sleep(3000);
	}
	
	//查看个人资料
	public void Xuan_person() throws InterruptedException{
		action.click(person());
		Thread.sleep(3000);
	}
	
	//回复消息
	public void Xuan_resend(String content) throws InterruptedException{
		action.click(chat());
		Thread.sleep(3000);
		action.click(choose_relation());
		Thread.sleep(3000);
		action.type(resend_content(), content);
		action.click(send_chat());
		Thread.sleep(3000);
	}
	
	//发送邮件
	public void Xuan_email() throws InterruptedException{
		action.click(relationship());
		Thread.sleep(3000);
		action.click(choose_relation());
		Thread.sleep(3000);
		action.click(send_email());
		Thread.sleep(3000);
	}
	
	
}
