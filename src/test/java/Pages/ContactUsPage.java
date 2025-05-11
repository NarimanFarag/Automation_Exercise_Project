package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class ContactUsPage
{

    private static final Logger logger = LogManager.getLogger(RegisterPage.class);
    WebDriver driver;

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(8) > a")
    WebElement contactUsButton;

    @FindBy(css = "#contact-us-form > div:nth-child(2) > input")
    WebElement nameField;

    @FindBy(css = "#contact-us-form > div:nth-child(3) > input")
    WebElement emailField;

    @FindBy(css = "#contact-us-form > div:nth-child(4) > input")
    WebElement subjectField;

    @FindBy(css = "#message")
    WebElement messageField;

    @FindBy(css = "#contact-us-form > div:nth-child(6) > input")
    WebElement fileUploadField;

    @FindBy(css = "#contact-us-form > div:nth-child(7) > input")
    WebElement submitButton;


    @FindBy(css = "#form-section > a > span")
    WebElement homeButton;


    @FindBy(css = "#contact-page > div.row > div.col-sm-8 > div > h2")
    WebElement getInTouchMsg;


    @FindBy(css = "#contact-page > div.row > div.col-sm-8 > div > div.status.alert.alert-success")
    WebElement successMessage;



    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logger.info("ContactUs Page Object Created...");
    }

    public void clickOnContactUs()
    {
        try
        {
            logger.trace("Trying to Find Contact Us Button");
            contactUsButton.click();
            logger.debug("Contact Us Button Clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Contact Us Button ", e);
        }

    }
    public void enterName(String usName)
    {
        try
        {
            logger.trace("Trying to Find Name Field");
            nameField.sendKeys(usName);
            logger.debug("Entered Name ..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Name Field ", e);
        }
    }

    public void enterEmail(String usEmail)
    {
        try
        {
            logger.trace("Trying to Find Email Field");
            emailField.sendKeys(usEmail);
            logger.debug("Entered Email ..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Email Field ", e);
        }
    }

    public void enterSubject(String subject)
    {
        try
        {
            logger.trace("Trying to Find Subject Field");
            subjectField.sendKeys(subject);
            logger.debug("Entered Subject ..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Subject Field ", e);
        }
    }

    public void enterMessage(String message)
    {
        try
        {
            logger.trace("Trying to Find Message Field");
            messageField.sendKeys(message);
            logger.debug("Entered Message ..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Message Field ", e);
        }
    }
    public void uploadFile(String path)
    {
        try
        {
            logger.trace("Trying to Find Upload File Field");
            messageField.sendKeys(path);
            logger.debug("Entered File ..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Upload File Field ", e);
        }
    }

    public void clickOnSubmitButton()
    {
        try
        {
            logger.trace("Trying to Find Submit Button");
            submitButton.submit();
            logger.debug("Submit Button Clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Submit Button ", e);
        }

    }

    public void clickOnHomeButton()
    {
        try
        {
            logger.trace("Trying to Find Home Button");
            homeButton.click();
            logger.debug("Home Button Clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Home Button ", e);
        }

    }

    public void checkContactUsVisibility()
    {
        try
        {
            logger.trace("Trying to Find Contact Us page");
            Assert.assertTrue(getInTouchMsg.isDisplayed());
            logger.debug("Contact Us Page is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Contact Us Page ", e);
        }

    }

    public void checkSuccessMessageVisibility()
    {
        try
        {
            logger.trace("Trying to Find Success Message in Contact us ");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            Assert.assertTrue(successMessage.isDisplayed());
            logger.debug(" Success Message is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in  Success Message in contact us Page ", e);
        }

    }

    public void handleAlerts()
    {
        try
        {
            logger.trace("Trying to Find Alert in Contact us ");
            Alert alert = driver.switchTo().alert();
            alert.accept();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            logger.debug("Alert is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Alert in contact us Page ", e);
        }

    }


}
