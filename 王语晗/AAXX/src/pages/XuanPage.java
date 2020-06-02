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
	
	//����xuanxuan
	private AndroidElement in_Xuan(){
		return driver.findElementByClassName("android.widget.TextView");
	}
	//��¼
	public AndroidElement Login_user(){
		return driver.findElementByClassName("android.widget.EditText");
	}
	public AndroidElement Login_pwd(){
		return driver.findElementByXPath("//*[@text='����']");
	}
	public AndroidElement Login_btn(){
		return driver.findElementByXPath("//*[@text='��¼']");
	}
	
	//ҳ����ת��������
	private AndroidElement discussGroup(){
		return driver.findElementByXPath("//*[@text='������� 2 ����ǩ���� 4 ��']");
	}
	
	//ҳ����ת����ϵ��
	private AndroidElement relationship(){
		return driver.findElementByXPath("//*[@text='��ϵ�˵� 3 ����ǩ���� 4 ��']");
	}
	
	//ҳ����ת���ҵ�
	private AndroidElement mine(){
		return driver.findElementByXPath("//*[@text='�ҵĵ� 4 ����ǩ���� 4 ��']");
	}
	
	//ע��
	private AndroidElement out(){
		return driver.findElementByXPath("//*[@text='ע��']");
	}
	
	//ע��ȷ��
	private AndroidElement out_sure(){
		return driver.findElementByXPath("//*[@text='ȷ��']");
	}
	
	//ѡ����ϵ��admin1
	private AndroidElement choose_relation(){
		return driver.findElementByXPath("//*[@text='Aadmin1[����]']");
	}
	//�������
	private AndroidElement start_chat(){
		return driver.findElementByXPath("//*[@text='����']");
	}
	//������������
	private AndroidElement chat_content(){
		return driver.findElementByClassName("android.view.View");
	}
	//�������
	private AndroidElement send_chat(){
		return driver.findElementByXPath("//*[@text='����']");
	}
	
	//�������
	private AndroidElement chat(){
		return driver.findElementByXPath("//*[@text='����� 1 ����ǩ���� 4 ��']");
	}
	//�ظ���Ϣ
	private AndroidElement resend_content(){
		return driver.findElementByXPath("//*[@text='������Ϣ']");
	}

	//�鿴��������
	private AndroidElement person(){
		return driver.findElementByXPath("//*[@text='Aadmin1  @admin1http://192.168.0.104:11443']");
	}
	
	//�����ʼ�
	private AndroidElement send_email(){
		return driver.findElementByXPath("//*[@text='Email12@qq.com']");
	}
	
	//��¼
	public void Xuan_Login(String name,String password) throws InterruptedException{
		action.click(in_Xuan());
		Thread.sleep(3000);
		action.type(Login_user(), name);
		action.type(Login_pwd(), password);
		action.click(Login_btn());
		Thread.sleep(3000);
	}
	
	//ҳ����ת��������
	public void Xuan_discuss() throws InterruptedException{
		Thread.sleep(3000);
		action.click(discussGroup());
		Thread.sleep(3000);
	}
	
	//ҳ����ת����ϵ��
	public void Xuan_relationship() throws InterruptedException{
		Thread.sleep(3000);
		action.click(relationship());
		Thread.sleep(3000);
	}
	
	//ҳ����ת���ҵ�
	public void Xuan_mine() throws InterruptedException{
		Thread.sleep(3000);
		action.click(mine());
		Thread.sleep(3000);
	}
	
	//ע��
	public void Xuan_out() throws InterruptedException{
		action.click(mine());
		Thread.sleep(3000);
		action.click(out());
		Thread.sleep(3000);
		action.click(out_sure());
		Thread.sleep(3000);
	}
	
	//����
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
	
	//�鿴��ϵ������
	public void Xuan_rela() throws InterruptedException{
		action.click(relationship());
		Thread.sleep(3000);
		action.click(choose_relation());
		Thread.sleep(3000);
	}
	
	//�鿴��������
	public void Xuan_person() throws InterruptedException{
		action.click(person());
		Thread.sleep(3000);
	}
	
	//�ظ���Ϣ
	public void Xuan_resend(String content) throws InterruptedException{
		action.click(chat());
		Thread.sleep(3000);
		action.click(choose_relation());
		Thread.sleep(3000);
		action.type(resend_content(), content);
		action.click(send_chat());
		Thread.sleep(3000);
	}
	
	//�����ʼ�
	public void Xuan_email() throws InterruptedException{
		action.click(relationship());
		Thread.sleep(3000);
		action.click(choose_relation());
		Thread.sleep(3000);
		action.click(send_email());
		Thread.sleep(3000);
	}
	
	
}
