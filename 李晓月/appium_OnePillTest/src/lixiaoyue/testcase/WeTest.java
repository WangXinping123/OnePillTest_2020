package lixiaoyue.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import liixaoyue.utils.ReadProperties;
import lixiaoyue.base.BaseTest;
import lixiaoyue.dataprovider.ExcelDataProvider;
import lixiaoyue.pages.WePage;

public class WeTest extends BaseTest{
	
	WePage wePage;
	//登录
		@Test(priority=0)
		public void login() throws InterruptedException {
			Thread.sleep(3000);
			wePage = new WePage(driver);
			Thread.sleep(3000);
		}
				
		//点击我们
		@Test(priority = 1, description = "点击我们")
		public void ClickWe() throws Exception{
			Thread.sleep(1000);
			wePage = new WePage(driver);
			Thread.sleep(3000);
			wePage.click_we();
			Thread.sleep(3000);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertNotNull("用户");
		}

		
		//输入问题
		@DataProvider(name = "help")
		public Object[][] getExcelData() throws Exception {
			return new ExcelDataProvider().getTestDataByExcel(ReadProperties.getPropertyValue("data_path") + "help.xlsx",
					"Sheet1");
		}
		@Test(priority = 2,dataProvider = "help", description = "输入问题")
		public void EditQuestion(String help) throws InterruptedException{
			Thread.sleep(3000);
			wePage = new WePage(driver);		
			Thread.sleep(2000);
			wePage.edit_question(help);
			Thread.sleep(2000);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertNotNull("电话号码");
			Thread.sleep(2000);
		}
		
//		//输入问题、电话
		@Test(priority = 3,dataProvider = "help", description = "输入电话 ")
		public void edit_question_tel(String tel) throws InterruptedException{
			Thread.sleep(3000);
			wePage = new WePage(driver);
			Thread.sleep(2000);
			wePage.edit_question_tel(tel);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertNotNull("电话号码");
			Thread.sleep(2000);
		}
		
		
	//输入问题、电话、问题概述	
		@Test(priority = 4,dataProvider = "help", description = "输入问题概述")
		public void edit_question_tel_help(String question) throws InterruptedException{
			Thread.sleep(3000);
			wePage = new WePage(driver);
			Thread.sleep(2000);
			wePage.edit_question_tel_help(question);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertNotNull("电话号码");
			Thread.sleep(2000);
		}
		
		
		//输入问题、电话、问题概述、QQ
		@Test(priority = 5,dataProvider = "help", description = "输入QQ")
		public void SelectDoctor(String QQ) throws InterruptedException{
			Thread.sleep(3000);
			wePage = new WePage(driver);
			Thread.sleep(2000);
			wePage.edit_question_tel_help_QQ(QQ);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertNotNull("电话号码");
			Thread.sleep(2000);
		}
		
		//***********************关注与收藏**************************//	
		@Test(priority = 6, description = "关注与收藏")
		public void ClickGet() throws Exception{
			wePage = new WePage(driver);
			wePage.click_get();
			Thread.sleep(3000);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertNotNull("医生");
		}
		
		
		@Test(priority = 7, description = "医生")
		public void ClickDoc() throws Exception{
			wePage = new WePage(driver);
			wePage.click_doc();
			Thread.sleep(3000);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertNotNull("医生");
		}
		

		@Test(priority = 8, description = "药品")
		public void ClickMed() throws Exception{
			wePage = new WePage(driver);
			wePage.click_med();
			Thread.sleep(3000);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertNotNull("药品");
		}
		
		@Test(priority = 9, description = "返回")
		public void ClickBack() throws Exception{
			wePage = new WePage(driver);
			wePage.click_back();
			Thread.sleep(5000);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertNotNull("首页");
		}
		
	//***********************找医生*******************************//	
		//点击首页
		@Test(priority = 10, description = "点击首页")
		public void ClickFirst() throws Exception{
			wePage = new WePage(driver);
			wePage.click_first();
			Thread.sleep(3000);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertNotNull("找医生");
		}
		
		//点击找医生
		@Test(priority = 11, description = "找医生")
		public void findDoctor() throws Exception{
			wePage = new WePage(driver);
			wePage.find_Doctor();
			Thread.sleep(3000);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertNotNull("快速匹配医生");
		}
		
		//搜索框查找医生
		@DataProvider(name = "data")
		public Object[][] getExcelData1() throws Exception {
			return new ExcelDataProvider().getTestDataByExcel(ReadProperties.getPropertyValue("data_path") + "data.xlsx",
					"Sheet1");
		}
		@Test(priority = 12,dataProvider = "data", description = "搜索框查找医生")
		public void Select_Doctor(String data) throws InterruptedException{
			Thread.sleep(3000);
			wePage = new WePage(driver);
			Thread.sleep(3000);
			wePage.select_Doctor(data);
			Thread.sleep(3000);
		}
		
		
		@DataProvider(name = "ill")
		public Object[][] getExcelData2() throws Exception {
			return new ExcelDataProvider().getTestDataByExcel(ReadProperties.getPropertyValue("data_path") + "ill.xlsx",
					"Sheet1");
		}
		
		//按病症匹配医生	
		@Test(priority = 13,dataProvider = "ill", description = "按病症匹配医生")
		public void select_ill(String ill) throws Exception{
			wePage = new WePage(driver);
			wePage.select_ill1(ill);
			Thread.sleep(3000);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertNotNull("医生简介");
			Thread.sleep(3000);
		}
}
