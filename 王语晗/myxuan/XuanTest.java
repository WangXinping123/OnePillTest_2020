package com.edu.myxuan;

import androidx.test.uiautomator.By;

import org.junit.Test;

public class XuanTest extends BaseUi{
    public void testLogin(String name,String password) throws InterruptedException {
        mDevice.findObject(By.clazz("android.widget.EditText")).setText(name);
        mDevice.findObject(By.text("密码")).setText(password);
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }

    public void testDiscuss() throws InterruptedException {
        mDevice.findObject(By.text("讨论组\n" +
                "第 2 个标签，共 4 个")).click();
        Thread.sleep(3000);
    }

    public void testRelation() throws InterruptedException {
        mDevice.findObject(By.text("联系人\n" +
                "第 3 个标签，共 4 个")).click();
        Thread.sleep(3000);
    }

    public void testMine() throws InterruptedException {
        mDevice.findObject(By.text("我的\n" +
                "第 4 个标签，共 4 个")).click();
        Thread.sleep(3000);
    }

    public void testChat(String chat) throws InterruptedException {
        mDevice.findObject(By.text("联系人\n" +
                "第 3 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("A\n" +
                "admin1\n" +
                "[在线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("开聊")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.clazz("android.widget.EditText")).setText(chat);
        mDevice.findObject(By.text("发送")).click();
        Thread.sleep(3000);
    }

    public void testPersonId() throws InterruptedException {
        mDevice.findObject(By.text("我的\n" +
                "第 4 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.clazz("android.view.View")).click();
        Thread.sleep(3000);
    }

    public void testRelationId() throws InterruptedException {
        mDevice.findObject(By.text("联系人\n" +
                "第 3 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("A\n" +
                "admin1\n" +
                "[在线]")).click();
        Thread.sleep(3000);
    }

    public void testReSend(String resend) throws InterruptedException {
        mDevice.findObject(By.text("聊天\n" +
                "第 1 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("A\n" +
                "admin1\n" +
                "[在线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.clazz("android.widget.EditText")).setText(resend);
        mDevice.findObject(By.text("发送")).click();
        Thread.sleep(3000);
    }

    public void testEmail() throws InterruptedException {
        mDevice.findObject(By.text("联系人\n" +
                "第 3 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("A\n" +
                "admin1\n" +
                "[在线]")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("Email12@qq.com")).click();
        Thread.sleep(3000);
    }

    public void testOut() throws InterruptedException {
        mDevice.findObject(By.text("我的\n" +
                "第 4 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("注销")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("确认")).click();
        Thread.sleep(3000);
    }






}
