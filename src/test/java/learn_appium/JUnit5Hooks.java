package learn_appium;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static learn_appium.drivers.AndroidDriverManager.createAndroidDriver;
import static learn_appium.drivers.AndroidDriverManager.quitSession;

public class JUnit5Hooks {

    private AndroidDriver driver;

    @BeforeEach
    public void createDriver() {
        createAndroidDriver();
    }

    @AfterEach
    public void quitDriver() {
        quitSession();
    }
}
