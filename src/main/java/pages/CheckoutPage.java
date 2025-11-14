package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;

    // Locators
    private By registerOrLoginButton = By.xpath("//u[contains(text(),'Register / Login')]");
    private By placeOrderButton = By.xpath("//a[contains(text(),'Place Order')]");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Register while checkout
    public void clickRegisterWhileCheckout() {
        driver.findElement(registerOrLoginButton).click();
    }

    // Click place order
    public void placeOrder() {
        driver.findElement(placeOrderButton).click();
    }

    // For your flow that registers and then places order:
    public void completeRegistration(String name, String email, String password) {
        // implement signup steps if you build a RegisterPage
        System.out.println("Registering user: " + email);
    }
}
