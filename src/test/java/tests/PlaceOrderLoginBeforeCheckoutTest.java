package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.CartPage;

public class PlaceOrderLoginBeforeCheckoutTest extends BaseTest {
	@Test(groups = {"regression"})
    public void loginBeforeCheckout() {
        HomePage home = new HomePage(driver);
        home.openHomePage();
        LoginPage login = home.clickSignupLogin();
        login.enterEmail("testuser@gmail.com");
        login.enterPassword("test123");
        login.clickLoginButton();
        home.addFirstProductToCart();
        CartPage cart = home.clickViewCart();
        cart.clickProceedToCheckout();
        //cart.placeOrder();
    }
}
