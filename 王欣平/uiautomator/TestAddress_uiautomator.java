package com.edu.uiautomator;

import android.util.Log;

import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiObject2;

import org.junit.Test;

import java.util.List;

public class TestAddress_uiautomator extends BaseTest_Uiautomator{

    public void to_setting() throws InterruptedException {

        mDevice.findObject(By.res("com.onepilltest:id/iv_me"))
                .click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/iv_setting"))
                .click();
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.onepilltest:id/setting_user_address"))
                .click();

        Thread.sleep(3000);
    }

    //	修改地址——收货人
    public void edit_address_name(String address_name) throws InterruptedException{

        List<UiObject2> list = mDevice.findObjects
                (By.res("com.onepilltest:id/user_address_item_name"));
        list.get(0).click();
        Thread.sleep(1000);
        mDevice.findObject(By.res("com.onepilltest:id/edit_address_name"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/edit_address_name"))
                .setText(address_name);
        mDevice.findObject(By.res("com.onepilltest:id/edit_address_save"))
                .click();

        Thread.sleep(3000);
    }

    //	修改地址——手机号
    public void edit_address_phone(String address_phone) throws InterruptedException{
        List<UiObject2> list = mDevice.findObjects
                (By.res("com.onepilltest:id/user_address_item_name"));
        list.get(0).click();
        Thread.sleep(1000);

        mDevice.findObject(By.res("com.onepilltest:id/edit_address_phoneNumber"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/edit_address_phoneNumber"))
                .setText(address_phone);
        mDevice.findObject(By.res("com.onepilltest:id/edit_address_save"))
                .click();
        Thread.sleep(3000);
    }

    //	修改地址——地区信息
    public void edit_address_address(String address_address) throws InterruptedException{
        List<UiObject2> list = mDevice.findObjects
                (By.res("com.onepilltest:id/user_address_item_name"));
        list.get(0).click();
        Thread.sleep(1000);

        mDevice.findObject(By.res("com.onepilltest:id/edit_address_address"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/edit_address_address"))
                .setText(address_address);
        mDevice.findObject(By.res("com.onepilltest:id/edit_address_save"))
                .click();
        Thread.sleep(3000);
    }

    //	修改地址——详细地址
    public void edit_address_more(String address_more) throws InterruptedException{
        List<UiObject2> list = mDevice.findObjects
                (By.res("com.onepilltest:id/user_address_item_name"));
        list.get(0).click();
        Thread.sleep(1000);

        mDevice.findObject(By.res("com.onepilltest:id/edit_address_more"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/edit_address_more"))
                .setText(address_more);
        mDevice.findObject(By.res("com.onepilltest:id/edit_address_save"))
                .click();
        Thread.sleep(3000);
    }

    //	修改地址——邮政编码
    public void edit_address_postalCode(String address_code) throws InterruptedException{
        List<UiObject2> list = mDevice.findObjects
                (By.res("com.onepilltest:id/user_address_item_name"));
        list.get(0).click();
        Thread.sleep(1000);

        mDevice.findObject(By.res("com.onepilltest:id/edit_address_postalCode"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/edit_address_postalCode"))
                .setText(address_code);
        mDevice.findObject(By.res("com.onepilltest:id/edit_address_save"))
                .click();
        Thread.sleep(3000);
    }

    //	添加地址
    public void add_address(String address_name,String address_phone,String address_address,
                              String address_more,String address_postalCode) throws InterruptedException{

        mDevice.findObject(By.res("com.onepilltest:id/user_address_add"))
                .click();
        Thread.sleep(2000);
//      添加收货人
        mDevice.findObject(By.res("com.onepilltest:id/add_address_name"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/add_address_name"))
                .setText(address_name);
//      添加手机号码
        mDevice.findObject(By.res("com.onepilltest:id/add_address_phoneNumber"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/add_address_phoneNumber"))
                .setText(address_phone);
//      添加地址
        mDevice.findObject(By.res("com.onepilltest:id/add_address_address"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/add_address_address"))
                .setText(address_address);
//      添加详细地址
        mDevice.findObject(By.res("com.onepilltest:id/add_address_more"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/add_address_more"))
                .setText(address_more);
//        邮政编码
        mDevice.findObject(By.res("com.onepilltest:id/add_address_postalCode"))
                .clear();
        mDevice.findObject(By.res("com.onepilltest:id/add_address_postalCode"))
                .setText(address_postalCode);
        mDevice.findObject(By.res("com.onepilltest:id/add_address_save"))
                .click();
        Thread.sleep(3000);
    }

    @Test
    public void test1_edit_address_name() throws InterruptedException {
        to_setting();
        edit_address_name("0123");
        edit_address_name("Crush");
        edit_address_name("daisy123");
        edit_address_name("*&%#@$&*!@");
        edit_address_name("小柒Crush");
    }

    @Test
    public void test2_edit_address_phone() throws InterruptedException {
        edit_address_phone("173630276460");
        edit_address_phone("17363027646");
        edit_address_phone("1736302764");
    }

    @Test
    public void test3_edit_address_address() throws InterruptedException {
        edit_address_address("河北省唐山市路北区");
        edit_address_address("河北省石家庄市");
        edit_address_address("河北省唐山市裕华区");
        edit_address_address("河北省唐山市裕华区");
    }

    @Test
    public void test4_edit_address_more() throws InterruptedException {
        edit_address_more("裕华区裕翔街河北师范大学");
        edit_address_more("长安区裕翔街河北师范大学");
        edit_address_more("长安区%#%&*河北师范大学");
    }

    @Test
    public void test5_edit_address_postalCode() throws InterruptedException {
        edit_address_postalCode("064000");
        edit_address_postalCode("abc064000");
        edit_address_postalCode("$^&*@!");
    }

    @Test
    public void test6_add_address() throws InterruptedException {

        add_address("012345",
                "17363027646",
                "河北省唐山市路北区",
                "裕华区裕翔街河北师范大学",
                "064003");

        add_address("Crush",
                "173630276460",
                "湖北省石家庄市",
                "长安区裕翔街河北师范大学",
                "abc064003");

        add_address("daisy123",
                "17363027646",
                "河北省唐山市裕华区",
                "裕华区$%&**@#$裕翔街河北师范大学",
                "abc064003");

        add_address("小柒crush",
                "17363027646",
                "河北省唐山市裕华区",
                "长安区裕翔街河北师范大学",
                "064003");
    }


}
