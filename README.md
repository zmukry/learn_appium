# Mobile Test Automation With Appium

### What is Appium
Appium is an open source automation tool for running scripts and testing applications on different platforms like Android, iOS, and Windows. Appium is based on Selenium-WeDriver.

It automates testing for:

Native Mobile Applications that are written using iOS, Android, or Windows SDKs
Mobile Web Applications that can be accessed using mobile browsers such as Safari, Chrome, or in-built native browser applications for android devices
Hybrid Mobile Applications that have a native wrapper around the web view

### Installation and Setup

1. Install Node.js (LTS Version): https://nodejs.org/en/download
2. Install Java JDK (LTS Version): https://www.oracle.com/java/technologies/downloads/
3. Set the JAVA_HOME environment variable to the JDK installation directory after installation. For example, if you installed JDK in C:\Program Files\Java\jdk-19, set JAVA_HOME to C:\Program Files\Java\jdk-19. 
4. Add the JDK bin directory to your system’s PATH environment variable. For example, if you installed JDK in C:\Program Files\Java\jdk-19, add C:\Program Files\Java\jdk-19\bin to the PATH environment variable.
5. Android Studio installed: https://developer.android.com/studio/install
6. Add the Android SDK directory to your system’s ANDROID_HOME environment variable. For example, if the Android SDK Location in Android Studio is C:\Users\Administrator\AppData\Local\Android\Sdk, add C:\Users\Administrator\AppData\Local\Android\Sdk to the ANDROID_HOME environment variable.
7. Create Android Virtual Device (AVD) Emulator with Android Studio. 
8. Run the emulator: Click on the “Run” button to start the AVD on the Virtual Device Manager page.
9. Install Appium Server and Appium Inspector

### Appium Inspector
Appium Inspector is a GUI assistant tool for Appium https://github.com/appium/appium-inspector, providing visual inspection of the application under test. It can show the application page screenshot along with its page source, and includes various features for interacting with the app.

### Test Framework
This basic Mobile Test Automation project is a Maven Java project, and contains only Appium Java-Client and JUnit5 dependencies. Testing App used in this Project can be downloaded from https://github.com/webdriverio/native-demo-app/releases.

