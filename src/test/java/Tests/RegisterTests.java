package Tests;

import Pages.HomePage;
import Pages.RegisterPage;
import org.testng.annotations.Test;


public class RegisterTests extends BaseTests
{
    @Test
    public void testValidRegister()
    {
        RegisterPage registerPage = new RegisterPage(chromeDriver);
        HomePage homePage = new HomePage(chromeDriver);

        homePage.checkHomeVisibility();
        registerPage.clickOnSignInSignUp();
        registerPage.newUserSignupVisibility();
        registerPage.SetEmailAndPassword("user","narimanfarag25@gmail.com");
        registerPage.clickOnSignUp();
        registerPage.addressInfoVisibility();
        registerPage.selectFemaleButton();

        registerPage.SetDate("3", "12", "2000");

        registerPage.selectNewsLetter();
        registerPage.selectOptionRadio();

        registerPage.SetUserInfo("Nariman","Farag","123456","company1", "wnskhdjdgjydgjady","dkhdgkgdghafhgsfafdad","dkmdkjj","India", "skmkjskjas", "165000", "01024658678797");

        registerPage.accountCreatedVisibility();
        registerPage.clickOnContinueButton();
        registerPage.checkLoggedAsUserVisibility();



    }

    @Test
    public void testInvalidRegister()
    {
        RegisterPage registerPage = new RegisterPage(chromeDriver);
        HomePage homePage = new HomePage(chromeDriver);

        homePage.checkHomeVisibility();
        registerPage.clickOnSignInSignUp();
        registerPage.newUserSignupVisibility();
        registerPage.SetEmailAndPassword("Nariman","narimanfarag71@gmail.com");
        registerPage.clickOnSignUp();
        registerPage.emailExistedMessageVisibility();

    }
}
