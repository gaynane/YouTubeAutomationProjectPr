package constants.errorMessages;

public class NavigationMenuErrorMessages {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void checkTheItemsNavigationMenuVisibleErrorMessage() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(navigationMenu.getHamburgerItem().isDisplayed(),  "Hamburger menu is not display");
        softAssert.assertTrue(navigationMenu.getLogo().isDisplayed(), "Logo button is not display");
        softAssert.assertTrue(navigationMenu.getSearchField().isSelected(), "Search field is not display");
        softAssert.assertTrue(navigationMenu.getSearch().isDisplayed(), "Search button is not display");
        softAssert.assertTrue(navigationMenu.getVideoButton().isDisplayed(), "Video button is not display");
        softAssert.assertTrue(navigationMenu.getAppsButton().isDisplayed(), "Apps button is not display");
        softAssert.assertTrue(navigationMenu.getSettingsButton().isDisplayed(), "Settings button is not display");
        softAssert.assertTrue(navigationMenu.getSignIn().isDisplayed(), "SignIn button is not display");

        softAssert.assertAll();
    }

    @Test
    public void checkLeftNavigationBarItemsWhenClickingHamburgerItemErrorMessage(){
        navigationMenu.getHamburgerItem().click();

        softAssert.assertTrue(navigationMenu.getHomeButton().isDisplayed(), "Home button is not display");
        softAssert.assertTrue(navigationMenu.getTrendingButton().isDisplayed(), "Trending button is not display");
        softAssert.assertTrue(navigationMenu.getSubscriptionsButton().isDisplayed(), "Subscriptions button is not display");
        softAssert.assertTrue(navigationMenu.getLibraryButton().isDisplayed(), "Library button is not display");
        softAssert.assertTrue(navigationMenu.getHistoryButton().isDisplayed(), "History button is not display");
        softAssert.assertTrue(navigationMenu.getSignInLikeVideosText().isDisplayed(), "Text SignIn Like Videos is not display");
        softAssert.assertTrue(navigationMenu.getSignInButton().isDisplayed(), "SignIn button is not display");
        softAssert.assertTrue(navigationMenu.getBestOfYouTubeText().isDisplayed(), "Text Best of Youtube is no- display");
        softAssert.assertTrue(navigationMenu.getMusicButton().isDisplayed(), "Music button is not display");
        softAssert.assertTrue(navigationMenu.getSportsButton().isDisplayed(), "Sports button is not display");
        softAssert.assertTrue(navigationMenu.getGamingButton().isDisplayed(), "Gaming button is not display");
        softAssert.assertTrue(navigationMenu.getNewsButton().isDisplayed(), "News button is not display");
        softAssert.assertTrue(navigationMenu.getLiveBlackButton().isDisplayed(), "Live black button is not display");
        softAssert.assertTrue(navigationMenu.getFashionButton().isDisplayed(), "Fashion button is not display");
        softAssert.assertTrue(navigationMenu.getVideo360Button().isDisplayed(), "360 Video button is not display");
        softAssert.assertTrue(navigationMenu.getBrowsChannels().isDisplayed(), "Brows channels button is not display");
        softAssert.assertTrue(navigationMenu.getMoreFromYouTubeText().isDisplayed(), "SignIn button is not display");
        softAssert.assertTrue(navigationMenu.getSettingsLeftButton().isDisplayed(), "Settings left button is not display");
        softAssert.assertTrue(navigationMenu.getReportHistoryButton().isDisplayed(), "Report history button is not display");
        softAssert.assertTrue(navigationMenu.getHelpButton().isDisplayed(), "Help button is not display");
        softAssert.assertTrue(navigationMenu.getSendFeedbackButton().isDisplayed(), "Send Feedback button is not display");
        softAssert.assertTrue(navigationMenu.getAbout().isDisplayed(), "About item is not display");
        softAssert.assertTrue(navigationMenu.getPress().isDisplayed(), "Press item is not display");
        softAssert.assertTrue(navigationMenu.getCopyright().isDisplayed(), "Copyright item is not display");
        softAssert.assertTrue(navigationMenu.getContactUs().isDisplayed(), "Contact us item is not display");
        softAssert.assertTrue(navigationMenu.getCreators().isDisplayed(), "Creators item is not display");
        softAssert.assertTrue(navigationMenu.getAdvertise().isDisplayed(), "Advertise item is not display");
        softAssert.assertTrue(navigationMenu.getDevelopers().isDisplayed(), "Developers item is not display");
        softAssert.assertTrue(navigationMenu.getTerms().isDisplayed(), "Text Terms item is not display");
        softAssert.assertTrue(navigationMenu.getPrivacy().isDisplayed(), "Text Privacy item is not display");
        softAssert.assertTrue(navigationMenu.getPolicy().isDisplayed(), "Text Policy & Safety item is not display");
        softAssert.assertTrue(navigationMenu.getTestNewFeatures().isDisplayed(), "Test new features item is not display");
        softAssert.assertAll();
    }

}
