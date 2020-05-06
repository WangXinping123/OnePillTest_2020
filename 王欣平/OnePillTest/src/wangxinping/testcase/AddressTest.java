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
	
	@DataProvider(name = "address_code")
	public Object[][] getExcelData5() throws Exception {
		return new ExcelDataProvider().getTestDataByExcel(ReadProperties.getPropertyValue("data_path") + "address.xlsx",
				"Sheet5");
	}

	@Test(priority = 20, dataProvider = "address_code", description = "修改邮政编码")
	public void test_edit_address_code(String address_code, String expectResult) throws InterruptedException {

		String actResult = addressPage.edit_address_more(address_code);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actResult, expectResult);
		Thread.sleep(3000);
	}
	
	@DataProvider(name = "add_address")
	public Object[][] getExcelData6() throws Exception {
		return new ExcelDataProvider().getTestDataByExcel(ReadProperties.getPropertyValue("data_path") + "address.xlsx",
				"Sheet6");
	}

	@Test(priority = 25, dataProvider = "add_address", description = "添加地址")
	public void test_add_address(String address_name,String address_phone,String address_address,
			String address_more,String address_postalCode, String expectResult) throws InterruptedException {

		String actResult = addressPage.add_address(address_name, address_phone, 
				address_address, address_more, address_postalCode);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actResult, expectResult);
		Thread.sleep(3000);
	}
	

}
