package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{
    @Test
    public void testValidLogin()
    {
        LoginPage loginPage = new LoginPage(chromeDriver);
        HomePage homePage = new HomePage(chromeDriver);

        homePage.checkHomeVisibility();
//      loginPage.checkHomeVisibility();
        loginPage.clickOnSignInSignUp();
        loginPage.checkLoginVisibility();
        loginPage.UserLogin("narimanfarag51@gmail.com","123456");
        loginPage.checkLoginAsVisibility();
        loginPage.CheckDeleteFun();
    }

    @Test
    public void testInvalidLogin()
    {
        LoginPage loginPage = new LoginPage(chromeDriver);
        HomePage homePage = new HomePage(chromeDriver);

        homePage.checkHomeVisibility();
        loginPage.clickOnSignInSignUp();
        loginPage.checkLoginVisibility();
        loginPage.UserLogin("narimanfarag51@gmail.com","123456");
        loginPage.checkIncorrectMessageVisibility();
    }

    @Test
    public void testLogout()
    {
        LoginPage loginPage = new LoginPage(chromeDriver);
        HomePage homePage = new HomePage(chromeDriver);

        homePage.checkHomeVisibility();
        loginPage.clickOnSignInSignUp();
        loginPage.checkLoginVisibility();
        loginPage.UserLogin("narimanfarag51@gmail.com","123456");
        loginPage.checkLoginAsVisibility();
        loginPage.UserLogout();
    }

}
