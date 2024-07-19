package learn_appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstAppiumTest {

    private AndroidDriver driver;

    @BeforeEach
    public void setUp() {
        System.out.println("Initializing Android Driver...");

        UiAutomator2Options options = new UiAutomator2Options()
                .amend("platformName", "Android")
                .amend("appium:deviceName", "Pixel 8")
                .amend("appium:app", "C:\\zuhair\\AppiumPlayground\\android.wdio.native.app.v1.0.8.apk")
                .amend("appium:automationName", "UiAutomator2")
                .amend("appium:ensureWebviewsHavePages", true)
                .amend("appium:nativeWebScreenshot", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);

        try {
            driver = new AndroidDriver(URI.create("http://127.0.0.1:4723").toURL(), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void sampleTest() {
        System.out.println("Verifying App Home Page");
        var homeIcon = driver.findElement(AppiumBy.accessibilityId("Home"));
        assertTrue(Boolean.parseBoolean(homeIcon.getAttribute("selected")));

        var webviewIcon = driver.findElement(AppiumBy.accessibilityId("Webview"));
        webviewIcon.click();
        System.out.println("Verifying App Webview Page");

        var loginIcon = driver.findElement(AppiumBy.accessibilityId("Login"));
        loginIcon.click();
        System.out.println("Verifying App Login Page");

        var formsIcon = driver.findElement(AppiumBy.accessibilityId("Forms"));
        formsIcon.click();
        System.out.println("Verifying App Forms Page");

        var swipeIcon = driver.findElement(AppiumBy.accessibilityId("Swipe"));
        swipeIcon.click();
        System.out.println("Verifying App Swipe Page");

        var dragIcon = driver.findElement(AppiumBy.accessibilityId("Drag"));
        dragIcon.click();
        System.out.println("Verifying App Drag and Drop Page");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
        System.out.println("Quit Android Driver...");
    }

}
