package com.edu.myxuan;

import android.app.Instrumentation;
import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.UiDevice;

import org.junit.Before;
public class BaseUi {
    Instrumentation minstrumentation;
    UiDevice mDevice;
    @Before
    public void startup() throws RemoteException {
        minstrumentation= InstrumentationRegistry.getInstrumentation();
        mDevice=UiDevice.getInstance(minstrumentation);
        mDevice.pressHome();
        boolean status=mDevice.isScreenOn();
        if(!status){
            mDevice.wakeUp();
        }
    }



}
