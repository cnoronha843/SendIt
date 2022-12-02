package com.fullsenders.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class ScreenProfile {
    private static AppiumDriver<RemoteWebElement> driver;

    public ScreenProfile(AppiumDriver<RemoteWebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(accessibility="copy link for IG bio")
    @iOSFindBy(accessibility="Back")
    private RemoteWebElement copyLinkForIGbio;
    @AndroidFindBy(accessibility="POST A PIC OF...your best hair day")
    @iOSFindBy(accessibility="Back")
    private RemoteWebElement postAPicOf;
    @AndroidFindBy(accessibility="themes")
    @iOSFindBy(accessibility="Back")
    private RemoteWebElement themes;
    @AndroidFindBy(accessibility="views")
    @iOSFindBy(accessibility="Back")
    private RemoteWebElement views;
    @AndroidFindBy(accessibility="tap to answer...")
    @iOSFindBy(accessibility="Back")
    private RemoteWebElement tapToAnswer;
}
