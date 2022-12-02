package com.fullsenders.test;

import com.fullsenders.core.DriverFactory;
import com.fullsenders.screen.ScreenInbox;
import com.fullsenders.screen.ScreenLogin;
import io.appium.java_client.AppiumDriver;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.MalformedURLException;

public class InboxTest {
    private static ScreenInbox screenInbox;
    private static ScreenLogin screenLogin;
    private static AppiumDriver driver;

    @BeforeClass
    public static void caps() throws MalformedURLException, InterruptedException, MalformedURLException {
        driver = DriverFactory.getDriver("android");
        screenInbox = new ScreenInbox(driver);
        screenLogin = new ScreenLogin(driver);
        screenLogin.clickLetsGo();
        screenLogin.clickContinueButton();
        screenLogin.clickAllowContacts();
        screenLogin.clickAllowContactsSO();
        screenLogin.swipeRight();
    }
    @Test
    public void test(){

    }
}
