package HomeWork_5.Locators.Android;

import HomeWork_5.Locators.Interfaces.FormComponentsPageLocators;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AndroidFormComponentsPageLocators implements FormComponentsPageLocators {
    @Override
    public By activeButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup/android.widget.TextView");
    }

    @Override
    public By formMessageText() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView");
    }

    @Override
    public By formScreen() {
        return MobileBy.AccessibilityId("Forms-screen");
    }
}
