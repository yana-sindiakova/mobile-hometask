package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class GmailPage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='New in Gmail']")
    private WebElement welcomeTitle;

    public GmailPage(AndroidDriver driver) {
        super(driver);
    }

    public String getWelcomeTitleText() {
        waitVisibilityOfElement(welcomeTitle);
        return welcomeTitle.getText();
    }
}
