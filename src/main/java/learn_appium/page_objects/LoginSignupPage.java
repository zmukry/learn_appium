package learn_appium.page_objects;

import io.appium.java_client.AppiumBy;
import learn_appium.drivers.AndroidDriverManager;

import java.util.UUID;

public class LoginSignupPage extends BasePage {

    AppiumBy loginTab = (AppiumBy) AppiumBy.accessibilityId("button-login-container");
    AppiumBy signUpTab = (AppiumBy) AppiumBy.accessibilityId("button-sign-up-container");
    AppiumBy emailTextField = (AppiumBy) AppiumBy.accessibilityId("input-email");
    AppiumBy passwordTextField = (AppiumBy) AppiumBy.accessibilityId("input-password");
    AppiumBy repeatPasswordTextField = (AppiumBy) AppiumBy.accessibilityId("input-repeat-password");
    AppiumBy loginButton = (AppiumBy) AppiumBy.accessibilityId("button-LOGIN");
    AppiumBy signUpButton = (AppiumBy) AppiumBy.accessibilityId("button-SIGN UP");
    AppiumBy alertOkButton = (AppiumBy) AppiumBy.id("android:id/button1");


    public LoginSignupPage() {
        super(AndroidDriverManager.getDriver());
    }

    public void performLogin(String userEmail) {
        // Click on Login Tab to make sure that Login Tab is selected
        this.clickUiElement(loginTab);
        this.enterText(emailTextField, userEmail);
        // Generate Random String and enter it in Password Text Field
        this.enterText(passwordTextField, UUID.randomUUID().toString());
        this.clickUiElement(loginButton);
        // Verify the Login Notification Message and Click 'OK Button
        this.clickUiElement(alertOkButton);
    }

    public void performSignUp(String userEmail) {
        // Click on Login Tab to make sure that Login Tab is selected
        this.clickUiElement(signUpTab);
        this.enterText(emailTextField, userEmail);
        // Generate Random String and enter it in Password Text Field
        var randomPassword = UUID.randomUUID().toString();
        this.enterText(passwordTextField, randomPassword);
        this.enterText(repeatPasswordTextField, randomPassword);
        this.clickUiElement(signUpButton);
        // Verify the Login Notification Message and Click 'OK Button
        this.clickUiElement(alertOkButton);
    }


}
