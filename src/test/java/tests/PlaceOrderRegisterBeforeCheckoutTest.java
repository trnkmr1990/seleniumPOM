package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.CartPage;

public class PlaceOrderRegisterBeforeCheckoutTest extends BaseTest {
    @Test
    public void registerBeforeCheckout() {
        HomePage home = new HomePage(driver);
        home.openHomePage();
        LoginPage login = home.clickSignupLogin();
        login.createNewAccount("Tarun", "tarun1234@test.com", "test@123");
        home.addFirstProductToCart();
        CartPage cart = home.clickViewCart();
        cart.clickProceedToCheckout();
        //cart.placeOrder();
    }
}
