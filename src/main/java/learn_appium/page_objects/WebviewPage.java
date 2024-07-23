package learn_appium.page_objects;

import io.appium.java_client.android.AndroidDriver;
import learn_appium.drivers.AndroidDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebviewPage extends BasePage{

    AndroidDriver driver;
    WebDriverWait wait;

    private final String menuButtonXPath = "//button[@class='navbar__toggle clean-btn']";
    private final String menuNavbarXPath = "//div[@class='navbar-sidebar']";

    public WebviewPage() {
        super(AndroidDriverManager.getDriver());
        this.driver = AndroidDriverManager.getDriver();
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(20));
    }

    public void verifyWebviewPage() {
        System.out.println("Verifying Webview Page");

        // Switch to 'Webview' Context
        this.changeDriverContext("WEBVIEW_com.wdiodemoapp");

        WebElement menuButton = driver.findElement(By.xpath(menuButtonXPath));
        wait.until(ExpectedConditions.visibilityOf(menuButton));
        menuButton.click();

        WebElement menuNavbar = driver.findElement(By.xpath(menuNavbarXPath));
        wait.until(ExpectedConditions.visibilityOf(menuNavbar));

        // Switch back to Default 'NATIVE_APP' Context
        this.changeDriverContext("NATIVE_APP");
    }
}
