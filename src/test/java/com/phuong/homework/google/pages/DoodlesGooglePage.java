package com.phuong.homework.google.pages;

import com.phuong.homework.core.logger.MyLogger;
import com.phuong.homework.google.BaseGooglePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoodlesGooglePage extends BaseGooglePage {
    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(id = "searchbtn")
    private WebElement searchButton;

    public DoodlesGooglePage setTextToSearchField(String text){
        MyLogger.LOGGER.info("Add '" +text+"' to search field in Doodles page");
        this.searchField.sendKeys(text);
        return this;
    }

    public DoodlesGooglePage clickSearchButton(){
        MyLogger.LOGGER.info("Click search button");
        this.searchButton.click();
        return this;
    }
}
