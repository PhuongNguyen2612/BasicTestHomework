package com.phuong.homework.google.pages;

import com.phuong.homework.google.BaseGooglePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PoliciesGooglePage extends BaseGooglePage {

    @FindBy(xpath = "//*[@id=\"gb\"]/div[2]/div[1]/div[1]")
    private WebElement nevButton;

}
