package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage
{
    private static final Logger logger = LogManager.getLogger(RegisterPage.class);
    WebDriver driver;

    @FindBy(css = ".navbar-nav > li:nth-child(4) > a:nth-child(1)")
    WebElement signInSignUp;

    @FindBy(css = ".login-form > h2:nth-child(1)")
    WebElement loginToYourAccount;

    @FindBy(css = ".login-form > form:nth-child(2) > input:nth-child(2)")
    WebElement emailField;

    @FindBy(css = ".login-form > form:nth-child(2) > input:nth-child(3)")
    WebElement passwordField;

    @FindBy(css = "button.btn:nth-child(4)")
    WebElement loginButton;


    @FindBy(css = ".navbar-nav > li:nth-child(10) > a:nth-child(1)")
    WebElement loginAsVisible;



    @FindBy(css = " .navbar-nav > li:nth-child(5) > a:nth-child(1)")
    WebElement deleteButton;



    @FindBy(css = ".title > b:nth-child(1)")
    WebElement accountDeleted;


    @FindBy(css = "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > p")
    WebElement incorrectMessage;



    @FindBy(css = "    #header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a")
    WebElement logoutButton;


    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logger.info("Login Page Object Created...");
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

    public void clickOnSignInSignUp()
    {
        try
        {
            logger.trace("Trying to Find SignIn/SignUp Button");
            signInSignUp.click();
            logger.debug("SignIn/SignUp Button Clicked..");
        } catch (Exception e) {
            logger.trace("Error Exception in SignIn/SignUp Button ", e);
        }
    }

    public void checkLoginVisibility()
    {
        try
        {
            logger.trace("Trying to Check Visibility of Login Page");
            Assert.assertTrue(loginToYourAccount.isDisplayed());
            logger.debug("Login Page is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Login Page is not displayed", e);
        }
    }

    public void enterPassword(String usPassword)
    {
        try
        {
            logger.trace("Trying to Find Password Field");
            passwordField.sendKeys(usPassword);
            logger.debug("Entered Password ..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Password Field ", e);
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

    public void clickOnLogin()
    {
        try
        {
            logger.trace("Trying to Find Login Button");
            loginButton.click();
            logger.debug("Login Button Clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Login Button ", e);
        }

    }

    public void checkLoginAsVisibility()
    {
        try
        {
            logger.trace("Trying to Check Visibility of Login As Link");
            Assert.assertTrue(loginAsVisible.isDisplayed());
            logger.debug("Login As Link is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Login As Link is not displayed", e);
        }
    }

    public void clickOnDelete()
    {
        try
        {
            logger.trace("Trying to Find Delete Button");
            deleteButton.click();
            logger.debug("Delete button Clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Delete Button ", e);
        }

    }

    public void checkAccountDeletedVisibility()
    {
        try
        {
            logger.trace("Trying to Check Visibility of Account Deleted ");
            Assert.assertTrue(accountDeleted.isDisplayed());
            logger.debug("Account Deleted is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Account Deleted is not displayed", e);
        }
    }
    public void checkIncorrectMessageVisibility()
    {
        try
        {
            logger.trace("Trying to Check Visibility of Incorrect Password Message");
            Assert.assertTrue(incorrectMessage.isDisplayed());
            logger.debug("Incorrect Password Message is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Incorrect Password Message is not displayed", e);
        }
    }

    public void clickOnLogout()
    {
        try
        {
            logger.trace("Trying to Find Logout Button");
            logoutButton.click();
            logger.debug("Logout Button Clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Logout Button ", e);
        }

    }

}
