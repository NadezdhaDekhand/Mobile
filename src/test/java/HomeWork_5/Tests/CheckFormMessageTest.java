package HomeWork_5.Tests;

import HomeWork_3.Listener.AllureListener;
import HomeWork_3.base.BaseTest;
import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckFormMessageTest extends BaseTest {

    public static final String VALID_MESSAGE = "This button is active";

    @Test
    @Description("Проверяем сообщение ")
    public void CheckFormMessageText() {
        openApp()
                .clickFormButton()
                .clickActiveButton()
                .checkFormMessageText(VALID_MESSAGE);
    }
}
