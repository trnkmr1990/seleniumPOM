package tests;

import base.BaseTest;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(groups = {"smoke", "regression"})
    public void verifySuccessfulLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();

        // Navigate to Login Page
        LoginPage loginPage = homePage.clickSignupLogin();

        // Enter VALID login credentials
        loginPage.enterEmail("hitman@example.com");
        loginPage.enterPassword("Password@123");

        AccountPage accountPage = loginPage.clickLoginButton();

        // Add small sleep to wait for redirect
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

        String loggedUser = accountPage.getLoggedInUsername();
        System.out.println("Logged In Text: " + loggedUser);

        Assert.assertTrue(loggedUser.contains("Logged in as"), "❌ Login Failed: User not found!");
    }
}
