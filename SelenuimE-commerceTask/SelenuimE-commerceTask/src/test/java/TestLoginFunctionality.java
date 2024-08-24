import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import pages.LoginPage;

public class TestLoginFunctionality extends BaseTest {
    @Test
    public void testLoginFunctionality() {
        BasePage base = new BasePage(driver);
        base.clickLogButton();
        LoginPage login = new LoginPage(driver);
        login.writeEmail("monaibrahim99999@gmail.com");
        login.writePassword("Mona2025/");
        login.pressOnLogin();
    }
    @Test
    public void testLoginFunctionality2() {
        BasePage base = new BasePage(driver);
        base.clickLogButton();
        LoginPage login = new LoginPage(driver);
        login.writeEmail("monaibrahim679dksa@gmail.com");
        login.writePassword("Mona2025");
        login.pressOnLogin();
        sAssert.assertEquals(login.unSuccessLogin(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found","Login was unsuccessful" );
    }

}
