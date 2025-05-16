package Tests;

import Pages.ProductsPage;
import org.testng.annotations.Test;

public class ProductsTests  extends BaseTests
{
    @Test
    public void verifyAllProductsVisibility()
    {
        ProductsPage productsPage = new ProductsPage(chromeDriver);
        productsPage.checkHomeVisibility();
        productsPage.clickOnProducts();
        productsPage.checkAllProductsVisibility();
        productsPage.clickOnViewProduct();
        productsPage.checkProductInfoVisibility();
    }

    @Test
    public void searchProduct()
    {
        ProductsPage productsPage = new ProductsPage(chromeDriver);
        productsPage.checkHomeVisibility();
        productsPage.clickOnProducts();
        productsPage.checkAllProductsVisibility();
        productsPage.enterSearchInput("Blue Top");
        productsPage.checkProductInfoVisibility();
        productsPage.clickOnSearchButton();
        productsPage.checkReturnedProductsFromSearch();
    }
}
