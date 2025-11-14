package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Locators
    private By emailInput = By.xpath("//input[@data-qa='login-email']");
    private By passwordInput = By.xpath("//input[@data-qa='login-password']");
    private By loginButton = By.xpath("//button[@data-qa='login-button']");
    private By loggedInAsText = By.xpath("//a[contains(text(),'Logged in as')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public AccountPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new AccountPage(driver);
    }

    public boolean isLoggedInVisible() {
        return driver.findElement(loggedInAsText).isDisplayed();
    }
    
    public void createNewAccount(String name, String email, String password) {
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(email);
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
    }

}
