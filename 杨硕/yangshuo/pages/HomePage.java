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

	//蹇�熼棶璇婂浘鏍�
	public AndroidElement iv_inquiry(){
		return this.driver.findElementById("iv_inquiry");
	}
	//璇勮鍥炬爣
	
	public AndroidElement iv_commentImg(){
		return this.driver.findElementById("iv_commentImg");
	}
	//鏂囩珷鍙戝竷鑰呭ご鍍� iv_article_headimg
	public AndroidElement iv_article_headimg(){
		return this.driver.findElementById("iv_article_headimg");
	}
	//鏂囩珷鍙戝竷鑰呭悕瀛�
	public AndroidElement tv_writer_name(String name){
		return this.driver.findElementByXPath("//*[@text='"+name+"']");
	}
	
	//鏂囩珷鏍囩
	public AndroidElement topcomment(){
		return this.driver.findElementByXPath("//*[@text='鐑棬璇勮']");
	}
	
	//"鐑棬璇勮"
	public AndroidElement tv_tag(){
		return this.driver.findElementById("tv_tag");
	}
	// 鍓嶅線蹇�熼棶璇婄殑椤甸潰
	public QuestionPage goTo_inquiry() {
		action.click(iv_inquiry());
		return new QuestionPage(driver);
	}
	//鍓嶅線璇勮椤甸潰
	public CommentPage goTo_comment() {
		action.click(iv_commentImg());
		return new CommentPage(driver);
	}
}
