import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.BrowserActions;
import utilities.DriversSetup;

public class BaseTest {
    WebDriver driver;
    SoftAssert sAssert = new SoftAssert();
    @BeforeMethod
    public void BaseMethod () {
       /* WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();*/
        driver = DriversSetup.chooseBrowser("chrome","https://demo.nopcommerce.com/");
    }
    @AfterMethod
    public void afterTest() {

        //driver.quit();
    }

}
