package learn_appium.page_objects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebviewPage extends BasePage{

    WebDriver webDriver;

    public WebviewPage(AndroidDriver driver) {
        super(driver);
        this.webDriver = driver;
    }

    public void verifyWebviewPage() throws InterruptedException {
        System.out.println("Verifying Webview Page");

        // Switch to 'Webview' Context
        this.changeDriverContext("WEBVIEW_com.wdiodemoapp");

        WebElement menuButton = webDriver.findElement(By.xpath("//button[@class='navbar__toggle clean-btn']"));
        menuButton.click();

        Thread.sleep(3000);
        this.changeDriverContext("NATIVE_APP");
    }
}
