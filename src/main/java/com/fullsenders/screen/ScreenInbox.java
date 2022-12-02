package com.fullsenders.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class ScreenInbox {
    private static AppiumDriver<RemoteWebElement> driver;

    public ScreenInbox(AppiumDriver<RemoteWebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(accessibility = "profile requests")
    @iOSFindBy(accessibility="Back")
    private RemoteWebElement profileRequests;
    @AndroidFindBy(accessibility = "boost sendit \uD83D\uDCA5")
    @iOSFindBy(accessibility="Back")
    private RemoteWebElement boostSendit;
    @AndroidFindBy(accessibility = "get more responses on instagram!")
    @iOSFindBy(accessibility="Back")
    private RemoteWebElement getMoreResponsesOnInstagram;
    @AndroidFindBy(accessibility = "add your noteit widget join 26 friends add +")
    @iOSFindBy(accessibility="Back")
    private RemoteWebElement addYourNoteitWidgetJoin26FriendsAdd;

    @AndroidFindBy(accessibility = "//android.view.View[@content-desc=\"add your noteit widget\n" +
            "join 26 friends\n" +
            "add +\"]/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]")
    @iOSFindBy(accessibility="Back")
    private RemoteWebElement firstMessage;

}
