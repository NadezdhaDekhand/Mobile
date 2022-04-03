package HomeWork_5.Pages;

import HomeWork_3.Locators.Interfaces.LoginPageLocators;
import HomeWork_3.Locators.LocatorService;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class LoginPage {




    // Метод позволяет работать с локаторами для нужной нам страницы.
    private LoginPageLocators locator() {
        return LocatorService.LOGIN_PAGE_LOCATORS;
    }

    @Step("Кликаем по кнопке логин в форме")
    public LoginPage clickLoginButton() {
        Selenide.$(locator().loginButton()).click();
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки")
    public LoginPage checkLoginErrorText(String text) {
        Selenide.$(locator().loginErrorText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }
    @Step("Переходим на форму регистрации")
    public LoginPage clickSignUpContainer() {
        Selenide.$(locator().signUpContainer()).click();
        return  new LoginPage();
    }
    @Step("Проверяем текст ошибки")
    public LoginPage checkSignUpErrorText(String text) {
        Selenide.$(locator().signUpErrorText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }
    @Step("Водим Email в форме")
    public LoginPage clickEmailButton() {
        Selenide.$(locator().emailButton()).click();
        Selenide.$(locator().emailButton()).sendKeys("1234@mail.ru");
        return new LoginPage();
    }
    @Step("Вводим Password в форме")
    public LoginPage clickPasswordButton() {
        Selenide.$(locator().passwordButton()).click();
        Selenide.$(locator().passwordButton()).sendKeys("123456");
        return new LoginPage();
    }
    @Step("Вводим Repeat Password в форме")
    public LoginPage clickRepeatPasswordButton() {
        Selenide.$(locator().repeatPasswordButton()).click();
        Selenide.$(locator().repeatPasswordButton()).sendKeys("123456");
        return new LoginPage();
    }
    @Step("Кликаем по кнопке SignUp")
    public LoginPage clickSignUpButton() {
        Selenide.$(locator().signUpButton()).click();
        return new LoginPage();
    }
}


