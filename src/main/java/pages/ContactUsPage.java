package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
    private WebDriver driver;

    private By nameField = By.xpath("//input[@data-qa='name']");
    private By emailField = By.xpath("//input[@data-qa='email']");
    private By messageBox = By.xpath("//textarea[@data-qa='message']");
    private By submitButton = By.xpath("//input[@data-qa='submit-button']");
    private By successMsg = By.xpath("//div[@class='status alert alert-success']");

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillContactForm(String name, String email, String message) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(messageBox).sendKeys(message);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMsg).isDisplayed();
    }
}
