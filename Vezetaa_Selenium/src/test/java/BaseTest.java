import Utilities.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BaseTest {

    WebDriver driver;
    SoftAssert sAssert = new SoftAssert();
    @BeforeMethod
    public void BaseMethod () {
       /* WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();*/
       driver = DriverSetup.chooseBrowser("chrome","https://www.vezeeta.com/en");
    }
    @AfterMethod
    public void afterTest() {
        driver.quit();
    }
}
