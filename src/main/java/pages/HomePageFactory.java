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
    private WebElement horizontalList;

    @FindBy(css = HomePageConstants.THUMBNAIL_LOCATOR)
    private WebElement thumbnail;

    @FindBy(css = HomePageConstants.OVERLAYS_LOCCATOR)
   private WebElement overlays;

    @FindBy(css = HomePageConstants.DETALIS_LOCATOR)
    private WebElement detalis;

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
