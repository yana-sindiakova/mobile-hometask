package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    @AndroidFindBy(accessibility = "Gmail")
    private WebElement gmailIcon;

    public MainPage(AndroidDriver driver) {
        super(driver);
    }

    public GmailPage clickOnGmailIcon() {
        clickElement(gmailIcon);
        return new GmailPage(driver);
    }


}
