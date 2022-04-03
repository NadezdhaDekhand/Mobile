package HomeWork_5.Tests;

import HomeWork_3.Listener.AllureListener;
import HomeWork_3.base.BaseTest;
import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

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


