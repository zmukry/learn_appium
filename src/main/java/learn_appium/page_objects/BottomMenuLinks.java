package learn_appium.page_objects;

import io.appium.java_client.AppiumBy;
import learn_appium.drivers.AndroidDriverManager;

public class BottomMenuLinks extends BasePage {

    public BottomMenuLinks() {
        super(AndroidDriverManager.getDriver());
    }

    public void clickBottomIcon(String iconName) {
        this.clickUiElement((AppiumBy) AppiumBy.accessibilityId(iconName));
    }

    public Boolean isBottomIconSelected(String iconName) {
        return Boolean.parseBoolean(this.getElementAttribute((AppiumBy) AppiumBy.accessibilityId(iconName), "selected"));
    }
}
