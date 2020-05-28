package yangshuo.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import yangshuo.utils.BaseAction;
/**
 * 
 * @author 鏉ㄤ箙楣�
 *
 */
public class QuestionPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public QuestionPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	//鍜ㄨ鏍囬
	public AndroidElement kswz_title(){
		return this.driver.findElementById("et_kswz_title");
	}
	//
	public AndroidElement kswz_outline_yes() {
		return this.driver.findElementById("kswz_outline_yes");
	}
	public AndroidElement kswz_outline_no() {
		return this.driver.findElementById("kswz_outline_no");
	}
	// 鍜ㄨ鍐呭
	public AndroidElement kswz_main() {
		return this.driver.findElementById("kswz_main");
	}
	//涓婁紶闄勪欢
	public AndroidElement iv_upimg() {
		return this.driver.findElementById("iv_upimg");
	}
	//瀹屾垚
	public AndroidElement question_finish() {
		return this.driver.findElementById("question_finish");
	}
	
	public AndroidElement question_back(){
		return this.driver.findElementById("question_back");
	}
	
	public void kswz_Success(String title,Boolean outline,String main,String upimg){		
		action.type(kswz_title(), title);
		if(outline){
			action.click(kswz_outline_yes());
		}else{
			action.click(kswz_outline_no());
		}		
		action.type(kswz_main(), main);
		//action.type(iv_upimg(), upimg);	
		action.click(question_finish());
	}

	public void kswz_failed_lose_outline(String title,String main,String upimg){		
		action.type(kswz_title(), title);	
		action.type(kswz_main(), main);
		//action.type(iv_upimg(), upimg);		
		action.click(question_finish());
	}
	
	public HomePage kswz_failed_setAndBack(String title,Boolean outline,String main,String upimg){		
		action.type(kswz_title(), title);	
		if(outline){
			action.click(kswz_outline_yes());
		}else{
			action.click(kswz_outline_no());
		}		
		action.type(kswz_main(), main);
		//action.type(iv_upimg(), upimg);		
		action.click(question_back());
		
		return new HomePage(driver);
	}
	
}	
