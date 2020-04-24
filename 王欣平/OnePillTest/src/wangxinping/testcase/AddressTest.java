package wangxinping.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import wangxinping.base.BaseTest;
import wangxinping.dataprovider.ExcelDataProvider;
import wangxinping.pages.AddressPage;
import wangxinping.pages.UserInfoPage;
import wangxinping.utils.ReadProperties;

public class AddressTest extends BaseTest {
	AddressPage addressPage;

	@Test(priority = 1)
	public void loginsucess() throws InterruptedException {
		addressPage = new AddressPage(driver);
		// UserInfoPage userInfoPage=new UserInfoPage(driver);
		// addressPage=userInfoPage.login("18831107935", "123456");
		Thread.sleep(3000);
		addressPage.to_setting();
	}

	@DataProvider(name = "name")
	public Object[][] getExcelData01() throws Exception {
		return new ExcelDataProvider().getTestDataByExcel(ReadProperties.getPropertyValue("data_path") + "address.xlsx",
				"Sheet1");
	}

	@Test(priority = 5, dataProvider = "name", description = "修改地址——收货人")
	public void test_edit_address_name(String address_name, String expectResult) throws InterruptedException {

		String actResult = addressPage.edit_address_name(address_name);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actResult, expectResult);
		Thread.sleep(3000);
	}

	@DataProvider(name = "phone")
	public Object[][] getExcelData3() throws Exception {
		return new ExcelDataProvider().getTestDataByExcel(ReadProperties.getPropertyValue("data_path") + "address.xlsx",
				"Sheet2");
	}

	@Test(priority = 10, dataProvider = "phone", description = "修改地址——手机号码")
	public void test_edit_address_phone(String address_phone, String expectResult) throws InterruptedException {

		String actResult = addressPage.edit_address_phone(address_phone);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actResult, expectResult);
		Thread.sleep(3000);
	}

	@DataProvider(name = "address")
	public Object[][] getExcelData2() throws Exception {
		return new ExcelDataProvider().getTestDataByExcel(ReadProperties.getPropertyValue("data_path") + "address.xlsx",
				"Sheet3");
	}

	@Test(priority = 12, dataProvider = "address", description = "修改地区信息")
	public void test_edit_address_address(String address_address, String expectResult) throws InterruptedException {

		String actResult = addressPage.edit_address_address(address_address);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actResult, expectResult);
		Thread.sleep(3000);
	}

	@DataProvider(name = "address_more")
	public Object[][] getExcelData4() throws Exception {
		return new ExcelDataProvider().getTestDataByExcel(ReadProperties.getPropertyValue("data_path") + "address.xlsx",
				"Sheet4");
	}

	@Test(priority = 16, dataProvider = "address_more", description = "修改详细地址")
	public void test_edit_address_more(String address_more, String expectResult) throws InterruptedException {

		String actResult = addressPage.edit_address_more(address_more);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actResult, expectResult);
		Thread.sleep(3000);
	}
	//
	//// 点击返回
	// @Test(priority=14)
	// public void test_click_back() throws InterruptedException {
	// setupPage.click_back();
	// }
	//
	// @Test(priority=16,dataProvider="phone",description="修改绑定手机号码")
	// public void test_edit_user_info(String phone,String expectResult) throws
	// InterruptedException {
	//
	// String actResult=setupPage.edit_user_phone(phone);
	// SoftAssert softAssert = new SoftAssert();
	// softAssert.assertEquals(actResult, expectResult);
	//
	// Thread.sleep(3000);
	// }

}
