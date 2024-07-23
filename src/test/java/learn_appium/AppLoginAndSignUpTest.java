package learn_appium;

import learn_appium.page_objects.BottomMenuLinks;
import learn_appium.page_objects.LoginSignupPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppLoginAndSignUpTest extends JUnit5Hooks {

    @Test
    public void AppLoginTest() {
        var bottomMenuLinks = new BottomMenuLinks();
        assertTrue(bottomMenuLinks.isBottomIconSelected("Home"));

        // Click App Menu Icon 'Login'
        bottomMenuLinks.clickBottomIcon("Login");
        assertTrue(bottomMenuLinks.isBottomIconSelected("Login"));
        var loginSignupPage = new LoginSignupPage();
        loginSignupPage.performLogin("test@test.com");
    }

    @Test
    public void AppSignUpTest() {
        var bottomMenuLinks = new BottomMenuLinks();
        assertTrue(bottomMenuLinks.isBottomIconSelected("Home"));

        // Click App Menu Icon 'Login'
        bottomMenuLinks.clickBottomIcon("Login");
        assertTrue(bottomMenuLinks.isBottomIconSelected("Login"));
        var loginSignupPage = new LoginSignupPage();
        loginSignupPage.performSignUp("test@test.com");
    }
}
