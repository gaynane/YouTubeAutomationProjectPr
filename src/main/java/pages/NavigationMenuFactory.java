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

    @FindBy(css="#search-icon-legacy > yt-icon > svg")
    WebElement search;

    @FindBy(css="#button > yt-icon")
    WebElement videoButton;

    @FindBy(css="")
    WebElement appsButton;

    @FindBy(css="")
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
    public WebElement getSearch() {
        return search;
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
