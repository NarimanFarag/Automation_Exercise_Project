package Tests;

import Pages.ProductsPage;
import Utillis.BaseTests;
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
}
