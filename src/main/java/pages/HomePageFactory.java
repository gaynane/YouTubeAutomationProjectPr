package pages;

import common.Video;
import constants.pages.HomePageConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePageFactory extends BasePageFactory {
    @FindBy(css="#dismissable")
    private List<WebElement> videosDiv;
    private List<Video> videos;

    public HomePageFactory(){
      super();
    }
    public HomePageFactory(String url){
        super(url);
    }

    public void initVideos(){
        videos = new ArrayList<>();
        for (WebElement element: videosDiv) {
            videos.add(new Video(element));
        }
    }
    public List<Video> getVideos() {
        initVideos();
        return videos;
    }
}
