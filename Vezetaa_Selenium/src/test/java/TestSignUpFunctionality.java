import Pages.BasePage;
import Pages.SignUp;
import org.testng.annotations.Test;

public class TestSignUpFunctionality extends BaseTest{

   @Test
    public void testSignupExistingUser() {
       BasePage base = new BasePage(driver);
       base.clickOnSignUp();
       SignUp signUp = new SignUp(driver);
       signUp.enterName("Mona ibrahim");
       signUp.enterMobile("01153268331");
       signUp.enterEmail("monaibrahim6792@gmail.com");
       signUp.enterPass("Mona2025/");
       signUp.genderFemale();
       signUp.clickJoin();
       sAssert.assertEquals(signUp.getSignUpMessage(),"This mobile number is already registered. Please choose another");
       sAssert.assertAll();




   }
}
