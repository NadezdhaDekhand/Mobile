package HomeWork_3.Tests;

import HomeWork_3.Listener.AllureListener;
import HomeWork_3.base.BaseTest;
import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckSwipeTest extends BaseTest {
    public static final String VALID_TEXT = "Swipe horizontal";
    @Test
    @Description("Проверяем текст ")
    public void CheckText() {
        openApp()
                .clickSwipeButton()
                .checkSwipeText(VALID_TEXT);


    }
}
