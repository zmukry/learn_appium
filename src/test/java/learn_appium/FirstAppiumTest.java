package learn_appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import learn_appium.drivers.AndroidDriverManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstAppiumTest extends JUnit5Hooks {

    @Test
    public void firstAppiumTest() {
        System.out.println("Verifying App Home Page");
        AndroidDriver driver = AndroidDriverManager.getDriver();

        var homeIcon = driver.findElement(AppiumBy.accessibilityId("Home"));
        assertTrue(Boolean.parseBoolean(homeIcon.getAttribute("selected")));

        var webviewIcon = driver.findElement(AppiumBy.accessibilityId("Webview"));
        System.out.println("Switching to App \"Webview\" Page");
        webviewIcon.click();

        var loginIcon = driver.findElement(AppiumBy.accessibilityId("Login"));
        System.out.println("Switching to App \"Login\" Page");
        loginIcon.click();

        var formsIcon = driver.findElement(AppiumBy.accessibilityId("Forms"));
        System.out.println("Switching to App \"Forms\" Page");
        formsIcon.click();

        var swipeIcon = driver.findElement(AppiumBy.accessibilityId("Swipe"));
        System.out.println("Switching to App \"Swipe\" Page");
        swipeIcon.click();

        var dragIcon = driver.findElement(AppiumBy.accessibilityId("Drag"));
        System.out.println("Switching to App \"Drag\" Page");
        dragIcon.click();
    }

}
