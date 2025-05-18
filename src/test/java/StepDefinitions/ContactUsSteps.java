package StepDefinitions;

import Pages.ContactUsPage;
import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class ContactUsSteps
{
    WebDriver driver = Hook.chromeDriver;
    ContactUsPage contactus = new ContactUsPage(driver);
    private static final Logger logger = LogManager.getLogger(RegisterPage.class);

    @When("Click On ContactUs")
    public void ClickOnContactUs()
    {
        logger.debug("User Click On ContactUs");
        contactus.clickOnContactUs();
    }

    @And("ContactUs Page Is Visible")
    public void ContactusPageIsVisible()
    {
        logger.debug(" ContactUs Page Is Visible");
        contactus.checkContactUsVisibility();
    }

    @And("Fill Data {string} , {string}, {string}, {string}, {string}")
    public void fillData(String arg0, String arg1, String arg2, String arg3, String arg4)
    {
        logger.debug("Fill Data (Name , Email, Subject, Message, Path)");
        contactus.FillData(arg0, arg1,arg2, arg3,arg4);
    }

    @And("Click On Submit Button")
    public void clickOnSubmitButton()
    {
        logger.debug("Click On Submit Button");
        contactus.clickOnSubmitButton();

    }

    @And("Handle Alerts")
    public void handleAlerts()
    {
        logger.debug("Handle Alerts");
        contactus.handleAlerts();
    }

    @And("Click On Home Button")
    public void clickOnHomeButton()
    {
        logger.debug(" Click On Home Button");
        contactus.clickOnHomeButton();
    }
}
