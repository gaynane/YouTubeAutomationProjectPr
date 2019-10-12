package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationMenuFactory extends BasePageFactory{
    @FindBy(css="#guide-icon")
    WebElement navigationItem;

    @FindBy(css="#logo-icon-container")
    WebElement logo;

    @FindBy(css="#search")
    WebElement searchField;

    @FindBy(css="")
    WebElement videoButton;

    @FindBy(css="")
    WebElement appsButton;

    @FindBy(css="input[]")
    WebElement settingsButton;

    @FindBy(css="input[value=signIn]")
    WebElement signIn;

    public NavigationMenuFactory(){
        super();
    }
    public NavigationMenuFactory(String url){
        super(url);
    }
    public WebElement getNavigationItem(){
        return navigationItem;
    }
    public WebElement getLogo(){
        return logo;
    }
    public WebElement getSearchField(){
        return searchField;
    }
    public WebElement getVideoButton(){
        return videoButton;
    }
    public WebElement getAppsButton(){
        return appsButton;
    }
    public WebElement getSettingsButton(){
        return settingsButton;
    }
    public WebElement getSignIn(){
        return signIn;
    }


}
