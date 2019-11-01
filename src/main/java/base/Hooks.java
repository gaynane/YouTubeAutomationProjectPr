package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Hooks {

//    @BeforeSuite
//    public void setupForHooks(String platform, String browser){
//
//    }

   @AfterSuite
    public void quitDriver(){
        if (BasePage.getDriver() != null){
            BasePage.getDriver().quit();
        }
    }
    public void setup(String platform, String browser){}

}
