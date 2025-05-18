package StepDefinitions;

import Pages.HomePage;
import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class HomeSteps
{
    WebDriver driver = Hook.chromeDriver;
    Pages.HomePage HomePage = new HomePage(driver);
    private static final Logger logger = LogManager.getLogger(RegisterPage.class);


    @And("User Scroll Down")
    public void UserScrollDown()
    {
        logger.debug("User Scroll Down");
        HomePage.scrollDown();
    }

    @And("User Check That Subscribe Button is Visible")
    public void CheckSubscribeVisibility()
    {
        logger.debug("Subscribe Button is Visible");
        HomePage.checkSubVisibility();
    }
    @When("Click on Subscribe Button")
    public void ClickOnSub()
    {
        logger.debug("Click on Subscribe Button");
        HomePage.clickOnSubscribeButton();
    }

    @And("user enters {string}")
    public void userEntersEmail(String arg0)
    {
        logger.debug("User entered Email");
        HomePage.enterEmail(arg0);
    }

    @Then("Success Message is Visible")
    public void successMessageIsVisible()
    {
        logger.debug("Success Message is Visible");
        HomePage.checkSuccessMessageVisibility();
    }
}
