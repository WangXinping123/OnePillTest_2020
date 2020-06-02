package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
	public void click(By by){
		driver.findElement(by).click();
	}
	public void click(WebElement element){
		element.click();
	}
	
	//输入
	public void type(By by,String value){
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(value);
	}
	public void type(WebElement element,String context){
		element.sendKeys(context);
	}
	public void typeAndClear(WebElement element,String context){
		element.clear();
		element.sendKeys(context);
	}
	
	//长按
	public void longPress(WebElement element){
		LongPressOptions longPressOptions=LongPressOptions.longPressOptions();
		longPressOptions.withElement(ElementOption.element(element));
		action.longPress(longPressOptions).release().perform();
	}
	
	//坐标点的滑动
	public void swip(PointOption fromOption,PointOption toOption){
		action.press(fromOption).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(toOption)
						.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).release().perform();
	}
	
	//元素间的滑动
	public void swip(WebElement fromEle,WebElement toEle){
		PointOption fromOption=PointOption.point(fromEle.getLocation().getX(),fromEle.getLocation().getY());
		PointOption toOption=PointOption.point(toEle.getLocation().getX(),toEle.getLocation().getY());
		swip(fromOption, toOption);
	}
	
	//拖拽
	public void DragAndSwip(AndroidElement element){
		LongPressOptions longPressOptions=LongPressOptions.longPressOptions();
		longPressOptions.withElement(ElementOption.element(element));
		action.longPress(longPressOptions).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
						.moveTo(PointOption.point(100,element.getLocation().getY()))
						.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).release().perform();
	}
	
	public String getToast(){
		return driver.findElementByXPath("//*[@class='android.widget.Toast']").getText();
	}
	
	
	
}
