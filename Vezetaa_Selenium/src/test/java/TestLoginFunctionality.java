import Pages.BasePage;
import Pages.Login;
import org.testng.annotations.Test;

public class TestLoginFunctionality extends BaseTest{
    @Test
    public void invalidLogin() {
        BasePage base = new BasePage(driver);
        base.clickLogin();
        Login login = new Login(driver);
        login.enterUsername("01153268331");
        login.enterPass("Mona2025/");
        login.pressLoginButton();
        sAssert.assertEquals(login.invalidLogin(), "Mobile number/Email or password is incorrect. please try again");
        sAssert.assertAll();
    }

}
