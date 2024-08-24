import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;

public class DataProvidedTest extends BaseTest {
    @DataProvider(name = "loginData")
    public Object[][] provideLoginData() {
        return new Object[][]{
                {"monaibrahim99569@gmail.com", "Mona2025/"},
                {"monaibrahim99569@gmail.com", "Mona2025/"},
    };
    }

    @Test(dataProvider ="loginData")
    public void loginTest (String username , String password) {
        BasePage basepage = new BasePage(driver);
        basepage.clickLogButton();
        LoginPage login = new LoginPage(driver);
        login.writeEmail(username);
        login.writePassword(password);
        login.pressOnLogin();
    }
}
