package com.phuong.homework.selenium4;

import com.phuong.homework.google.pages.GoogleFooter;
import com.phuong.homework.google.pages.GoogleHomeSearchPage;
import com.phuong.homework.testListener.TestListener;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
@Epic("Smoke Tests")
@Feature("Home Page Test")
public class HomePageSmokeTest extends SeleniumBaseTest {

    @DataProvider(name = "data-provider")
    public Object[][] createSearchParamCollections() throws Exception {
        String[][] collections = {{"viet nam"},{"hello"},{"epam"}};
        return collections;
    }

    @Test(description = "Search on home page", dataProvider = "data-provider")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Search on home page")
    public void testBasicSearchOnGoogleMainPage(String text) {
        String title = new GoogleHomeSearchPage()
                .setTextToSearchField(text)
                .clickGoogleSearchButton()
                .getTitle();
        Assert.assertTrue(title.contains(text));
    }

    @Test(description = "Switch to image search page")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Switch to image search page")
    public void testImagesButton() {
        String title = new GoogleHomeSearchPage()
                .clickImagesButton().getUrl();
        Assert.assertTrue(title.contains("img"));
    }

    @Test(description = "Redirect to About Google Page")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Redirect to About Google Page")
    public void testAboutButton() {
        String url = new GoogleFooter().clickAboutButton().getUrl();
        Assert.assertTrue(url.contains("about.google"));
    }

    @Test(description = "Redirect to Advertising Page")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Redirect to Advertising Page")
    public void testAdvertisingButton() {
        String url = new GoogleFooter().clickAdvertisingButton().getUrl();
        Assert.assertTrue(url.contains("ads.google"));
    }

    @Test(description = "Access to doodle page")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Access to doodle page")
    public void testDoodlesButton() {
        String title = new GoogleHomeSearchPage()
                .clickDoodlesButton()
                .getTitle();
        Assert.assertTrue(title.contains("Google Doodles"));
    }

}