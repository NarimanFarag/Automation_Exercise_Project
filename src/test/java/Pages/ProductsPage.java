package Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProductsPage
{
    private static final Logger logger = LogManager.getLogger(RegisterPage.class);
    WebDriver driver;

    @FindBy(css = ".navbar-nav > li:nth-child(4) > a:nth-child(1)")
    WebElement signInSignUp;


    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a")
    WebElement productsButton;


    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > h2")
    WebElement allProductsSen;


    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.choose > ul > li > a")
    WebElement viewProductButton;

    @FindBy(css = "body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div")
    WebElement productInfo;


    @FindBy(id = "search_product")
    WebElement searchInput;


    @FindBy(css = "#submit_search > i")
    WebElement searchButton;



    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/p")
    WebElement returnedFromSearch;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logger.info("Products Page Object Created...");
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

    public void clickOnProducts()
    {
        try
        {
            logger.trace("Trying to Find Products Button");
            productsButton.click();
            logger.debug("Products Button Clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Products Button ", e);
        }

    }

    public void checkAllProductsVisibility()
    {
        try
        {
            logger.trace("Trying to Check Visibility of All Products Page");
            Assert.assertTrue(allProductsSen.isDisplayed());
            logger.debug("All Products Page is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : All Products Page is not displayed", e);
        }
    }

    public void clickOnViewProduct()
    {
        try
        {
            logger.trace("Trying to Find View Product Button");
            String value2 = viewProductButton.getAttribute("href");
            driver.navigate().to(value2);
            logger.debug("View Product Button Clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in View Product Button ", e);
        }
    }

    public void checkProductInfoVisibility()
    {
        try
        {
            logger.trace("Trying to Check Visibility of Product Info");
            Assert.assertTrue(productInfo.isDisplayed());
            logger.debug("Product Info is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception :Product Info is not displayed", e);
        }
    }

    public void enterSearchInput(String searchProduct)
    {
        try
        {
            logger.trace("Trying to Check Visibility of Search input");
            searchInput.sendKeys(searchProduct);
            logger.debug("Search input is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception : Search input is not displayed", e);
        }

    }

    public void clickOnSearchButton()
    {
        try
        {
            logger.trace("Trying to Find Search Button");
            searchButton.click();
            logger.debug("Search Button Clicked..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception in Search Button ", e);
        }
    }

    public void checkReturnedProductsFromSearch()
    {
        try
        {
            logger.trace("Trying to Check Visibility of Returned Products");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            Assert.assertEquals(returnedFromSearch.getText(),"Blue Top");
            logger.debug("Returned Product is Displayed..");
        }
        catch (Exception e)
        {
            logger.trace("Error Exception :Returned Product is not displayed", e);
        }
    }
}
