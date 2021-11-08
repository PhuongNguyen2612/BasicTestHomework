package com.phuong.homework.google.pages;

import com.phuong.homework.core.logger.MyLogger;
import com.phuong.homework.google.BaseGooglePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This is a google search home page class presentation
 */

public class GoogleHomeSearchPage extends BaseGooglePage {

    @FindBy(xpath = "//input[@class = 'gLFyf gsfi']")
    private WebElement googleSearchField;

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']/descendant::input[@name='btnK']")
    private WebElement googleSearchButton;

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']/descendant::input[@name='btnI']")
    private WebElement doodlesButton;

    @FindBy(xpath = "//div[@class='gb_g gb_h']/a")
    private WebElement imagesButton;

    /**
     * method send %text% to the google search field
     *
     * @param text - string variable presenting the we will input into the search field
     * @return GoogleHomeSearchPage .this
     */
    public GoogleHomeSearchPage setTextToSearchField(String text){
        googleSearchField.sendKeys(text);
        MyLogger.LOGGER.info("Add '" +text+"' to search field");
        return this;
    }

    /**
     * method click on google search button
     *
     * @return GoogleSearchResultPage
     */
    public GoogleSearchResultPage clickGoogleSearchButton(){
        googleSearchButton.submit();
        MyLogger.LOGGER.info("Click search button");
        return new GoogleSearchResultPage();
    }

    /**
     * method click on 'I'm feeling lucky' button
     *
     * @return DoodlesGooglePage
     */
    public DoodlesGooglePage clickDoodlesButton(){
        doodlesButton.click();
        MyLogger.LOGGER.info("Click 'I'm feeling lucky' button");
        return new DoodlesGooglePage();
    }

    /**
     * method click on Images button
     *
     * @return GoogleImagesPage*/
    public GoogleImagesPage clickImagesButton(){
        imagesButton.click();
        MyLogger.LOGGER.info("Click 'Images' button");
        return new GoogleImagesPage();
    }


}
