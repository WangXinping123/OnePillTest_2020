package testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class MainTest extends BaseTest{
	HomePage homePage;
	@BeforeMethod
	public void login() throws Exception {
		LoginPage login=new LoginPage(driver);
		 homePage=login.loginSuccess("18831107935", "123456");
		 Thread.sleep(2000);
	}

	//点击我的
	@Test(priority=0)
	public void MainSuccess() throws Exception{
		homePage.Main();
		Thread.sleep(5000);
	}
	//点击进入我的订单
	@Test(priority=1)
	public void Order(){
		homePage.orderIn();
	}
	//点击进入购物车
	@Test(priority=1)
	public void Cart(){
		homePage.cartIn();
	}
	//点击进入钱包
	@Test(priority=1)
	public void Wallet(){
		homePage.walletIn();
	}
}
