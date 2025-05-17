package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class LoginSteps
{
    WebDriver driver = Hook.chromeDriver;
    LoginPage LoginPage = new LoginPage(driver);
    HomePage HomePage = new HomePage(driver);
    private static final Logger logger = LogManager.getLogger(RegisterPage.class);

    @Given("user in home page")
    public void user_in_home_page()
    {
        logger.debug("User is on the home page");
        HomePage.checkHomeVisibility();
    }

    @And("user clicked on signIn signUp")
    public void user_clicked_on_signIn_signUp()
    {
        logger.debug("user clicked on signIn signUp");
        LoginPage.clickOnSignInSignUp();
    }

    @And("user redirected to login page")
    public void user_redirected_to_login_page()
    {
        logger.debug("user redirected to login page");
        LoginPage.checkLoginVisibility();
    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String email, String pass) {

        logger.debug("user enter valid Email and Password");
        LoginPage.UserLogin(email,pass);
    }


    @And("user clicked on login button")
    public void  userClickedOnLoginButton()
    {
        logger.debug("user clicked on login button");
        LoginPage.clickOnLogin();
    }




    @Then("user login successfully")
    public void  user_login_successfully()
    {
        logger.debug("user login successfully");
        LoginPage.checkLoginAsVisibility();
    }

    @Then("error message will appear")
    public void  error_login_message()
    {
        logger.debug("Error Login Message");
        LoginPage.checkLoginAsVisibility();
    }

}

