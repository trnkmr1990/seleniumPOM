package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.CartPage;

public class AddToCartFromHomeTest extends BaseTest {
	@Test(groups = "sanity")
    public void addProductFromHome() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        homePage.addFirstProductToCart();
        CartPage cartPage = homePage.clickViewCart();
        Assert.assertTrue(cartPage.isProductInCart(), "Product not added to cart!");
    }
}
