package Lesson_2;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.URL;

public class HomeWork_2 {

     @Test
     public void chicEmptyFormTest() throws Exception {
          DesiredCapabilities capabilities = new DesiredCapabilities();

          capabilities.setCapability("platformName", "Android");
          capabilities.setCapability("deviceName", "Pixel");
          capabilities.setCapability("platformVersion", "11");
          capabilities.setCapability("udid", "emulator-5554");
          capabilities.setCapability("automationName", "UiAutomator2");
          capabilities.setCapability("app", "C:/Users/UserProfile/Downloads/Android-NativeDemoApp-0.2.1.apk");

          MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

          MobileElement loginMenuButton = (MobileElement) driver.findElementByAccessibilityId("Login");
          loginMenuButton.click();
          Thread.sleep(2000);
          MobileElement loginButton = (MobileElement) driver.findElementByAccessibilityId("button-LOGIN");
          loginButton.click();
          Thread.sleep(2000);
          MobileElement errorText = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
          Assert.assertEquals(errorText.getText(), "Please enter a valid email address");

     }

     @Test
     public void chicRerFormTest() throws Exception {
          DesiredCapabilities capabilities = new DesiredCapabilities();

          capabilities.setCapability("platformName", "Android");
          capabilities.setCapability("deviceName", "Pixel");
          capabilities.setCapability("platformVersion", "11");
          capabilities.setCapability("udid", "emulator-5554");
          capabilities.setCapability("automationName", "UiAutomator2");
          capabilities.setCapability("app", "C:/Users/UserProfile/Downloads/Android-NativeDemoApp-0.2.1.apk");

          MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

          MobileElement el7 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.ViewGroup/android.widget.TextView");
          el7.click();
          Thread.sleep(2000);
          MobileElement el8 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView");
          el8.click();
          Thread.sleep(2000);
          MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("input-email");
          el9.click();
          Thread.sleep(2000);
          MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("input-email");
          el10.sendKeys("1234@mail.ru");
          MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("input-password");
          el11.click();
          Thread.sleep(2000);
          el11.sendKeys("123456");
          MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("input-repeat-password");
          el12.click();
          Thread.sleep(2000);
          el12.sendKeys("123456");
          MobileElement el13 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup");
          el13.click();
          Thread.sleep(2000);
          MobileElement errorText = (MobileElement) driver.findElementById("android:id/message");
          Assert.assertEquals(errorText.getText(), "Some fields are not valid!");
     }

     @Test
     public void formComponentsTest() throws Exception {
          DesiredCapabilities capabilities = new DesiredCapabilities();

          capabilities.setCapability("platformName", "Android");
          capabilities.setCapability("deviceName", "Pixel");
          capabilities.setCapability("platformVersion", "11");
          capabilities.setCapability("udid", "emulator-5554");
          capabilities.setCapability("automationName", "UiAutomator2");
          capabilities.setCapability("app", "C:/Users/UserProfile/Downloads/Android-NativeDemoApp-0.2.1.apk");

          MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

          MobileElement el10 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.view.ViewGroup/android.widget.TextView");
          el10.click();
          Thread.sleep(2000);
          MobileElement el11 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup/android.widget.TextView");
          el11.click();
          Thread.sleep(2000);
          MobileElement errorText = (MobileElement) driver.findElementById("android:id/message");
          Assert.assertEquals(errorText.getText(), "This button is active");
     }
}