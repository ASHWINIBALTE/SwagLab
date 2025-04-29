package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    //private By addToCartButton = By.cssSelector(".inventory_item:first-of-type button"); // First product's button
    private By addToCartButton=By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By cartIcon = By.className("shopping_cart_link");
    private By cartItem = By.className("cart_item");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemToCart(String itemName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement itemvalue = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        itemvalue.click();
       // driver.findElement(addToCartButton).click();

    }

    public void clickCartIcon() {
        driver.findElement(cartIcon).click();
    }

    public boolean isItemInCart(

    ) {
        return driver.findElements(cartItem).size() > 0;
    }

}
