package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.CartPage;

public class RemoveProductsFromCartTest extends BaseTest {
    @Test
    public void removeProductFromCart() {
        HomePage home = new HomePage(driver);
        home.openHomePage();
        home.addFirstProductToCart();
        CartPage cart = home.clickViewCart();
        cart.removeProduct();
        Assert.assertTrue(cart.isCartEmpty(), "Cart not empty after removal!");
    }
}
