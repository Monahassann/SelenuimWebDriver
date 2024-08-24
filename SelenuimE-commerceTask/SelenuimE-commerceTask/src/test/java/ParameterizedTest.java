import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;

public class ParameterizedTest extends BaseTest {
    @Parameters({"username", "password"})
    @Test
    public void loginTest (String username , String password) {
        BasePage basepage = new BasePage(driver);
        basepage.clickLogButton();
        LoginPage login = new LoginPage(driver);
        login.writeEmail(username);
        login.writePassword(password);
        login.pressOnLogin();
        //sAssert.assertEquals(l);
    }
}
