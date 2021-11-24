package com.phuong.homework.google.pages;

import com.phuong.homework.google.BaseGooglePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This is About Google Page class presentation
 */

public class AboutGooglePage extends BaseGooglePage {

    @FindBy(className = "nav-toggle-button")
    private WebElement navButton;

    @FindBy(xpath = "//li[@id='tab-1']/a")
    private WebElement introduceButton;

    @FindBy(xpath = "//li[@id='tab-2']/a")
    private WebElement productButton;

    @FindBy(className = "//li[@id='tab-3']/a")
    private WebElement commitButton;

    @FindBy(className = "//li[@id='tab-4']/a")
    private WebElement storyButton;

    /**
     * Method to click open navigate bar
     *
     * @return AboutGooglePage .this*/
    public AboutGooglePage clickNavigateButton(){
        navButton.click();
        return this;
    }

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
