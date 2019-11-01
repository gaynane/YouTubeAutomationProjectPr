package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupDriver {
    public static WebDriver setup(){
        return  BasePage.getDriver();

    }
    public static WebDriver initializeLocalDriver(){
        return  BasePage.getDriver();
    }
    // currently supported chrome webDriver
    //TODO added more browsers support
    public static WebDriver createWebDriver(String browserName){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
