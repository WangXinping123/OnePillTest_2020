package yangjiupeng.pages;

import java.time.Duration;
import java.util.List;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import yangjiupeng.utils.BaseAction;

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

	// lv_comment 列表
	public AndroidElement lv_comment() {
		return this.driver.findElementById("lv_comment");
	}

	//获取用户头像(第一个
	public AndroidElement iv_commenterImg(){
		return this.driver.findElementById("iv_commenterImg");
	}
	
	
	public AndroidElement tv_commenter_name(){
		return this.driver.findElementById("tv_commenter_name");
	}
	//第一条评论内容
	public AndroidElement tv_commenter_content(){
		return this.driver.findElementById("tv_commenter_content");
	}
	
	public AndroidElement iv_comment_left(){
		return this.driver.findElementById("iv_comment_left");
	}
	
	//获取最后一条(最新的一条)评论
	public AndroidElement latest_comment() throws InterruptedException {
		// com.onepilltest:id/tv_commenter_content
		// 滑动到页面的最低端
		List<AndroidElement> comments = this.driver.findElementsById("tv_commenter_content");
		
		AndroidElement firstComment = comments.get(0);
		AndroidElement lastComment = comments.get(comments.size()-2);		
		action.swip(lastComment, firstComment);		
		comments = this.driver.findElementsById("tv_commenter_content");		
		return comments.get(comments.size()-1);
	}

	// 发布评论
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
