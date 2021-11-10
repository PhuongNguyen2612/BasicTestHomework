package com.phuong.homework.google.pages;

import com.phuong.homework.google.BaseGooglePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This is About Google Page class presentation
 */

public class AboutGooglePage extends BaseGooglePage {

    @FindBy(className = "header-link-home")
    private WebElement introduceButton;

    @FindBy(className = "header-link-products")
    private WebElement productButton;

    @FindBy(className = "header-link-commitments")
    private WebElement commitButton;

    @FindBy(className = "header-link-stories")
    private WebElement storyButton;

    /**
     * Method to click on Introduce button
     *
     * @return AboutGooglePage .this*/
    public AboutGooglePage clickIntroduceButton(){
        introduceButton.click();
        return this;
    }

    /**
     * Method to click on Product button
     *
     * @return AboutGooglePage .this*/
    public AboutGooglePage clickProductButton(){
        productButton.click();
        return this;
    }

    /**
     * Method to click on Commit button
     *
     * @return AboutGooglePage .this*/
    public AboutGooglePage clickCommitButton(){
        commitButton.click();
        return this;
    }

    /**
     * Method to click on Story button
     *
     * @return AboutGooglePage .this*/
    public AboutGooglePage clickStoryButton(){
        storyButton.click();
        return this;
    }

}
