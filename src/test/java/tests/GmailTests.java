package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GmailTests extends BaseTest {
    private static final String EXPECTED_WELCOME_TEXT = "New in Gmail";

    @Test
    public void GmailTest() {

        String actualWelcomeText = getMainPage()
                .clickOnGmailIcon()
                .getWelcomeTitleText();
        assertEquals(actualWelcomeText, EXPECTED_WELCOME_TEXT);
    }
}
