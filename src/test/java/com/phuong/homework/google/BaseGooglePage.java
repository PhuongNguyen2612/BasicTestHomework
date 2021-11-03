package com.phuong.homework.google;

import com.phuong.homework.core.DriverWrapper;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseGooglePage {

    public BaseGooglePage() {
        PageFactory.initElements(DriverWrapper.getDriver(),this);
    }

    public String getUrl(){
        System.out.println("Url: "+ DriverWrapper.getDriver().getCurrentUrl());
        return DriverWrapper.getDriver().getCurrentUrl();
    }

    public String getTitle(){
        System.out.println("Title: "+DriverWrapper.getDriver().getTitle());
        return DriverWrapper.getDriver().getTitle();
    }
}
