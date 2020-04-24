package wangxinping.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import wangxinping.dataprovider.ExcelDataProvider;
import wangxinping.utils.ReadProperties;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import wangxinping.base.BaseTest;
import wangxinping.pages.UserInfoPage;


public class UserInfoTest extends BaseTest{
	UserInfoPage userInfoPage;

	@Test(priority=1)
	public void loginsucess() throws InterruptedException{
		userInfoPage=new UserInfoPage(driver);
//		userInfoPage.login("18831107935", "123456");
		Thread.sleep(3000);
		userInfoPage.to_setting();
	}
	
	@DataProvider(name = "nickname01")
	public Object[][] getExcelData01() throws Exception {
		return new ExcelDataProvider().getTestDataByExcel(
				ReadProperties.getPropertyValue("data_path") +"info.xlsx",
				"Sheet1");
	}
	
	@DataProvider(name = "nickname02")
	public Object[][] getExcelData02() throws Exception {
		return new ExcelDataProvider().getTestDataByExcel(
				ReadProperties.getPropertyValue("data_path") +"info.xlsx",
				"Sheet2");
	}
	
	@Test(priority=5,dataProvider="nickname01",description="修改昵称——成功")
	public void test_edit_user_name_success(String nickname,String expectResult) throws InterruptedException {
		String actResult=userInfoPage.edit_user_nickname_success(nickname);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actResult, expectResult);   
//		Assert.assertEquals(actResult, expectResult);
		Thread.sleep(3000);
	}
	
	@Test(priority=8,dataProvider="nickname02",description="修改昵称——失败")
	public void test_edit_user_name_fail(String nickname,String expectResult) throws InterruptedException {
		String actResult=userInfoPage.edit_user_nickname_fail(nickname);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actResult, expectResult);   
		Thread.sleep(3000);
	}
	
	@DataProvider(name = "pid")
	public Object[][] getExcelData3() throws Exception {
		return new ExcelDataProvider().getTestDataByExcel(
				ReadProperties.getPropertyValue("data_path") +"info.xlsx",
				"Sheet3");
	}
	
	@Test(priority=10,dataProvider="pid",description="修改身份证信息")
	public void test_edit_user_PID(String PID,String expectResult) throws Exception {
		String actResult=userInfoPage.edit_user_PID(PID);
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actResult, expectResult);
		Thread.sleep(3000);
	}
	
	@DataProvider(name = "password")
	public Object[][] getExcelData2() throws Exception {
		return new ExcelDataProvider().getTestDataByExcel(
				ReadProperties.getPropertyValue("data_path") +"info.xlsx",
				"Sheet4");
	}
	
	@Test(priority=12,dataProvider="password",description="修改密码")
	public void test_edit_user_password(String pwd,String expectResult) throws InterruptedException {
		
		String actResult=userInfoPage.edit_user_password(pwd);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actResult, expectResult);
        
		Thread.sleep(3000);
	}
	
	@DataProvider(name = "phone")
	public Object[][] getExcelData4() throws Exception {
		return new ExcelDataProvider().getTestDataByExcel(
				ReadProperties.getPropertyValue("data_path") +"info.xlsx",
				"Sheet5");
	}
	
//	点击返回
	@Test(priority=14)
	public void test_click_back() throws InterruptedException {
		userInfoPage.click_back();
	}
	
	@Test(priority=16,dataProvider="phone",description="修改绑定手机号码")
	public void test_edit_user_info(String phone,String expectResult) throws InterruptedException {
		
		String actResult=userInfoPage.edit_user_phone(phone);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actResult, expectResult);

		Thread.sleep(3000);
	}

}
