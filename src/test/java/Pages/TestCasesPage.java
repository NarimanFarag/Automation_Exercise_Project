package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TestCasesPage
{

    private static final Logger logger = LogManager.getLogger(RegisterPage.class);
    WebDriver driver;

    @FindBy(css = ".navbar-nav > li:nth-child(4) > a:nth-child(1)")
    WebElement signInSignUp;


    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(5) > a")
    WebElement testCasesButton;



    @FindBy(css = "#form > div > div:nth-child(2) > h5 > span")
    WebElement testCasesItem;


    public TestCasesPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logger.info("Test Cases Page Object Created...");
    }

    public void checkHomeVisibility()
    {
        try
        {
            logger.trace("Trying to Check Visibility of Home Page");
            Assert.assertTrue(signInSignUp.isDisplayed());
            logger.debug("Home Page is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : home page is not displayed", e);
        }
    }
    public void clickOnTestCases()
    {
        try
        {
            logger.trace("Trying to Find Test Cases Button");
            testCasesButton.click();
            logger.debug("Test Cases Button Clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Test Cases Button ", e);
        }

    }

    public void checkHTestCasesVisibility()
    {
        try
        {
            logger.trace("Trying to Check Visibility of Test Cases Page");
            Assert.assertTrue(testCasesItem.isDisplayed());
            logger.debug("Test Cases Page is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Test Cases page is not displayed", e);
        }
    }
}
