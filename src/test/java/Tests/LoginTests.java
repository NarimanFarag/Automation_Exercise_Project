package Tests;

import Pages.LoginPage;
import Utillis.BaseTests;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests
{
    @Test
    public void testValidLogin()
    {
        LoginPage loginPage = new LoginPage(chromeDriver);

        loginPage.checkHomeVisibility();
        loginPage.clickOnSignInSignUp();
        loginPage.checkLoginVisibility();
        loginPage.enterEmail("narimanfarag41@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLogin();
        loginPage.checkLoginAsVisibility();
        loginPage.clickOnDelete();
        loginPage.checkAccountDeletedVisibility();
    }

    @Test
    public void testInvalidLogin()
    {
        LoginPage loginPage = new LoginPage(chromeDriver);

        loginPage.checkHomeVisibility();
        loginPage.clickOnSignInSignUp();
        loginPage.checkLoginVisibility();
        loginPage.enterEmail("narimanfarag41@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLogin();
        loginPage.checkIncorrectMessageVisibility();
    }

    @Test
    public void testLogout()
    {
        LoginPage loginPage = new LoginPage(chromeDriver);

        loginPage.checkHomeVisibility();
        loginPage.clickOnSignInSignUp();
        loginPage.checkLoginVisibility();
        loginPage.enterEmail("narimanfarag71@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLogin();
        loginPage.checkLoginAsVisibility();
        loginPage.clickOnLogout();
        loginPage.checkLoginVisibility();
    }

}
