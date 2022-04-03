package HomeWork_5;

import HomeWork_3.base.BaseTest;
import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class ScreenshortHelper extends BaseTest {
    @Test
    public void FormPageScreenshot() {
        openApp()
                .clickFormButton();
        File actualScreenshot = $(MobileBy.AccessibilityId("Forms-screen")).screenshot();

    }

}
