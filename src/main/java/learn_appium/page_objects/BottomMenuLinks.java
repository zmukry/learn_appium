package learn_appium.page_objects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class BottomMenuLinks extends BasePage{

    public BottomMenuLinks(AndroidDriver driver) {
        super(driver);
    }

    public void clickBottomIcon(String iconName) {
        this.clickElement((AppiumBy) AppiumBy.accessibilityId(iconName));
    }

    public Boolean isBottomIconSelected(String iconName) {
        return Boolean.parseBoolean(this.getElementAttribute((AppiumBy) AppiumBy.accessibilityId(iconName), "selected"));
    }
}
