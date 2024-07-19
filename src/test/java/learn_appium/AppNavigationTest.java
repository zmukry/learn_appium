package learn_appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import learn_appium.page_objects.BottomMenuLinks;
import learn_appium.page_objects.WebviewPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppNavigationTest {

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
    public void appNavigationTest() throws InterruptedException {
        var bottomMenuLinks = new BottomMenuLinks(driver);
        Boolean isHomeSelected = bottomMenuLinks.isBottomIconSelected("Home");
        assertTrue(isHomeSelected);

        bottomMenuLinks.clickBottomIcon("Webview");
        isHomeSelected = bottomMenuLinks.isBottomIconSelected("Webview");

        var webviewPage = new WebviewPage(driver);
        webviewPage.verifyWebviewPage();

        bottomMenuLinks.clickBottomIcon("Login");
        isHomeSelected = bottomMenuLinks.isBottomIconSelected("Login");

        bottomMenuLinks.clickBottomIcon("Login");
        isHomeSelected = bottomMenuLinks.isBottomIconSelected("Forms");

        bottomMenuLinks.clickBottomIcon("Login");
        isHomeSelected = bottomMenuLinks.isBottomIconSelected("Swipe");

        bottomMenuLinks.clickBottomIcon("Login");
        isHomeSelected = bottomMenuLinks.isBottomIconSelected("Drag");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
        System.out.println("Quit Android Driver...");
    }
}
