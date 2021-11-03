package com.phuong.homework.selenium4;

import com.phuong.homework.core.DriverWrapper;
import com.phuong.homework.google.pages.GoogleHomeSearchPage;
import com.phuong.homework.google.pages.GooglePageFooter;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium4Test extends SeleniumBaseTest {

    @BeforeTest
    public void preCondition(){
        DriverWrapper.getDriver().navigate().to("https://google.com");
    }

    @AfterTest
    public void postCondition(){
        DriverWrapper.getDriver().quit();
    }

    @Test
    public void testingChromeAndSeleniumBasic(){
        Assert.assertEquals(true, true);
    }

    @Test
    public void testBasingSearchOnGoogleMainPage(){
        String title = new GoogleHomeSearchPage()
                .setTextToSearchField("Vietnam")
                .clickGoogleSearchButton()
                .getTitle();
        Assert.assertTrue(title.contains("Vietnam"));
    }

    @Test
    public void testDoodlesButton(){
        String title = new GoogleHomeSearchPage()
                .clickDoodlesButton()
                .getTitle();
        Assert.assertTrue(title.contains("Google Doodles"));
    }

    @Test
    public void testSearchOnDoodlesPage(){
        String url = new GoogleHomeSearchPage()
                .clickDoodlesButton()
                .setTextToSearchField("bee")
                .clickSearchButton()
                .getUrl();
        Assert.assertTrue(url.contains("bee"));
    }

    @Test
    public void testImagesButton() {
        String title = new GoogleHomeSearchPage()
                .clickImagesButton().getUrl();
        Assert.assertTrue(title.contains("img"));

    }

    @Test
    public void testAboutButton(){
        String url = new GooglePageFooter().clickAboutButton().getUrl();
        Assert.assertTrue(url.contains("about"));
    }

}