package HomeWork_5.Pages;

import HomeWork_3.Locators.Interfaces.SwipePageLocators;
import HomeWork_3.Locators.LocatorService;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class SwipePage {
    private SwipePageLocators locator() {return LocatorService.SWIPE_PAGE_LOCATORS;}

    @Step("Проверяем ")
    public SwipePage checkSwipeText(String text) {
        Selenide.$(locator().swipeNotEmpty()).shouldHave(Condition.text(text));
        return new SwipePage();
    }
}
