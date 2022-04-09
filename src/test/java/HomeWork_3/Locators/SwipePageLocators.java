package HomeWork_3.Locators;


import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SwipePageLocators {

    public By swipeNotEmpty() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Swipe-screen\"]/android.view.ViewGroup[1]/android.widget.TextView");
    }
}
