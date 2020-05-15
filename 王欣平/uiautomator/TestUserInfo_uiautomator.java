package com.edu.uiautomator;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;

import org.junit.Before;
import org.junit.Test;

public class TestUserInfo_uiautomator extends BaseTest_Uiautomator{

//    UiObject2 btn_me=mDevice.findObject(By.res("com.onepilltest:id/iv_me"));
//    UiObject2 btn_setting=mDevice.findObject(By.res("com.onepilltest:id/iv_setting"));
//    UiObject2 setting_nickName=mDevice.findObject(By.res("com.onepilltest:id/setting_lin_nickName"));
//    UiObject2 setting_phone=mDevice.findObject(By.res("com.onepilltest:id/setting_lin_phone"));
//    UiObject2 edit_user_nickName=mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_nickName"));
//    UiObject2 edit_user_PID=mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_PID"));
//    UiObject2 edit_user_password=mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_password"));
//    UiObject2 edit_user_phone=mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_phone"));
//    UiObject2 btn_user_save=mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_save"));
//    UiObject2 btn_user_back=mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_back"));


    //	个人信息——修改昵称   成功
    @Test
    public void test_edit_nickname_success() throws InterruptedException{

        mDevice.findObject(By.res("com.onepilltest:id/iv_me"))
                .click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_setting"))
                .click();
        Thread.sleep(3000);

        mDevice.findObject(By.res("com.onepilltest:id/setting_lin_nickName"))
                .click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_nickName"))
        .setText("daisy");
        mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_save"))
                .click();
        Thread.sleep(5000);
    }

    //	个人信息——修改昵称  失败
    @Test
    public void test_edit_nickname_fail() throws InterruptedException{

        mDevice.findObject(By.res("com.onepilltest:id/setting_lin_nickName"))
                .click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_nickName"))
                .setText("^^*%$*^*(*)_(+)_");
        mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_save"))
                .click();
        Thread.sleep(3000);
    }

    //	个人信息——修改身份证号码
    @Test
    public void test_edit_user_PID() throws InterruptedException{

        mDevice.findObject(By.res("com.onepilltest:id/setting_lin_nickName"))
                .click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_PID"))
                .setText("130221199088761254");
        mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_save"))
                .click();
        Thread.sleep(3000);
    }

    //	个人信息——修改密码
    @Test
    public void test_edit_password() throws InterruptedException{

        mDevice.findObject(By.res("com.onepilltest:id/setting_lin_nickName"))
                .click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_password"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_password"))
                .setText("12356388046");
        mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_save"))
                .click();
        Thread.sleep(3000);
    }

//    //	点击返回
//    @Test
//    public void click_back() throws InterruptedException{
//        action.click(user_info_back());
//        Thread.sleep(3000);
//        action.click(setting_phone());
//        Thread.sleep(3000);
//    }

    //	个人信息——修改手机号码
    @Test
    public void test_edit_phone() throws InterruptedException{
        mDevice.findObject(By.res("com.onepilltest:id/setting_lin_nickName"))
                .click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_phone"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_phone"))
                .setText("15033312764");
        mDevice.findObject(By.res("com.onepilltest:id/edit_user_info_save"))
                .click();

    }
}
