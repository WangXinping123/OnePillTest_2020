package pages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class HomePage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public HomePage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	//�ҵ�
	private AndroidElement tab_spec_me() {
		return driver.findElementById("tab_spec_me");
	}
	//����
	private AndroidElement order() {
		return driver.findElementById("ll_order");
	}
	//���ذ�ť
	private AndroidElement back(){
		return driver.findElementById("setting_order_back");
	}
	//���ﳵ
	private AndroidElement cart() {
		return driver.findElementById("ll_cart");
	}
	//���ذ�ť
	private AndroidElement cartback(){
		return driver.findElementById("cart_back");
	}
	//Ǯ��
	private AndroidElement wallet() {
		return driver.findElementById("ll_wallet");
	}
	//���ذ�ť
	private AndroidElement walletback(){
		return driver.findElementById("wallet_back");
	}
	//��������ҵĽ���
	public void Main(){
		action.click(tab_spec_me());
	}
	//��������ҵĶ���
	public void orderIn(){
		action.click(order());
		action.click(back());
	}
	//������빺�ﳵ
	public void cartIn(){
		action.click(cart());
		action.click(cartback());
	}
	//�������Ǯ��
	public void walletIn(){
		action.click(wallet());
		action.click(walletback());
	}
}
