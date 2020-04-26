package yangjiupeng.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import yangjiupeng.base.BaseTest;
import yangjiupeng.pages.HomePage;
import yangjiupeng.pages.LoginPage;
import yangjiupeng.pages.QuestionPage;
import yangjiupeng.pages.WelcamePage;

public class LoginTest extends BaseTest{
	QuestionPage questionPage = new QuestionPage(driver);
	// welcame
	@Test(priority=1)
	public void patient(){
		WelcamePage welcamePage = new WelcamePage(driver);
		welcamePage.patientLogin();
		Assert.assertEquals(this.driver.currentActivity(), ".welcome.LoginActivity");
	}
	
	@Test(priority=2)
	public void loginSucess() throws InterruptedException {		
		Thread.sleep(2000);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.loginSuccess("123", "123");
		Assert.assertEquals(this.driver.currentActivity(), ".index.HomeActivity");
	}
	
	//************问诊***************
	
	@Test(priority=3)
	public void kswz_Success(){		
		questionPage.kswz_Success("test1", true, "这是一段测试", "");
		Assert.assertEquals(this.driver.currentActivity(), ".index.HomeActivity");
	}
	
	@Test
	public void kswz_title_test(){
		questionPage.kswz_Success("", true, "这是一段测试", "");
	}
	
	@Test
	public void kswz_main_test(){
		questionPage.kswz_Success("", true, "这是一段测试", "");
	}
	
	@Test
	public void kswz_outline_lose(){
		questionPage.kswz_failed_lose_outline("这是标题","这是内容","");
	}
	
	@Test 
	public void kswz_setAndBack(){
		questionPage.kswz_failed_setAndBack("这是标题",true, "这是内容", "");
		assertEquals(this.driver.currentActivity(), ".index.HomeActivity");
		HomePage homePage = new HomePage(driver);
		homePage.goTo_inquiry();//进入快速问诊页面
		QuestionPage questionPage = new QuestionPage(driver);
		assertEquals(questionPage.kswz_title().getText(), "这是标题");		
	}
	
	
	
}
