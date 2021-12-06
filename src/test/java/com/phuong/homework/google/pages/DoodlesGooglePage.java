package com.phuong.homework.google.pages;

import com.phuong.homework.core.logger.MyLogger;
import com.phuong.homework.google.BaseGooglePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This is a doodle google page class presentation
 */

public class DoodlesGooglePage extends BaseGooglePage {

    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(id = "searchbtn")
    private WebElement searchButton;

    /**
     * Method send %text% to doodles search field
     *
     * @param text - string variable presenting the we will input into the search field
     * @return DoodlesGooglePage .this
     */
    public DoodlesGooglePage setTextToSearchField(String text){
        this.searchField.sendKeys(text);
        MyLogger.LOGGER.info("Add '" +text+"' to search field in Doodles page");
        return this;
    }

    /**
     * Method click on Search button
     *
     * @return DoodlesGooglePage .this
     */
    public DoodlesGooglePage clickSearchButton(){
        this.searchButton.click();
        MyLogger.LOGGER.info("Click search button");
        return this;
    }
}
