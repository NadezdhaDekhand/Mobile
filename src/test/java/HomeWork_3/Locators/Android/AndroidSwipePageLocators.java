package HomeWork_3.Locators.Android;

import HomeWork_3.Locators.Interfaces.SwipePageLocators;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AndroidSwipePageLocators implements SwipePageLocators {




    @Override
    public By swipeNotEmpty() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Swipe-screen\"]/android.view.ViewGroup[1]/android.widget.TextView");
    }
}
