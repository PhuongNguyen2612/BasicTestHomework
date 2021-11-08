package com.phuong.homework.selenium4;

import com.phuong.homework.core.webdriver.DriverWrapper;
import com.phuong.homework.google.pages.GoogleFooter;
import com.phuong.homework.google.pages.GoogleHomeSearchPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium4Test extends SeleniumBaseTest {

    @BeforeMethod
    public void preCondition() {
        DriverWrapper.getDriver().navigate().to("https://google.com");
    }

    @AfterTest
    public void postCondition() {
        DriverWrapper.getDriver().quit();
    }

    @Test
    public void testingChromeAndSeleniumBasic() {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testBasicSearchOnGoogleMainPage() {
        String title = new GoogleHomeSearchPage()
                .setTextToSearchField("Vietnam")
                .clickGoogleSearchButton()
                .getTitle();
        Assert.assertTrue(title.contains("Vietnam"));
    }

    @Test
    public void testDoodlesButton() {
        String title = new GoogleHomeSearchPage()
                .clickDoodlesButton()
                .getTitle();
        Assert.assertTrue(title.contains("Google Doodles"));
    }

    @Test
    public void testSearchOnDoodlesPage() {
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
    public void testAboutButton() {
        String url = new GoogleFooter().clickAboutButton().getUrl();
        Assert.assertTrue(url.contains("about.google"));
    }

    @Test
    public void testAdvertisingButton() {
        String url = new GoogleFooter().clickAdvertisingButton().getUrl();
        Assert.assertTrue(url.contains("ads.google"));
    }

    @Test
    public void testClickSettingButton(){
        Assert.assertTrue(new GoogleFooter().clickSettingsButton().displaySettingsPopupFrame());

    }



}