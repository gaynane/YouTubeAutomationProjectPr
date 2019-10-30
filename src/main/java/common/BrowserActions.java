package common;

import org.openqa.selenium.WebDriver;

public class BrowserActions {
    public static void goBack(WebDriver driver){
        driver.navigate().back();
    }
}
