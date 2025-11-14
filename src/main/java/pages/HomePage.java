package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // Locators
    private By signupLoginLink = By.xpath("//a[contains(text(),'Signup / Login')]");
    private By productsLink = By.xpath("//a[@href='/products']");
    private By contactUsLink = By.xpath("//a[@href='/contact_us']");
    private By addToCartFirstProduct = By.xpath("(//a[contains(text(),'Add to cart')])[1]");
    private By viewCartButton = By.xpath("//u[contains(text(),'View Cart')]");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Navigate to Home Page
    public void openHomePage() {
        driver.get("https://automationexercise.com/");
    }

    // Navigate to Login Page
    public LoginPage clickSignupLogin() {
        driver.findElement(signupLoginLink).click();
        return new LoginPage(driver);
    }

    // Navigate to Products Page
    public void navigateToProductsPage() {
        driver.findElement(productsLink).click();
    }

    // Navigate to Contact Us Page
    public void navigateToContactUs() {
        driver.findElement(contactUsLink).click();
    }

    // Add product to cart from Home page
    public void addFirstProductToCart() {
        driver.findElement(addToCartFirstProduct).click();
    }

    // Click View Cart (after adding product)
    public CartPage clickViewCart() {
        driver.findElement(viewCartButton).click();
        return new CartPage(driver);
    }
}
