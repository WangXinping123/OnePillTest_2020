package com.onepilltest;

import android.app.Instrumentation;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;

import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WenzhenTest {
    Instrumentation mInstrumentation;
    UiDevice mDevice;
    @BeforeClass
    public void startUp() throws RemoteException, InterruptedException {
        //获得一个设备
        mInstrumentation = InstrumentationRegistry.getInstrumentation();
        //获得设备的实例
        mDevice = UiDevice.getInstance(mInstrumentation);
        //按键home
        mDevice.pressHome();
//        或者
//      mDevice.pressKeyCode(KeyEvent.KEYCODE_HOME);
//        判断是否锁屏
        boolean status = mDevice.isScreenOn();
        if (!status) {
            mDevice.wakeUp();
//            可以用滑动的方式解锁
//            mDevice.swipe(376,1348,502,569,5);
        }
        Thread.sleep(3000);
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(2000);
       mDevice.findObject(By.res("com.onepilltest:id/linear_patient"))
                .click();
        Thread.sleep(2000);
       mDevice.findObject(By.res("com.onepilltest:id/edit_phone"))
                .setText("123");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password"))
                .setText("123");
        mDevice.findObject(By.text("测试按钮")).click();
        Thread.sleep(3000);
    }
    public void wenzhen(String title,String outline,String main,String upimg) throws InterruptedException {
        //点击 问诊
        mDevice.findObject(By.res("com.onepilltest:id/iv_inquiry")).click();
        Thread.sleep(2000);
        //咨询标题 com.onepilltest:id/et_kswz_title
        mDevice.findObject(By.res("com.onepilltest:id/et_kswz_title"))
                .setText(title);
        //是否去线下医院就诊过
        mDevice.findObject(By.text(outline)).click();
        //咨询内容
        mDevice.findObject(By.res("com.onepilltest:id/kswz_main"))
                .setText(main);

        //上传图片
        mDevice.findObject(By.res("com.onepilltest:id/iv_upimg"))
                .setText(upimg);
    }

    @Test
    public void success() throws InterruptedException {
        wenzhen("标题","是","这是一段测试","F:\\cs.jpg");
    }
    @Test
    public void test1() throws InterruptedException {
        wenzhen("标题","否","这是一段测试","F:\\cs.jpg");
    }
    @Test
    public void test2() throws InterruptedException {
        wenzhen(" ","否"," ", " ");
    }
}
