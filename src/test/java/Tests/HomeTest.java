package Tests;

import Pages.HomePage;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest
{
    @Test
    public void testHome()
    {
        HomePage homePage = new HomePage(chromeDriver);
        homePage.scrollDown();
        homePage.checkSubVisibility();
        homePage.enterEmail("nariman6@gmail.com");
        homePage.clickOnSubscribeButton();
        homePage.checkSuccessMessageVisibility();

    }

}
