package com.phuong.homework.google;

import com.phuong.homework.core.logger.MyLogger;
import com.phuong.homework.core.webdriver.DriverWrapper;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseGooglePage {

    public BaseGooglePage() {
        PageFactory.initElements(DriverWrapper.getDriver(),this);
    }

    public String getUrl(){
        String url = DriverWrapper.getDriver().getCurrentUrl();
        MyLogger.LOGGER.info("Access to url: "+url);
        return url;
    }

    public String getTitle(){
        String title = DriverWrapper.getDriver().getTitle();
        MyLogger.LOGGER.info("Access to page have title: "+title);
        return title;
    }
}
