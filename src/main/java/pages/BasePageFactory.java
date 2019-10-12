package pages;

import base.BasePage;

public class BasePageFactory extends BasePage<BasePageFactory> {
    public BasePageFactory(){
        super();
        BasePage.getDriver().manage().window().maximize();
    }
    public BasePageFactory(String url){
        super(url);
        BasePage.getDriver().manage().window().maximize();
    }


}
