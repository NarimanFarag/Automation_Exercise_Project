package StepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Hook
{
    public static WebDriver chromeDriver;

    @BeforeClass
    public void driverSetup()
    {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--incognito");
        options.addArguments("--ignore-certificate-errors");

        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver(options);
        //chromeDriver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        //chromeDriver.get("https://automationexercise.com/login");
        chromeDriver.navigate().to("https://automationexercise.com/login");
        chromeDriver.navigate().forward();
    }

    @BeforeMethod
    public void navigateToUrl()
    {
        chromeDriver.navigate().to("https://automationexercise.com/login");
        chromeDriver.navigate().forward();
    }
}
