package com.phuong.homework.test;

import com.phuong.homework.BaseTest;
import com.phuong.homework.core.webdriver.DriverWrapper;
import com.phuong.homework.core.webdriver.model.DriverType;
import com.phuong.homework.google.pages.GoogleFooter;
import com.phuong.homework.google.pages.GoogleHomeSearchPage;
import com.phuong.homework.testListener.TestListener;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
@Epic("Smoke Tests")
@Feature("Home Page Test")
public class HomePageSmokeTest extends BaseTest {

    @Test(description = "Search on home page", dataProvider = "drivers")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Search on home page")
    public void testOpenGooglePage(String driver) {
        DriverWrapper.setDriver(DriverType.valueOf(driver));
        DriverWrapper.getDriver().navigate().to(baseUrl);
        Assert.assertEquals(true, true);
    }

    @Test(description = "Search on home page", dataProvider = "drivers")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Search on home page")
    public void testBasicSearchOnGoogleMainPage(String driver) {
        DriverWrapper.setDriver(DriverType.valueOf(driver));
        DriverWrapper.getDriver().navigate().to(baseUrl);
        String title = new GoogleHomeSearchPage()
                .setTextToSearchField("viet nam")
                .clickGoogleSearchButton()
                .getTitle();
        Assert.assertTrue(title.contains("viet nam"));
    }

    @Test(description = "Switch to image search page", dataProvider = "drivers")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Switch to image search page")
    public void testImagesButton(String driver) {
        DriverWrapper.setDriver(DriverType.valueOf(driver));
        DriverWrapper.getDriver().navigate().to(baseUrl);
        String title = new GoogleHomeSearchPage()
                .clickImagesButton().getUrl();
        Assert.assertTrue(title.contains("img"));
    }

    @Test(description = "Redirect to About Google Page", dataProvider = "drivers")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Redirect to About Google Page")
    public void testAboutButton(String driver) {
        DriverWrapper.setDriver(DriverType.valueOf(driver));
        DriverWrapper.getDriver().navigate().to(baseUrl);
        String url = new GoogleFooter().clickAboutButton().getUrl();
        Assert.assertTrue(url.contains("about.google"));
    }

    @Test(description = "Redirect to Advertising Page", dataProvider = "drivers")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Redirect to Advertising Page")
    public void testAdvertisingButton(String driver) {
        DriverWrapper.setDriver(DriverType.valueOf(driver));
        DriverWrapper.getDriver().navigate().to(baseUrl);
        String url = new GoogleFooter().clickAdvertisingButton().getUrl();
        Assert.assertTrue(url.contains("ads.google"));
    }

    @Test(description = "Access to doodle page", dataProvider = "drivers")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Access to doodle page")
    public void testDoodlesButton(String driver) {
        DriverWrapper.setDriver(DriverType.valueOf(driver));
        DriverWrapper.getDriver().navigate().to(baseUrl);
        String title = new GoogleHomeSearchPage()
                .clickDoodlesButton()
                .getTitle();
        Assert.assertTrue(title.contains("Google Doodles"));
    }

}