package com.example.myapplication;

import android.app.Instrumentation;
import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiCollection;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.Test;

public class DemoTest {
    UiDevice mDevice;
    Instrumentation minstrumentation;

    @Before
    public void startUp()throws RemoteException {
        minstrumentation= InstrumentationRegistry.getInstrumentation();
        //获取连接设备
        mDevice=UiDevice.getInstance(minstrumentation);
        //按home键
        mDevice.pressHome();
        //是否锁屏
        boolean status=mDevice.isScreenOn();
        if(!status){
            mDevice.wakeUp();
        }
    }

    @Test
    public void testBack() throws UiObjectNotFoundException, InterruptedException{
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_find_medicine")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/findpatient_left")).click();
    }
    @Test
    public void testSearch() throws UiObjectNotFoundException, InterruptedException{
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_find_medicine")).click();
        Thread.sleep(5000);
        mDevice.findObject(By.res("com.onepilltest:id/findpatient_select")).setText("布洛芬");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/img_findpa_select")).click();
    }
    @Test
    public void  testBLF() throws UiObjectNotFoundException, InterruptedException  , UiObjectNotFoundException{
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_find_medicine")).click();
        Thread.sleep(5000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_12")).click();
    }
    @Test
    public void  testFol() throws UiObjectNotFoundException, InterruptedException  , UiObjectNotFoundException{
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_find_medicine")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_12")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_coll")).click();
    }
    @Test
    public void  testUnFol() throws UiObjectNotFoundException, InterruptedException  , UiObjectNotFoundException{
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_find_medicine")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_12")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_coll")).click();
    }
    @Test
    public void  testBuy() throws UiObjectNotFoundException, InterruptedException  , UiObjectNotFoundException{
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_find_medicine")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_12")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_addcart")).click();

    }
    @Test
    public void  testAsk()throws UiObjectNotFoundException, InterruptedException  , UiObjectNotFoundException{
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_find_medicine")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_12")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_cons")).click();

    }
    @Test
    public void  testUse()throws UiObjectNotFoundException, InterruptedException  , UiObjectNotFoundException{
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_find_medicine")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_12")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("使用说明")).click();

    }
    @Test
    public void  testEff()throws UiObjectNotFoundException, InterruptedException  , UiObjectNotFoundException{
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_find_medicine")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_12")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("副作用")).click();

    }
    @Test
    public void  testFunction()throws UiObjectNotFoundException, InterruptedException  , UiObjectNotFoundException{
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_find_medicine")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_12")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("功能主治")).click();

    }
    @Test
    public void  testAskFol()throws UiObjectNotFoundException, InterruptedException  , UiObjectNotFoundException{
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_find_medicine")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_12")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_cons")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/doctor_focus_img")).click();

    }
    @Test
    public void  testAskUnFol()throws UiObjectNotFoundException, InterruptedException  , UiObjectNotFoundException{
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_find_medicine")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_12")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_cons")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/doctor_focus_img")).click();

    }
    @Test
    public void  testAskTel()throws UiObjectNotFoundException, InterruptedException  , UiObjectNotFoundException{
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_find_medicine")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_12")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/btn_cons")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("联系电话")).click();

    }




}
