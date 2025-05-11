package Tests;

import Pages.ContactUsPage;
import Utillis.BaseTests;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class ContactUsTests extends BaseTests
{
    @Test
    public void testContactUs()
    {
        ContactUsPage contactus = new ContactUsPage(chromeDriver);
        contactus.clickOnContactUs();
        contactus.checkContactUsVisibility();
        contactus.enterName("Nariman");
        contactus.enterEmail("nariman@gmail.com");
        contactus.enterSubject("skshjwsb");
        contactus.enterMessage("wnsdjwdhuwdhuwdh");
        contactus.uploadFile("");
        contactus.clickOnSubmitButton();
        contactus.handleAlerts();
        contactus.checkSuccessMessageVisibility();
        contactus.clickOnHomeButton();

    }


}
