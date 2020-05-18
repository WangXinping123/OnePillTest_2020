package com.example.myapplication;

import androidx.test.uiautomator.By;

import org.testng.annotations.Test;


public class Doctor1 extends Base_Ui {

    //点击个人
    public void click_me() throws InterruptedException {

        mDevice.findObject(By.res("com.onepilltest:id/iv_me"))
                .click();
        Thread.sleep(3000);
    }

    //点击帮助与反馈
    public void click_help() throws InterruptedException {

        mDevice.findObject(By.text("帮助与反馈"))
                .click();
        Thread.sleep(3000);
    }

    //输入问题
    public void edit_question(String question) throws InterruptedException{
        mDevice.findObject(By.res("com.onepilltest:id/add_content"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/add_content"))
                .setText(question);
        Thread.sleep(3000);
    }

    //输入电话号码
    public void edit_call(String call) throws InterruptedException{
        mDevice.findObject(By.res("com.onepilltest:id/help_tel"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/help_tel"))
                .setText(call);
        Thread.sleep(3000);
    }

    //输入问题概述
    public void edit_help(String help) throws InterruptedException{
        mDevice.findObject(By.res("com.onepilltest:id/help_question"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/help_question"))
                .setText(help);
        Thread.sleep(3000);
    }

    //输入QQ号
    public void edit_QQ(String QQ) throws InterruptedException{
        mDevice.findObject(By.res("com.onepilltest:id/help_QQ"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/help_QQ"))
                .setText(QQ);
        Thread.sleep(3000);
    }

    //点击提交
    public void click_submit() throws InterruptedException {

        mDevice.findObject(By.res("com.onepilltest:id/help_submit"))
                .click();
        Thread.sleep(3000);
    }

    //点击关注与收藏
    public void find_collect() throws InterruptedException {

        mDevice.findObject(By.text("关注和收藏"))
                .click();
        Thread.sleep(3000);
    }

    //点击医生
    public void click_doctor() throws InterruptedException {

        mDevice.findObject(By.res("com.onepilltest:id/focus_list_tab1"))
                .click();
        Thread.sleep(3000);
    }

    //点击药品
    public void click_med() throws InterruptedException {

        mDevice.findObject(By.res("com.onepilltest:id/focus_list_tab2"))
                .click();
        Thread.sleep(3000);
    }

    //点击返回
    public void click_back() throws InterruptedException {

        mDevice.findObject(By.res("com.onepilltest:id/focus_list_back"))
                .click();
        Thread.sleep(3000);
    }

    //点击首页
    public void click_home() throws InterruptedException {

        mDevice.findObject(By.res("com.onepilltest:id/iv_home"))
                .click();
        Thread.sleep(3000);
    }
    //点击找医生
    public void find_doctor() throws InterruptedException {

        mDevice.findObject(By.res("com.onepilltest:id/iv_find_doctor"))
                .click();
        Thread.sleep(3000);
    }

    //进行医生的查找
    public void edit_doctor(String doctor) throws InterruptedException{
        mDevice.findObject(By.res("com.onepilltest:id/findoctor_select"))
                .click();
        Thread.sleep(1000);
        mDevice.findObject(By.res("com.onepilltest:id/findoctor_select"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/findoctor_select"))
                .setText(doctor);
        mDevice.findObject(By.res("com.onepilltest:id/img_select"))
                .click();
        Thread.sleep(3000);
    }

    //根据点击病症进行查找并返回
    public void find_ill() throws InterruptedException {
        mDevice.findObject(By.res("com.onepilltest:id/tb_one"))
                .click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/dc_details_back"))
                .click();
        Thread.sleep(3000);
    }
////////////////////////////////////TEST////////////////////////////////////
    @Test(priority = 1)
    //点击个人并进入帮助与反馈
    public void me_help() throws InterruptedException {
        click_me();
        click_help();
    }

    @Test(priority = 2)
    //输入需要帮助的内容
    public void edit_all2() throws InterruptedException {
        edit_question("哈哈哈哈");
        edit_help("呼呼呼");
        click_submit();
    }

    @Test(priority = 3)
    public void edit_all3() throws InterruptedException {
        edit_question("哈哈哈哈");
        edit_help("呼呼呼");
        edit_call("123456");
        click_submit();
    }

    @Test(priority = 4)
    public void edit_all4() throws InterruptedException {
        edit_question("哈哈哈哈");
        edit_help("呼呼呼");
        edit_call("123456");
        edit_QQ("456789");
        click_submit();
    }

    @Test(priority = 5)
    //关注与收藏并返回
    public void coolect() throws InterruptedException {
        find_collect();
        click_doctor();
        click_med();
        click_back();
    }

    @Test(priority = 6)
    //找医生
    public void doctor() throws InterruptedException {
        click_home();
        find_doctor();
    }

    @Test(priority = 7)
    //查找医生
    public void select_doctor() throws InterruptedException {
        edit_doctor("111");
    }

    @Test(priority = 8)
    //查找医生
    public void ill() throws InterruptedException {
        find_ill();
    }
}
