package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;
    private By loggedInAs = By.xpath("//a[contains(text(),'Logged in as')]");

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoggedInUsername() {
        return driver.findElement(loggedInAs).getText();
    }
}
