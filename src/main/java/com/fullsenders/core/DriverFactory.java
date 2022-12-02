package com.fullsenders.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    private static AppiumDriver<RemoteWebElement> driver;


    public static AppiumDriver getDriver(String platform) throws MalformedURLException {
        if (driver == null) {
            if (platform == "ios") {
                return capsIos();
            }
            if (platform == "android") {
                return capsAndroid();
            }
            if (platform == "iOSRealDevice") {
                return capsRealIos();
            }
        }
        return driver;
    }
    public static IOSDriver capsIos() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("app","/Users/premiersoft/Desktop/dede/LoginExample.app" );
//        capabilities.setCapability("app","/Users/premiersoft/Downloads/noteIt/dede.ipa" );
        capabilities.setCapability("bundleId","me.bukovitz.NoteIt" );
        capabilities.setCapability("platformName","iOS" );
        capabilities.setCapability("platformVersion","15.0" );
        capabilities.setCapability("deviceName","Carlos 11" );
        capabilities.setCapability("automationName","XCUITest" );
        return (IOSDriver) (driver = new IOSDriver<RemoteWebElement>(new URL("http://localhost:4723/wd/hub"), capabilities));
    }
    public static IOSDriver capsRealIos() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("xcodesigningid","iPhone Delveloper" );
        capabilities.setCapability("xcodeOrgId","8TBGT267JT" );
        capabilities.setCapability("udid","9038991063f3b14ff46ed9707225c3e70ecc6131" );
        capabilities.setCapability("bundleId","me.bukovitz.NoteIt" );
        capabilities.setCapability("platformName","iOS" );
        capabilities.setCapability("platformVersion","15.7" );
        capabilities.setCapability("deviceName","Device's iPad" );
        capabilities.setCapability("automationName","XCUITest" );
        return (IOSDriver) (driver = new IOSDriver<RemoteWebElement>(new URL("http://localhost:4723/wd/hub"), capabilities));
    }
    public static AndroidDriver capsAndroid() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("app","/Users/premiersoft/Downloads/sendit/sendit.apk" );
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("deviceName", "Carlos 11");
        capabilities.setCapability("automationName", "uiautomator2");
//        capabilities.setCapability("appPackage", "com.fullsenders.sendit");
//        capabilities.setCapability("appActivity", "com.fullsenders.sendit");
//        capabilities.setCapability("appActivity", "me.bukovitz.noteit.presentation.MainActivity");
//        capabilities.setCapability("unicodeKeyboard",true );
        return (AndroidDriver) (driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities));
    }
    public static AndroidDriver capsAndroidReal() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("deviceName", "Carlos 11");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("appPackage", "me.bukovitz.noteit.beta");
        capabilities.setCapability("appActivity", "me.bukovitz.noteit.presentation.SplashActivity");
        capabilities.setCapability("unicodeKeyboard",true );
        return (AndroidDriver) (driver = new AndroidDriver<RemoteWebElement>(new URL("http://localhost:4723/wd/hub"), capabilities));
    }
}
