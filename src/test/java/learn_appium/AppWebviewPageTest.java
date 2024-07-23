package learn_appium;

import learn_appium.page_objects.BottomMenuLinks;
import learn_appium.page_objects.WebviewPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppWebviewPageTest extends JUnit5Hooks {

    @Test
    public void VerifyWebViewPageTest() {
        var bottomMenuLinks = new BottomMenuLinks();
        assertTrue(bottomMenuLinks.isBottomIconSelected("Home"));

        bottomMenuLinks.clickBottomIcon("Webview");
        assertTrue(bottomMenuLinks.isBottomIconSelected("Webview"));

        var webviewPage = new WebviewPage();
        webviewPage.verifyWebviewPage();
    }
}
