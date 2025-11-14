package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    // Locators
    private By productRows = By.xpath("//tbody/tr");
    private By removeProductIcon = By.xpath("//a[@class='cart_quantity_delete']");
    private By emptyCartMessage = By.xpath("//b[contains(text(),'Cart is empty!')]");
    private By proceedToCheckoutBtn = By.xpath("//a[contains(text(),'Proceed To Checkout')]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Verify if a product is added
    public boolean isProductInCart() {
        return driver.findElements(productRows).size() > 0;
    }

    // Remove product
    public void removeProduct() {
        driver.findElement(removeProductIcon).click();
    }

    // Verify if cart is empty
    public boolean isCartEmpty() {
        return driver.findElement(emptyCartMessage).isDisplayed();
    }

    // Proceed to checkout
    public CheckoutPage clickProceedToCheckout() {
        driver.findElement(proceedToCheckoutBtn).click();
        return new CheckoutPage(driver);
    }
}
