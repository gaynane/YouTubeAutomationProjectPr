package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavigationMenuFactory;


public class NavigationMenuTest extends HomePageTest {
    NavigationMenuFactory navigationMenu;
    @Test
    public void TestNavigationMenuElements(){
        navigationMenu = new NavigationMenuFactory("http://www.youtube.com");
        Assert.assertTrue(navigationMenu.getNavigationItem().isDisplayed());
        navigationMenu.getNavigationItem().click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(navigationMenu.getLogo().isDisplayed());
        navigationMenu.getLogo().click();

        Assert.assertTrue(navigationMenu.getSearchField().isSelected());
        navigationMenu.getSearchField().clear();
        navigationMenu.getSearchField().sendKeys("Yerevan");


    }
}
