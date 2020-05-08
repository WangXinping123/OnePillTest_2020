/*
 * 李晓月
 * 2017011749
 * 主要内容：找医生、帮助与反馈、关注与收藏
 */

package lixiaoyue.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class BaseAction {
	public AndroidDriver<AndroidElement> driver;
	public AndroidTouchAction action;

	public BaseAction(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		action = new AndroidTouchAction(driver);

	}

	/**
	 * @param by
	 */
	public void click(By by) {
		driver.findElement(by).click();
	}

	public void click(WebElement elemnet) {
		elemnet.click();
	}

	/**
	 * 输入
	 * @param element
	 * @param context
	 */
	public void type(By by, String value) {
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(value);

	}

	public void type(WebElement element, String context) {
		element.sendKeys(context);
	}
	public void typeAndclear(WebElement element, String context) {
		element.clear();
		element.sendKeys(context);
	}
	
	public void longPress(WebElement element) {
		LongPressOptions longPressOptions = LongPressOptions.longPressOptions();
		longPressOptions.withElement(ElementOption.element(element));
		action.longPress(longPressOptions).release().perform();
	}

	
	public void swip(PointOption fromOption, PointOption toOption) {
		action.press(fromOption).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(toOption)
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).release().perform();
	}

	public void swip(WebElement fromEle, WebElement toEle) {

		PointOption fromOption = PointOption.point(fromEle.getLocation().getX(), fromEle.getLocation().getY());
		PointOption toOption = PointOption.point(toEle.getLocation().getX(), toEle.getLocation().getY());
		swip(fromOption, toOption);
	}

	public void DragAndSwip(AndroidElement element) {

		LongPressOptions longPressOptions = LongPressOptions.longPressOptions();
		longPressOptions.withElement(ElementOption.element(element));

		action.longPress(longPressOptions).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(100, element.getLocation().getY()))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).release().perform();
	}

	public void multiTouch(int x1, int y1, int x2, int y2, int x3, int y3) {
		MultiTouchAction multiAction = new MultiTouchAction(driver);
		AndroidTouchAction action1 = new AndroidTouchAction(driver);
		AndroidTouchAction action2 = new AndroidTouchAction(driver);
		AndroidTouchAction action3 = new AndroidTouchAction(driver);
		AndroidTouchAction action4 = new AndroidTouchAction(driver);
		AndroidTouchAction action5 = new AndroidTouchAction(driver);

		action1.longPress(PointOption.point(x1, y1)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.release();
		action2.longPress(PointOption.point(x2, y2)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.release();
		action3.longPress(PointOption.point(x3, y3)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.release();

		multiAction.add(action1).add(action2).add(action3).add(action4).add(action5).perform();
	}
	
	public String getToast() {
		return driver.findElementByXPath("//*[@class='android.widget.Toast']").getText();
	}
}
