package yangjiupeng.testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import yangjiupeng.base.BaseTest;
import yangjiupeng.dataprovider.TxtDataProvider;
import yangjiupeng.pages.CommentPage;
import yangjiupeng.pages.HomePage;
import yangjiupeng.pages.LoginPage;
import yangjiupeng.pages.WelcamePage;

public class CommentTest extends BaseTest{
	
	@BeforeClass
	public void patient() throws InterruptedException{
		WelcamePage welcamePage = new WelcamePage(driver);
		welcamePage.patientLogin();
		//Assert.assertEquals(this.driver.currentActivity(), ".welcome.LoginActivity");
		Thread.sleep(2000);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.loginSuccess("123", "123");	
		HomePage homePage = new HomePage(driver);
		homePage.goTo_comment();
		//Assert.assertEquals(this.driver.currentActivity(), ".index.HomeActivity");
	}
	
	
	@DataProvider(name = "comment")
	public Object[][] getExcelDada2() throws IOException{
		return new TxtDataProvider().getTxtUser("data/data.txt");
	}
	@Test(dataProvider="comment")
	public void commentSuccess(String comment) throws InterruptedException{		
		CommentPage commentPage = new CommentPage(driver);
		commentPage.comment(comment);
		assertEquals(commentPage.latest_comment().getText(), comment);
	}

	@Test
	public void click_userimg(){
		
		CommentPage commentPage = new CommentPage(driver);
		commentPage.iv_commenterImg().click();		
	}
	
	@Test
	public void click_username(){
		
		CommentPage commentPage = new CommentPage(driver);
//		String name = commentPage.tv_commenter_name().getText();
//		System.out.println(name);
		commentPage.tv_commenter_name().click();
	}
	
	@Test
	public void click_content(){	
		CommentPage commentPage = new CommentPage(driver);
//		String name = commentPage.tv_commenter_name().getText();
//		System.out.println(name);
		commentPage.tv_commenter_content().click();
	}
	
	@Test
	public void returnpage(){
		
		CommentPage commentPage = new CommentPage(driver);
		commentPage.setAndLeft("是否保存草稿？");
		HomePage homePage = new HomePage(driver);
		homePage.goTo_comment();
		commentPage = new CommentPage(driver);
		assertEquals(commentPage.et_comment(), "是否保存草稿？");
	}
}
