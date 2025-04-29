package hooks;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.BaseClass;

import static utils.BaseClass.driver;

public class Hooks  {

    @BeforeTest
    public void setup() {
        // Call the initialize method from BaseClass
        BaseClass.getDriver();
     }

    @AfterTest
    public void tearDown() {
        // Call the tearDown method from BaseClass
        BaseClass.quitDriver();
    }
}
