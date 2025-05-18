package Tests;

import Pages.ContactUsPage;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseTest
{
    @Test
    public void testContactUs()
    {
        ContactUsPage contactus = new ContactUsPage(chromeDriver);
        //Click On ContactUs
        contactus.clickOnContactUs();
        //ContactUs Page Is Visible
        contactus.checkContactUsVisibility();
        //Fill Data (Name , Email, Subject, Message, Path)
        contactus.FillData("Nariman", "nariman@gmail.com","skshjwsb", "wnsdjwdhuwdhuwdh","");
        //Click On Submit Button
        contactus.clickOnSubmitButton();
        //Handle Alerts
        contactus.handleAlerts();
        //Success Message is Visible
        contactus.checkSuccessMessageVisibility();
        //Click On Home Button
        contactus.clickOnHomeButton();


    }


}
