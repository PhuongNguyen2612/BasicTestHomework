package com.phuong.homework.selenium4;

import com.phuong.homework.google.pages.GoogleFooter;
import com.phuong.homework.google.pages.GoogleHomeSearchPage;
import com.phuong.homework.testListener.TestListener;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Search Stays Tests")
public class Selenium4Test extends SeleniumBaseTest {

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