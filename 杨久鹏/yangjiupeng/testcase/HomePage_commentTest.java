package yangjiupeng.testcase;

import org.testng.annotations.Test;

import yangjiupeng.base.BaseTest;
import yangjiupeng.pages.LoginPage;
import yangjiupeng.pages.WelcamePage;

public class HomePage_commentTest extends BaseTest{
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
}
