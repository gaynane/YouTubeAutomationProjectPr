package pages;

import constants.pages.HomePageConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFactory extends BasePageFactory {
    public HomePageFactory(){
      super();
    }
    public HomePageFactory(String url){
        super(url);
    }

    @FindBy(css = HomePageConstants.HORIZONTAL_LIST_LOCATOR)
    WebElement horizontalList;

    @FindBy(css = HomePageConstants.THUMBNAIL_LOCATOR)
    WebElement thumbnail;

    @FindBy(css = HomePageConstants.OVERLAYS_LOCCATOR)
    WebElement overlays;

    @FindBy(css = HomePageConstants.DETALIS_LOCATOR)
    WebElement detalis;

    public WebElement getHorizontalList() {
        return horizontalList;
    }
    public WebElement getThumbnail() {
        return thumbnail;
    }
    public WebElement getOverlays() {
        return overlays;
    }
    public WebElement getDetalis() { return detalis; }
}
