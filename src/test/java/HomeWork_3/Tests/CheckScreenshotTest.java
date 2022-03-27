package HomeWork_3.Tests;

import HomeWork_3.Listener.AllureListener;
import HomeWork_3.base.BaseTest;
import io.appium.java_client.MobileBy;
import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

@Listeners(AllureListener.class)
public class CheckScreenshotTest extends BaseTest {
    @Test
    @Description("Проверяем UI главной страницы с помощью скриншота.")
    public void CheckMainPageScreenshot() {
            openApp()
                    .checkScreenshot();
        }
    @Test
    @Description("Проверяем UI Form страницы с помощью скриншота.")
    public void CheckFormComponentsPageScreenshot(){
        openApp()
                .clickFormButton()
                .checkFormScreenshot();
    }
    }


