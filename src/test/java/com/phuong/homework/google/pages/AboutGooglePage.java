package com.phuong.homework.google.pages;

import com.phuong.homework.google.BaseGooglePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This is About Google Page class presentation
 */

public class AboutGooglePage extends BaseGooglePage {

    @FindBy(xpath = "//li[@id='tab-1']/a")
    private WebElement introduceButton;

    @FindBy(xpath = "//li[@id='tab-2']/a")
    private WebElement productButton;

    @FindBy(xpath = "//li[@id='tab-3']/a")
    private WebElement commitButton;

    @FindBy(xpath = "//li[@id='tab-4']/a")
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
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }

    /**
     * Method to click on Commit button
     *
     * @return AboutGooglePage .this*/
    public AboutGooglePage clickCommitButton(){
        commitButton.click();
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }

    /**
     * Method to click on Story button
     *
     * @return AboutGooglePage .this*/
    public AboutGooglePage clickStoryButton(){
        storyButton.click();
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return this;
    }

}
