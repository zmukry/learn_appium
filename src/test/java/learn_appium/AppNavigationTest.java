package learn_appium;

import learn_appium.page_objects.BottomMenuLinks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppNavigationTest extends JUnit5Hooks {

    @Test
    public void appNavigationTest() {
        var bottomMenuLinks = new BottomMenuLinks();
        assertTrue(bottomMenuLinks.isBottomIconSelected("Home"));

        bottomMenuLinks.clickBottomIcon("Webview");
        assertTrue(bottomMenuLinks.isBottomIconSelected("Webview"));

        bottomMenuLinks.clickBottomIcon("Login");
        assertTrue(bottomMenuLinks.isBottomIconSelected("Login"));

        bottomMenuLinks.clickBottomIcon("Forms");
        assertTrue(bottomMenuLinks.isBottomIconSelected("Forms"));

        bottomMenuLinks.clickBottomIcon("Swipe");
        assertTrue(bottomMenuLinks.isBottomIconSelected("Swipe"));

        bottomMenuLinks.clickBottomIcon("Drag");
        assertTrue(bottomMenuLinks.isBottomIconSelected("Drag"));
    }
}
