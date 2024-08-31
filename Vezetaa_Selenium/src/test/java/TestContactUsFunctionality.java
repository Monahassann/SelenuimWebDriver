import Pages.BasePage;
import Pages.ContactUs;
import org.testng.annotations.Test;

public class TestContactUsFunctionality extends BaseTest {
    @Test
    public void contactUs() {
        BasePage basePage = new BasePage(driver);
        basePage.ClickOnContact();
        ContactUs contact = new ContactUs(driver);
        contact.typeContactName("Mona ibrahim hassan");
        contact.typeContactMail("monaibrahim672@gmail.com");
        contact.typeContactMobile("01153268331");
        contact.typeMessage("I want to reserve an appointment for doctor ibrahim hassan but i can't find him on the website , SO i" +
                "want someone to contact me");
        //contact.clickSendButton();
    }
}
