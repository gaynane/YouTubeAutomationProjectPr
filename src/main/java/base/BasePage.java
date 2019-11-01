package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasePage<T extends LoadableComponent<T>> extends LoadableComponent<T> {

   private static ThreadLocal<WebDriver>driver = new ThreadLocal();

   private static List<WebDriver> webDriverThreadPool = Collections.synchronizedList(new ArrayList());
    public BasePage(){
      createDriver();
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

    }

    public BasePage(String url){
     createDriver();
     getDriver().get(url);
    }
    private void createDriver(){
      if (getDriver() == null){
       driver.set(SetupDriver.createWebDriver("Chrome"));
       webDriverThreadPool.add(getDriver());
      }
    }

    public static synchronized WebDriver getDriver() {
        return driver.get();
    }
}
