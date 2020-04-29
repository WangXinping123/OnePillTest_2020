package testcase;

import org.seleniumhq.jetty9.security.authentication.LoginAuthenticator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import dataprovider.ExcelDataProvider;
import pages.FindMedicinal;
import utils.ReadProperties;

public class FindMedicinalTest extends BaseTest{
	FindMedicinal findMedicinal;
	@BeforeClass
	public void start(){
		findMedicinal=new FindMedicinal(driver);
	}
	@DataProvider(name = "search")
	public Object[][] getExcelData01() throws Exception {
		return new ExcelDataProvider().getTestDataByExcel(ReadProperties.getPropertyValue("data_path") + "find.xlsx",
				"Sheet1");
	}
	
	//@Test(priority = 1)
	public void Login() throws InterruptedException{
		findMedicinal.login("18831107935","123456");
	}
	@Test(dataProvider = "name")
	//后退功能还没实现 数据驱动有点问题
	public void serach(String name) throws InterruptedException{
			findMedicinal.search(name);
	}
	@Test
	public void serach1(String name) throws InterruptedException{
			findMedicinal.search("");
	}
	@Test
	public void buluofen() throws InterruptedException{
		findMedicinal.blf();
	}
	@Test
	public void follow() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.follow();
	}
	
}
