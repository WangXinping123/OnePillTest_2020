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
/*
 * 袁康
 *
 * */
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
	@Test(dataProvider = "search",priority = 2)
	//后退功能还没实现 数据驱动有点问题
	public void serach(String name) throws InterruptedException{
			findMedicinal.search(name);
			findMedicinal.act_back();
			findMedicinal.act_back();
	}
	@Test(priority = 3)
	//查询空
	public void serach1() throws InterruptedException{
			findMedicinal.search("");
			findMedicinal.act_back();
			findMedicinal.act_back();
	}
	@Test(priority = 4)
	//进入药品页面（布洛芬
	public void buluofen() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.act_back();
		findMedicinal.act_back();
	}
	@Test(priority = 5)
	//关注药品
	public void follow() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.follow();
		findMedicinal.act_back();
		findMedicinal.act_back();
	}
	@Test(priority = 6)
	//取消关注药品
	public void unfollow() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.unfollow();
		findMedicinal.act_back();
		findMedicinal.act_back();
	}
	@Test(priority = 7)
	//添加至购物车
	public void addshop() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.buy();
		findMedicinal.act_back();
		findMedicinal.act_back();
	}
	@Test(priority = 8)
	//多次添加至购物车
	public void addshop_more() throws InterruptedException{
		findMedicinal.blf();
		for(int i=0;i<5;i++)
			findMedicinal.buy();
		findMedicinal.act_back();
		findMedicinal.act_back();
		
	}
	@Test(priority = 9)
	//查看主治功能
	public void func() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.func();
		findMedicinal.act_back();
		findMedicinal.act_back();
	}
	@Test(priority = 10)
	//查看副作用
	public void effect() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.effect();
		findMedicinal.act_back();
		findMedicinal.act_back();
	}
	@Test(priority = 11)
	//使用说明
	public void use() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.use();
		findMedicinal.act_back();
		findMedicinal.act_back();
	}
	@Test(priority = 12)
	//药品咨询
	public void ask() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.ask();
		findMedicinal.act_back();
		findMedicinal.act_back();
		findMedicinal.act_back();
	}
	@Test(priority = 13)
	//轮播图滑动
	public void swip() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.swip(PointOption.point(300, 500),PointOption.point(1300, 500));
		findMedicinal.act_back();
		findMedicinal.act_back();
	}
	@Test(priority = 14)
	//关注医生
	public void fol_doc() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.ask();
		findMedicinal.doc_fol();
		//再次点击取消
		//findMedicinal.doc_fol();
		findMedicinal.act_back();
		findMedicinal.act_back();
		findMedicinal.act_back();
	}
	@Test(priority = 15)
	//取消关注医生
	public void unfol_doc() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.ask();
		findMedicinal.doc_fol();
		//再次点击取消
		findMedicinal.doc_fol();
		findMedicinal.act_back();
		findMedicinal.act_back();
		findMedicinal.act_back();
		
	}
	@Test(priority = 16)
	//搜索页面后退
	public void back(){
		findMedicinal.find();
		findMedicinal.back();
		
	}
	@Test(priority = 17)
	//医生咨询页面后退
	public void doc_back() throws InterruptedException{
		findMedicinal.blf();
		findMedicinal.ask();
		findMedicinal.doc_back();
		findMedicinal.act_back();
		findMedicinal.act_back();
		findMedicinal.act_back();
	}
	
	
}
