package HomeWork_5.Locators;

import HomeWork_5.Locators.Android.AndroidFormComponentsPageLocators;
import HomeWork_5.Locators.Android.AndroidLoginPageLocators;
import HomeWork_5.Locators.Android.AndroidMainPageLocators;
import HomeWork_5.Locators.Android.AndroidSwipePageLocators;
import HomeWork_5.Locators.IOS.IOSFormComponentsPageLocators;
import HomeWork_5.Locators.IOS.IOSLoginPageLocators;
import HomeWork_5.Locators.IOS.IOSMainPageLocators;
import HomeWork_5.Locators.IOS.IOSSwipePageLocators;
import HomeWork_5.Locators.Interfaces.FormComponentsPageLocators;
import HomeWork_5.Locators.Interfaces.LoginPageLocators;
import HomeWork_5.Locators.Interfaces.MainPageLocators;
import HomeWork_5.Locators.Interfaces.SwipePageLocators;

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
