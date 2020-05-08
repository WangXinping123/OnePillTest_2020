package jinmingming.pages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import jinmingming.utils.BaseAction;

/**
 * 项目名称：OnePillTest   
 * 类名称：HomePage   
 * 类描述： 
 * @author jinmingming
 * @version  
 */
public class HomePage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public HomePage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	/*———————————————定位元素—————————————*/
	//我的
	private AndroidElement tab_spec_me() {
		return driver.findElementById("tab_spec_me");
	}
	/*-----------订单----------*/
	private AndroidElement order() {
		return driver.findElementById("ll_order");
	}
	//返回按钮
	private AndroidElement back(){
		return driver.findElementById("setting_order_back");
	}
	
	/*-----------购物车----------*/
	private AndroidElement cart() {
		return driver.findElementById("ll_cart");
	}
	//返回按钮
	private AndroidElement cartback(){
		return driver.findElementById("cart_back");
	}
	//结算
	private AndroidElement cartSettlement() {
		return driver.findElementById("btn_cart_settlement");
	}
	/*-----------钱包----------*/
	private AndroidElement wallet() {
		return driver.findElementById("ll_wallet");
	}
	//返回按钮
	private AndroidElement walletback(){
		return driver.findElementById("wallet_back");
	}
	//提现按钮
	private AndroidElement MoneyOut(){
		return driver.findElementById("wallet_out");
	}
	//充值按钮
	private AndroidElement MoneyIn(){
		return driver.findElementById("wallet_in");
	}
	/*————————————————调用方法————————————————*/
	//点击进入我的界面
	public void Main(){
		action.click(tab_spec_me());
	}
	/*-----------我的订单----------*/
	//点击进入我的订单
	public void orderIn(){
		action.click(order());
	}
	//返回
	public void backOrder(){
		action.click(back());
	}
	/*-----------购物车----------*/
	//点击进入购物车
	public void cartIn(){
		action.click(cart());
	}
	//结算
	public void Settlement(){
		action.click(cartSettlement());
	}
	//返回
	public void backCart(){
		action.click(cartback());
	}
	/*-----------钱包----------*/
	
	//点击进入钱包
	public void walletIn(){
		action.click(wallet());
	}
	//提现
	public void Out(){
		action.click(MoneyOut());
	}
	//充值
	public void In(){
		action.click(MoneyIn());
	}
	//返回
	public void backWallet(){
		action.click(walletback());
	}
}
