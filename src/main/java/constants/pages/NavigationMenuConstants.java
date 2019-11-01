package constants.pages;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.NavigationMenuFactory;

public class NavigationMenuConstants {

    public static final String URL = "http://www.youtube.com";
    public static final String HAMBURGERITEM_LOCATOR ="#guide-icon";
    public static final String LOGO_LOCATOR ="#logo-icon-container";
    public static final String SEARCHFIELD_LOCATOR ="#search-input";
    public static final String SEARCH_LOCATOR ="#search-icon-legacy > yt-icon > svg";
    public static final String VIDEOBUTTON_LOCATOR="[aria-label=Create a video or post]";
    public static final String APPS_BUTTON_LOCATOR ="[aria-label=YouTube apps";
    public static final String SETTINGS_BUTTON_LOCATOR ="[aria-label=Settings]";
    public static final String SIGNIN_LOCATOR="[aria-label=Sign in]";
    public static final String HOME_BUTTON_LOCATOR ="a[title='Home']";
    public static final String TRENDING_BUTTON_LOCATOR ="a[title='Trending']";
    public static final String SUBSCRIPTIONS_BUTTON_LOCATOR = "a[title='Subscriptions']";
    public static final String LIBRARY_BUTTON_LOCATOR = "a[title='Library']";
    public static final String HISTORY_BUTTON_LOCATOR = "a[title='History']";
    public static final String SIGNIN_LIKE_VIDEOS_TEXT_LOCATOR = "";
    public static final String SIGNIN_BUTTON_LOCATOR = "yt-formatted-string:contains('Sign in to like videos, comment, and subscribe.')";
    public static final String GAMING_BUTTON_LOCATOR = "a[title='Gaming']";
    public static final String MUSIC_BUTTON_LOCATOR ="a[title='Music']";
    public static final String SPORTS_BUTTON_LOCATOR ="a[title='Sports']";
    public static final String NEWS_BUTTON_LOCATOR = "a[title='News']";
    public static final String BEST_OF_YOUTUBE_LOCATOR ="";
    public static final String LIVE_BLACK_BUTTON_LOCATOR ="a[title='Live']";
    public static final String FASHION_BUTTON_LOCATOR ="a[title='Fashion']";
    public static final String VIDEO360_BUTTON_LOCATOR ="a[title='360° Video']";
    public static final String BROWS_CHANNELS_LOCATOR ="a[title='Browse channels']";
    public static final String MORE_FROM_YOUTUBE_LOCATOR ="yt-formatted-string:contains('More from TouTube')";
    public static final String LIVE_RED_BUTTON_LOCATOR ="";
    public static final String SETTINGS_LEFT_BUTTON_LOCATOR="a[title='Settings']";
    public static final String REPORT_HISTORY_BUTTON_LOCATOR="a[title='Report history']";
    public static final String HELP_BUTTON_LOCATOR="a[title='Help']";
    public static final String SEND_FEEDBACK_BUTTON_LOCATOR ="a[title='Send feedback']";
    public static final String ABOUT_LOCATOR="a.contains('About')";
    public static final String PRESS_LOCATOR="a.contains('Press')";
    public static final String COPYRIGHT_LOCATOR="a.contains('Copyright')";
    public static final String CONTACT_US_LOCATOR="a.contains('Contact us')";
    public static final String CREATORS_LOCATOR="a.contains('Creators')";
    public static final String ADVERTISE_LOCATOR ="a.contains('Advertise')";
    public static final String DEVELOPERS_LOCATOR ="a.contains('Developers')";
    public static final String TERMS_LOCATOR ="a.contains('Terms')";
    public static final String PRIVACY_LOCATOR ="a.contains('Privacy')";
    public static final String POLICY_LOCATOR ="a.contains('Policy & Safety')";
    public static final String TEST_NEW_FEATURES_LOCATOR="a.contains('Test new features')";

    //click
    public static final String LOGO_EXPECTED_URL = "https://www.youtube.com/";
    public static final String VIDEO_BUTTON_EXPECTED_URL ="";
    public static final String SETTINGS_BUTTON_EXPECTED_URL = "";
    public static final String APPS_BUTTON_EXPECTED_URL ="";
    public static final String SIGNIN_EXPECTED_URL ="https://accounts.google.com/signin/v2/identifier?service=youtube&uilel=3&passive=true&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Dru%26next%3D%252F&hl=ru&ec=65620&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

