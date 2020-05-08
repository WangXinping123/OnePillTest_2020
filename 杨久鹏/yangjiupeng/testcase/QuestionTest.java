package yangjiupeng.testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import yangjiupeng.base.BaseTest;
import yangjiupeng.dataprovider.TxtDataProvider;
import yangjiupeng.pages.HomePage;
import yangjiupeng.pages.LoginPage;
import yangjiupeng.pages.QuestionPage;
import yangjiupeng.pages.WelcamePage;
/**
 * 
 * @author 杨久鹏
 *
 */
public class QuestionTest extends BaseTest{
	
	@BeforeClass
	public void patient() throws InterruptedException{
		WelcamePage welcamePage = new WelcamePage(driver);
		welcamePage.patientLogin();
		//Assert.assertEquals(this.driver.currentActivity(), ".welcome.LoginActivity");
		Thread.sleep(2000);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.loginSuccess("123", "123");	
		//Assert.assertEquals(this.driver.currentActivity(), ".index.HomeActivity");
	}
	
	@Test(priority=1)
	public void kswz_Success(){	
		HomePage homePage = new HomePage(driver);
		homePage.goTo_inquiry();
		QuestionPage questionPage = new QuestionPage(driver); 
		questionPage.kswz_Success("test1", true, "这是一段测试", "");
		Assert.assertEquals(this.driver.currentActivity(), ".index.HomeActivity");
	}
	
	@DataProvider(name = "data")
	public Object[][] getExcelDada2() throws IOException{
		return new TxtDataProvider().getTxtUser("data/data.txt");
	}
	@Test(priority=1,dataProvider="data")
	public void kswz_title_test(String data){
		HomePage homePage = new HomePage(driver);
		homePage.goTo_inquiry();
		QuestionPage questionPage = new QuestionPage(driver); 
		questionPage.kswz_Success(data, true, "mian正常", "");
	}
	
	@Test(priority=1,dataProvider="data")
	public void kswz_main_test(String data){
		HomePage homePage = new HomePage(driver);
		homePage.goTo_inquiry();
		QuestionPage questionPage = new QuestionPage(driver); 
		questionPage.kswz_Success("title正常", true, data, "");
	}
	
	@Test(priority=1)
	public void kswz_outline_lose(){
		HomePage homePage = new HomePage(driver);
		homePage.goTo_inquiry();
		QuestionPage questionPage = new QuestionPage(driver); 
		questionPage.kswz_failed_lose_outline("这是标题","这是内容","");
	}
	
	@Test(priority=2)
	public void kswz_setAndBack(){
		HomePage homePage = new HomePage(driver);
		homePage.goTo_inquiry();
		QuestionPage questionPage = new QuestionPage(driver); 
		questionPage.kswz_failed_setAndBack("这是标题",true, "这是内容", "");
		assertEquals(this.driver.currentActivity(), ".index.HomeActivity");
		homePage = new HomePage(driver);
		homePage.goTo_inquiry();//进入快速问诊页面
		questionPage = new QuestionPage(driver);
		assertEquals(questionPage.kswz_title().getText(), "这是标题");		
	}
}
