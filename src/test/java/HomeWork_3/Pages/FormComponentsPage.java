package HomeWork_3.Pages;

import HomeWork_3.Locators.FormComponentsPageLocators;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.awt.image.BufferedImage;
import java.io.File;

import static com.codeborne.selenide.Selenide.$;


public class FormComponentsPage {
    private FormComponentsPageLocators locator() {
        return new FormComponentsPageLocators();
    }
    @Step("Кликаем по кнопке active в форме")
    public FormComponentsPage clickActiveButton() {
        Selenide.$(locator().activeButton()).click();
        return new FormComponentsPage();
    }
    @Step("Проверяем текст сообщения")
    public FormComponentsPage checkFormMessageText(String text) {
        Selenide.$(locator().formMessageText()).shouldHave(Condition.text(text));
        return new FormComponentsPage();
    }

    @Step("Делаем скриншот FormComponents страницы и сравниваем с требованием.")
    public FormComponentsPage checkFormScreenshot() {

        BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources("src/main/resources/expectedScreenshots/FormPage.png");

        File actualScreenshot = $(locator().formScreen()).screenshot();

        BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("screenshots/actual/" + actualScreenshot.getName());

        File resultDestination = new File("diff/diff_CheckMainPageScreenshot.png");


        ImageComparisonResult imageComparisonResult = new ImageComparison(expectedImage, actualImage, resultDestination).compareImages();
        Assert.assertEquals(ImageComparisonState.MATCH, imageComparisonResult.getImageComparisonState());
        return this;
    }

}

