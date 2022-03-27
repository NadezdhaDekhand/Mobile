package HomeWork_3.Locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MainPageLocators {
    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }
    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }
    public By formButton(){
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.view.ViewGroup/android.widget.TextView");
    }


}
