package learn_appium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static learn_appium.drivers.AndroidDriverManager.createAndroidDriver;
import static learn_appium.drivers.AndroidDriverManager.quitSession;

public class JUnit5Hooks {

    @BeforeEach
    public void createDriver() {
        createAndroidDriver();
    }

    @AfterEach
    public void quitDriver() {
        quitSession();
    }
}