    public static final String HAMBURGERITEM_EXPECTED_URL ="";
    public static final String HOME_BUTTON_EXPECTED_URL ="https://www.youtube.com/";
    public static final String TRENDING_BUTTON_EXPECTED_URL ="https://www.youtube.com/feed/trending";
    public static final String SUBSCRIPTIONS_BUTTON_EXPECTED_URL ="https://www.youtube.com/feed/subscriptions";
    public static final String LIBRARY_BUTTON_EXPECTED_URL ="https://www.youtube.com/feed/subscriptions";
    public static final String HISTORY_BUTTON_EXPECTED_URL ="https://www.youtube.com/feed/history";
    public static final String MUSIC_BUTTON_EXPECTED_URL ="https://www.youtube.com/channel/UC-9-kyTW8ZkZNDHQJ6FgpwQ";
    public static final String SPORTS_BUTTON_EXPECTED_URL ="https://www.youtube.com/channel/UCEgdi0XIXXZ-qJOFPf4JSKw";
    public static final String GAMING_BUTTON_EXPECTED_URL ="https://www.youtube.com/gaming";
    public static final String NEWS_BUTTON_EXPECTED_URL ="https://www.youtube.com/channel/UCYfdidRxbB8Qhf0Nx7ioOYw";
    public static final String LIVE_BLACK_BUTTON_EXPECTED_URL ="https://www.youtube.com/channel/UC4R8DWoMoI7CAwX8_LjQHig";
    public static final String FASHION_BUTTON_EXPECTED_URL ="https://www.youtube.com/channel/UC4R8DWoMoI7CAwX8_LjQHig";
    public static final String VIDEO360_BUTTON_EXPECTED_URL ="https://www.youtube.com/channel/UCzuqhhs6NWbgTzMuM09WKDQ";
    public static final String BROWS_CHANNELS_EXPECTED_URL ="https://www.youtube.com/feed/guide_builder";
    public static final String LIVE_RED_BUTTON_EXPECTED_URL ="https://www.youtube.com/channel/UC4R8DWoMoI7CAwX8_LjQHig";
    public static final String SETTINGS_LEFT_BUTTON_EXPECTED_URL ="https://accounts.google.com/signin/v2/identifier?service=youtube&hl=en&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Fapp%3Ddesktop%26hl%3Den%26feature%3Dredirect_login%26action_handle_signin%3Dtrue%26next%3D%252Faccount%253Fpbjreload%253D10&uilel=3&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
    public static final String REPORT_HISTORY_BUTTON_EXPECTED_URL ="https://www.youtube.com/reporthistory";
    public static final String HELP_BUTTON_EXPECTED_URL ="#content > div > div.help-panel";
    public static final String SEND_FEEDBACK_BUTTON_EXPECTED_URL ="";
    public static final String ABOUT_EXPECTED_URL ="https://www.youtube.com/about/";
    public static final String PRESS_EXPECTED_URL ="https://www.youtube.com/about/press/";
    public static final String COPYRIGHT_EXPECTED_URL ="https://www.youtube.com/about/copyright/#support-and-troubleshooting";
    public static final String CONTACTUS_EXPECTED_URL ="https://www.youtube.com/t/contact_us";
    public static final String CREATORS_EXPECTED_URL ="https://www.youtube.com/creators/";
    public static final String ADVERTISE_EXPECTED_URL ="https://www.youtube.com/ads/";
    public static final String DEVELOPERS_EXPECTED_URL ="https://www.youtube.com/yt/dev/";
    public static final String TERMS_EXPECTED_URL ="https://www.youtube.com/t/terms";
    public static final String PRIVACY_EXPECTED_URL ="https://policies.google.com/privacy?hl=en";
    public static final String POLICY_EXPECTED_URL ="https://www.youtube.com/about/policies/#community-guidelines";
    public static final String TEST_NEW_FEATURES_EXPECTED_URL ="https://www.youtube.com/new";

}
