package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected AndroidDriver driver;
    private static final long DEFAULT_TIMEOUT = 3000;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void waitVisibilityOfElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(DEFAULT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    public void clickElement(WebElement element) {
        waitVisibilityOfElement(element);
        element.click();
    }
}
