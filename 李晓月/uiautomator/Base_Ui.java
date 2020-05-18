package com.example.myapplication;

import android.app.Instrumentation;
import android.os.RemoteException;
import android.util.Log;
import android.view.KeyEvent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiSelector;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class Base_Ui {
    Instrumentation mInstrumentation;
    UiDevice mDevice;

//    @After
//    public void tearDown() throws IntezrruptedException {
//        quit();
//    }

    @Before
    public void startUp() throws RemoteException, InterruptedException {
        mInstrumentation = InstrumentationRegistry.getInstrumentation();
//        获得连接设备
        mDevice = UiDevice.getInstance(mInstrumentation);
//        按键home
        mDevice.pressHome();
//        或者
//        mDevice.pressKeyCode(KeyEvent.KEYCODE_HOME);
//        判断是否锁屏
        boolean status = mDevice.isScreenOn();
        if (!status) {
            mDevice.wakeUp();
//            可以用滑动的方式解锁
//            mDevice.swipe(376,1348,502,569,5);
        }
        Thread.sleep(3000);
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);
//       mDevice.findObject(By.res("com.onepilltest:id/linear_patient"))
//                .click();
//
//       mDevice.findObject(By.res("com.onepilltest:id/edit_phone"))
//                .setText("18831107935");
//        Thread.sleep(3000);
//        mDevice.findObject(By.res("com.onepilltest:id/edit_password"))
//                .setText("123456");
//        mDevice.findObject(By.text("登录")).click();
//        Thread.sleep(3000);
    }

}
