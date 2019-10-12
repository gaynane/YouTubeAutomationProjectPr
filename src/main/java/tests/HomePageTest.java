package tests;

import base.Hooks;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePageFactory;

public class HomePageTest extends Hooks {
    HomePageFactory homePage;
    @BeforeClass
    public void setup(){
        homePage = new HomePageFactory("http://www.youtube.com");
    }
    @Test
    public void check(){
        System.out.println("Stepanavan");
    }
}
