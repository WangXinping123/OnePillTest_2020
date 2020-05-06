package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class CartTest extends BaseTest{
	HomePage homePage;
	@BeforeClass
	public void login() throws Exception {
		//登录成功
		LoginPage login=new LoginPage(driver);
		homePage=login.loginSuccess("18831107935", "123456");
		Thread.sleep(2000);
		//点击我的
		homePage.Main();
		Thread.sleep(5000);
	}
	SoftAssert softAssert = new SoftAssert();
	//点击进入购物车
	@Test(priority=0)
	public void Cart() throws Exception{
		homePage.cartIn();
		softAssert.assertNotNull("购物车");
		Thread.sleep(2000);
	}
	//结算
	@Test(priority=1)
	public void Settlement(){
		homePage.Settlement();
		softAssert.assertNotNull("订单结算成功");
	}
	//返回
	@Test(priority=2)
	public void Back(){
		homePage.backCart();
		softAssert.assertNotNull("我的");
	}
}
