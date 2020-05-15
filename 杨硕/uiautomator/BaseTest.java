package com.onepilltest;

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
public class BaseTest {
    @Before
    public void startUp() throws RemoteException, InterruptedException {
        mInstrumentation = InstrumentationRegistry.getInstrumentation();
        mDevice = UiDevice.getInstance(mInstrumentation);
        mDevice.pressHome();
        boolean status = mDevice.isScreenOn();
        if (!status) {
            mDevice.wakeUp();
//            可以用滑动的方式解锁
//            mDevice.swipe(376,1348,502,569,5);
        }
        Thread.sleep(3000);
        mDevice.findObject(By.text("OnePillTest")).click();
        Thread.sleep(3000);

    }
}