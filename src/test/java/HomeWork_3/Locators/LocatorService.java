package HomeWork_3.Locators;

import HomeWork_3.Locators.Android.AndroidFormComponentsPageLocators;
import HomeWork_3.Locators.Android.AndroidLoginPageLocators;
import HomeWork_3.Locators.Android.AndroidMainPageLocators;
import HomeWork_3.Locators.Android.AndroidSwipePageLocators;
import HomeWork_3.Locators.IOS.IOSFormComponentsPageLocators;
import HomeWork_3.Locators.IOS.IOSLoginPageLocators;
import HomeWork_3.Locators.IOS.IOSMainPageLocators;
import HomeWork_3.Locators.IOS.IOSSwipePageLocators;
import HomeWork_3.Locators.Interfaces.FormComponentsPageLocators;
import HomeWork_3.Locators.Interfaces.LoginPageLocators;
import HomeWork_3.Locators.Interfaces.MainPageLocators;
import HomeWork_3.Locators.Interfaces.SwipePageLocators;
import HomeWork_3.Pages.SwipePage;

public class LocatorService {
    public static final MainPageLocators MAIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidMainPageLocators() : new IOSMainPageLocators();
    public static final LoginPageLocators LOGIN_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidLoginPageLocators() : new IOSLoginPageLocators();
    public static final FormComponentsPageLocators FORM_COMPONENTS_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidFormComponentsPageLocators() : new IOSFormComponentsPageLocators();
    public static final SwipePageLocators SWIPE_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidSwipePageLocators() : new IOSSwipePageLocators();


}
