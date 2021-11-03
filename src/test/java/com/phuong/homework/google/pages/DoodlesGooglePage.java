package com.phuong.homework.google.pages;

import com.phuong.homework.google.BaseGooglePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoodlesGooglePage extends BaseGooglePage {
    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(id = "searchbtn")
    private WebElement searchButton;

    public DoodlesGooglePage setTextToSearchField(String text){
        this.searchField.sendKeys(text);
        return this;
    }

    public DoodlesGooglePage clickSearchButton(){
        this.searchButton.click();
        return this;
    }
}
