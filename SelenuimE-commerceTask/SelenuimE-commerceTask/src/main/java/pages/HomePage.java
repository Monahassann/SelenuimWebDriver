package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BrowserActions;

import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.text;

public class HomePage extends BasePage {

    By searchBox =  By.xpath("//input[@class='search-box-text ui-autocomplete-input']");
    By searchBoxClick = By.xpath("//button[@class= 'button-1 search-box-button']");

    public  HomePage (WebDriver driver) { super(driver);};

    public void typeInSearchBox (String text) {BrowserActions.sendKeys(searchBox,driver,text);};
    public void clickOnSearch () { BrowserActions.clickOnButton(searchBoxClick,driver);};
}
