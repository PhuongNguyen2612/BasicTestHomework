package com.phuong.homework.google.pages;

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

    public GoogleHomeSearchPage setTextToSearchField(String text){
        googleSearchField.sendKeys(text);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }

    public GoogleSearchResultPage clickGoogleSearchButton(){
        googleSearchButton.submit();
        return new GoogleSearchResultPage();
    }

    public DoodlesGooglePage clickDoodlesButton(){
        doodlesButton.click();
        return new DoodlesGooglePage();
    }

    public GoogleImagesPage clickImagesButton(){
        imagesButton.click();
        return new GoogleImagesPage();
    }
}
