package yangshuo.pages;




import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import yangshuo.utils.BaseAction;
/**
 * 
 * @author 鏉ㄤ箙楣�
 *
 */
public class HomePage {

	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public HomePage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;	
		this.action = new BaseAction(driver);
	}

	public AndroidElement iv_inquiry(){
		return this.driver.findElementById("iv_inquiry");
	}
	
	public AndroidElement iv_commentImg(){
		return this.driver.findElementById("iv_commentImg");
	}
	public AndroidElement iv_article_headimg(){
		return this.driver.findElementById("iv_article_headimg");
	}
	public AndroidElement tv_writer_name(String name){
		return this.driver.findElementByXPath("//*[@text='"+name+"']");
	}
	
	
	public AndroidElement tv_tag(){
		return this.driver.findElementById("tv_tag");
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