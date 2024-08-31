import Pages.BasePage;
import Pages.Login;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProvidedData extends BaseTest{
    @DataProvider(name = "loginData")
    public Object[][] provideLoginData() {
        return new Object[][]{
                {"monaibrahim99569@gmail.com", "Mona2025/"},
                {"monaibrahim99569@gmail.com", "Mona2025/"},
                {"monaibrahim99d9@gmail.com", "Mona2025/"},
        };
    }
    @Test(dataProvider ="loginData")
    public void loginTest (String username , String password) {
        BasePage basepage = new BasePage(driver);
        basepage.clickLogin();
        Login login = new Login(driver);
        login.enterUsername(username);
        login.enterPass(password);
        login.pressLoginButton();
    }

}
