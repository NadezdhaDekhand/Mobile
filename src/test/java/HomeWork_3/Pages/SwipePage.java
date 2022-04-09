package HomeWork_3.Pages;


import HomeWork_3.Locators.SwipePageLocators;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class SwipePage {
    private SwipePageLocators locator() {return new SwipePageLocators();}

    @Step("Проверяем ")
    public SwipePage checkSwipeText(String text) {
        Selenide.$(locator().swipeNotEmpty()).shouldHave(Condition.text(text));
        return new SwipePage();
    }
}
