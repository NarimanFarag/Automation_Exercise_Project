package Tests;

import Pages.HomePage;
import Pages.RegisterPage;
import org.testng.annotations.Test;


public class RegisterTests extends BaseTests
{
    @Test
    public void testValidRegister() {
        RegisterPage registerPage = new RegisterPage(chromeDriver);
        HomePage homePage = new HomePage(chromeDriver);

        homePage.checkHomeVisibility();
        registerPage.clickOnSignInSignUp();
        registerPage.newUserSignupVisibility();
        registerPage.enterName("user");
        registerPage.enterEmail("narimanfarag25@gmail.com");
        registerPage.clickOnSignUp();
        registerPage.addressInfoVisibility();
        registerPage.selectFemaleButton();

        registerPage.selectFromDays("3");
        registerPage.selectFromMonths("12");
        registerPage.selectFromYears("2000");
        registerPage.selectNewsLetter();
        registerPage.selectOptionRadio();
        registerPage.enterPassword("123456");

        registerPage.enterFirstName("Nariman");
        registerPage.enterLastName("Farag");
        registerPage.enterCompany("company1");
        registerPage.enterAddress1("wnskhdjdgjydgjady");
        registerPage.enterAddress2("dkhdgkgdghafhgsfafdad");
        registerPage.enterCity("dkmdkjj");
        registerPage.selectCountry("India");
        registerPage.enterState("skmkjskjas");

        registerPage.enterZipCode("165000");

        registerPage.enterMobileNumber("01024658678797");
        registerPage.clickOnRegister();

        registerPage.accountCreatedVisibility();
        registerPage.clickOnContinueButton();
        registerPage.checkLoggedAsUserVisibility();



    }

    @Test
    public void testInvalidRegister() {
        RegisterPage registerPage = new RegisterPage(chromeDriver);
        HomePage homePage = new HomePage(chromeDriver);

        homePage.checkHomeVisibility();
        registerPage.clickOnSignInSignUp();
        registerPage.newUserSignupVisibility();
        registerPage.enterName("Nariman");
        registerPage.enterEmail("narimanfarag71@gmail.com");
        registerPage.clickOnSignUp();
        registerPage.emailExistedMessageVisibility();

    }
}
