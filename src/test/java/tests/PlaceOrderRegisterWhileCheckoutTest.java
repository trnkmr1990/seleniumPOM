package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.CartPage;
import pages.CheckoutPage;

public class PlaceOrderRegisterWhileCheckoutTest extends BaseTest {
    @Test
    public void registerWhileCheckout() {
        HomePage home = new HomePage(driver);
        home.openHomePage();
        home.addFirstProductToCart();
        CartPage cart = home.clickViewCart();
        CheckoutPage checkout = cart.clickProceedToCheckout();
        checkout.clickRegisterWhileCheckout();
        checkout.completeRegistration("Tarun", "tarun123@test.com", "password123");
        checkout.placeOrder();
    }
}
