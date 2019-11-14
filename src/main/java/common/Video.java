package common;

import base.BasePage;
import constants.pages.HomePageConstants;
import constants.pages.VideoConstants;
import org.checkerframework.checker.initialization.qual.Initialized;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Video{

    private WebElement image;
    private WebElement videoTitle;
    private WebElement channelName;
    private WebElement views;
    private WebElement time;

    public Video(WebElement video){
        InitImage(video);
        InitVideoTitle(video);
        InitChannelName(video);
        InitViews(video);
        InitTime(video);
    }

    void InitImage(WebElement video){
       try {
           image = video.findElement(By.cssSelector("img"));
       } catch(NoSuchElementException ex){
           image = null;
       }
    }

    void InitVideoTitle(WebElement video){
        try {
            videoTitle = video.findElement(By.cssSelector("#video-title"));
        } catch(NoSuchElementException ex){
            videoTitle = null;
        }
    }

    void InitChannelName(WebElement video){
        try {
            channelName = video.findElement(By.cssSelector("#channel-name"));
        } catch(NoSuchElementException ex){
            channelName = null;
        }
    }
    void InitViews(WebElement video){
        try {
            views = video.findElement(By.cssSelector("#metadata-line > span:nth-child(1)"));
        } catch(NoSuchElementException ex){
            views = null;
        }
    }

    void InitTime(WebElement video){
        try {
            time = video.findElement(By.cssSelector("#metadata-line > span:nth-child(2)"));
        } catch(NoSuchElementException ex){
            time = null;
        }
    }

    public WebElement getImage() { return image;}
    public WebElement getVideoTitle() { return videoTitle;}
    public WebElement getViews() { return views;}
    public WebElement getChannelName() { return channelName;}
    public WebElement getTime() { return time;}

}

