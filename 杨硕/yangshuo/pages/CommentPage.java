package yangshuo.pages;

import java.time.Duration;
import java.util.List;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import yangshuo.utils.BaseAction;

/**
 * 
 * @author 鏉ㄤ箙楣�
 *
 */
public class CommentPage {
	
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public CommentPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}

	public AndroidElement et_comment() {
		return this.driver.findElementById("et_comment");
	}

	public AndroidElement btn_send_comment() {
		return this.driver.findElementById("btn_send_comment");
	}

	// lv_comment 鍒楄〃
	public AndroidElement lv_comment() {
		return this.driver.findElementById("lv_comment");
	}

	//鑾峰彇鐢ㄦ埛澶村儚(绗竴涓�
	public AndroidElement iv_commenterImg(){
		return this.driver.findElementById("iv_commenterImg");
	}
	
	
	public AndroidElement tv_commenter_name(){
		return this.driver.findElementById("tv_commenter_name");
	}
	//绗竴鏉¤瘎璁哄唴瀹�
	public AndroidElement tv_commenter_content(){
		return this.driver.findElementById("tv_commenter_content");
	}
	
	public AndroidElement iv_comment_left(){
		return this.driver.findElementById("iv_comment_left");
	}
	
	//鑾峰彇鏈�鍚庝竴鏉�(鏈�鏂扮殑涓�鏉�)璇勮
	public AndroidElement latest_comment() throws InterruptedException {
		// com.onepilltest:id/tv_commenter_content
		// 婊戝姩鍒伴〉闈㈢殑鏈�浣庣
		List<AndroidElement> comments = this.driver.findElementsById("tv_commenter_content");
		
		AndroidElement firstComment = comments.get(0);
		AndroidElement lastComment = comments.get(comments.size()-2);		
		action.swip(lastComment, firstComment);		
		comments = this.driver.findElementsById("tv_commenter_content");		
		return comments.get(comments.size()-1);
	}

	// 鍙戝竷璇勮
	public void comment(String text) {
		action.type(et_comment(), text);
		action.click(btn_send_comment());
	}
	
	public HomePage setAndLeft(String text) {
		action.type(et_comment(), text);
		action.click(iv_comment_left());
		return new HomePage(driver);
	}
}
