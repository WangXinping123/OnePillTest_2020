package jinmingming.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import jinmingming.base.BaseTest;
import jinmingming.pages.HomePage;
import jinmingming.pages.LoginPage;
/**
 * 项目名称：OnePillTest   
 * 类名称：WalletTest   
 * 类描述： 
 * @author jinmingming
 * @version  
 */
public class WalletTest extends BaseTest{
	HomePage homePage;
	@BeforeClass
	public void login() throws Exception {
		LoginPage login=new LoginPage(driver);
		 homePage=login.loginSuccess("18831107935", "123456");
		 Thread.sleep(2000);
	}
	SoftAssert softAssert = new SoftAssert();
	//点击进入钱包
	@Test(priority=0)
	public void Wallet(){
		homePage.walletIn();
		softAssert.assertNotNull("余额");
	}
	//提现
	@Test(priority=1)
	public void MoneyOut(){
		homePage.Out();
	}
	//充值
	@Test(priority=1)
	public void MoneyIn(){
		homePage.In();
	}
	//返回
	@Test(priority=1)
	public void back(){
		homePage.backWallet();
		softAssert.assertNotNull("我的");
	}
}
