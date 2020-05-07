package testcase;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.PublicImpl;
import org.seleniumhq.jetty9.security.authentication.LoginAuthenticator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import dataprovider.ExcelDataProvider;
import io.appium.java_client.touch.offset.PointOption;
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
	//查询空
	public void serach1(String name) throws InterruptedException{
			findMedicinal.search("");
	}
	@Test
	//进入药品页面（布洛芬
	public void buluofen() throws InterruptedException{
		findMedicinal.blf();
	}
	@Test
	//关注药品
	public void follow() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.follow();
	}
	@Test
	//取消关注药品
	public void unfollow() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.unfollow();
	}
	@Test
	//添加至购物车
	public void addshop() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.buy();
		//多次点击
		//findMedicinal.buy();
	}
	@Test
	//查看主治功能
	public void func() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.func();
	}
	@Test
	//查看副作用
	public void effect() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.effect();
	}
	@Test
	//使用说明
	public void use() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.use();
	}
	@Test
	//药品咨询
	public void ask() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.ask();
	}
	@Test
	//轮播图滑动
	public void swip(){
		findMedicinal.swip(PointOption.point(300, 500),PointOption.point(1300, 500));
		
	}
	@Test
	//关注医生
	public void fol_doc() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.ask();
		findMedicinal.doc_fol();
		//再次点击取消
		//findMedicinal.doc_fol();
	}
	@Test
	//搜索页面后退
	public void back(){
		findMedicinal.find();
		findMedicinal.back();
	}
	@Test
	//医生咨询页面后退
	public void doc_back() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.ask();
		findMedicinal.doc_back();
	}
	
	
}
