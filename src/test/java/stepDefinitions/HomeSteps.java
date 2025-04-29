package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseClass;

public class HomeSteps {
    WebDriver driver = BaseClass.getDriver();
    HomePage homePage = new HomePage(driver);

    @And("User clicks on the cart icon")
    public void userClicksOnTheCartIcon() {
        homePage.clickCartIcon();
    }

    @And("User adds the {string} item to the cart")
    public void
    userAddsTheItemToTheCart(String itemName) {
       homePage.addItemToCart(itemName);

    }

    @Then("User should see the {string} item in the cart")
    public void userShouldSeeTheItemInTheCart(String itemName) {
        Assert.assertTrue(homePage.isItemInCart(), "Item was not found in the cart");


    }
}
