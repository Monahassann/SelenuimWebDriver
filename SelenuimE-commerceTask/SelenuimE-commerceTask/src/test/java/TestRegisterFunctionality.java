import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RegisterPage;

import java.util.concurrent.TimeUnit;

public class TestRegisterFunctionality extends BaseTest{

    @Test
    public void testRegisterFunctionality() {
        BasePage base = new BasePage(driver);
        base.clickRegisterButton();
        RegisterPage register = new RegisterPage(driver);
        register.typeInFirstName("Mona");
        register.typeInLastName("Gomaa");
        register.typeInEmail("monaibrahim990609@gmail.com");
        register.selectDay(2);
        register.selectYear(3);
        register.selectMonth(5);
        register.typePassword("Mona2025/");
        register.typeConfPassword("Mona2025/");
        register.clickOnRegisterButton();

    }
    @Test
    public void testRegisterFunctionality2() {
        BasePage base = new BasePage(driver);
        base.clickRegisterButton();
        RegisterPage register = new RegisterPage(driver);
        register.typeInFirstName("Mona");
        register.typeInLastName("Gomaa");
        register.typeInEmail("monaibrahim67");
        register.selectDay(2);
        register.selectYear(3);
        register.selectMonth(5);
        register.typePassword("Mona20245/");
        register.typeConfPassword("Mona20245/");
        register.clickOnRegisterButton();
        sAssert.assertEquals(register.validateRegister(),"Wrong email","The specified email is incorrect");
        sAssert.assertAll();

    }








}
