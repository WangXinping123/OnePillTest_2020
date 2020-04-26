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
	
	public QuestionPage goTo_inquiry() {
		action.click(iv_inquiry());
		return new QuestionPage(driver);
	}
	
	public CommentPage goTo_comment() {
		action.click(iv_commentImg());
		return new CommentPage(driver);
	}
}
