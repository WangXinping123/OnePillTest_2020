package yangjiupeng.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import yangjiupeng.base.BaseTest;
import yangjiupeng.pages.CommentPage;
import yangjiupeng.pages.HomePage;
import yangjiupeng.pages.LoginPage;
import yangjiupeng.pages.WelcamePage;

public class HomePage_commentTest extends BaseTest{
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
	public void article_headimg_click(){
		HomePage homePage = new HomePage(driver);
		homePage.iv_article_headimg().click();
	}
	@Test(priority=1)
	public void writer_name_click(){
		HomePage homePage = new HomePage(driver);
		homePage.tv_writer_name("这是一个正常的网友").click();
	}
	@Test(priority=1)
	public void article_tag_click(){
		HomePage homePage = new HomePage(driver);
		homePage.tv_tag().click();
	} 
	@Test(priority=2)
	public void goCommentByText(){
		HomePage homePage = new HomePage(driver);
		homePage.topcomment().click();
		assertEquals(this.driver.currentActivity(), ".index.CommentActivity");
		CommentPage commentPage = new CommentPage(driver);
		commentPage.iv_comment_left().click();
		
	} 
	@Test(priority=2)
	public void goCommentByImg(){
		HomePage homePage = new HomePage(driver);
		homePage.iv_commentImg().click();
		assertEquals(this.driver.currentActivity(), ".index.CommentActivity");
		CommentPage commentPage = new CommentPage(driver);
		commentPage.iv_comment_left().click();
	} 
}
