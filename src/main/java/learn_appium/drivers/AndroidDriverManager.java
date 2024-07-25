package learn_appium.drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;

public class AndroidDriverManager {

    private static final ThreadLocal<AndroidDriver> DRIVER   = new ThreadLocal<> ();

    /**
     * This method creates the Android Driver.
     * The 'UiAutomator2Options' are currently hard coded,
     * change them according to your 'Emulator', 'App' & 'App Folder Path'
     */
    public static void createAndroidDriver () {
        final UiAutomator2Options uiAutomator2Options;
        uiAutomator2Options = new UiAutomator2Options ()
                // 'Avd' related commands are for optional
                .setAvd ("Pixel_8_API_34")
                .setAvdLaunchTimeout (Duration.ofSeconds (300))
                .setAvdReadyTimeout (Duration.ofSeconds (100))
                .setPlatformName("Android")
                .setDeviceName ("Pixel_8_API_34")
                .setAutomationName (AutomationName.ANDROID_UIAUTOMATOR2)
                .setApp ("C:\\zuhair\\AppiumPlayground\\android.wdio.native.app.v1.0.8.apk")
                .setAppPackage ("com.wdiodemoapp")
                .setAppActivity ("com.wdiodemoapp.MainActivity")
                .setNoReset (false);

        try {
            setDriver (new AndroidDriver (URI.create("http://127.0.0.1:4723").toURL(), uiAutomator2Options));
        } catch (final MalformedURLException e) {
            throw new RuntimeException (e);
        }
        setupDriverTimeouts ();
    }

    public static AndroidDriver getDriver () {
        return AndroidDriverManager.DRIVER.get ();
    }

    public static void quitSession () {
        if (null != DRIVER.get ()) {
            System.out.println("Closing the driver...");
            getDriver ().quit ();
            DRIVER.remove ();
        }
    }

    private static void setDriver (final AndroidDriver driver) {
        AndroidDriverManager.DRIVER.set (driver);
    }

    private static void setupDriverTimeouts () {
        getDriver()
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds (5));
    }
}
