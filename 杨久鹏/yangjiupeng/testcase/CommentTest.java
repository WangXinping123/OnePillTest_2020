package yangjiupeng.testcase;

import static org.testng.Assert.assertEquals;

import java.util.jar.Attributes.Name;

import org.testng.annotations.Test;

import yangjiupeng.base.BaseTest;
import yangjiupeng.pages.CommentPage;
import yangjiupeng.pages.HomePage;
import yangjiupeng.pages.LoginPage;
import yangjiupeng.pages.WelcamePage;

public class CommentTest extends BaseTest{
	
	@Test(priority=1)
	public void patient() throws InterruptedException{
		WelcamePage welcamePage = new WelcamePage(driver);
		welcamePage.patientLogin();
		//Assert.assertEquals(this.driver.currentActivity(), ".welcome.LoginActivity");
		Thread.sleep(2000);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.loginSuccess("123", "123");		
		//Assert.assertEquals(this.driver.currentActivity(), ".index.HomeActivity");
	}
	
//	@Test(priority=2)
//	public void commentSuccess() throws InterruptedException{
//		HomePage homePage = new HomePage(driver);
//		homePage.goTo_comment();
//		CommentPage commentPage = new CommentPage(driver);
//		commentPage.comment("这是一次测试");
//		assertEquals(commentPage.latest_comment().getText(), "这是一次测试");
//	}
//	
//	@Test(priority=2)
//	public void click_userimg(){
//		HomePage homePage = new HomePage(driver);
//		homePage.goTo_comment();
//		CommentPage commentPage = new CommentPage(driver);
//		commentPage.iv_commenterImg().click();		
//	}
	
	@Test(priority=2)
	public void click_username(){
		HomePage homePage = new HomePage(driver);
		homePage.goTo_comment();
		CommentPage commentPage = new CommentPage(driver);
//		String name = commentPage.tv_commenter_name().getText();
//		System.out.println(name);
		commentPage.tv_commenter_name().click();
	}
	
	@Test(priority=2)
	public void click_content(){
		HomePage homePage = new HomePage(driver);
		homePage.goTo_comment();
		CommentPage commentPage = new CommentPage(driver);
//		String name = commentPage.tv_commenter_name().getText();
//		System.out.println(name);
		commentPage.tv_commenter_content().click();
	}
	
	@Test(priority=2)
	public void returnpage(){
		HomePage homePage = new HomePage(driver);
		homePage.goTo_comment();
		CommentPage commentPage = new CommentPage(driver);
		commentPage.setAndLeft("是否保存草稿？");
		homePage.goTo_comment();
		commentPage = new CommentPage(driver);
		assertEquals(commentPage.et_comment(), "是否保存草稿？");
	}
}
