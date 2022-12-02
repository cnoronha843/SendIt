package com.fullsenders.screen;

import com.fullsenders.core.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class ScreenLogin extends ScreenBase {
    private static AppiumDriver<RemoteWebElement> driver;

    public ScreenLogin(AppiumDriver<RemoteWebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(accessibility = "let's go")
    @iOSFindBy(accessibility="let's go")
    private RemoteWebElement letsGoButton;
    @AndroidFindBy(id = "com.snapchat.android:id/login_kit_auth_continue_button")
    @iOSFindBy(accessibility="let's go")
    private RemoteWebElement continueButton;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"   allow   ✅\"]")
    @iOSFindBy(accessibility="let's go")
    private RemoteWebElement allowContacts;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    @iOSFindBy(accessibility="let's go")
    private RemoteWebElement allowContactsSO;
    @AndroidFindBy(accessibility = "terms of service")
    @iOSFindBy(accessibility="let's go")
    private RemoteWebElement termsOfService;

    @AndroidFindBy(accessibility = "terms of service")
    @iOSFindBy(accessibility="let's go")
    private RemoteWebElement iNeedHelp;


    public void clickLetsGo() throws InterruptedException {
        letsGoButton.click();
        Thread.sleep(5000);
    }
    public void clickContinueButton() throws InterruptedException {
        continueButton.click();
        Thread.sleep(5000);
    }
    public void clickAllowContacts() throws InterruptedException {
        allowContacts.click();
        Thread.sleep(5000);
        System.out.printf("clicou");
    }
    public void clickAllowContactsSO() throws InterruptedException {
        allowContactsSO.click();
        Thread.sleep(3000);
    }



}
