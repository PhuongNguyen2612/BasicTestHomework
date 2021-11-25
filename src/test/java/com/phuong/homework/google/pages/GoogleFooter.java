package com.phuong.homework.google.pages;

import com.phuong.homework.core.logger.MyLogger;
import com.phuong.homework.google.BaseGooglePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This is the Footer of google page
 */

public class GoogleFooter extends BaseGooglePage {

    @FindBy(xpath = "//div[@class='KxwPGc AghGtd']/a[contains(@href,'about')]")
    private WebElement aboutButton;

    @FindBy(xpath = "//div[@class='KxwPGc AghGtd']/a[contains(@href,'ads')]")
    private WebElement advertisingButton;

    @FindBy(xpath = "//div[@class='KxwPGc AghGtd']/a[contains(@href,'service')]")
    private WebElement businessButton;

    @FindBy(xpath = "//div[@class='KxwPGc AghGtd']/a[contains(@href,'howsearchwork')]")
    private WebElement howSearchButton;

    @FindBy(xpath = "//div[@class='KxwPGc iTjxkf']/a[contains(@href,'privacy')]")
    private WebElement privacyButton;

    @FindBy(xpath = "//div[@class='KxwPGc iTjxkf']/a[contains(@href,'terms')]")
    private WebElement termsButton;

    @FindBy(id = "Mses6b")
    private WebElement settingButton;

    @FindBy(id = "dEjpnf")
    private WebElement settingPopupFrame;

    /**
     * Method click on About button
     *
     * @return AboutGooglePage
     */
    public AboutGooglePage clickAboutButton(){
        aboutButton.click();
        MyLogger.LOGGER.info("Click 'About' button");
        return new AboutGooglePage();
    }

    /**
     * Method click on Advertising button
     *
     * @return AdvertisingGooglePage
     */
    public AdvertisingGooglePage clickAdvertisingButton(){
        advertisingButton.click();
        MyLogger.LOGGER.info("Click 'Advertising' button");
        return new AdvertisingGooglePage();
    }



    /**
     * Method click on Settings button
     *
     * @return GoogleFooter .this
     */
    public GoogleFooter clickSettingsButton(){
        settingButton.click();
        MyLogger.LOGGER.info("Click 'Settings' button");
        return this;
    }

    /**
     * Method check SettingPopupFrame is displayed or not
     *
     * @return boolean
     */
    public boolean displaySettingsPopupFrame(){
        MyLogger.LOGGER.info("Settings Pop-up frame is displayed");
        return settingPopupFrame.isDisplayed();
    }
}
