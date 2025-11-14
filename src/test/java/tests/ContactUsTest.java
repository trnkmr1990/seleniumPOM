package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ContactUsPage;

public class ContactUsTest extends BaseTest {
    @Test
    public void submitContactForm() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        homePage.navigateToContactUs();
        ContactUsPage contact = new ContactUsPage(driver);
        contact.fillContactForm("Tarun", "tarun@example.com", "This is a test message.");
        contact.clickSubmit();
        Assert.assertTrue(contact.isSuccessMessageDisplayed(), "Form not submitted!");
    }
}
