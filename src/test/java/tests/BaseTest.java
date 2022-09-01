package tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.GmailPage;
import pages.MainPage;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    private static final String APP = "";
    private static final String APPIUM = "http://localhost:4723/wd/hub";
    private AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("automationName", "UiAutomator2");
        //capabilities.setCapability("app", APP);
        driver = new AndroidDriver(new URL(APPIUM), capabilities);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }

    public AndroidDriver getDriver() {
        return driver;
    }

    public MainPage getMainPage() {
        return new MainPage(getDriver());
    }

    public GmailPage getGmailPage() {
        return new GmailPage(getDriver());
    }


}

