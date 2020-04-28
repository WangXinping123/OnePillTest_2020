package yangjiupeng.pages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import yangjiupeng.utils.BaseAction;

public class HomePage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public HomePage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;	
		this.action = new BaseAction(driver);
	}

	//快速问诊图标
	public AndroidElement iv_inquiry(){
		return this.driver.findElementById("iv_inquiry");
	}
	//评论图标
	
	public AndroidElement iv_commentImg(){
		return this.driver.findElementById("iv_commentImg");
	}
	//文章发布者头像 iv_article_headimg
	public AndroidElement iv_article_headimg(){
		return this.driver.findElementById("iv_article_headimg");
	}
	//文章发布者名字
	public AndroidElement tv_writer_name(String name){
		return this.driver.findElementByXPath("//*[@text='"+name+"']");
	}
	
	//文章标签
	public AndroidElement topcomment(){
		return this.driver.findElementByXPath("//*[@text='热门评论']");
	}
	
	//"热门评论"
	public AndroidElement tv_tag(){
		return this.driver.findElementById("tv_tag");
	}
	// 前往快速问诊的页面
	public QuestionPage goTo_inquiry() {
		action.click(iv_inquiry());
		return new QuestionPage(driver);
	}
	//前往评论页面
	public CommentPage goTo_comment() {
		action.click(iv_commentImg());
		return new CommentPage(driver);
	}
}
