package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import io.qameta.allure.*;

public class RegisterPage {

    private static final Logger logger = LogManager.getLogger(RegisterPage.class);
    WebDriver driver;

    @FindBy(id = "id_gender1")
    WebElement selectMale;

    @FindBy(id = "id_gender2")
    WebElement selectFemale;

    @FindBy(css = ".signup-form > form:nth-child(2) > input:nth-child(2)")
    WebElement userName;

    @FindBy(css = ".signup-form > form:nth-child(2) > input:nth-child(3)")
    WebElement userEmail;

    @FindBy(css = ".navbar-nav > li:nth-child(4) > a:nth-child(1)")
    WebElement signInSignUp;

    @FindBy(css = ".signup-form > h2:nth-child(1)")
    WebElement newUserSignup;

    @FindBy(id = "days")
    WebElement daysDropList;

    @FindBy(id = "months")
    WebElement monthsDropList;

    @FindBy(id = "years")
    WebElement yearsDropList;

    @FindBy(id = "password")
    WebElement userPassword;

    @FindBy(id = "newsletter")
    WebElement newsletter;

    @FindBy(id = "optin")
    WebElement optionRadio;

    @FindBy(id = "first_name")
    WebElement firstName;

    @FindBy(id = "last_name")
    WebElement lastName;

    @FindBy(id = "company")
    WebElement companyName;

    @FindBy(id = "address1")
    WebElement addressOne;

    @FindBy(id = "address2")
    WebElement addressTwo;

    @FindBy(id = "country")
    WebElement countryDropList;

    @FindBy(id = "state")
    WebElement stateField;

    @FindBy(id = "city")
    WebElement cityField;

    @FindBy(id = "zipcode")
    WebElement zipcodeField;

    @FindBy(id = "mobile_number")
    WebElement mobileNumberField;

    @FindBy(css = "button.btn:nth-child(22)")
    WebElement createAccountButton;

    @FindBy(css = "button.btn:nth-child(5)")
    WebElement signupButton;

    @FindBy(css = "h2.title:nth-child(10) > b:nth-child(1)")
    WebElement addressInfo;

    @FindBy(css = "#form > div > div > div > h2 > b")
    WebElement accountCreated;

    @FindBy(css = "#form > div > div > div > div > a")
    WebElement continueButton;

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a")
    WebElement loggedAsUser;

