package jinmingming.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import jinmingming.base.BaseTest;
import jinmingming.pages.HomePage;
import jinmingming.pages.LoginPage;
/**
 * 项目名称：OnePillTest   
 * 类名称：MainTest   
 * 类描述： 
 * @author jinmingming
 * @version  
 */
public class MainTest extends BaseTest{
	HomePage homePage;
	@BeforeClass
	public void login() throws Exception {
		LoginPage login=new LoginPage(driver);
		 homePage=login.loginSuccess("18831107935", "123456");
		 Thread.sleep(2000);
	}
	SoftAssert softAssert = new SoftAssert();
	//点击我的
	@Test(priority=0)
	public void MainSuccess() throws Exception{
		homePage.Main();
		softAssert.assertNotNull("我的");
		Thread.sleep(5000);
	}
	//点击进入我的订单
	@Test(priority=1)
	public void Order() throws Exception{
		homePage.orderIn();
		Thread.sleep(200);
		softAssert.assertNotNull("订单");
	}
	//返回
	@Test(priority=2)
	public void Back()throws Exception{
		homePage.backOrder();
		Thread.sleep(200);
		softAssert.assertNotNull("我的");
	}

}
