package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserActions {

    public static void clickOnButton(By clickableElement, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(clickableElement));
        driver.findElement(clickableElement).click();
    }
    public static void waitUntilElementLocated(WebDriver driver, By locatedElement) {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(locatedElement));
    }
    public static void sendKeys(By sendTextElement, WebDriver driver, String text)
    {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(sendTextElement));
        driver.findElement(sendTextElement).sendKeys(text);
    }

    public static String getText(By getTextElement, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(getTextElement));
        return driver.findElement(getTextElement).getText();
    }

    public static void waitUntilElementIsVisible (WebDriverWait wait , WebDriver driver, By element) {
        wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void scrollElement(By locatedElement, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", locatedElement);
    }




}
