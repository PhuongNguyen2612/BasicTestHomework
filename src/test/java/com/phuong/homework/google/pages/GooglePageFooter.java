package com.phuong.homework.google.pages;

import com.phuong.homework.google.BaseGooglePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePageFooter extends BaseGooglePage {

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[2]/div[1]/a[1]")
    WebElement aboutButton;

    public AboutGooglePage clickAboutButton(){
        aboutButton.click();
        return new AboutGooglePage();
    }
}
