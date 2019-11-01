package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickActions {
    public static void clickOnTheElement(WebDriver driver, WebElement element, String s){
    }

    public static String clickOnTheElementAndGetUrl(WebElement element, WebDriver driver){
       ClickActions.clickOnTheElement(driver, element, "");
       String currentUrl = driver.getCurrentUrl();
       BrowserActions.goBack(driver);
       return currentUrl;
    }

}
