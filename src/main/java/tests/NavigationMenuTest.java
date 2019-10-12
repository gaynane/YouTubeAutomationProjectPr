package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavigationMenuFactory;


public class NavigationMenuTest extends HomePageTest {
    NavigationMenuFactory navigationMenu;
    @Test
    public void setNavigationMenuElements(){
        navigationMenu = new NavigationMenuFactory();
        //Assert.assertTrue(navigationMenu.getNavigationItem().isDisplayed());
        navigationMenu.getNavigationItem().click();
    }
}
