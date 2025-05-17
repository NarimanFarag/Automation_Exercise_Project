package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage
{

    private static final Logger logger = LogManager.getLogger(RegisterPage.class);
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")
    WebElement subscriptionWord;

    @FindBy(css = ".navbar-nav > li:nth-child(4) > a:nth-child(1)")
    WebElement signInSignUp;

    @FindBy(id = "susbscribe_email")
    WebElement subscribeEmail;

    @FindBy(xpath = "//*[@id=\"subscribe\"]/i")
    WebElement subscribeButton;

    @FindBy(id = "success-subscribe")
    WebElement successMessage;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logger.info("Products Page Object Created...");
    }

    public void scrollDown()
    {
        try
        {
            logger.trace("Trying to Scroll down in Home Page");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            logger.debug("Scroll down is done..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception :Scroll down in Home Page", e);
        }

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
            logger.trace("Error Exception : Home Page is not displayed", e);
        }
    }

    public void checkSubVisibility()
    {
        try
        {
            logger.trace("Trying to Check Visibility of subscription word in Home Page");
            Assert.assertTrue(subscriptionWord.isDisplayed());
            logger.debug("subscription word in Home Page is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : subscription word in Home Page is not displayed", e);
        }

    }

    public void enterEmail(String email)
    {
        try
        {
            logger.trace("Trying to Check Visibility of Subscribe Email in Home Page");
            subscribeEmail.sendKeys(email);
            logger.debug("Subscribe Email in Home Page entered..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Subscribe Email in Home Page is not displayed", e);
        }
    }


    public void clickOnSubscribeButton()
    {
        try
        {
            logger.trace("Trying to Check Visibility of Subscribe Button in Home Page");
            subscribeButton.click();
            logger.debug("Subscribe Button is clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Subscribe Button in Home Page is not clicked", e);
        }
    }

    public void checkSuccessMessageVisibility()
    {
        try
        {
            logger.trace("Trying to Check Visibility of subscription Success Message in Home Page");
            Assert.assertTrue(successMessage.isDisplayed());
            logger.debug("Subscription Success Message in Home Page is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Subscription Success Message in Home Page is not displayed", e);
        }

    }
}
