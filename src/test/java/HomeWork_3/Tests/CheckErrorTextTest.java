package HomeWork_3.Tests;

import HomeWork_3.Listener.AllureListener;
import HomeWork_3.base.BaseTest;
import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckErrorTextTest extends BaseTest {
    public static final String VALID_EMAIL_ADDRESS = "Please enter a valid email address";
    public static final String VALID_PASSWORD = "Some fields are not valid!";

    @Test
    @Description("Проверяем сообщение об ошибке при невалидной email.")
    public void CheckEmptyEmail() {
        openApp()
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
    }
    @Test
    @Description("Проверяем сообщение об ошибке при не валидном вводе пароля при регистрации.")
    public void CheckEmptyPassword() {
        openApp()
                .clickLoginMenuButton()
                .clickSignUpContainer()
                .clickEmailButton()
                .clickPasswordButton()
                .clickRepeatPasswordButton()
                .clickSignUpButton()
                .checkSignUpErrorText(VALID_PASSWORD);
    }
}
