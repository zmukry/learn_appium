package learn_appium.page_objects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class BasePage {

    private final AndroidDriver driver;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickUiElement(AppiumBy locator) {
        var uiElementToBeClicked = driver.findElement(locator);
        uiElementToBeClicked.click();
        System.out.println("Clicked UI Element: " + uiElementToBeClicked);
    }

    public void enterText(AppiumBy locator, String inputText) {
        var uiTextField = driver.findElement(locator);
        uiTextField.clear();
        uiTextField.sendKeys(inputText);
        System.out.println("Entered Text: \"" + inputText + "\" in UI TextField: " + uiTextField);
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
