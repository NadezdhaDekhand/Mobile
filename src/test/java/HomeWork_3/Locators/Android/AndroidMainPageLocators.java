package HomeWork_3.Locators.Android;

import HomeWork_3.Locators.Interfaces.MainPageLocators;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AndroidMainPageLocators implements MainPageLocators {
    @Override
    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    @Override
    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }

    @Override
    public By formButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.view.ViewGroup/android.widget.TextView");
    }

    @Override
    public By swipeButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Swipe\"]/android.view.ViewGroup/android.widget.TextView");
    }
}
