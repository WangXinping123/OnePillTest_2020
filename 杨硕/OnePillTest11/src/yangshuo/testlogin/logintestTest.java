package yangshuo.testlogin;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import yangshuo.dataprovider.ExcelDataProvider;
import yangshuo.pages.LoginDPage;
import yangshuo.pages.LoginPage;
import yangshuo.pages.WelcameDPage;
import yangshuo.pages.WelcamePage;

public class logintestTest {
	private AndroidDriver<AndroidElement> driver;
	@DataProvider(name = "login")
	public Object[][] getExcelDada2() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel(fileName, sheetName);
	}
	@Test(dataProvider="login")
	public void patient(String username,String password) throws InterruptedException{
		WelcamePage welcamePage = new WelcamePage(driver);
		welcamePage.patientLogin();
		Thread.sleep(2000);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.loginSuccess(username,password);	
		Assert.assertEquals(this.driver.currentActivity(), ".index.HomeActivity");
	}
	@Test(dataProvider="login")
	public void patient3(String username,String password) throws InterruptedException{
		WelcameDPage welcameDPage = new WelcameDPage(driver);
		welcameDPage.patientLogin();
		Thread.sleep(2000);
		LoginDPage loginDPage= new LoginDPage(driver);
		loginDPage.loginSuccess(username,password);	
		Assert.assertEquals(this.driver.currentActivity(), ".index.HomeActivity");
	}

}
