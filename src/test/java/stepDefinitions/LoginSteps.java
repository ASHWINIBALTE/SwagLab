package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import utils.BaseClass;

public class LoginSteps {


    WebDriver driver;
    LoginPage loginPage;
    @Given("User is on the Swag Labs login page")
    public void userIsOnTheSwagLabsLoginPage() {
         driver = BaseClass.getDriver();
         loginPage = new LoginPage(driver);
       driver.get("https://www.saucedemo.com");
    }

    @When("User enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("User clicks on the Login button")
    public void userClicksOnTheLoginButton() {
        loginPage.clickLogin();
    }

    @Then("User should see the Products page")
    public void user_should_see_products_page() {
        Assert.assertTrue(loginPage.isProductsTitleVisible(), "Products title not visible, login might have failed.");
    }

   // @Then("User should see the error message")
    //public void userShouldSeeTheErrorMessage() {
      //  Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message not visible for invalid login.");
        //}


    @Then("User should see the error message {string}")
    public void userShouldSeeTheErrorMessage(String expectedError)
    {
        //  Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message is not displayed!");
        String actualError = loginPage.getErrorText();
       // System.out.println("Actual Error Message: " + actualError);
        Assert.assertEquals(actualError, expectedError);
    }
       // Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message not visible for invalid login.");

}



