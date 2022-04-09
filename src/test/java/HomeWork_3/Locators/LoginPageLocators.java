package HomeWork_3.Locators;


import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginPageLocators  {
   
    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }

   
    public By loginErrorText() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
    }

  
    public By emailButton() {
        return MobileBy.AccessibilityId("input-email");
    }

  
    public By passwordButton() {
        return MobileBy.AccessibilityId("input-password");
    }

   
    public By repeatPasswordButton() {
        return MobileBy.AccessibilityId("input-repeat-password");
    }

  
    public By signUpContainer() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView");
    }

   
    public By signUpButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup");
    }

  
    public By signUpErrorText() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView");
    }
}
