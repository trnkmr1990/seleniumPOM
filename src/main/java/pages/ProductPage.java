package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    private By addToCartFirstProduct = By.xpath("(//a[contains(text(),'Add to cart')])[1]");
    private By viewCartButton = By.xpath("//u[contains(text(),'View Cart')]");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstProductToCart() {
        driver.findElement(addToCartFirstProduct).click();
    }

    public CartPage clickViewCart() {
        driver.findElement(viewCartButton).click();
        return new CartPage(driver);
    }
}
