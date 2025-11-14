package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;


public class AddToCartFromProductsTest extends BaseTest {
    @Test(groups= "sanity")
    public void addProductFromProductsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        homePage.navigateToProductsPage();
        ProductPage productPage = new ProductPage(driver);
        productPage.addFirstProductToCart();
        CartPage cartPage = productPage.clickViewCart();
        Assert.assertTrue(cartPage.isProductInCart(), "Product not added!");
    }
}
