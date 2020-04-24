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
	//我的
	private AndroidElement tab_spec_me() {
		return driver.findElementById("tab_spec_me");
	}
	//订单
	private AndroidElement order() {
		return driver.findElementById("ll_order");
	}
	//返回按钮
	private AndroidElement back(){
		return driver.findElementById("setting_order_back");
	}
	//购物车
	private AndroidElement cart() {
		return driver.findElementById("ll_cart");
	}
	//返回按钮
	private AndroidElement cartback(){
		return driver.findElementById("cart_back");
	}
	//钱包
	private AndroidElement wallet() {
		return driver.findElementById("ll_wallet");
	}
	//返回按钮
	private AndroidElement walletback(){
		return driver.findElementById("wallet_back");
	}
	//点击进入我的界面
	public void Main(){
		action.click(tab_spec_me());
	}
	//点击进入我的订单
	public void orderIn(){
		action.click(order());
		action.click(back());
	}
	//点击进入购物车
	public void cartIn(){
		action.click(cart());
		action.click(cartback());
	}
	//点击进入钱包
	public void walletIn(){
		action.click(wallet());
		action.click(walletback());
	}
}
