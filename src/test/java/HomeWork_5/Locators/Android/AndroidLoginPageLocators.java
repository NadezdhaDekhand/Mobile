package HomeWork_5.Locators.Android;

import HomeWork_5.Locators.Interfaces.LoginPageLocators;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AndroidLoginPageLocators implements LoginPageLocators {
    @Override
    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }

    @Override
    public By loginErrorText() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
    }

    @Override
    public By emailButton() {
        return MobileBy.AccessibilityId("input-email");
    }

    @Override
    public By passwordButton() {
        return MobileBy.AccessibilityId("input-password");
    }

    @Override
    public By repeatPasswordButton() {
        return MobileBy.AccessibilityId("input-repeat-password");
    }

    @Override
    public By signUpContainer() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView");
    }

    @Override
    public By signUpButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup");
    }

    @Override
    public By signUpErrorText() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView");
    }
}
