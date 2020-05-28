package yangshuo.testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import yangshuo.base.BaseTest;
import yangshuo.dataprovider.TxtDataProvider;
import yangshuo.pages.CommentPage;
import yangshuo.pages.HomePage;
import yangshuo.pages.LoginPage;
import yangshuo.pages.WelcamePage;
/**
 * 
 * @author 鏉ㄤ箙楣�
 *
 */
public class CommentTest extends BaseTest{
	
	@DataProvider(name = "login")
	public Object[][] getExcelDada2() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel(fileName, sheetName);
	}
	@Test(dataProvider="login1")
	public void patient(String username,String password) throws InterruptedException{
		WelcamePage welcamePage = new WelcamePage(driver);
		welcamePage.patientLogin();
		//Assert.assertEquals(this.driver.currentActivity(), ".welcome.LoginActivity");
		Thread.sleep(2000);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.loginSuccess(username,password);	
//		HomePage homePage = new HomePage(driver);
//		homePage.goTo_comment();
		Assert.assertEquals(this.driver.currentActivity(), ".index.HomeActivity");
	}
	@Test(dataProvider="login3")
	public void doctor(String username,String password) throws InterruptedException{
		DWelcamePage DwelcamePage = new DWelcamePage(driver);
		DwelcamePage.patientLogin();
		//Assert.assertEquals(this.driver.currentActivity(), ".welcome.LoginActivity");
		Thread.sleep(2000);
		DLoginPage DloginPage= new DLoginPage(driver);
		DloginPage.loginSuccess(username,password);	
//		HomePage homePage = new HomePage(driver);
//		homePage.goTo_comment();
		Assert.assertEquals(this.driver.currentActivity(), ".index.HomeActivity");
	}
}
