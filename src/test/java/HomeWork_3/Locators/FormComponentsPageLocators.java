package HomeWork_3.Locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FormComponentsPageLocators {

    public By activeButton(){
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup/android.widget.TextView");
    }

    public By formMessageText(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView");

    }
    public  By formScreen(){
        return MobileBy.AccessibilityId("Forms-screen");
    }
}