    @FindBy(css = " #form > div > div > div:nth-child(3) > div > form > p")
    WebElement emailExistedMessage;


    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logger.info("Register Page Object Created...");
    }

    public void enterName(String usName)
    {
        try
        {
            logger.trace("Trying to Find Name Field");
            userName.sendKeys(usName);
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
            userEmail.sendKeys(usEmail);
            logger.debug("Entered Email ..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Email Field ", e);
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
            logger.trace("Error Exception : home page is not displayed", e);
        }
    }

    public void newUserSignupVisibility()
    {
        try
        {
            logger.trace("Trying to Check Visibility of signup new user");
            Assert.assertTrue(newUserSignup.isDisplayed());
            logger.debug("Signup New User is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : new user signup is not displayed", e);
        }
    }

    public void selectFemaleButton()
    {
        try
        {
            logger.trace("Trying to Select Female Button");
            selectFemale.click();
            logger.debug("Female Button is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Female Button is not Selected", e);
        }

    }

    public void selectMaleButton()
    {
        try
        {
            logger.trace("Trying to Select Male Button");
            selectMale.click();
            logger.debug("Male Button is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Male Button is not Selected", e);
        }

    }

    public void selectFromDays(String item)
    {
        try
        {
            logger.trace("Trying to Select Item from Days");
            Select select = new Select(daysDropList);
            select.selectByVisibleText(item);
            logger.debug("Day is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Can NOT Select Item from Days drop down list", e);
        }
    }

    public void selectFromMonths(String item)
    {
        try
        {
            logger.trace("Trying to Select Item from Months");
            Select select = new Select(monthsDropList);
            select.selectByVisibleText(item);
            logger.debug("Month is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Can NOT Select Item from Months drop down list", e);
        }
    }

    public void selectFromYears(String item)
    {
        try
        {
            logger.trace("Trying to Select Item from Years");
            Select select = new Select(yearsDropList);
            select.selectByVisibleText(item);
            logger.debug("Year is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Can NOT Select Item from Years drop down list", e);
        }
    }

    public void enterPassword(String usPassword)
    {
        try
        {
            logger.trace("Trying to Find Password Field");
            userPassword.sendKeys(usPassword);
            logger.debug("Entered Password ..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Password Field ", e);
        }
    }

    public void selectNewsLetter()
    {
        try
        {
            logger.trace("Trying to Find NewsLetter Field");
            newsletter.click();
            logger.debug("Newsletter is clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in NewsLetter Field ", e);
        }
    }

    public void selectOptionRadio()
    {
        try
        {
            logger.trace("Trying to Find option Radio Field");
            optionRadio.click();
            logger.debug("optionRadio is checked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in option Radio Field ", e);
        }
    }

    public void enterFirstName(String firstname)
    {
        try
        {
            logger.trace("Trying to Find First Name Field");
            firstName.sendKeys(firstname);
            logger.debug("Entered First Name ..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in First Name Field ", e);
        }

    }

    public void enterLastName(String lastname) {

        try {
            logger.trace("Trying to Find Last Name Field");
            lastName.sendKeys(lastname);
            logger.debug("Entered Last Name ..");
        } catch (Exception e) {
            logger.trace("Error Exception in Last Name Field ", e);
        }
    }

    public void enterCompany(String comPName) {
        try {
            logger.trace("Trying to Find Company Name Field");
            companyName.sendKeys(comPName);
            logger.debug("Entered Company Name ..");
        } catch (Exception e) {
            logger.trace("Error Exception in Company Name Field ", e);
        }

    }

    public void enterAddress1(String address) {
        try {
            logger.trace("Trying to Find address one Field");
            addressOne.sendKeys(address);
            logger.debug("Entered address one ..");
        } catch (Exception e) {
            logger.trace("Error Exception in address one Field ", e);
        }

    }

    public void enterAddress2(String address)
    {
        try
        {
            logger.trace("Trying to Find address two Field");
            addressTwo.sendKeys(address);
            logger.debug("Entered address two ..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in address Two Field ", e);
        }

    }

    public void selectCountry(String countryValue)
    {
        try
        {
            logger.trace("Trying to Find Country Drop List Field");
            Select select = new Select(countryDropList);
            select.selectByVisibleText(countryValue);
            logger.debug("Country is Selected..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Country Drop List Field ", e);
        }
    }

    public void enterState(String stateValue)
    {
        try
        {
            logger.trace("Trying to Find State Field");
            stateField.sendKeys(stateValue);
            logger.debug("Entered State Field..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in State Field ", e);
        }

    }

    public void enterCity(String cityValue)
    {
        try
        {
            logger.trace("Trying to Find City Field");
            cityField.sendKeys(cityValue);
            logger.debug("Entered City Field..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in City Field ", e);
        }

    }

    public void enterZipCode(String zipcodeValue)
    {
        try
        {
            logger.trace("Trying to Find zip code Field");
            zipcodeField.sendKeys(zipcodeValue);
            logger.debug("Entered zip code Field..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in zip code Field ", e);
        }

    }

    public void enterMobileNumber(String mobileValue)
    {
        try
        {
            logger.trace("Trying to Find Mobile Number Field");
            mobileNumberField.sendKeys(mobileValue);
            logger.debug("Entered Mobile Number Field..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Mobile Number Field ", e);
        }

    }

    public void clickOnRegister()
    {
        try
        {
            logger.trace("Trying to Find Register Button");
            createAccountButton.click();
            logger.debug("Register Button Clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Register Button ", e);
        }

    }

    public void clickOnSignInSignUp()
    {
        try
        {
            logger.trace("Trying to Find SignIn/SignUp words");
            signInSignUp.click();
            logger.debug("SignIn/SignUp words Clicked..");
        } catch (Exception e) {
            logger.trace("Error Exception in SignIn/SignUp words ", e);
        }

    }

    public void clickOnSignUp()
    {
        try
        {
            logger.trace("Trying to Find SignUp Button");
            signupButton.click();
            logger.debug("SignUp Button Clicked..");
        } catch (Exception e) {
            logger.trace("Error Exception in SignUp Button ", e);
        }

    }

    public void addressInfoVisibility()
    {
        try
        {
            logger.trace("Trying to Check Visibility of Address Info");
            Assert.assertTrue(addressInfo.isDisplayed());
            logger.debug("Address Info is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Address Info is not displayed", e);
        }
    }

    public void accountCreatedVisibility()
    {
        try
        {
            logger.trace("Trying to account Created Visibility of home page");
            Assert.assertTrue(accountCreated.isDisplayed());
            logger.debug("Account Created is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Account Created is not Displayed", e);
        }
    }

    public void clickOnContinueButton()
    {
        try
        {
            logger.trace("Trying to Find Continue Button");
            continueButton.click();
            logger.debug("Continue Button Clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Continue Button ", e);
        }
    }


    public void checkLoggedAsUserVisibility()
    {
        try
        {
            logger.trace("Trying to Logged As User Visibility of home page");
            Assert.assertTrue(loggedAsUser.isDisplayed());
            logger.debug("Logged As User is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Logged As User is not displayed", e);
        }
    }

    public void emailExistedMessageVisibility()
    {
        try
        {
            logger.trace("Trying to Check Visibility of Email Existed Message");
            Assert.assertTrue(emailExistedMessage.isDisplayed());
            logger.debug("Email Existed Message is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Email Existed Message is not displayed", e);
        }
    }

    public void SetDate(String Day, String Month, String Year)
    {
        try
        {
            Assert.assertTrue(daysDropList.isDisplayed());
            selectFromDays(Day);
            Assert.assertTrue(monthsDropList.isDisplayed());
            selectFromMonths(Month);
            Assert.assertTrue(yearsDropList.isDisplayed());
            selectFromYears(Year);
            logger.debug("Fill Date..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Date", e);
        }
    }

    public void SetUserInfo(String FName, String LName,String Password, String Company, String Add1,String Add2,String City, String Country, String State, String ZipCode, String MobileNumber)
    {
        try
        {
            enterFirstName(FName);
            enterLastName(LName);
            enterPassword(Password);
            enterCompany(Company);
            enterAddress1(Add1);
            enterAddress2(Add2);
            enterCity(City);
            selectCountry(Country);
            enterState(State);
            enterZipCode(ZipCode);
            enterMobileNumber(MobileNumber);
            clickOnRegister();
            logger.debug("Fill User Info..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : User Info", e);
        }
    }

    public void SetEmailAndPassword(String Name,String Password)
    {
        try
        {
            enterName(Name);
            enterPassword(Password);
            logger.debug("Fill Email and Password..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Email and Password", e);
        }
    }

}

