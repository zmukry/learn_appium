package learn_appium.page_objects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver wdDriver;
    private final AndroidDriver driver;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickElement(AppiumBy locator) {
        var uiElement = driver.findElement(locator);
        uiElement.click();
        System.out.println("Clicked UI Element: " + uiElement);
    }

    public String getElementAttribute(AppiumBy locator, String attributeName) {
        var uiElement = driver.findElement(locator);
        var uiElementAttribute = uiElement.getAttribute(attributeName);
        System.out.println("UI Element: " + uiElement + ", Attribute: \"" + attributeName + "\" = \"" + uiElementAttribute + "\"");
        return uiElementAttribute;
    }

    public void changeDriverContext(String contextName) {
        driver.context(contextName);
    }
}
