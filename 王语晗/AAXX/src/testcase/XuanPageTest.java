package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import dataProvider.ExcelDataProvider;
import pages.XuanPage;
import utils.ReadProperities;

public class XuanPageTest extends BaseTest{
	XuanPage xuan;
	
	@DataProvider(name="xuanLogin")
	public Object[][] getExcelData1() throws Exception{
		return new ExcelDataProvider().getTestDataByExcel(ReadProperities.getPropertyValue("data_path") + "xuanLogin.xlsx",
				"Sheet1");
	}
	@Test(priority=0,dataProvider="xuanLogin",description="登录")
	public void testLogin(String name,String password) throws InterruptedException{
		xuan=new XuanPage(driver);
		Thread.sleep(3000);
		xuan.Xuan_Login(name,password);
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	public void testDiscuss() throws InterruptedException{
		xuan=new XuanPage(driver);
		xuan.Xuan_discuss();
		Thread.sleep(3000);
	}
	@DataProvider(name="xuanLoginWrong")
	public Object[][] getExcelData4() throws Exception{
		return new ExcelDataProvider().getTestDataByExcel(ReadProperities.getPropertyValue("data_path") + "xuanLoginWrong.xlsx",
				"Sheet1");
	}
	@Test(priority=2)
	public void testDiscussWrong() throws InterruptedException{
		xuan=new XuanPage(driver);
		xuan.Xuan_discuss();
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void testrelation() throws InterruptedException{
		xuan=new XuanPage(driver);
		xuan.Xuan_relationship();
		Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void testMine() throws InterruptedException{
		xuan=new XuanPage(driver);
		Thread.sleep(3000);
		xuan.Xuan_mine();
		Thread.sleep(3000);
	}
	
	@DataProvider(name="chat")
	public Object[][] getExcelData2() throws Exception{
		return new ExcelDataProvider().getTestDataByExcel(ReadProperities.getPropertyValue("data_path") + "chat.xlsx",
				"Sheet1");
	}
	@Test(priority=5,dataProvider="chat",description="聊天")
	public void testChat(String chat) throws InterruptedException{
		Thread.sleep(3000);
		xuan=new XuanPage(driver);
		Thread.sleep(3000);
		xuan.Xuan_chat(chat);
		Thread.sleep(3000);
	}
	@Test(priority=6)
	public void testchatWrong() throws InterruptedException{
		Thread.sleep(3000);
		xuan=new XuanPage(driver);
		Thread.sleep(3000);
		xuan.Xuan_chat("");
		Thread.sleep(3000);
	}
	
	@Test(priority=7)
	public void testrelaid() throws InterruptedException{
		Thread.sleep(3000);
		xuan=new XuanPage(driver);
		Thread.sleep(3000);
		xuan.Xuan_rela();
		Thread.sleep(3000);
	}
	
	@Test(priority=8)
	public void testpersonid() throws InterruptedException{
		Thread.sleep(3000);
		xuan=new XuanPage(driver);
		Thread.sleep(3000);
		xuan.Xuan_person();
		Thread.sleep(3000);
	}
	
	@DataProvider(name="rechat")
	public Object[][] getExcelData3() throws Exception{
		return new ExcelDataProvider().getTestDataByExcel(ReadProperities.getPropertyValue("data_path") + "rechat.xlsx",
				"Sheet1");
	}
	@Test(priority=9,dataProvider="rechat",description="回复消息")
	public void testResend(String rechat) throws InterruptedException{
		Thread.sleep(3000);
		xuan=new XuanPage(driver);
		Thread.sleep(3000);
		xuan.Xuan_resend(rechat);
		Thread.sleep(3000);
	}
	@Test(priority=10)
	public void testresendWrong() throws InterruptedException{
		Thread.sleep(3000);
		xuan=new XuanPage(driver);
		Thread.sleep(3000);
		xuan.Xuan_resend("");
		Thread.sleep(3000);
	}
	
	@Test(priority=11)
	public void testEmail() throws InterruptedException{
		Thread.sleep(3000);
		xuan=new XuanPage(driver);
		Thread.sleep(3000);
		xuan.Xuan_email();
		Thread.sleep(3000);
	}
	
	@Test(priority=12)
	public void testOut() throws InterruptedException{
		Thread.sleep(3000);
		xuan=new XuanPage(driver);
		Thread.sleep(3000);
		xuan.Xuan_out();
		Thread.sleep(3000);
	}
	
}
