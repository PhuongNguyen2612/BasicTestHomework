package com.phuong.homework.google.pages;

import com.phuong.homework.BaseTest;
import com.phuong.homework.core.logger.MyLogger;
import com.phuong.homework.google.BaseGooglePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomeSearchPage extends BaseGooglePage {

    @FindBy(xpath = "//input[@class = 'gLFyf gsfi']")
    private WebElement googleSearchField;

    @FindBy(xpath = "//div[@class = 'FPdoLc lJ9FBc']/center/input[1]")
    private WebElement googleSearchButton;

    @FindBy(xpath = "//div[@class = 'FPdoLc lJ9FBc']/center/input[2]")
    private WebElement doodlesButton;

    @FindBy(xpath = "//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")
    private WebElement imagesButton;

    //
    @FindBy(xpath = "//div[@class = 'KxwPGc AghGtd']/a[1]")
    private WebElement aboutButton;

    @FindBy(xpath = "//div[@class = 'KxwPGc AghGtd']/a[2]")
    private WebElement advertisingButton;

    @FindBy(xpath = "//div[@class = 'KxwPGc AghGtd']/a[3]")
    private WebElement businessButton;

    @FindBy(xpath = "//div[@class = 'KxwPGc AghGtd']/a[4]")
    private WebElement howSearchButton;

    @FindBy(xpath = "//div[@class = 'KxwPGc iTjxkf']/a[1]")
    private WebElement privacyButton;

    @FindBy(xpath = "//div[@class = 'KxwPGc iTjxkf']/a[2]")
    private WebElement termsButton;

    @FindBy(id = "Mses6b")
    private WebElement settingButton;

    @FindBy(id = "dEjpnf")
    private WebElement settingPopupFrame;

    public GoogleHomeSearchPage setTextToSearchField(String text){
        MyLogger.LOGGER.info("Add '" +text+"' to search field");
        googleSearchField.sendKeys(text);
        return this;
    }

    public GoogleSearchResultPage clickGoogleSearchButton(){
        MyLogger.LOGGER.info("Click search button");
        googleSearchButton.submit();
        return new GoogleSearchResultPage();
    }

    public DoodlesGooglePage clickDoodlesButton(){
        MyLogger.LOGGER.info("Click 'I'm feeling lucky' button");
        doodlesButton.click();
        return new DoodlesGooglePage();
    }

    public GoogleImagesPage clickImagesButton(){
        MyLogger.LOGGER.info("Click 'Images' button");
        imagesButton.click();
        return new GoogleImagesPage();
    }

    public AboutGooglePage clickAboutButton(){
        MyLogger.LOGGER.info("Click 'About' button");
        aboutButton.click();
        return new AboutGooglePage();
    }

    public AdvertisingGooglePage clickAdvertisingButton(){
        MyLogger.LOGGER.info("Click 'Advertising' button");
        advertisingButton.click();
        return new AdvertisingGooglePage();
    }

    public GoogleHomeSearchPage clickSettingsButton(){
        MyLogger.LOGGER.info("Click 'Settings' button");
        advertisingButton.click();
        return this;
    }

    public boolean displaySettingsPopupFrame(){
        return settingPopupFrame.isDisplayed();
    }
}
