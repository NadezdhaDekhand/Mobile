package HomeWork_3.Tests;

import HomeWork_3.Listener.AllureListener;
import HomeWork_3.base.BaseTest;

import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class ScreenShortFailTest extends BaseTest {
    @Test
    @Description("Проверяем поведение теста при неудачной проверке UI главной страницы с помощью скриншота.")
    public void CheckMainPageScreenshot() {
            openApp()
                    .checkFailScreenshot();
        }
    }

