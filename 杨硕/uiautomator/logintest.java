package com.onepilltest;
import android.util.Log;

import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiObject2;

import org.junit.Test;

import java.util.List;
public class logintest extends BaseTest {
    @Test
    public void logintest1() throws InterruptedException {
       mDevice.findObject(By.res("com.onepilltest:id/linear_patient"))
                .click();

       mDevice.findObject(By.res("com.onepilltest:id/edit_phone"))
                .setText("18831107935");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password"))
                .setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void logintest2() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_patient"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone"))
                .setText("18830000000");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password"))
                .setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void logintest3() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_patient"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone"))
                .setText("18831107935");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password"))
                .setText("000000");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void logintest4() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_patient"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone"))
                .setText("aaaaaaaaaaa");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password"))
                .setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void logintest5() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_patient"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone"))
                .setText("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password"))
                .setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void logintest6() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_patient"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone"))
                .setText("18831107935");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password"))
                .setText("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void logintest7() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_patient"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone"))
                .setText("=======");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password"))
                .setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void logintest8() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_patient"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone"))
                .setText("18830000000");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password"))
                .setText("000000");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void Dlogintest1() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_doctor"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone_doctor"))
                .setText("18831107935");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password_doctor"))
                .setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void Dlogintest2() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_doctor"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone_doctor"))
                .setText("18830000000");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password_doctor"))
                .setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void Dlogintest3() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_doctor"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone_doctor"))
                .setText("18831107935");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password_doctor"))
                .setText("000000");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void Dlogintest4() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_doctor"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone_doctor"))
                .setText("aaaaaaaaaaa");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password_doctor"))
                .setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void Dlogintest5() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_doctor"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone_doctor"))
                .setText("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password_doctor"))
                .setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void Dlogintest6() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_doctor"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone_doctor"))
                .setText("18831107935");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password_doctor"))
                .setText("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void Dlogintest7() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_doctor"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone_doctor"))
                .setText("=======");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password_doctor"))
                .setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
    @Test
    public void Dlogintest8() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/linear_doctor"))
                .click();

        mDevice.findObject(By.res("com.onepilltest:id/edit_phone_doctor"))
                .setText("18830000000");
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_password_doctor"))
                .setText("000000");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }
}

