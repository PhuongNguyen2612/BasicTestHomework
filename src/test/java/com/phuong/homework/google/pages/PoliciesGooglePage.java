package com.phuong.homework.google.pages;

import com.phuong.homework.core.logger.MyLogger;
import com.phuong.homework.google.BaseGooglePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This is a google policies page class presentation
 */
public class PoliciesGooglePage extends BaseGooglePage {

    @FindBy(xpath = "//div[@class='gb_uc']")
    private WebElement nevButton;

    /**
     * Method click on nevigation bar button
     *
     * @return PoliciesGooglePage .this
     */
    public PoliciesGooglePage clickNevigationButton(){
        nevButton.click();
        MyLogger.LOGGER.info("Click navigation button");
        return this;
    }

}
